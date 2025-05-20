

# ImportEPackAsyncTaskStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | **String** | GUID of tenant from which the task is initiated. |  [optional] |
|**orgId** | **Integer** | Organisation ID of the user who initiated the task. |  [optional] |
|**taskId** | **String** | Unique identifier for the task. |  [optional] |
|**taskName** | **String** | Name of the task. |  [optional] |
|**importResponse** | **Object** | Response of imported objects so far. |  [optional] |
|**taskStatus** | [**TaskStatusEnum**](#TaskStatusEnum) | Current status of the task. |  [optional] |
|**authorId** | **String** | ID of the user who initiated the task. |  [optional] |
|**importPolicy** | [**ImportPolicyEnum**](#ImportPolicyEnum) | Policy used for the import task. |  [optional] |
|**createdAt** | **Float** | Time when the task was created (in ms since epoch). |  [optional] |
|**inProgressAt** | **Float** | Time when the task started (in ms since epoch). |  [optional] |
|**completedAt** | **Float** | Time when the task was completed (in ms since epoch). |  [optional] |
|**totalObjectCount** | **Integer** | Total number of objects to process. |  [optional] |
|**objectProcessedCount** | **Integer** | Number of objects processed so far. |  [optional] |
|**modifiedAt** | **Float** | Last time the task status was updated (in ms since epoch). |  [optional] |



## Enum: TaskStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| IN_QUEUE | &quot;IN_QUEUE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: ImportPolicyEnum

| Name | Value |
|---- | -----|
| PARTIAL | &quot;PARTIAL&quot; |
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |
| PARTIAL_OBJECT | &quot;PARTIAL_OBJECT&quot; |


## Implemented Interfaces

* Serializable


