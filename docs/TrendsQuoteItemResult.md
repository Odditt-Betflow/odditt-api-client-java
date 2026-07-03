

# TrendsQuoteItemResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **Object** | Operator response passthrough on 200, error envelope otherwise. |  |
|**flowId** | **Long** |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | HTTP-style status code for this single item. 200 &#x3D; success, 404 &#x3D; flow not resolvable, 502 &#x3D; upstream returned non-2xx or non-JSON, 504 &#x3D; upstream timed out. |  |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| FACT_FLOW | &quot;fact_flow&quot; |
| FUN_FLOW | &quot;fun_flow&quot; |
| FACT_FLOW_PARLAY | &quot;fact_flow_parlay&quot; |
| FUN_FLOW_PARLAY | &quot;fun_flow_parlay&quot; |
| PLAIN_FLOW_PARLAY | &quot;plain_flow_parlay&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_200 | 200 |
| NUMBER_404 | 404 |
| NUMBER_500 | 500 |
| NUMBER_502 | 502 |
| NUMBER_504 | 504 |



