# AffiliatesApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesEventPositionPost**](AffiliatesApi.md#v1AffiliatesEventPositionPost) | **POST** /v1/affiliates/event-position | Single-bet cart for affiliate mode |
| [**v1AffiliatesParlayPost**](AffiliatesApi.md#v1AffiliatesParlayPost) | **POST** /v1/affiliates/parlay | Parlay cart for affiliate mode |


<a id="v1AffiliatesEventPositionPost"></a>
# **v1AffiliatesEventPositionPost**
> Object v1AffiliatesEventPositionPost(v1AffiliatesEventPositionPostRequest)

Single-bet cart for affiliate mode

Returns live odds across operators for a single event betting market position, overlaid with the calling client&#39;s best affiliate offer per operator. Powers the widget&#39;s \&quot;Bet Now\&quot; cart for a single selection. Results are scoped to the authenticated client; operators can be gated with operator_ids / operator_keys.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AffiliatesApi;

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

    AffiliatesApi apiInstance = new AffiliatesApi(defaultClient);
    V1AffiliatesEventPositionPostRequest v1AffiliatesEventPositionPostRequest = new V1AffiliatesEventPositionPostRequest(); // V1AffiliatesEventPositionPostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesEventPositionPost(v1AffiliatesEventPositionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AffiliatesApi#v1AffiliatesEventPositionPost");
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
| **v1AffiliatesEventPositionPostRequest** | [**V1AffiliatesEventPositionPostRequest**](V1AffiliatesEventPositionPostRequest.md)|  | |

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

<a id="v1AffiliatesParlayPost"></a>
# **v1AffiliatesParlayPost**
> Object v1AffiliatesParlayPost(v1AffiliatesParlayPostRequest)

Parlay cart for affiliate mode

Returns combined parlay odds per operator, the per-leg single bets, and the calling client&#39;s best affiliate offer per operator, with combo deeplinks generated per operator. Powers the widget&#39;s \&quot;Bet Now\&quot; cart for a multi-leg bet. Results are scoped to the authenticated client; operators can be gated with operator_ids / operator_keys.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.AffiliatesApi;

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

    AffiliatesApi apiInstance = new AffiliatesApi(defaultClient);
    V1AffiliatesParlayPostRequest v1AffiliatesParlayPostRequest = new V1AffiliatesParlayPostRequest(); // V1AffiliatesParlayPostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesParlayPost(v1AffiliatesParlayPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AffiliatesApi#v1AffiliatesParlayPost");
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
| **v1AffiliatesParlayPostRequest** | [**V1AffiliatesParlayPostRequest**](V1AffiliatesParlayPostRequest.md)|  | |

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

