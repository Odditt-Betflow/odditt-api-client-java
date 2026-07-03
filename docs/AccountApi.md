# AccountApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AccountApiKeysGet**](AccountApi.md#v1AccountApiKeysGet) | **GET** /v1/account/api-keys | List own API keys |
| [**v1AccountApiKeysKeyCodeDelete**](AccountApi.md#v1AccountApiKeysKeyCodeDelete) | **DELETE** /v1/account/api-keys/{key_code} | Deactivate an API key |
| [**v1AccountApiKeysPost**](AccountApi.md#v1AccountApiKeysPost) | **POST** /v1/account/api-keys | Create a new API key |
| [**v1AccountCheckEndpointDelete**](AccountApi.md#v1AccountCheckEndpointDelete) | **DELETE** /v1/account/check-endpoint | Delete the check endpoint |
| [**v1AccountCheckEndpointGet**](AccountApi.md#v1AccountCheckEndpointGet) | **GET** /v1/account/check-endpoint | Get the configured check endpoint |
| [**v1AccountCheckEndpointPost**](AccountApi.md#v1AccountCheckEndpointPost) | **POST** /v1/account/check-endpoint | Set the check endpoint (upsert) |
| [**v1AccountConfigGet**](AccountApi.md#v1AccountConfigGet) | **GET** /v1/account/config | Get own client configuration |
| [**v1AccountSecretPost**](AccountApi.md#v1AccountSecretPost) | **POST** /v1/account/secret | Create a new client secret |
| [**v1AccountSecretsGet**](AccountApi.md#v1AccountSecretsGet) | **GET** /v1/account/secrets | List own client secrets |
| [**v1AccountSecretsSecretCodeDelete**](AccountApi.md#v1AccountSecretsSecretCodeDelete) | **DELETE** /v1/account/secrets/{secret_code} | Delete a client secret |
| [**v1AccountUsageGet**](AccountApi.md#v1AccountUsageGet) | **GET** /v1/account/usage | Get own usage stats |


<a id="v1AccountApiKeysGet"></a>
# **v1AccountApiKeysGet**
> AuthListAPIKeysResponse v1AccountApiKeysGet()

List own API keys

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      AuthListAPIKeysResponse result = apiInstance.v1AccountApiKeysGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountApiKeysGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthListAPIKeysResponse**](AuthListAPIKeysResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of API keys |  -  |
| **401** | Missing or invalid credentials. |  -  |

<a id="v1AccountApiKeysKeyCodeDelete"></a>
# **v1AccountApiKeysKeyCodeDelete**
> v1AccountApiKeysKeyCodeDelete(keyCode)

Deactivate an API key

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    UUID keyCode = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.v1AccountApiKeysKeyCodeDelete(keyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountApiKeysKeyCodeDelete");
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
| **keyCode** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API key deactivated |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **409** | The request conflicts with the current resource state. Uses the account-envelope shape &#x60;{ \&quot;success\&quot;: false, \&quot;error\&quot;: \&quot;...\&quot; }&#x60; rather than the standard error envelope. |  -  |

<a id="v1AccountApiKeysPost"></a>
# **v1AccountApiKeysPost**
> AuthCreateAPIKeyResponse v1AccountApiKeysPost(authCreateAPIKeyRequest)

Create a new API key

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AuthCreateAPIKeyRequest authCreateAPIKeyRequest = new AuthCreateAPIKeyRequest(); // AuthCreateAPIKeyRequest | 
    try {
      AuthCreateAPIKeyResponse result = apiInstance.v1AccountApiKeysPost(authCreateAPIKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountApiKeysPost");
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
| **authCreateAPIKeyRequest** | [**AuthCreateAPIKeyRequest**](AuthCreateAPIKeyRequest.md)|  | |

### Return type

[**AuthCreateAPIKeyResponse**](AuthCreateAPIKeyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | API key created (plaintext returned once) |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |

<a id="v1AccountCheckEndpointDelete"></a>
# **v1AccountCheckEndpointDelete**
> v1AccountCheckEndpointDelete()

Delete the check endpoint

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      apiInstance.v1AccountCheckEndpointDelete();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountCheckEndpointDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check endpoint deleted |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **409** | The request conflicts with the current resource state. Uses the account-envelope shape &#x60;{ \&quot;success\&quot;: false, \&quot;error\&quot;: \&quot;...\&quot; }&#x60; rather than the standard error envelope. |  -  |

<a id="v1AccountCheckEndpointGet"></a>
# **v1AccountCheckEndpointGet**
> AuthCheckEndpointResponse v1AccountCheckEndpointGet()

Get the configured check endpoint

Returns the URL, method and bearer token preview for the check endpoint used by flow quoting. The full bearer token is never returned.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      AuthCheckEndpointResponse result = apiInstance.v1AccountCheckEndpointGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountCheckEndpointGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthCheckEndpointResponse**](AuthCheckEndpointResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check endpoint configuration (or null data if not configured) |  -  |
| **401** | Missing or invalid credentials. |  -  |

<a id="v1AccountCheckEndpointPost"></a>
# **v1AccountCheckEndpointPost**
> AuthCheckEndpointResponse v1AccountCheckEndpointPost(authSetCheckEndpointRequest)

Set the check endpoint (upsert)

Stores or updates the URL, method and bearer token used to quote flows against the client&#39;s own service. A single configuration exists per client.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    AuthSetCheckEndpointRequest authSetCheckEndpointRequest = new AuthSetCheckEndpointRequest(); // AuthSetCheckEndpointRequest | 
    try {
      AuthCheckEndpointResponse result = apiInstance.v1AccountCheckEndpointPost(authSetCheckEndpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountCheckEndpointPost");
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
| **authSetCheckEndpointRequest** | [**AuthSetCheckEndpointRequest**](AuthSetCheckEndpointRequest.md)|  | |

### Return type

[**AuthCheckEndpointResponse**](AuthCheckEndpointResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check endpoint stored |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |

<a id="v1AccountConfigGet"></a>
# **v1AccountConfigGet**
> v1AccountConfigGet()

Get own client configuration

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      apiInstance.v1AccountConfigGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountConfigGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Client configuration |  -  |
| **401** | Missing or invalid credentials. |  -  |

<a id="v1AccountSecretPost"></a>
# **v1AccountSecretPost**
> AuthCreateSecretResponse v1AccountSecretPost()

Create a new client secret

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      AuthCreateSecretResponse result = apiInstance.v1AccountSecretPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountSecretPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthCreateSecretResponse**](AuthCreateSecretResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Secret created (plaintext returned once) |  -  |
| **401** | Missing or invalid credentials. |  -  |

<a id="v1AccountSecretsGet"></a>
# **v1AccountSecretsGet**
> AuthListSecretsResponse v1AccountSecretsGet()

List own client secrets

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      AuthListSecretsResponse result = apiInstance.v1AccountSecretsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountSecretsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthListSecretsResponse**](AuthListSecretsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of secrets |  -  |
| **401** | Missing or invalid credentials. |  -  |

<a id="v1AccountSecretsSecretCodeDelete"></a>
# **v1AccountSecretsSecretCodeDelete**
> v1AccountSecretsSecretCodeDelete(secretCode)

Delete a client secret

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    UUID secretCode = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.v1AccountSecretsSecretCodeDelete(secretCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountSecretsSecretCodeDelete");
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
| **secretCode** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret deleted |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **409** | The request conflicts with the current resource state. Uses the account-envelope shape &#x60;{ \&quot;success\&quot;: false, \&quot;error\&quot;: \&quot;...\&quot; }&#x60; rather than the standard error envelope. |  -  |

<a id="v1AccountUsageGet"></a>
# **v1AccountUsageGet**
> v1AccountUsageGet(startDate, endDate)

Get own usage stats

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      apiInstance.v1AccountUsageGet(startDate, endDate);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountUsageGet");
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
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data |  -  |
| **401** | Missing or invalid credentials. |  -  |

