

# ChannelValidationDetail

Validation detail result for a sub-step.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationStep** | [**ValidationStepEnum**](#ValidationStepEnum) | The validation step that was performed. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of this validation step. |  |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | Error code if the validation step failed. |  [optional] |
|**httpStatus** | **Integer** | HTTP status code returned by the channel (if applicable). |  [optional] |
|**errorMessage** | **String** | Error message from the channel or validation process. |  [optional] |
|**additionalInfo** | **String** | Additional information about the validation step. |  [optional] |



## Enum: ValidationStepEnum

| Name | Value |
|---- | -----|
| HTTP_CONNECTION_CHECK | &quot;HTTP_CONNECTION_CHECK&quot; |
| STORAGE_FILE_UPLOAD_CHECK | &quot;STORAGE_FILE_UPLOAD_CHECK&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| INVALID_CREDENTIALS | &quot;INVALID_CREDENTIALS&quot; |
| FORBIDDEN | &quot;FORBIDDEN&quot; |
| UNAUTHORIZED | &quot;UNAUTHORIZED&quot; |
| CONNECTION_TIMEOUT | &quot;CONNECTION_TIMEOUT&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |


## Implemented Interfaces

* Serializable


