

# AuthSetCheckEndpointRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultiple** | **Boolean** | If true, the platform sends a single POST with a JSON array of all hydrated payloads. If false (default), one POST per flow is issued in parallel. |  [optional] |
|**authHeaderName** | **String** | HTTP header name used to carry the authentication credential. Defaults to &#39;Authorization&#39;. Common alternatives: &#39;X-API-Key&#39;, &#39;X-Auth&#39;. |  [optional] |
|**authScheme** | **String** | Prefix placed before the token in the header value. Defaults to &#39;Bearer&#39; when &#39;auth_header_name&#39; is omitted. Set to an empty string for headers that take the raw value (e.g. &#39;X-API-Key&#39;). |  [optional] |
|**authToken** | **String** | Authentication credential. Stored server-side and never returned in any response. Sent as &#x60;&lt;auth_header_name&gt;: &lt;auth_scheme&gt; &lt;auth_token&gt;&#x60; (scheme omitted when empty). |  |
|**method** | [**MethodEnum**](#MethodEnum) | HTTP method used when calling the endpoint. |  |
|**url** | **URI** | Absolute URL of the check endpoint (https recommended). |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;POST&quot; |



