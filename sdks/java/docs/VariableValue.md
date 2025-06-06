

# VariableValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value of the variable |  |
|**orgIdentifier** | **String** | The unique name of the org |  |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Principal type |  [optional] |
|**principalIdentifier** | **String** | Unique ID or name of the principal |  [optional] |
|**priority** | **Integer** | The priority assigned to this value. If there are 2 matching values, the one with the higher priority will be picked. |  [optional] |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


