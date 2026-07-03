# LinksApi

All URIs are relative to *https://api.odditt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AffiliatesLinksBulkDeactivatePost**](LinksApi.md#v1AffiliatesLinksBulkDeactivatePost) | **POST** /v1/affiliates/links/bulk-deactivate | Bulk deactivate links by filter |
| [**v1AffiliatesLinksBulkPatch**](LinksApi.md#v1AffiliatesLinksBulkPatch) | **PATCH** /v1/affiliates/links/bulk | Bulk patch links by filter |
| [**v1AffiliatesLinksBulkPost**](LinksApi.md#v1AffiliatesLinksBulkPost) | **POST** /v1/affiliates/links/bulk | Bulk create/upsert links (JSON or CSV) |
| [**v1AffiliatesLinksJobsGet**](LinksApi.md#v1AffiliatesLinksJobsGet) | **GET** /v1/affiliates/links/jobs | List async bulk jobs |
| [**v1AffiliatesLinksJobsJobIdGet**](LinksApi.md#v1AffiliatesLinksJobsJobIdGet) | **GET** /v1/affiliates/links/jobs/{job_id} | Poll an async bulk job |
| [**v1AffiliatesLinksPost**](LinksApi.md#v1AffiliatesLinksPost) | **POST** /v1/affiliates/links | Create or upsert a single link |


<a id="v1AffiliatesLinksBulkDeactivatePost"></a>
# **v1AffiliatesLinksBulkDeactivatePost**
> Object v1AffiliatesLinksBulkDeactivatePost(v1AffiliatesLinksBulkDeactivatePostRequest)

Bulk deactivate links by filter

Soft-deletes all links matching a filter (e.g. a state goes offline).

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    V1AffiliatesLinksBulkDeactivatePostRequest v1AffiliatesLinksBulkDeactivatePostRequest = new V1AffiliatesLinksBulkDeactivatePostRequest(); // V1AffiliatesLinksBulkDeactivatePostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesLinksBulkDeactivatePost(v1AffiliatesLinksBulkDeactivatePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksBulkDeactivatePost");
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
| **v1AffiliatesLinksBulkDeactivatePostRequest** | [**V1AffiliatesLinksBulkDeactivatePostRequest**](V1AffiliatesLinksBulkDeactivatePostRequest.md)|  | |

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

<a id="v1AffiliatesLinksBulkPatch"></a>
# **v1AffiliatesLinksBulkPatch**
> Object v1AffiliatesLinksBulkPatch(v1AffiliatesLinksBulkPatchRequest)

Bulk patch links by filter

Applies a patch to all links matching a filter (e.g. rewrite all FanDuel-NJ URLs on a domain change).

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    V1AffiliatesLinksBulkPatchRequest v1AffiliatesLinksBulkPatchRequest = new V1AffiliatesLinksBulkPatchRequest(); // V1AffiliatesLinksBulkPatchRequest | 
    try {
      Object result = apiInstance.v1AffiliatesLinksBulkPatch(v1AffiliatesLinksBulkPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksBulkPatch");
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
| **v1AffiliatesLinksBulkPatchRequest** | [**V1AffiliatesLinksBulkPatchRequest**](V1AffiliatesLinksBulkPatchRequest.md)|  | |

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

<a id="v1AffiliatesLinksBulkPost"></a>
# **v1AffiliatesLinksBulkPost**
> Object v1AffiliatesLinksBulkPost(requestBody, dryRun, async)

Bulk create/upsert links (JSON or CSV)

Upserts many links idempotently on the natural key. Accepts a JSON array of row objects or a text/csv body (header row). Per-row errors never fail the batch. Use ?dry_run&#x3D;true to validate without persisting.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    List<Object> requestBody = null; // List<Object> | 
    Boolean dryRun = true; // Boolean | When true, validates the whole batch and returns the per-row report without persisting. Always synchronous.
    Boolean async = true; // Boolean | Force background processing. Batches of 500+ rows are queued automatically regardless of this flag. Queued batches return 202 with a job_id to poll at /v1/affiliates/links/jobs/{job_id}.
    try {
      Object result = apiInstance.v1AffiliatesLinksBulkPost(requestBody, dryRun, async);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksBulkPost");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)|  | |
| **dryRun** | **Boolean**| When true, validates the whole batch and returns the per-row report without persisting. Always synchronous. | [optional] |
| **async** | **Boolean**| Force background processing. Batches of 500+ rows are queued automatically regardless of this flag. Queued batches return 202 with a job_id to poll at /v1/affiliates/links/jobs/{job_id}. | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/csv
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Processed synchronously |  -  |
| **202** | Accepted for background processing. |  -  |
| **400** | The request was malformed. |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **422** | One or more fields failed validation; the message names each offending field. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLinksJobsGet"></a>
# **v1AffiliatesLinksJobsGet**
> Object v1AffiliatesLinksJobsGet()

List async bulk jobs

Recent async bulk jobs for the authenticated client.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    try {
      Object result = apiInstance.v1AffiliatesLinksJobsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksJobsGet");
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
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLinksJobsJobIdGet"></a>
# **v1AffiliatesLinksJobsJobIdGet**
> Object v1AffiliatesLinksJobsJobIdGet(jobId)

Poll an async bulk job

Status, counts, and per-row errors for one async bulk job. Poll until status is \&quot;completed\&quot; or \&quot;failed\&quot;. Scoped to the authenticated client.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      Object result = apiInstance.v1AffiliatesLinksJobsJobIdGet(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksJobsJobIdGet");
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
| **jobId** | **UUID**|  | |

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
| **400** | The request was malformed. |  -  |
| **403** | Authenticated but not permitted to access this resource. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | Unexpected server error. |  -  |

<a id="v1AffiliatesLinksPost"></a>
# **v1AffiliatesLinksPost**
> Object v1AffiliatesLinksPost(v1AffiliatesLinksPostRequest)

Create or upsert a single link

Creates a link, or updates the existing one on the natural key (operator + geography + category + campaign + label). Resolves operator, country, and region at write time; unresolvable codes return 422.

### Example
```java
// Import classes:
import com.odditt.apiclient.ApiClient;
import com.odditt.apiclient.ApiException;
import com.odditt.apiclient.Configuration;
import com.odditt.apiclient.auth.*;
import com.odditt.apiclient.models.*;
import com.odditt.apiclient.api.LinksApi;

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

    LinksApi apiInstance = new LinksApi(defaultClient);
    V1AffiliatesLinksPostRequest v1AffiliatesLinksPostRequest = new V1AffiliatesLinksPostRequest(); // V1AffiliatesLinksPostRequest | 
    try {
      Object result = apiInstance.v1AffiliatesLinksPost(v1AffiliatesLinksPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#v1AffiliatesLinksPost");
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
| **v1AffiliatesLinksPostRequest** | [**V1AffiliatesLinksPostRequest**](V1AffiliatesLinksPostRequest.md)|  | |

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

