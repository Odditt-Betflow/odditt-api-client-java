# AuthenticationApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AuthLoginPost**](AuthenticationApi.md#v1AuthLoginPost) | **POST** /v1/auth/login | Login with API key |
| [**v1AuthRefreshPost**](AuthenticationApi.md#v1AuthRefreshPost) | **POST** /v1/auth/refresh | Refresh tokens |
| [**v1OauthLoginPost**](AuthenticationApi.md#v1OauthLoginPost) | **POST** /v1/oauth/login | OAuth login (client credentials) |
| [**v1OauthRefreshPost**](AuthenticationApi.md#v1OauthRefreshPost) | **POST** /v1/oauth/refresh | OAuth refresh |


<a id="v1AuthLoginPost"></a>
# **v1AuthLoginPost**
> AuthTokenPair v1AuthLoginPost(xAPIKey)

Login with API key

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String xAPIKey = "xAPIKey_example"; // String | 
    try {
      AuthTokenPair result = apiInstance.v1AuthLoginPost(xAPIKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthLoginPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xAPIKey** | **String**|  | |

### Return type

[**AuthTokenPair**](AuthTokenPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token pair |  -  |

<a id="v1AuthRefreshPost"></a>
# **v1AuthRefreshPost**
> AuthTokenPair v1AuthRefreshPost(authRefreshRequest)

Refresh tokens

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    AuthRefreshRequest authRefreshRequest = new AuthRefreshRequest(); // AuthRefreshRequest | 
    try {
      AuthTokenPair result = apiInstance.v1AuthRefreshPost(authRefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1AuthRefreshPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authRefreshRequest** | [**AuthRefreshRequest**](AuthRefreshRequest.md)|  | |

### Return type

[**AuthTokenPair**](AuthTokenPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token pair |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |

<a id="v1OauthLoginPost"></a>
# **v1OauthLoginPost**
> AuthTokenPair v1OauthLoginPost(authOAuthLoginRequest)

OAuth login (client credentials)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    AuthOAuthLoginRequest authOAuthLoginRequest = new AuthOAuthLoginRequest(); // AuthOAuthLoginRequest | 
    try {
      AuthTokenPair result = apiInstance.v1OauthLoginPost(authOAuthLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1OauthLoginPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authOAuthLoginRequest** | [**AuthOAuthLoginRequest**](AuthOAuthLoginRequest.md)|  | |

### Return type

[**AuthTokenPair**](AuthTokenPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token pair |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |

<a id="v1OauthRefreshPost"></a>
# **v1OauthRefreshPost**
> AuthTokenPair v1OauthRefreshPost(authRefreshRequest)

OAuth refresh

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    AuthRefreshRequest authRefreshRequest = new AuthRefreshRequest(); // AuthRefreshRequest | 
    try {
      AuthTokenPair result = apiInstance.v1OauthRefreshPost(authRefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#v1OauthRefreshPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authRefreshRequest** | [**AuthRefreshRequest**](AuthRefreshRequest.md)|  | |

### Return type

[**AuthTokenPair**](AuthTokenPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token pair |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |

