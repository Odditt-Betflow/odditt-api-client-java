# OddsApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1OddsUpcomingOddsByEventPost**](OddsApi.md#v1OddsUpcomingOddsByEventPost) | **POST** /v1/odds/upcoming-odds-by-event | Get upcoming odds by event |


<a id="v1OddsUpcomingOddsByEventPost"></a>
# **v1OddsUpcomingOddsByEventPost**
> Object v1OddsUpcomingOddsByEventPost(v1OddsUpcomingOddsByEventPostRequest)

Get upcoming odds by event

Returns paginated betting market positions for a specific upcoming event, optionally filtered by operator.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.OddsApi;

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

    OddsApi apiInstance = new OddsApi(defaultClient);
    V1OddsUpcomingOddsByEventPostRequest v1OddsUpcomingOddsByEventPostRequest = new V1OddsUpcomingOddsByEventPostRequest(); // V1OddsUpcomingOddsByEventPostRequest | 
    try {
      Object result = apiInstance.v1OddsUpcomingOddsByEventPost(v1OddsUpcomingOddsByEventPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OddsApi#v1OddsUpcomingOddsByEventPost");
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
| **v1OddsUpcomingOddsByEventPostRequest** | [**V1OddsUpcomingOddsByEventPostRequest**](V1OddsUpcomingOddsByEventPostRequest.md)|  | |

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

