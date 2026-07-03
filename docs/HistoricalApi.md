# HistoricalApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1HistoricalEventsGet**](HistoricalApi.md#v1HistoricalEventsGet) | **GET** /v1/historical/events | List historical odds events (paginated) |
| [**v1HistoricalOddsEventIdExtGet**](HistoricalApi.md#v1HistoricalOddsEventIdExtGet) | **GET** /v1/historical/odds/{event_id}.{ext} | Download a per-event historical odds file |


<a id="v1HistoricalEventsGet"></a>
# **v1HistoricalEventsGet**
> Object v1HistoricalEventsGet(schemaVersion, sportId, leagueId, teamId, startDate, endDate, page, pageSize)

List historical odds events (paginated)

Returns a paginated catalog of per-event historical odds files the authenticated client has access to. Each result entry carries pre-baked download URLs for the JSON and CSV payloads; clients GET those URLs directly. Results are scoped to the authenticated client; callers without a client association receive &#x60;403 Forbidden&#x60;. 

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.HistoricalApi;

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

    HistoricalApi apiInstance = new HistoricalApi(defaultClient);
    String schemaVersion = "v1"; // String | Payload schema version. Defaults to `v1` when omitted. Unknown versions are rejected.
    Long sportId = 56L; // Long | 
    Long leagueId = 56L; // Long | 
    Long teamId = 56L; // Long | Filter to events involving this team as either home or away.
    String startDate = "startDate_example"; // String | Inclusive lower bound on the event/affiliation date, ISO format YYYY-MM-DD.
    String endDate = "endDate_example"; // String | Inclusive upper bound on the event/affiliation date, ISO format YYYY-MM-DD.
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      Object result = apiInstance.v1HistoricalEventsGet(schemaVersion, sportId, leagueId, teamId, startDate, endDate, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricalApi#v1HistoricalEventsGet");
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
| **schemaVersion** | **String**| Payload schema version. Defaults to &#x60;v1&#x60; when omitted. Unknown versions are rejected. | [optional] [default to v1] |
| **sportId** | **Long**|  | [optional] |
| **leagueId** | **Long**|  | [optional] |
| **teamId** | **Long**| Filter to events involving this team as either home or away. | [optional] |
| **startDate** | **String**| Inclusive lower bound on the event/affiliation date, ISO format YYYY-MM-DD. | [optional] |
| **endDate** | **String**| Inclusive upper bound on the event/affiliation date, ISO format YYYY-MM-DD. | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1HistoricalOddsEventIdExtGet"></a>
# **v1HistoricalOddsEventIdExtGet**
> Object v1HistoricalOddsEventIdExtGet(eventId, ext, schemaVersion)

Download a per-event historical odds file

Resolves the requested per-event file for the authenticated client and streams the JSON or CSV payload back. The response body is the raw file content (not the manifest envelope); the API takes care of fetching the bytes from the underlying CDN so callers see a single HTTP call per file.  The &#x60;sha256&#x60; of the bytes-at-rest is exposed as a strong &#x60;ETag&#x60;. Clients can short-circuit with &#x60;If-None-Match&#x60; to receive &#x60;304 Not Modified&#x60;. &#x60;Range&#x60; requests are forwarded upstream and &#x60;206 Partial Content&#x60; responses are relayed unchanged — useful for resuming multi-MB CSV downloads. 

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.HistoricalApi;

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

    HistoricalApi apiInstance = new HistoricalApi(defaultClient);
    Long eventId = 56L; // Long | Canonical event identifier.
    String ext = "json"; // String | File format. `json` returns `application/json`; `csv` returns `text/csv`.
    String schemaVersion = "v1"; // String | Payload schema version. Defaults to `v1` when omitted.
    try {
      Object result = apiInstance.v1HistoricalOddsEventIdExtGet(eventId, ext, schemaVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoricalApi#v1HistoricalOddsEventIdExtGet");
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
| **eventId** | **Long**| Canonical event identifier. | |
| **ext** | **String**| File format. &#x60;json&#x60; returns &#x60;application/json&#x60;; &#x60;csv&#x60; returns &#x60;text/csv&#x60;. | [enum: json, csv] |
| **schemaVersion** | **String**| Payload schema version. Defaults to &#x60;v1&#x60; when omitted. | [optional] [default to v1] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File payload streamed back to the client. |  * Content-Disposition - Always &#x60;attachment; filename&#x3D;\&quot;event_&lt;event_id&gt;.&lt;ext&gt;\&quot;&#x60;. <br>  * ETag - Strong validator based on the SHA-256 of the file bytes-at-rest. <br>  |
| **206** | Partial content when the client provided a &#x60;Range&#x60; header. |  -  |
| **304** | Not modified — the client supplied a matching &#x60;If-None-Match&#x60;. |  -  |
| **400** | The request was malformed (invalid path/query parameter or JSON type mismatch in the body). |  -  |
| **401** | Missing or invalid credentials. |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **422** | The request body was syntactically valid JSON but one or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |
| **502** | Upstream content delivery unavailable. |  -  |

