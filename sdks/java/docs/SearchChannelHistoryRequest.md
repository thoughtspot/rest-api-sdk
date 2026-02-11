

# SearchChannelHistoryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | Type of communication channel to search history for. |  |
|**jobIds** | **List&lt;String&gt;** | List of job execution record IDs to retrieve. |  [optional] |
|**channelIdentifiers** | **List&lt;String&gt;** | List of channel IDs or names to filter by. |  [optional] |
|**channelStatus** | [**ChannelStatusEnum**](#ChannelStatusEnum) | Filter by channel delivery status. |  [optional] |
|**events** | [**List&lt;ChannelHistoryEventInput&gt;**](ChannelHistoryEventInput.md) | Filter by events that triggered the channel. |  [optional] |
|**startEpochTimeInMillis** | **Object** | Filter records created on or after this time (epoch milliseconds). |  [optional] |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;WEBHOOK&quot; |



## Enum: ChannelStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| RETRY | &quot;RETRY&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


