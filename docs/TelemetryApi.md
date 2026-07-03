# TelemetryApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesEventsPost**](TelemetryApi.md#v1AffiliatesEventsPost) | **POST** /v1/affiliates/events | Log an impression or click |


<a id="v1AffiliatesEventsPost"></a>
# **v1AffiliatesEventsPost**
> v1AffiliatesEventsPost(v1AffiliatesEventsPostRequest)

Log an impression or click

Fire-and-forget telemetry. Records one impression (card render) or click (deeplink tap). Returns 202 on accept; never blocks the widget&#39;s click-out.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TelemetryApi;

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

    TelemetryApi apiInstance = new TelemetryApi(defaultClient);
    V1AffiliatesEventsPostRequest v1AffiliatesEventsPostRequest = new V1AffiliatesEventsPostRequest(); // V1AffiliatesEventsPostRequest | 
    try {
      apiInstance.v1AffiliatesEventsPost(v1AffiliatesEventsPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TelemetryApi#v1AffiliatesEventsPost");
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
| **v1AffiliatesEventsPostRequest** | [**V1AffiliatesEventsPostRequest**](V1AffiliatesEventsPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |

