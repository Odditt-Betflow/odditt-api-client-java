# TrendsApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1TrendsByBettingMarketPositionPost**](TrendsApi.md#v1TrendsByBettingMarketPositionPost) | **POST** /v1/trends/by-betting-market-position | Get flows by betting market position IDs |
| [**v1TrendsFlowGraphDataFactFlowIdGet**](TrendsApi.md#v1TrendsFlowGraphDataFactFlowIdGet) | **GET** /v1/trends/flow-graph-data/{fact_flow_id} | Get fact flow graph data |
| [**v1TrendsFlowTooltipFlowTypeFlowIdGet**](TrendsApi.md#v1TrendsFlowTooltipFlowTypeFlowIdGet) | **GET** /v1/trends/flow-tooltip/{flow_type}/{flow_id} | Get flow tooltip payload |
| [**v1TrendsFlowsByIdPost**](TrendsApi.md#v1TrendsFlowsByIdPost) | **POST** /v1/trends/flows-by-id | Get flows by ids |
| [**v1TrendsFlowsPost**](TrendsApi.md#v1TrendsFlowsPost) | **POST** /v1/trends/flows | Get flows (paginated) |
| [**v1TrendsFlowsQuotePost**](TrendsApi.md#v1TrendsFlowsQuotePost) | **POST** /v1/trends/flows/quote | Quote a batch of flows against the caller&#39;s configured check endpoint |
| [**v1TrendsFlowsQuoteSandboxPost**](TrendsApi.md#v1TrendsFlowsQuoteSandboxPost) | **POST** /v1/trends/flows/quote-sandbox | Mock operator pricing endpoint — for sandbox / development use |
| [**v1TrendsLeaguesWithAvailableFlowsGet**](TrendsApi.md#v1TrendsLeaguesWithAvailableFlowsGet) | **GET** /v1/trends/leagues-with-available-flows | Get leagues with available flows |
| [**v1TrendsMixedFlowsPost**](TrendsApi.md#v1TrendsMixedFlowsPost) | **POST** /v1/trends/mixed-flows | Get mixed flows (paginated) |
| [**v1TrendsWidgetEventPost**](TrendsApi.md#v1TrendsWidgetEventPost) | **POST** /v1/trends/widget/event | Submit a widget telemetry event |


<a id="v1TrendsByBettingMarketPositionPost"></a>
# **v1TrendsByBettingMarketPositionPost**
> Object v1TrendsByBettingMarketPositionPost(v1TrendsByBettingMarketPositionPostRequest)

Get flows by betting market position IDs

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    V1TrendsByBettingMarketPositionPostRequest v1TrendsByBettingMarketPositionPostRequest = new V1TrendsByBettingMarketPositionPostRequest(); // V1TrendsByBettingMarketPositionPostRequest | 
    try {
      Object result = apiInstance.v1TrendsByBettingMarketPositionPost(v1TrendsByBettingMarketPositionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsByBettingMarketPositionPost");
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
| **v1TrendsByBettingMarketPositionPostRequest** | [**V1TrendsByBettingMarketPositionPostRequest**](V1TrendsByBettingMarketPositionPostRequest.md)|  | |

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
| **200** | OK. Each record carries &#x60;flow_type&#x3D;fact_flow&#x60; and &#x60;fact_flow_type&#x3D;multi&#x60;. |  -  |

<a id="v1TrendsFlowGraphDataFactFlowIdGet"></a>
# **v1TrendsFlowGraphDataFactFlowIdGet**
> Object v1TrendsFlowGraphDataFactFlowIdGet(factFlowId)

Get fact flow graph data

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    Long factFlowId = 56L; // Long | The fact flow ID to get graph data for
    try {
      Object result = apiInstance.v1TrendsFlowGraphDataFactFlowIdGet(factFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowGraphDataFactFlowIdGet");
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
| **factFlowId** | **Long**| The fact flow ID to get graph data for | |

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

<a id="v1TrendsFlowTooltipFlowTypeFlowIdGet"></a>
# **v1TrendsFlowTooltipFlowTypeFlowIdGet**
> Object v1TrendsFlowTooltipFlowTypeFlowIdGet(flowType, flowId)

Get flow tooltip payload

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    String flowType = "fact"; // String | Type of flow (fact or fun)
    Long flowId = 56L; // Long | The flow ID to get tooltip data for
    try {
      Object result = apiInstance.v1TrendsFlowTooltipFlowTypeFlowIdGet(flowType, flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowTooltipFlowTypeFlowIdGet");
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
| **flowType** | **String**| Type of flow (fact or fun) | [enum: fact, fun] |
| **flowId** | **Long**| The flow ID to get tooltip data for | |

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

<a id="v1TrendsFlowsByIdPost"></a>
# **v1TrendsFlowsByIdPost**
> Object v1TrendsFlowsByIdPost(v1TrendsFlowsByIdPostRequest)

Get flows by ids

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    V1TrendsFlowsByIdPostRequest v1TrendsFlowsByIdPostRequest = new V1TrendsFlowsByIdPostRequest(); // V1TrendsFlowsByIdPostRequest | 
    try {
      Object result = apiInstance.v1TrendsFlowsByIdPost(v1TrendsFlowsByIdPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowsByIdPost");
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
| **v1TrendsFlowsByIdPostRequest** | [**V1TrendsFlowsByIdPostRequest**](V1TrendsFlowsByIdPostRequest.md)|  | |

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
| **200** | OK. Every record carries a &#x60;flow_type&#x60; string with one of: &#x60;fact_flow&#x60;, &#x60;fun_flow&#x60;, &#x60;fact_flow_parlay&#x60;, &#x60;fun_flow_parlay&#x60;, &#x60;plain_flow_parlay&#x60;. Parlay records also include the same field on each entry of their nested &#x60;flows&#x60; array. Records with &#x60;flow_type&#x3D;fact_flow&#x60; additionally carry a &#x60;fact_flow_type&#x60; string with one of: &#x60;base&#x60;, &#x60;expanded&#x60;, &#x60;multi&#x60;. Inside parlay records, fact_flow entries in the nested &#x60;flows&#x60; array are always &#x60;base&#x60;. |  -  |

<a id="v1TrendsFlowsPost"></a>
# **v1TrendsFlowsPost**
> Object v1TrendsFlowsPost(v1TrendsFlowsPostRequest)

Get flows (paginated)

Same parameters as mixed-flows but returns non-mixed (single-type) flows. Uses the same underlying request model.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    V1TrendsFlowsPostRequest v1TrendsFlowsPostRequest = new V1TrendsFlowsPostRequest(); // V1TrendsFlowsPostRequest | 
    try {
      Object result = apiInstance.v1TrendsFlowsPost(v1TrendsFlowsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowsPost");
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
| **v1TrendsFlowsPostRequest** | [**V1TrendsFlowsPostRequest**](V1TrendsFlowsPostRequest.md)|  | |

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
| **200** | OK. Every record carries a &#x60;flow_type&#x60; string with one of: &#x60;fact_flow&#x60;, &#x60;fun_flow&#x60;, &#x60;fact_flow_parlay&#x60;, &#x60;fun_flow_parlay&#x60;, &#x60;plain_flow_parlay&#x60;. Parlay records also include the same field on each entry of their nested &#x60;flows&#x60; array. Records with &#x60;flow_type&#x3D;fact_flow&#x60; additionally carry a &#x60;fact_flow_type&#x60; string with one of: &#x60;base&#x60;, &#x60;expanded&#x60;, &#x60;multi&#x60;. Inside parlay records, fact_flow entries in the nested &#x60;flows&#x60; array are always &#x60;base&#x60;. |  -  |

<a id="v1TrendsFlowsQuotePost"></a>
# **v1TrendsFlowsQuotePost**
> List&lt;TrendsQuoteItemResult&gt; v1TrendsFlowsQuotePost(trendsQuoteFlowItem)

Quote a batch of flows against the caller&#39;s configured check endpoint

Accepts a JSON array of 1..50 flow specifications and, for each one, forwards a hydrated payload to the URL the caller has registered under &#x60;/v1/account/check-endpoint&#x60;. Outbound calls run in parallel; the response is a JSON array with one entry per input item, in input order. Per-item failures are encoded in each entry&#39;s &#x60;status&#x60; (and &#x60;body&#x60;) so one bad operator response does not poison the others. Batch-level failures map to HTTP 4xx without an array body — 412 when the caller has not configured a check endpoint, 422 on validation failure.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    List<TrendsQuoteFlowItem> trendsQuoteFlowItem = Arrays.asList(); // List<TrendsQuoteFlowItem> | 
    try {
      List<TrendsQuoteItemResult> result = apiInstance.v1TrendsFlowsQuotePost(trendsQuoteFlowItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowsQuotePost");
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
| **trendsQuoteFlowItem** | [**List&lt;TrendsQuoteFlowItem&gt;**](TrendsQuoteFlowItem.md)|  | |

### Return type

[**List&lt;TrendsQuoteItemResult&gt;**](TrendsQuoteItemResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of per-item results in input order. |  -  |
| **400** | Malformed request body. |  -  |
| **412** | Caller has not configured a check endpoint. |  -  |
| **422** | Validation failed (empty batch, batch too large, or any item failed field validation). |  -  |

<a id="v1TrendsFlowsQuoteSandboxPost"></a>
# **v1TrendsFlowsQuoteSandboxPost**
> TrendsQuoteSandboxResponse v1TrendsFlowsQuoteSandboxPost(trendsQuoteSandboxRequest)

Mock operator pricing endpoint — for sandbox / development use

Drop-in stand-in for a real operator&#39;s pricing endpoint. Accepts ONE hydrated pricing payload (the exact shape that /v1/trends/flows/quote POSTs to a configured check endpoint) and returns synthetic pricing- response data with deterministic &#x60;button_payload&#x60; values and randomly- injected failure modes (~15% rate). Integrators wire this URL into /v1/account/check-endpoint as &#x60;url&#x60; to round-trip the widget call entirely on platform infrastructure without a real operator. Not for production traffic.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    TrendsQuoteSandboxRequest trendsQuoteSandboxRequest = new TrendsQuoteSandboxRequest(); // TrendsQuoteSandboxRequest | 
    try {
      TrendsQuoteSandboxResponse result = apiInstance.v1TrendsFlowsQuoteSandboxPost(trendsQuoteSandboxRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsFlowsQuoteSandboxPost");
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
| **trendsQuoteSandboxRequest** | [**TrendsQuoteSandboxRequest**](TrendsQuoteSandboxRequest.md)|  | |

### Return type

[**TrendsQuoteSandboxResponse**](TrendsQuoteSandboxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mock pricing response, shape depends on single vs parlay. |  -  |
| **400** | Malformed request body. |  -  |
| **422** | Validation failed. |  -  |

<a id="v1TrendsLeaguesWithAvailableFlowsGet"></a>
# **v1TrendsLeaguesWithAvailableFlowsGet**
> Object v1TrendsLeaguesWithAvailableFlowsGet(sportId, sportKey)

Get leagues with available flows

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    Long sportId = 56L; // Long | 
    String sportKey = "sportKey_example"; // String | Sport external key (e.g. 'american-football'). Format: {sport_key}. Alternative to sport_id. If both are provided, sport_id takes precedence.
    try {
      Object result = apiInstance.v1TrendsLeaguesWithAvailableFlowsGet(sportId, sportKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsLeaguesWithAvailableFlowsGet");
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
| **sportId** | **Long**|  | [optional] |
| **sportKey** | **String**| Sport external key (e.g. &#39;american-football&#39;). Format: {sport_key}. Alternative to sport_id. If both are provided, sport_id takes precedence. | [optional] |

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

<a id="v1TrendsMixedFlowsPost"></a>
# **v1TrendsMixedFlowsPost**
> Object v1TrendsMixedFlowsPost(v1TrendsFlowsPostRequest)

Get mixed flows (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

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

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    V1TrendsFlowsPostRequest v1TrendsFlowsPostRequest = new V1TrendsFlowsPostRequest(); // V1TrendsFlowsPostRequest | 
    try {
      Object result = apiInstance.v1TrendsMixedFlowsPost(v1TrendsFlowsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsMixedFlowsPost");
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
| **v1TrendsFlowsPostRequest** | [**V1TrendsFlowsPostRequest**](V1TrendsFlowsPostRequest.md)|  | |

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
| **200** | OK. Every record carries a &#x60;flow_type&#x60; string with one of: &#x60;fact_flow&#x60;, &#x60;fun_flow&#x60;, &#x60;fact_flow_parlay&#x60;, &#x60;fun_flow_parlay&#x60;, &#x60;plain_flow_parlay&#x60;. Parlay records also include the same field on each entry of their nested &#x60;flows&#x60; array. Records with &#x60;flow_type&#x3D;fact_flow&#x60; additionally carry a &#x60;fact_flow_type&#x60; string with one of: &#x60;base&#x60;, &#x60;expanded&#x60;, &#x60;multi&#x60;. Inside parlay records, fact_flow entries in the nested &#x60;flows&#x60; array are always &#x60;base&#x60;. |  -  |

<a id="v1TrendsWidgetEventPost"></a>
# **v1TrendsWidgetEventPost**
> TrendsWidgetEventResponse v1TrendsWidgetEventPost(trendsWidgetEventRequest)

Submit a widget telemetry event

Records a single client-side widget interaction (impression, click, dwell, or cart action) for analytics. Accepts a typed envelope &#x60;{event_type, mode, event_body}&#x60;: &#x60;event_type&#x60; is a closed enum naming the interaction, optional &#x60;mode&#x60; describes the widget mode, and &#x60;event_body&#x60; is an arbitrary JSON object whose shape depends on the event. Available only to widget API keys. Fire-and-forget: returns &#x60;202 Accepted&#x60; once the event is queued; the response does not guarantee durable storage.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.TrendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.odditt.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TrendsApi apiInstance = new TrendsApi(defaultClient);
    TrendsWidgetEventRequest trendsWidgetEventRequest = new TrendsWidgetEventRequest(); // TrendsWidgetEventRequest | 
    try {
      TrendsWidgetEventResponse result = apiInstance.v1TrendsWidgetEventPost(trendsWidgetEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrendsApi#v1TrendsWidgetEventPost");
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
| **trendsWidgetEventRequest** | [**TrendsWidgetEventRequest**](TrendsWidgetEventRequest.md)|  | |

### Return type

[**TrendsWidgetEventResponse**](TrendsWidgetEventResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Event accepted for asynchronous processing. |  -  |
| **400** | Malformed request body. |  -  |
| **403** | The API key is not a widget key. |  -  |
| **422** | Validation failed (unknown event_type, invalid mode, missing event_body, or event_body is not a JSON object). |  -  |

