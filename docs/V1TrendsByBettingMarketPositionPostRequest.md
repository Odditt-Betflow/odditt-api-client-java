

# V1TrendsByBettingMarketPositionPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventBettingMarketPositionIds** | **List&lt;Long&gt;** | Array of event betting market position IDs |  |
|**oddsFormat** | [**OddsFormatEnum**](#OddsFormatEnum) | Odds display format. Defaults per product_mode (dfs→multiplier, prediction_market→percent, else american). |  [optional] |
|**productMode** | [**ProductModeEnum**](#ProductModeEnum) | Display mode. dfs rewrites stat lines to MORE/LESS; on the paginated flows endpoints it also auto-filters to over/under player props (entity_type&#x3D;player, positions [4,5]) unless an entity/position filter is set. |  [optional] |
|**useCartoonImages** | **Boolean** | When true, the logo fields on each flow, leg, and multi-trend slot (default_logo_url, logo_url_1, logo_url_2) are replaced with cartoon-jersey image URLs derived from the relevant team, player, or league. When false or omitted, the original logo URLs are returned. Defaults to false. |  [optional] |



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



