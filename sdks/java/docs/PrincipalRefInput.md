

# PrincipalRefInput

Input reference to a principal (user or group) used when granting or revoking access to a shared resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**principalIdentifier** | **String** | Unique identifier of the user or group. |  |
|**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) | Whether the principal is an individual user or a group. |  |



## Enum: PrincipalTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


