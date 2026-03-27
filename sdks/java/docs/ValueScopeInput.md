

# ValueScopeInput

Input for filtering variable values by scope in search operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | The unique name of the org |  [optional] |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Type of principal to filter by. Use USER to filter values assigned to specific users, or USER_GROUP to filter values assigned to groups. |  [optional] |
|**principalIdentifier** | **String** | Unique ID or name of the principal |  [optional] |
|**modelIdentifier** | **String** | Unique ID or name of the model to filter by. Applicable only for FORMULA_VARIABLE type. |  [optional] |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


