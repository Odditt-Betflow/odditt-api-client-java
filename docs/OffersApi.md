# OffersApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesDealsPost**](OffersApi.md#v1AffiliatesDealsPost) | **POST** /v1/affiliates/deals | Paginated client deals |
| [**v1AffiliatesOffersPost**](OffersApi.md#v1AffiliatesOffersPost) | **POST** /v1/affiliates/offers | Client offer cards for a geography |


<a id="v1AffiliatesDealsPost"></a>
# **v1AffiliatesDealsPost**
> Object v1AffiliatesDealsPost(v1AffiliatesDealsPostRequest)

Paginated client deals

Paginated client deals (carousel/featured/list), optionally enriched with operator reviews. Scoped to the authenticated client.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OffersApi apiInstance = new OffersApi(defaultClient);
    V1AffiliatesDealsPostRequest v1AffiliatesDealsPostRequest = new V1AffiliatesDealsPostRequest(); // V1AffiliatesDealsPostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesDealsPost(v1AffiliatesDealsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#v1AffiliatesDealsPost");
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
| **v1AffiliatesDealsPostRequest** | [**V1AffiliatesDealsPostRequest**](V1AffiliatesDealsPostRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesOffersPost"></a>
# **v1AffiliatesOffersPost**
> Object v1AffiliatesOffersPost(v1AffiliatesOffersPostRequest)

Client offer cards for a geography

Returns the calling client&#39;s best operator offer card per operator for a geography. The core offers read the widget cart renders.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OffersApi apiInstance = new OffersApi(defaultClient);
    V1AffiliatesOffersPostRequest v1AffiliatesOffersPostRequest = new V1AffiliatesOffersPostRequest(); // V1AffiliatesOffersPostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesOffersPost(v1AffiliatesOffersPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#v1AffiliatesOffersPost");
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
| **v1AffiliatesOffersPostRequest** | [**V1AffiliatesOffersPostRequest**](V1AffiliatesOffersPostRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

