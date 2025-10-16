

# VariableUpdateScopeInput

Input for variable value update in batch operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | The unique name of the org |  |
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


