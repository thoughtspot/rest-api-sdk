

# EventChannelConfigInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event for which communication channels are configured |  |
|**channels** | [**List&lt;ChannelsEnum&gt;**](#List&lt;ChannelsEnum&gt;) | Communication channels enabled for this event type. Empty array disables all channels for this event. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |



## Enum: List&lt;ChannelsEnum&gt;

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |
| WEBHOOK | &quot;WEBHOOK&quot; |


## Implemented Interfaces

* Serializable


