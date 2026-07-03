# ReportingApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesLinksClicksGet**](ReportingApi.md#v1AffiliatesLinksClicksGet) | **GET** /v1/affiliates/links/clicks | Impression/click rollups |
| [**v1AffiliatesLinksInventorySummaryGet**](ReportingApi.md#v1AffiliatesLinksInventorySummaryGet) | **GET** /v1/affiliates/links/inventory-summary | Inventory counts |


<a id="v1AffiliatesLinksClicksGet"></a>
# **v1AffiliatesLinksClicksGet**
> Object v1AffiliatesLinksClicksGet(startDate, endDate, operatorId, countryCode, subnationalRegionCode, offerCampaign, offerLabel)

Impression/click rollups

Per-link, per-day impression and click counts for the authenticated client.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReportingApi;

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

    ReportingApi apiInstance = new ReportingApi(defaultClient);
    LocalDate startDate = LocalDate.now(); // LocalDate | 
    LocalDate endDate = LocalDate.now(); // LocalDate | 
    Long operatorId = 56L; // Long | 
    String countryCode = "countryCode_example"; // String | 
    String subnationalRegionCode = "subnationalRegionCode_example"; // String | 
    String offerCampaign = "offerCampaign_example"; // String | 
    String offerLabel = "offerLabel_example"; // String | 
    try {
      Object result = apiInstance.v1AffiliatesLinksClicksGet(startDate, endDate, operatorId, countryCode, subnationalRegionCode, offerCampaign, offerLabel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#v1AffiliatesLinksClicksGet");
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
| **startDate** | **LocalDate**|  | |
| **endDate** | **LocalDate**|  | |
| **operatorId** | **Long**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **subnationalRegionCode** | **String**|  | [optional] |
| **offerCampaign** | **String**|  | [optional] |
| **offerLabel** | **String**|  | [optional] |

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
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLinksInventorySummaryGet"></a>
# **v1AffiliatesLinksInventorySummaryGet**
> Object v1AffiliatesLinksInventorySummaryGet(groupBy)

Inventory counts

Active/inactive link counts grouped by the requested dimension.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReportingApi;

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

    ReportingApi apiInstance = new ReportingApi(defaultClient);
    String groupBy = "operator"; // String | 
    try {
      Object result = apiInstance.v1AffiliatesLinksInventorySummaryGet(groupBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#v1AffiliatesLinksInventorySummaryGet");
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
| **groupBy** | **String**|  | [optional] [default to operator] [enum: operator, subnational_region, offer_campaign, offer_label, operator_subnational_region, operator_offer_campaign] |

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
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

