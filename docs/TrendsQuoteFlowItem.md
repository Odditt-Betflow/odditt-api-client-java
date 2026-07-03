

# TrendsQuoteFlowItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** | ISO 3166-1 alpha-2 country code (e.g. &#39;US&#39;, &#39;IT&#39;). Uppercased server-side. |  |
|**eventBettingMarketPositionIds** | **List&lt;Long&gt;** | Leg identifiers that make up this flow. Length 1 &#x3D; single, length 2+ &#x3D; parlay. |  |
|**flowId** | **Long** |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**region** | **String** | Sub-national region code (e.g. &#39;NJ&#39;, &#39;WA&#39;). Uppercased server-side. |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| FACT_FLOW | &quot;fact_flow&quot; |
| FUN_FLOW | &quot;fun_flow&quot; |
| FACT_FLOW_PARLAY | &quot;fact_flow_parlay&quot; |
| FUN_FLOW_PARLAY | &quot;fun_flow_parlay&quot; |
| PLAIN_FLOW_PARLAY | &quot;plain_flow_parlay&quot; |



