

# VariablePutAssignmentInput

Input for variable value put operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedValues** | **List&lt;String&gt;** | Values of the variable |  |
|**orgIdentifier** | **String** | The unique name of the org |  [optional] |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Principal type |  [optional] |
|**principalIdentifier** | **String** | Unique ID or name of the principal |  [optional] |
|**modelIdentifier** | **String** | Unique ID of the model |  [optional] |
|**priority** | **Integer** | Priority level |  [optional] |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


