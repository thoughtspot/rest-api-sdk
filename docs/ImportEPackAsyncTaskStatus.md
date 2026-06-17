# ThoughtSpot.Client.Model.ImportEPackAsyncTaskStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TenantId** | **string** | GUID of tenant from which the task is initiated. | [optional] 
**OrgId** | **int?** | Organisation ID of the user who initiated the task. | [optional] 
**TaskId** | **string** | Unique identifier for the task. | [optional] 
**TaskName** | **string** | Name of the task. | [optional] 
**ImportResponse** | **Object** | Response of imported objects so far. | [optional] 
**TaskStatus** | **string** | Current status of the task. | [optional] 
**AuthorId** | **string** | ID of the user who initiated the task. | [optional] 
**ImportPolicy** | **string** | Policy used for the import task. | [optional] 
**CreatedAt** | **float?** | Time when the task was created (in ms since epoch). | [optional] 
**InProgressAt** | **float?** | Time when the task started (in ms since epoch). | [optional] 
**CompletedAt** | **float?** | Time when the task was completed (in ms since epoch). | [optional] 
**TotalObjectCount** | **int?** | Total number of objects to process. | [optional] 
**ObjectProcessedCount** | **int?** | Number of objects processed so far. | [optional] 
**ModifiedAt** | **float?** | Last time the task status was updated (in ms since epoch). | [optional] 
**AuthorDisplayName** | **string** | Display name of the user who initiated the task. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

