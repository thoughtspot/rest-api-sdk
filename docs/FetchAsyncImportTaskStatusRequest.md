# ThoughtSpot.Client.Model.FetchAsyncImportTaskStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaskIds** | **List&lt;string&gt;** | List of task IDs to fetch status for. | [optional] 
**TaskStatus** | **List&lt;FetchAsyncImportTaskStatusRequest.TaskStatusEnum&gt;** | List of task statuses to filter on. Valid values: [IN_QUEUE, IN_PROGRESS, COMPLETED, FAILED] | [optional] 
**AuthorIdentifier** | **string** | Author GUID or name of async import tasks to filter on. | [optional] 
**RecordOffset** | **int** | The offset point, starting from where the task status should be included in the response. | [optional] [default to 0]
**RecordSize** | **int** | The number of task statuses that should be included in the response starting from offset position. | [optional] [default to 5]
**IncludeImportResponse** | **bool?** | Boolean flag to specify whether to include import response in the task status objects. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

