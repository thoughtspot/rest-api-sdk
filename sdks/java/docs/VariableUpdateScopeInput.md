

# VariableUpdateScopeInput

Input for defining the scope of variable value assignments in batch update operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | The unique name of the org |  |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Type of principal to which the variable value applies. Use USER to assign values to a specific user, or USER_GROUP to assign values to a group. |  [optional] |
|**principalIdentifier** | **String** | Unique ID or name of the principal |  [optional] |
|**modelIdentifier** | **String** | Unique ID or name of the model. Required for FORMULA_VARIABLE type to scope the variable value to a specific worksheet. |  [optional] |
|**priority** | **Integer** | The priority level for this scope assignment, used for conflict resolution when multiple values match. Higher priority values (larger numbers) take precedence. |  [optional] |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


