

# V1TrendsFlowsByIdPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**factFlowType** | [**FactFlowTypeEnum**](#FactFlowTypeEnum) | Sub-type for fact flows. Defaults to &#39;base&#39; if omitted. |  [optional] |
|**flowIds** | **List&lt;Long&gt;** | Array of flow IDs to retrieve |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**useCartoonImages** | **Boolean** | When true, the logo fields on each flow, leg, and multi-trend slot (default_logo_url, logo_url_1, logo_url_2) are replaced with cartoon-jersey image URLs derived from the relevant team, player, or league. When false or omitted, the original logo URLs are returned. Defaults to false. |  [optional] |



## Enum: FactFlowTypeEnum

| Name | Value |
|---- | -----|
| BASE | &quot;base&quot; |
| EXPANDED | &quot;expanded&quot; |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| FACT_FLOW | &quot;fact_flow&quot; |
| FUN_FLOW | &quot;fun_flow&quot; |
| FACT_FLOW_PARLAY | &quot;fact_flow_parlay&quot; |
| FUN_FLOW_PARLAY | &quot;fun_flow_parlay&quot; |
| PLAIN_FLOW_PARLAY | &quot;plain_flow_parlay&quot; |



