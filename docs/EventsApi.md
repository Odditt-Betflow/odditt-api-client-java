# EventsApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1EventsUpcomingEventsPost**](EventsApi.md#v1EventsUpcomingEventsPost) | **POST** /v1/events/upcoming-events | Get upcoming events |


<a id="v1EventsUpcomingEventsPost"></a>
# **v1EventsUpcomingEventsPost**
> Object v1EventsUpcomingEventsPost(v1EventsUpcomingEventsPostRequest)

Get upcoming events

Returns upcoming events with optional sport and league filters, timezone support, and pagination.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    V1EventsUpcomingEventsPostRequest v1EventsUpcomingEventsPostRequest = new V1EventsUpcomingEventsPostRequest(); // V1EventsUpcomingEventsPostRequest | 
    try {
      Object result = apiInstance.v1EventsUpcomingEventsPost(v1EventsUpcomingEventsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#v1EventsUpcomingEventsPost");
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
| **v1EventsUpcomingEventsPostRequest** | [**V1EventsUpcomingEventsPostRequest**](V1EventsUpcomingEventsPostRequest.md)|  | |

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

