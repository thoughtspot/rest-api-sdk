

# VariableValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value of the variable |  [optional] |
|**valueList** | **List&lt;String&gt;** | The value of the variable if it is a list type |  [optional] |
|**orgIdentifier** | **String** | The unique name of the org |  |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Type of principal to which this value applies. Use USER to assign the value to a specific user, or USER_GROUP to assign it to a group. |  [optional] |
|**principalIdentifier** | **String** | Unique ID or name of the principal |  [optional] |
|**modelIdentifier** | **String** | Unique ID of the model   Version: 26.3.0.cl or later  |  [optional] |
|**priority** | **Integer** | The priority assigned to this value. If there are 2 matching values, the one with the higher priority will be picked. |  [optional] |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


