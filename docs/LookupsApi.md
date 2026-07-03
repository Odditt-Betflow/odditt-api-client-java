# LookupsApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesLookupsAffiliateNetworksGet**](LookupsApi.md#v1AffiliatesLookupsAffiliateNetworksGet) | **GET** /v1/affiliates/lookups/affiliate-networks | Affiliate networks |
| [**v1AffiliatesLookupsOfferCategoriesGet**](LookupsApi.md#v1AffiliatesLookupsOfferCategoriesGet) | **GET** /v1/affiliates/lookups/offer-categories | Offer categories |
| [**v1AffiliatesLookupsOperatorJurisdictionsGet**](LookupsApi.md#v1AffiliatesLookupsOperatorJurisdictionsGet) | **GET** /v1/affiliates/lookups/operator-jurisdictions | Operator jurisdictions |
| [**v1AffiliatesLookupsOperatorsGet**](LookupsApi.md#v1AffiliatesLookupsOperatorsGet) | **GET** /v1/affiliates/lookups/operators | Operators |


<a id="v1AffiliatesLookupsAffiliateNetworksGet"></a>
# **v1AffiliatesLookupsAffiliateNetworksGet**
> Object v1AffiliatesLookupsAffiliateNetworksGet()

Affiliate networks

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LookupsApi;

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

    LookupsApi apiInstance = new LookupsApi(defaultClient);
    try {
      Object result = apiInstance.v1AffiliatesLookupsAffiliateNetworksGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupsApi#v1AffiliatesLookupsAffiliateNetworksGet");
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
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLookupsOfferCategoriesGet"></a>
# **v1AffiliatesLookupsOfferCategoriesGet**
> Object v1AffiliatesLookupsOfferCategoriesGet()

Offer categories

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LookupsApi;

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

    LookupsApi apiInstance = new LookupsApi(defaultClient);
    try {
      Object result = apiInstance.v1AffiliatesLookupsOfferCategoriesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupsApi#v1AffiliatesLookupsOfferCategoriesGet");
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
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLookupsOperatorJurisdictionsGet"></a>
# **v1AffiliatesLookupsOperatorJurisdictionsGet**
> Object v1AffiliatesLookupsOperatorJurisdictionsGet(operatorId, countryCode)

Operator jurisdictions

Where we believe an operator is live. Informational only — not an upload gate.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LookupsApi;

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

    LookupsApi apiInstance = new LookupsApi(defaultClient);
    Long operatorId = 56L; // Long | 
    String countryCode = "countryCode_example"; // String | 
    try {
      Object result = apiInstance.v1AffiliatesLookupsOperatorJurisdictionsGet(operatorId, countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupsApi#v1AffiliatesLookupsOperatorJurisdictionsGet");
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
| **operatorId** | **Long**|  | [optional] |
| **countryCode** | **String**|  | [optional] |

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
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLookupsOperatorsGet"></a>
# **v1AffiliatesLookupsOperatorsGet**
> Object v1AffiliatesLookupsOperatorsGet(search, page, pageSize)

Operators

Paginated list of operators, optionally filtered by a free-text search term.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LookupsApi;

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

    LookupsApi apiInstance = new LookupsApi(defaultClient);
    String search = "search_example"; // String | 
    Integer page = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    try {
      Object result = apiInstance.v1AffiliatesLookupsOperatorsGet(search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupsApi#v1AffiliatesLookupsOperatorsGet");
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
| **search** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |

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
| **500** | Unexpected server error. |  -  |

