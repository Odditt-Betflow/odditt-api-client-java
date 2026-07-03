

# TrendsQuoteSandboxRequest

Single hydrated pricing payload — the exact shape /v1/trends/flows/quote sends in each outbound call. Wire this endpoint into /v1/account/check-endpoint to round-trip the widget call entirely on platform infrastructure (no real operator needed).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** |  |  |
|**eventBettingMarketPositionMaps** | **List&lt;Object&gt;** | Hydrated leg array, identical to what the quote endpoint POSTs to a real operator. Pass it through unchanged. |  |
|**flowId** | **Long** |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**region** | **String** |  |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| FACT_FLOW | &quot;fact_flow&quot; |
| FUN_FLOW | &quot;fun_flow&quot; |
| FACT_FLOW_PARLAY | &quot;fact_flow_parlay&quot; |
| FUN_FLOW_PARLAY | &quot;fun_flow_parlay&quot; |
| PLAIN_FLOW_PARLAY | &quot;plain_flow_parlay&quot; |



