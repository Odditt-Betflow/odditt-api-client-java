# ReferencesApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1ReferencesBettingMarketCategoriesGet**](ReferencesApi.md#v1ReferencesBettingMarketCategoriesGet) | **GET** /v1/references/betting-market-categories | Get betting market categories |
| [**v1ReferencesBettingMarketPositionsGet**](ReferencesApi.md#v1ReferencesBettingMarketPositionsGet) | **GET** /v1/references/betting-market-positions | Get all betting market positions |
| [**v1ReferencesBettingMarketsGet**](ReferencesApi.md#v1ReferencesBettingMarketsGet) | **GET** /v1/references/betting-markets | Get betting markets (paginated) |
| [**v1ReferencesCountriesGet**](ReferencesApi.md#v1ReferencesCountriesGet) | **GET** /v1/references/countries | Get countries (paginated) |
| [**v1ReferencesEventPeriodsGet**](ReferencesApi.md#v1ReferencesEventPeriodsGet) | **GET** /v1/references/event-periods | Get event periods |
| [**v1ReferencesLeaguesGet**](ReferencesApi.md#v1ReferencesLeaguesGet) | **GET** /v1/references/leagues | Get leagues (paginated) |
| [**v1ReferencesOddsFormatGet**](ReferencesApi.md#v1ReferencesOddsFormatGet) | **GET** /v1/references/odds-format | Get odds formats (paginated) |
| [**v1ReferencesOperatorsGet**](ReferencesApi.md#v1ReferencesOperatorsGet) | **GET** /v1/references/operators | Get operators (paginated) |
| [**v1ReferencesPlayersGet**](ReferencesApi.md#v1ReferencesPlayersGet) | **GET** /v1/references/players | Get players (paginated) |
| [**v1ReferencesSportsGet**](ReferencesApi.md#v1ReferencesSportsGet) | **GET** /v1/references/sports | Get sports (paginated) |
| [**v1ReferencesSubnationalRegionsGet**](ReferencesApi.md#v1ReferencesSubnationalRegionsGet) | **GET** /v1/references/subnational-regions | Get subnational regions (paginated) |
| [**v1ReferencesTagDimensionsGet**](ReferencesApi.md#v1ReferencesTagDimensionsGet) | **GET** /v1/references/tag-dimensions | Get tag dimensions |
| [**v1ReferencesTagTypesSearchGet**](ReferencesApi.md#v1ReferencesTagTypesSearchGet) | **GET** /v1/references/tag-types/search | Search tag types |
| [**v1ReferencesTagTypesTagTypeIdChildrenGet**](ReferencesApi.md#v1ReferencesTagTypesTagTypeIdChildrenGet) | **GET** /v1/references/tag-types/{tag_type_id}/children | Get child tag types |
| [**v1ReferencesTeamsGet**](ReferencesApi.md#v1ReferencesTeamsGet) | **GET** /v1/references/teams | Get teams (paginated) |


<a id="v1ReferencesBettingMarketCategoriesGet"></a>
# **v1ReferencesBettingMarketCategoriesGet**
> Object v1ReferencesBettingMarketCategoriesGet(sportId, sportKey)

Get betting market categories

Returns available betting market categories, optionally filtered by sport.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long sportId = 56L; // Long | 
    String sportKey = "sportKey_example"; // String | Sport external key (e.g. 'american-football'). Alternative to sport_id. If both are provided, sport_id takes precedence.
    try {
      Object result = apiInstance.v1ReferencesBettingMarketCategoriesGet(sportId, sportKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesBettingMarketCategoriesGet");
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
| **sportKey** | **String**| Sport external key (e.g. &#39;american-football&#39;). Alternative to sport_id. If both are provided, sport_id takes precedence. | [optional] |

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

<a id="v1ReferencesBettingMarketPositionsGet"></a>
# **v1ReferencesBettingMarketPositionsGet**
> Object v1ReferencesBettingMarketPositionsGet()

Get all betting market positions

Returns all available betting market positions.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    try {
      Object result = apiInstance.v1ReferencesBettingMarketPositionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesBettingMarketPositionsGet");
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

<a id="v1ReferencesBettingMarketsGet"></a>
# **v1ReferencesBettingMarketsGet**
> Object v1ReferencesBettingMarketsGet(sportId, sportKey, search, page, pageSize)

Get betting markets (paginated)

Returns a paginated list of betting markets with optional sport filter and text search.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long sportId = 56L; // Long | 
    String sportKey = "sportKey_example"; // String | Sport external key (e.g. 'american-football'). Alternative to sport_id. If both are provided, sport_id takes precedence.
    String search = "search_example"; // String | Text search filter for betting market names
    Long page = 1L; // Long | Page number for pagination
    Long pageSize = 100L; // Long | Number of results per page
    try {
      Object result = apiInstance.v1ReferencesBettingMarketsGet(sportId, sportKey, search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesBettingMarketsGet");
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
| **sportKey** | **String**| Sport external key (e.g. &#39;american-football&#39;). Alternative to sport_id. If both are provided, sport_id takes precedence. | [optional] |
| **search** | **String**| Text search filter for betting market names | [optional] |
| **page** | **Long**| Page number for pagination | [optional] [default to 1] |
| **pageSize** | **Long**| Number of results per page | [optional] [default to 100] |

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

<a id="v1ReferencesCountriesGet"></a>
# **v1ReferencesCountriesGet**
> TrendsPaginatedResponse v1ReferencesCountriesGet(search, page, pageSize)

Get countries (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String search = "search_example"; // String | Search by country name
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesCountriesGet(search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesCountriesGet");
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
| **search** | **String**| Search by country name | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesEventPeriodsGet"></a>
# **v1ReferencesEventPeriodsGet**
> Object v1ReferencesEventPeriodsGet(sportId, sportKey)

Get event periods

Returns available event periods, optionally filtered by sport.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long sportId = 56L; // Long | 
    String sportKey = "sportKey_example"; // String | Sport external key (e.g. 'american-football'). Alternative to sport_id. If both are provided, sport_id takes precedence.
    try {
      Object result = apiInstance.v1ReferencesEventPeriodsGet(sportId, sportKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesEventPeriodsGet");
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
| **sportKey** | **String**| Sport external key (e.g. &#39;american-football&#39;). Alternative to sport_id. If both are provided, sport_id takes precedence. | [optional] |

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

<a id="v1ReferencesLeaguesGet"></a>
# **v1ReferencesLeaguesGet**
> Object v1ReferencesLeaguesGet(countryId, sportId, sportKey, search, isPopular, page, pageSize, searchMode)

Get leagues (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long countryId = 56L; // Long | 
    Long sportId = 56L; // Long | 
    String sportKey = "sportKey_example"; // String | Sport external key (e.g. 'american-football'). Format: {sport_key}. Alternative to sport_id. If both are provided, sport_id takes precedence.
    String search = "search_example"; // String | 
    Boolean isPopular = true; // Boolean | 
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    String searchMode = "searchMode_example"; // String | Search mode (e.g. exact match vs partial). When omitted, uses default search behavior.
    try {
      Object result = apiInstance.v1ReferencesLeaguesGet(countryId, sportId, sportKey, search, isPopular, page, pageSize, searchMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesLeaguesGet");
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
| **countryId** | **Long**|  | [optional] |
| **sportId** | **Long**|  | [optional] |
| **sportKey** | **String**| Sport external key (e.g. &#39;american-football&#39;). Format: {sport_key}. Alternative to sport_id. If both are provided, sport_id takes precedence. | [optional] |
| **search** | **String**|  | [optional] |
| **isPopular** | **Boolean**|  | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |
| **searchMode** | **String**| Search mode (e.g. exact match vs partial). When omitted, uses default search behavior. | [optional] |

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

<a id="v1ReferencesOddsFormatGet"></a>
# **v1ReferencesOddsFormatGet**
> TrendsPaginatedResponse v1ReferencesOddsFormatGet(search, page, pageSize)

Get odds formats (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String search = "search_example"; // String | 
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesOddsFormatGet(search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesOddsFormatGet");
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
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesOperatorsGet"></a>
# **v1ReferencesOperatorsGet**
> TrendsPaginatedResponse v1ReferencesOperatorsGet(search, page, pageSize)

Get operators (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String search = "search_example"; // String | Search by operator display name
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesOperatorsGet(search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesOperatorsGet");
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
| **search** | **String**| Search by operator display name | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesPlayersGet"></a>
# **v1ReferencesPlayersGet**
> Object v1ReferencesPlayersGet(teamId, teamKey, search, page, pageSize, searchMode)

Get players (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long teamId = 56L; // Long | 
    String teamKey = "teamKey_example"; // String | Team external key (e.g. 'new-england-patriots', 'nfl.new-england-patriots'). Format: {team_key} or {league_key}.{team_key}. Alternative to team_id. If both are provided, team_id takes precedence.
    String search = "search_example"; // String | 
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    String searchMode = "searchMode_example"; // String | Search mode (e.g. exact match vs partial). When omitted, uses default search behavior.
    try {
      Object result = apiInstance.v1ReferencesPlayersGet(teamId, teamKey, search, page, pageSize, searchMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesPlayersGet");
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
| **teamId** | **Long**|  | [optional] |
| **teamKey** | **String**| Team external key (e.g. &#39;new-england-patriots&#39;, &#39;nfl.new-england-patriots&#39;). Format: {team_key} or {league_key}.{team_key}. Alternative to team_id. If both are provided, team_id takes precedence. | [optional] |
| **search** | **String**|  | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |
| **searchMode** | **String**| Search mode (e.g. exact match vs partial). When omitted, uses default search behavior. | [optional] |

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

<a id="v1ReferencesSportsGet"></a>
# **v1ReferencesSportsGet**
> TrendsPaginatedResponse v1ReferencesSportsGet(search, page, pageSize)

Get sports (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String search = "search_example"; // String | 
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesSportsGet(search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesSportsGet");
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
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesSubnationalRegionsGet"></a>
# **v1ReferencesSubnationalRegionsGet**
> TrendsPaginatedResponse v1ReferencesSubnationalRegionsGet(countryId, search, page, pageSize)

Get subnational regions (paginated)

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long countryId = 56L; // Long | Country ID to filter subnational regions
    String search = "search_example"; // String | Search by subnational region name
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesSubnationalRegionsGet(countryId, search, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesSubnationalRegionsGet");
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
| **countryId** | **Long**| Country ID to filter subnational regions | |
| **search** | **String**| Search by subnational region name | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesTagDimensionsGet"></a>
# **v1ReferencesTagDimensionsGet**
> V1ReferencesTagDimensionsGet200Response v1ReferencesTagDimensionsGet(flowType)

Get tag dimensions

Returns the top-level tag dimension categories. Use these as entry points to explore the tag hierarchy. Optionally filter to dimensions relevant to a specific flow type.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String flowType = "fact_flows"; // String | Filter by flow type eligibility.
    try {
      V1ReferencesTagDimensionsGet200Response result = apiInstance.v1ReferencesTagDimensionsGet(flowType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesTagDimensionsGet");
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
| **flowType** | **String**| Filter by flow type eligibility. | [optional] [enum: fact_flows, fun_flows, plain_flows, parlays, singles] |

### Return type

[**V1ReferencesTagDimensionsGet200Response**](V1ReferencesTagDimensionsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesTagTypesSearchGet"></a>
# **v1ReferencesTagTypesSearchGet**
> TrendsPaginatedResponse v1ReferencesTagTypesSearchGet(search, searchMode, dimension, flowType, terminalOnly, tagLevel, page, pageSize)

Search tag types

Search across tag types by keyword. Returns paginated results with breadcrumb paths for disambiguation. Use terminal_only combined with flow_type to find only tags that are usable as filters for a specific flow type.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    String search = "search_example"; // String | 
    String searchMode = "starts_with"; // String | How the search term is matched. Defaults to 'starts_with'.
    String dimension = "dimension_example"; // String | Limit results to a specific dimension (e.g. 'event', 'metadata').
    String flowType = "fact_flows"; // String | Filter by flow type eligibility.
    Boolean terminalOnly = false; // Boolean | When true, returns only terminal (filterable) tag types.
    Long tagLevel = 56L; // Long | Restrict results to a specific hierarchy depth.
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    try {
      TrendsPaginatedResponse result = apiInstance.v1ReferencesTagTypesSearchGet(search, searchMode, dimension, flowType, terminalOnly, tagLevel, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesTagTypesSearchGet");
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
| **searchMode** | **String**| How the search term is matched. Defaults to &#39;starts_with&#39;. | [optional] [enum: starts_with, ends_with, contains] |
| **dimension** | **String**| Limit results to a specific dimension (e.g. &#39;event&#39;, &#39;metadata&#39;). | [optional] |
| **flowType** | **String**| Filter by flow type eligibility. | [optional] [enum: fact_flows, fun_flows, plain_flows, parlays, singles] |
| **terminalOnly** | **Boolean**| When true, returns only terminal (filterable) tag types. | [optional] [default to false] |
| **tagLevel** | **Long**| Restrict results to a specific hierarchy depth. | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |

### Return type

[**TrendsPaginatedResponse**](TrendsPaginatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesTagTypesTagTypeIdChildrenGet"></a>
# **v1ReferencesTagTypesTagTypeIdChildrenGet**
> V1ReferencesTagTypesTagTypeIdChildrenGet200Response v1ReferencesTagTypesTagTypeIdChildrenGet(tagTypeId, includeValues, flowType)

Get child tag types

Returns the direct children of a given tag type, along with context about the parent (description and known values). Use this to navigate the tag hierarchy from dimensions down to individual filterable tags.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long tagTypeId = 56L; // Long | Parent tag type ID to drill into.
    Boolean includeValues = false; // Boolean | When true, includes individual value-level leaf tags in the results. When false (default), value-level leaves are omitted — the parent's known_values field already enumerates them.
    String flowType = "fact_flows"; // String | Filter by flow type eligibility.
    try {
      V1ReferencesTagTypesTagTypeIdChildrenGet200Response result = apiInstance.v1ReferencesTagTypesTagTypeIdChildrenGet(tagTypeId, includeValues, flowType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesTagTypesTagTypeIdChildrenGet");
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
| **tagTypeId** | **Long**| Parent tag type ID to drill into. | |
| **includeValues** | **Boolean**| When true, includes individual value-level leaf tags in the results. When false (default), value-level leaves are omitted — the parent&#39;s known_values field already enumerates them. | [optional] [default to false] |
| **flowType** | **String**| Filter by flow type eligibility. | [optional] [enum: fact_flows, fun_flows, plain_flows, parlays, singles] |

### Return type

[**V1ReferencesTagTypesTagTypeIdChildrenGet200Response**](V1ReferencesTagTypesTagTypeIdChildrenGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="v1ReferencesTeamsGet"></a>
# **v1ReferencesTeamsGet**
> Object v1ReferencesTeamsGet(leagueId, leagueKey, search, page, pageSize, searchMode, startDate, endDate)

Get teams (paginated)

Returns a paginated list of teams. When neither &#x60;start_date&#x60; nor &#x60;end_date&#x60; is provided, only teams whose affiliation is currently active are returned. When either date is provided, the result is filtered to teams whose affiliation overlapped the requested window — useful for looking up teams that played in a league during a past season. 

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.ReferencesApi;

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

    ReferencesApi apiInstance = new ReferencesApi(defaultClient);
    Long leagueId = 56L; // Long | 
    String leagueKey = "leagueKey_example"; // String | League external key (e.g. 'nba', 'united-states.nba'). Format: {league_key} or {country_key}.{league_key}. Alternative to league_id. If both are provided, league_id takes precedence.
    String search = "search_example"; // String | 
    Long page = 1L; // Long | 
    Long pageSize = 20L; // Long | 
    String searchMode = "searchMode_example"; // String | Search mode (e.g. exact match vs partial). When omitted, uses default search behavior.
    String startDate = "startDate_example"; // String | Inclusive lower bound on the event/affiliation date, ISO format YYYY-MM-DD.
    String endDate = "endDate_example"; // String | Inclusive upper bound on the event/affiliation date, ISO format YYYY-MM-DD.
    try {
      Object result = apiInstance.v1ReferencesTeamsGet(leagueId, leagueKey, search, page, pageSize, searchMode, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencesApi#v1ReferencesTeamsGet");
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
| **leagueId** | **Long**|  | [optional] |
| **leagueKey** | **String**| League external key (e.g. &#39;nba&#39;, &#39;united-states.nba&#39;). Format: {league_key} or {country_key}.{league_key}. Alternative to league_id. If both are provided, league_id takes precedence. | [optional] |
| **search** | **String**|  | [optional] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 20] |
| **searchMode** | **String**| Search mode (e.g. exact match vs partial). When omitted, uses default search behavior. | [optional] |
| **startDate** | **String**| Inclusive lower bound on the event/affiliation date, ISO format YYYY-MM-DD. | [optional] |
| **endDate** | **String**| Inclusive upper bound on the event/affiliation date, ISO format YYYY-MM-DD. | [optional] |

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

