/*
 * Odditt B2B Public API — convenience authentication layer (hand-written).
 *
 * Kept in .openapi-generator-ignore so regeneration preserves it.
 */

package com.odditt.apiclient;

import com.odditt.apiclient.api.AuthenticationApi;
import com.odditt.apiclient.model.AuthOAuthLoginRequest;
import com.odditt.apiclient.model.AuthRefreshRequest;
import com.odditt.apiclient.model.AuthTokenPair;
import java.time.Duration;
import java.time.Instant;

/**
 * Auto-login/refresh authentication wrapper over the generated client.
 *
 * <p>The API accepts two credential types, both exchanged for a short-lived
 * Bearer JWT at a login endpoint:
 *
 * <ul>
 *   <li>an API key           &rarr; {@code POST /v1/auth/login} (sends the X-API-Key header)</li>
 *   <li>client_id + secret   &rarr; {@code POST /v1/oauth/login} (body {client_id, client_secret})</li>
 * </ul>
 *
 * <p>Data endpoints also accept the API key directly via X-API-Key, so no login
 * is needed for them; the {@code /v1/account/*} endpoints require the Bearer
 * token. The session installs a {@code Supplier<String>} bearer-token provider
 * that lazily logs in and transparently refreshes the token before it expires.
 *
 * <pre>{@code
 * AuthSession session = AuthSession.fromApiKey("YOUR_API_KEY");
 * AccountApi account = new AccountApi(session.getApiClient());
 * account.v1AccountApiKeysGet();
 *
 * AuthSession session = AuthSession.fromClientCredentials("CLIENT_ID", "CLIENT_SECRET");
 * }</pre>
 */
public class AuthSession {

  private final ApiClient apiClient;
  private final AuthenticationApi authApi;
  private final String apiKey;
  private final String clientId;
  private final String clientSecret;
  private final Duration skew;
  private final Object lock = new Object();

  private AuthTokenPair tokenPair;
  private Instant expiresAt;

  /** Build a session from an API key. */
  public static AuthSession fromApiKey(String apiKey) {
    return new AuthSession(apiKey, null, null, null, 60);
  }

  /** Build a session from an API key, overriding the base path. */
  public static AuthSession fromApiKey(String apiKey, String basePath) {
    return new AuthSession(apiKey, null, null, basePath, 60);
  }

  /** Build a session from OAuth client credentials. */
  public static AuthSession fromClientCredentials(String clientId, String clientSecret) {
    return new AuthSession(null, clientId, clientSecret, null, 60);
  }

  /** Build a session from OAuth client credentials, overriding the base path. */
  public static AuthSession fromClientCredentials(String clientId, String clientSecret, String basePath) {
    return new AuthSession(null, clientId, clientSecret, basePath, 60);
  }

  AuthSession(String apiKey, String clientId, String clientSecret, String basePath, long skewSeconds) {
    if (apiKey == null && (clientId == null || clientSecret == null)) {
      throw new IllegalArgumentException("provide an apiKey, or clientId and clientSecret");
    }
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.skew = Duration.ofSeconds(skewSeconds);

    this.apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    if (apiKey != null) {
      apiClient.setApiKey(apiKey); // X-API-Key for data endpoints
    }
    apiClient.setBearerToken(this::bearerToken); // Bearer for account (and OAuth) calls

    ApiClient authClient = new ApiClient();
    if (basePath != null) {
      authClient.setBasePath(basePath);
    }
    this.authApi = new AuthenticationApi(authClient);
  }

  /** The auth-configured client. Pass it to any generated *Api constructor. */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /** Returns a currently-valid Bearer token, logging in or refreshing as needed. */
  String bearerToken() {
    synchronized (lock) {
      try {
        if (tokenPair != null && !expired()) {
          return tokenPair.getAccessToken();
        }
        tokenPair =
            (tokenPair != null && tokenPair.getRefreshToken() != null) ? refresh() : login();
        expiresAt = computeExpiry(tokenPair);
        return tokenPair.getAccessToken();
      } catch (ApiException e) {
        throw new IllegalStateException("Odditt authentication failed: " + e.getMessage(), e);
      }
    }
  }

  private AuthTokenPair login() throws ApiException {
    if (apiKey != null) {
      return authApi.v1AuthLoginPost(apiKey);
    }
    return authApi.v1OauthLoginPost(
        new AuthOAuthLoginRequest().clientId(clientId).clientSecret(clientSecret));
  }

  private AuthTokenPair refresh() throws ApiException {
    AuthRefreshRequest request = new AuthRefreshRequest().refreshToken(tokenPair.getRefreshToken());
    try {
      return apiKey != null ? authApi.v1AuthRefreshPost(request) : authApi.v1OauthRefreshPost(request);
    } catch (ApiException e) {
      return login(); // a rejected refresh token falls back to a full login
    }
  }

  private boolean expired() {
    return expiresAt == null || !Instant.now().isBefore(expiresAt.minus(skew));
  }

  static Instant computeExpiry(AuthTokenPair pair) {
    if (pair.getExpiresAt() != null) {
      return pair.getExpiresAt().toInstant();
    }
    Long seconds = pair.getExpiresIn();
    long value = (seconds != null && seconds > 0) ? seconds : 3600L;
    return Instant.now().plusSeconds(value);
  }
}
