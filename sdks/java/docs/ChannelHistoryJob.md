

# ChannelHistoryJob

A single job execution record for a channel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status of this job. |  |
|**creationTimeInMillis** | **Float** | Timestamp when this job was created (epoch milliseconds). |  |
|**event** | [**ChannelHistoryEventInfo**](ChannelHistoryEventInfo.md) |  |  [optional] |
|**recipients** | [**List&lt;JobRecipient&gt;**](JobRecipient.md) | The users, groups or external recipients for this job. |  [optional] |
|**detail** | **String** | Additional delivery details such as HTTP response code or error message. |  [optional] |
|**tryCount** | **Integer** | Number of attempts made. 1 indicates first attempt. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| RETRY | &quot;RETRY&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


