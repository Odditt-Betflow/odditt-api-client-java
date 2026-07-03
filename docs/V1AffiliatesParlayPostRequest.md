

# V1AffiliatesParlayPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional] |
|**eventBettingMarketPositionIds** | **List&lt;Long&gt;** | The event betting market positions that make up the parlay legs. |  |
|**hideOffersLinks** | **Boolean** | When true, offer metadata is returned without the deep-link URLs. |  [optional] |
|**oddsFormat** | [**OddsFormatEnum**](#OddsFormatEnum) | Odds display format. Defaults per product_mode (dfs→multiplier, prediction_market→percent, else american). |  [optional] |
|**offerCampaign** | **String** | Optional campaign filter. Renders only offers tagged with this campaign. |  [optional] |
|**operatorIds** | **List&lt;Long&gt;** | Optional list of operator IDs to gate which operators appear in the cart. |  [optional] |
|**operatorKeys** | **List&lt;String&gt;** | Optional operator external keys (e.g. &#39;draftkings&#39;). Resolved IDs are merged with operator_ids. |  [optional] |
|**productMode** | [**ProductModeEnum**](#ProductModeEnum) | Display mode. dfs rewrites leg stat lines to MORE/LESS. |  [optional] |
|**subnationalRegionCode** | **String** | ISO 3166-2 subnational region code (used for offer/deeplink resolution). |  [optional] |



## Enum: OddsFormatEnum

| Name | Value |
|---- | -----|
| AMERICAN | &quot;american&quot; |
| DECIMAL | &quot;decimal&quot; |
| FRACTIONAL | &quot;fractional&quot; |
| MULTIPLIER | &quot;multiplier&quot; |
| PERCENT | &quot;percent&quot; |



## Enum: ProductModeEnum

| Name | Value |
|---- | -----|
| SPORTSBOOK | &quot;sportsbook&quot; |
| DFS | &quot;dfs&quot; |
| PREDICTION_MARKET | &quot;prediction_market&quot; |



