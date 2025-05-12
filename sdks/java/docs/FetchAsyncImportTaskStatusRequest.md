

# FetchAsyncImportTaskStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskIds** | **List&lt;String&gt;** | List of task IDs to fetch status for. |  [optional] |
|**taskStatus** | [**List&lt;TaskStatusEnum&gt;**](#List&lt;TaskStatusEnum&gt;) | List of task statuses to filter on. Valid values: [IN_QUEUE, IN_PROGRESS, COMPLETED, FAILED] |  [optional] |
|**authorIdentifier** | **String** | Author GUID or name of async import tasks to filter on. |  [optional] |
|**recordOffset** | **Integer** | The offset point, starting from where the task status should be included in the response. |  [optional] |
|**recordSize** | **Integer** | The number of task statuses that should be included in the response starting from offset position. |  [optional] |
|**includeImportResponse** | **Boolean** | Boolean flag to specify whether to include import response in the task status objects. |  [optional] |



## Enum: List&lt;TaskStatusEnum&gt;

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| IN_QUEUE | &quot;IN_QUEUE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


