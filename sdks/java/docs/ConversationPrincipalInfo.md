

# ConversationPrincipalInfo

A principal that has been granted access to a shared conversation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the user or group. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the principal is an individual user or a group. |  |
|**displayName** | **String** | Display name of the principal as shown in the UI. |  |
|**name** | **String** | Internal name of the principal. |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | Access level granted to the principal. Always &#x60;READ_ONLY&#x60; for shared conversations. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |
| NO_ACCESS | &quot;NO_ACCESS&quot; |


## Implemented Interfaces

* Serializable


