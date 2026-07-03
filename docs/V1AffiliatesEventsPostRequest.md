

# V1AffiliatesEventsPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** |  |  |
|**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**offerCampaign** | **String** |  |  [optional] |
|**offerId** | **UUID** |  |  |
|**offerLabel** | **String** |  |  [optional] |
|**operatorId** | **Long** |  |  |
|**sessionToken** | **String** |  |  [optional] |
|**subnationalRegionCode** | **String** |  |  [optional] |



## Enum: DeviceTypeEnum

| Name | Value |
|---- | -----|
| IOS | &quot;ios&quot; |
| ANDROID | &quot;android&quot; |
| DESKTOP | &quot;desktop&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| IMPRESSION | &quot;impression&quot; |
| CLICK | &quot;click&quot; |



