

# AuthCheckEndpointResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultiple** | **Boolean** |  |  [optional] |
|**authHeaderName** | **String** |  |  [optional] |
|**authScheme** | **String** | May be empty for raw-value header schemes like &#39;X-API-Key&#39;. |  [optional] |
|**authTokenPreview** | **String** | Masked preview of the stored auth token (e.g. \&quot;…aB3x\&quot;). The full token is never returned. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**url** | **URI** |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;POST&quot; |



