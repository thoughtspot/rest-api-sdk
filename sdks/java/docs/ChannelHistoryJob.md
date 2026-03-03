

# ChannelHistoryJob

A single job execution record for a channel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status of this job. |  |
|**creationTimeInMillis** | **Object** | Timestamp when this job was created (epoch milliseconds). |  |
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


