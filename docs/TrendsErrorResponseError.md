

# TrendsErrorResponseError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | Machine-readable error code. Possible values:   * &#x60;BAD_REQUEST&#x60; — malformed request, invalid path/query parameter, or JSON type mismatch in the body. Returned with HTTP 400.   * &#x60;VALIDATION_ERROR&#x60; — one or more request fields failed validation rules; the message names each offending field. Returned with HTTP 422 (Unprocessable Entity).   * &#x60;AMBIGUOUS_LOOKUP&#x60; — a slug identifier matched more than one record; qualify it (e.g. &#x60;country/league&#x60;) and retry.   * &#x60;UNAUTHORIZED&#x60; — missing or invalid credentials.   * &#x60;FORBIDDEN&#x60; — authenticated but not permitted to access this resource.   * &#x60;NOT_FOUND&#x60; — resource does not exist.   * &#x60;RATE_LIMIT_EXCEEDED&#x60; — too many requests.   * &#x60;INTERNAL_ERROR&#x60; — unexpected server error.  |  |
|**message** | **String** | Human-readable explanation of the error. For &#x60;VALIDATION_ERROR&#x60; responses, names the offending field(s) and the rule that failed. |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;BAD_REQUEST&quot; |
| VALIDATION_ERROR | &quot;VALIDATION_ERROR&quot; |
| AMBIGUOUS_LOOKUP | &quot;AMBIGUOUS_LOOKUP&quot; |
| UNAUTHORIZED | &quot;UNAUTHORIZED&quot; |
| FORBIDDEN | &quot;FORBIDDEN&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |
| RATE_LIMIT_EXCEEDED | &quot;RATE_LIMIT_EXCEEDED&quot; |
| INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot; |



