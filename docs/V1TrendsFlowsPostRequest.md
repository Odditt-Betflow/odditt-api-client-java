

# V1TrendsFlowsPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**betType** | [**BetTypeEnum**](#BetTypeEnum) | Filter by bet type. If omitted, returns mixed singles and parlays. |  [optional] |
|**bettingMarketCategoryId** | **Long** | Deprecated — use &#x60;betting_market_category_ids&#x60; instead (e.g. Shooting Props, Game Props etc.). A bare &#x60;betting_market_category_id&#x60; is treated as &#x60;betting_market_category_ids: [betting_market_category_id]&#x60;. |  [optional] |
|**bettingMarketCategoryIds** | **List&lt;Long&gt;** | Filter by one or more betting market category IDs (e.g. Shooting Props, Game Props etc.). Empty array &#x3D; no filter. |  [optional] |
|**bettingMarketEntityType** | [**BettingMarketEntityTypeEnum**](#BettingMarketEntityTypeEnum) | Filter by betting market entity type |  [optional] |
|**bettingMarketIds** | **List&lt;Long&gt;** | Filter by betting market IDs |  [optional] |
|**bettingMarketPositionId** | **Long** | Deprecated — use &#x60;betting_market_position_ids&#x60; instead. A bare &#x60;betting_market_position_id&#x60; is treated as &#x60;betting_market_position_ids: [betting_market_position_id]&#x60;. |  [optional] |
|**bettingMarketPositionIds** | **List&lt;Long&gt;** | Filter by one or more betting market position IDs. Empty array &#x3D; no filter. |  [optional] |
|**eventId** | **Long** | Deprecated — use &#x60;event_ids&#x60; instead. A bare &#x60;event_id&#x60; is treated as &#x60;event_ids: [event_id]&#x60;. |  [optional] |
|**eventIds** | **List&lt;Long&gt;** | Filter by one or more event IDs. Empty array &#x3D; no filter. |  [optional] |
|**eventStartDateFrom** | **OffsetDateTime** | Filter events starting on or after this value. Accepts a date (&#39;2026-04-19&#39;) or full ISO 8601 timestamp (&#39;2026-04-19T00:00:00Z&#39;). |  [optional] |
|**eventStartDateTo** | **OffsetDateTime** | Filter events starting on or before this value. Accepts a date (&#39;2026-04-26&#39;) or full ISO 8601 timestamp (&#39;2026-04-26T23:59:59Z&#39;). |  [optional] |
|**factFlowType** | [**FactFlowTypeEnum**](#FactFlowTypeEnum) | Sub-type for fact flows. Defaults to &#39;base&#39; if omitted. |  [optional] |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) | Type of flow to return. &#39;plain&#39; only returns parlays. |  [optional] |
|**focusEntityTypeId** | **Long** | Filter by focus entity type ID |  [optional] |
|**fullHitRate** | **Boolean** | When true, include full hit rate data in response |  [optional] |
|**includeAltLines** | **Boolean** | When false, exclude alt lines. Defaults to true. |  [optional] |
|**includeDeeplinks** | **Boolean** | When true, returns operator-specific odds and deeplink URLs (bet_ios_deep_link_url, bet_android_deep_link_url, bet_web_deep_link_url) for each flow. Requires exactly one operator_id in operator_ids. |  [optional] |
|**includeOnlyBasicTrends** | **Boolean** | When true, return only basic trends (omit fact flows with conditions) |  [optional] |
|**includeStarSignContent** | **Boolean** | When true, include star sign/horoscope content in flows |  [optional] |
|**leagueId** | **Long** | Deprecated — use &#x60;league_ids&#x60; instead. A bare &#x60;league_id&#x60; is treated as &#x60;league_ids: [league_id]&#x60;. |  [optional] |
|**leagueIds** | **List&lt;Long&gt;** | Filter by one or more league IDs. Empty array &#x3D; no filter. |  [optional] |
|**leagueKey** | **String** | League external key (e.g. &#39;nba&#39;, &#39;united-states.nba&#39;). Format: {league_key} or {country_key}.{league_key}. Alternative to league_id. If both are provided, league_id takes precedence. |  [optional] |
|**likelihoodType** | [**LikelihoodTypeEnum**](#LikelihoodTypeEnum) | Filter by likelihood category |  [optional] |
|**maxHitRateThreshold** | **Integer** | Maximum hit rate threshold filter (0-100) |  [optional] |
|**maxImpliedProbabilityThreshold** | **Double** | Maximum implied probability threshold filter |  [optional] |
|**minHitRateThreshold** | **Integer** | Minimum hit rate threshold filter (0-100) |  [optional] |
|**minImpliedProbabilityThreshold** | **Double** | Minimum implied probability threshold filter |  [optional] |
|**oddsFormat** | [**OddsFormatEnum**](#OddsFormatEnum) | Odds display format. Defaults per product_mode (dfs→multiplier, prediction_market→percent, else american). |  [optional] |
|**operatorIds** | **List&lt;Long&gt;** | Filter by operator IDs |  [optional] |
|**operatorKeys** | **List&lt;String&gt;** | Filter by operator external keys (e.g. &#39;draftkings&#39;). Format: {operator_key}. Resolved IDs are merged with operator_ids. |  [optional] |
|**page** | **Long** |  |  [optional] |
|**pageSize** | **Long** |  |  [optional] |
|**playerId** | **Long** | Deprecated — use &#x60;player_ids&#x60; instead. A bare &#x60;player_id&#x60; is treated as &#x60;player_ids: [player_id]&#x60;. |  [optional] |
|**playerIds** | **List&lt;Long&gt;** | Filter by one or more player IDs. Empty array &#x3D; no filter. |  [optional] |
|**playerKey** | **String** | Player external key (e.g. &#39;nikola-vucevic&#39;, &#39;chicago-bulls.tre-jones&#39;, &#39;nba.boston-celtics.nikola-vucevic&#39;). Format: {player_key} or {team_key}.{player_key} or {league_key}.{team_key}.{player_key}. Alternative to player_id. If both are provided, player_id takes precedence. |  [optional] |
|**productMode** | [**ProductModeEnum**](#ProductModeEnum) | Display mode. dfs rewrites stat lines to MORE/LESS; on the paginated flows endpoints it also auto-filters to over/under player props (entity_type&#x3D;player, positions [4,5]) unless an entity/position filter is set. |  [optional] |
|**splitType** | [**SplitTypeEnum**](#SplitTypeEnum) | Filter by split type (overs or unders) |  [optional] |
|**sportId** | **Long** | Deprecated — use &#x60;sport_ids&#x60; instead. A bare &#x60;sport_id&#x60; is treated as &#x60;sport_ids: [sport_id]&#x60;. |  [optional] |
|**sportIds** | **List&lt;Long&gt;** | Filter by one or more sport IDs. Empty array &#x3D; no filter. |  [optional] |
|**sportKey** | **String** | Sport external key (e.g. &#39;american-football&#39;). Format: {sport_key}. Alternative to sport_id. If both are provided, sport_id takes precedence. |  [optional] |
|**startingSoon** | **Boolean** | When true, only return flows for events starting soon |  [optional] |
|**teamId** | **Long** | Deprecated — use &#x60;team_ids&#x60; instead. A bare &#x60;team_id&#x60; is treated as &#x60;team_ids: [team_id]&#x60;. |  [optional] |
|**teamIds** | **List&lt;Long&gt;** | Filter by one or more team IDs. Empty array &#x3D; no filter. |  [optional] |
|**teamKey** | **String** | Team external key (e.g. &#39;new-england-patriots&#39;, &#39;nfl.new-england-patriots&#39;). Format: {team_key} or {league_key}.{team_key}. Alternative to team_id. If both are provided, team_id takes precedence. |  [optional] |
|**teamSplit** | **String** | Team split filter value |  [optional] |
|**useCartoonImages** | **Boolean** | When true, the logo fields on each flow, leg, and multi-trend slot (default_logo_url, logo_url_1, logo_url_2) are replaced with cartoon-jersey image URLs derived from the relevant team, player, or league. When false or omitted, the original logo URLs are returned. Defaults to false. |  [optional] |



## Enum: BetTypeEnum

| Name | Value |
|---- | -----|
| SINGLES | &quot;singles&quot; |
| PARLAY | &quot;parlay&quot; |
| SAME_GAME_PARLAY | &quot;same_game_parlay&quot; |



## Enum: BettingMarketEntityTypeEnum

| Name | Value |
|---- | -----|
| PLAYER | &quot;player&quot; |
| TEAM | &quot;team&quot; |
| EVENT | &quot;event&quot; |



## Enum: FactFlowTypeEnum

| Name | Value |
|---- | -----|
| BASE | &quot;base&quot; |
| EXPANDED | &quot;expanded&quot; |
| MULTI | &quot;multi&quot; |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| FACT | &quot;fact&quot; |
| FUN | &quot;fun&quot; |
| PLAIN | &quot;plain&quot; |



## Enum: LikelihoodTypeEnum

| Name | Value |
|---- | -----|
| LIKELY | &quot;likely&quot; |
| POSSIBLE | &quot;possible&quot; |
| LONGSHOT | &quot;longshot&quot; |



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



## Enum: SplitTypeEnum

| Name | Value |
|---- | -----|
| OVERS | &quot;overs&quot; |
| UNDERS | &quot;unders&quot; |



