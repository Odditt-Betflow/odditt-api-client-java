

# TrendsQuoteSandboxResponse

Mock pricing response. Shape differs between single (1-leg) and parlay (2+ legs); parlay responses additionally carry top-level combined odds and is_combinable / parlay_failure_reason.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**americanOddsValue** | **String** | Parlay only. Null when uncombinable. |  [optional] |
|**buttonPayload** | **String** | Synthetic bet-slip identifier (prefix &#39;FD-MOCK-&#39;). Null when the result is invalid or the parlay is uncombinable. |  [optional] |
|**decimalOddsValue** | **BigDecimal** |  |  [optional] |
|**eventBettingMarketPositionMaps** | **List&lt;Object&gt;** |  |  |
|**flowId** | **Long** |  |  |
|**flowType** | **String** |  |  |
|**fractionalOddsValue** | **String** |  |  [optional] |
|**isCombinable** | **Boolean** | Parlay only. False if any leg failed or the parlay-level uncombinable roll fired. |  [optional] |
|**oddsImpliedProbability** | **BigDecimal** |  |  [optional] |
|**parlayFailureReason** | [**ParlayFailureReasonEnum**](#ParlayFailureReasonEnum) |  |  [optional] |
|**payoutMultiplier** | **BigDecimal** |  |  [optional] |



## Enum: ParlayFailureReasonEnum

| Name | Value |
|---- | -----|
| ONE_OR_MORE_LEGS_FAILED | &quot;one or more legs failed&quot; |
| SELECTIONS_ARE_NOT_COMBINABLE | &quot;selections are not combinable&quot; |



