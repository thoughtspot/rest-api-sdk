

# CommunicationChannelValidateResponse

Response containing validation results for communication channel configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | Type of communication channel that was validated. |  |
|**channelId** | **String** | ID of the communication channel (e.g., webhook_id). |  |
|**channelName** | **String** | Name of the communication channel (e.g., webhook name). |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Event type that was validated. |  |
|**resultCode** | [**ResultCodeEnum**](#ResultCodeEnum) | Overall result of the validation. |  |
|**details** | [**List&lt;ChannelValidationDetail&gt;**](ChannelValidationDetail.md) | Detailed results of various validation sub-steps. |  [optional] |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;WEBHOOK&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD_SCHEDULE | &quot;LIVEBOARD_SCHEDULE&quot; |



## Enum: ResultCodeEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| PARTIAL_SUCCESS | &quot;PARTIAL_SUCCESS&quot; |


## Implemented Interfaces

* Serializable


