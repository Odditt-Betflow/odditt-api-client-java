package com.odditt.apiclient;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.odditt.apiclient.model.AuthTokenPair;
import java.time.Instant;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

/** Unit tests for the hand-written {@link AuthSession} auth helper. */
public class AuthSessionTest {

  @Test
  public void requiresCredentials() {
    assertThrows(IllegalArgumentException.class, () -> new AuthSession(null, null, null, null, 60));
    assertThrows(IllegalArgumentException.class, () -> new AuthSession(null, "id", null, null, 60));
  }

  @Test
  public void fromApiKeyConfiguresClient() {
    AuthSession session = AuthSession.fromApiKey("my-key");
    assertNotNull(session.getApiClient());
  }

  @Test
  public void computeExpiryPrefersExpiresAt() {
    AuthTokenPair pair = new AuthTokenPair().expiresAt(OffsetDateTime.now().plusHours(1));
    assertTrue(AuthSession.computeExpiry(pair).isAfter(Instant.now().plusSeconds(3000)));
  }

  @Test
  public void computeExpiryFallsBackToExpiresIn() {
    AuthTokenPair pair = new AuthTokenPair().expiresIn(120L);
    Instant expiry = AuthSession.computeExpiry(pair);
    assertTrue(expiry.isAfter(Instant.now().plusSeconds(60)));
    assertTrue(expiry.isBefore(Instant.now().plusSeconds(180)));
  }
}
