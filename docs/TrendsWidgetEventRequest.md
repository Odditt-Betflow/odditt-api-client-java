

# TrendsWidgetEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventBody** | **Map&lt;String, Object&gt;** | Arbitrary JSON object carrying event-specific fields. May be an empty object. |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The kind of client-side widget interaction being reported. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | Optional widget mode the interaction occurred in. Defaults to &#x60;clean&#x60;. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| IMPRESSION | &quot;impression&quot; |
| CLICK | &quot;click&quot; |
| DWELL | &quot;dwell&quot; |
| CART_OPEN | &quot;cart_open&quot; |
| CART_OFFERS_SHOWN | &quot;cart_offers_shown&quot; |
| CART_DISMISS | &quot;cart_dismiss&quot; |
| CARD_CLICK | &quot;card_click&quot; |
| GRAPH_EXPAND | &quot;graph_expand&quot; |
| GRAPH_METRIC_CHANGE | &quot;graph_metric_change&quot; |
| FILTER_CHANGE | &quot;filter_change&quot; |
| WIDGET_IMPRESSION | &quot;widget-impression&quot; |
| WIDGET_VIEWED | &quot;widget-viewed&quot; |
| BETSLIP_CLICKED | &quot;betslip-clicked&quot; |
| BETSLIP_SHARED | &quot;betslip-shared&quot; |
| FLOW_CLICKED | &quot;flow-clicked&quot; |
| FLOW_SHARED | &quot;flow-shared&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| OPERATOR | &quot;operator&quot; |
| AFFILIATE | &quot;affiliate&quot; |
| CLEAN | &quot;clean&quot; |



