

# JobRecipient

A recipient (user, group, or external) for a job execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the recipient. |  |
|**id** | **String** | Unique ID of the recipient. |  [optional] |
|**name** | **String** | Name of the recipient. |  [optional] |
|**email** | **String** | Email of the recipient. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |


## Implemented Interfaces

* Serializable


