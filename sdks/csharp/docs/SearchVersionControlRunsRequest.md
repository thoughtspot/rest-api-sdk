# ThoughtSpot.RestApi.Sdk.Model.SearchVersionControlRunsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunIdentifiers** | **List&lt;string&gt;** | Runs to read, as run IDs returned when each run was admitted, at most 100. Omit this to return your Org&#39;s runs, newest first. Paging applies either way. | [optional] 
**RunType** | **string** | Return only runs admitted by this operation. COMMIT is your Org&#39;s commit history, DEPLOY the content it received, RESTORE the rollbacks it ran. Omit this to return every type. | [optional] 
**Objects** | [**List&lt;VersionControlObjectInput&gt;**](VersionControlObjectInput.md) | Return only runs that carry a result for at least one of these objects. Objects are named as on the commit endpoint, except that the type may also be LOGICAL_TABLE: a run can report a type that a commit does not accept. Omit this to return runs regardless of the objects they touched. | [optional] 
**RecordOffset** | **int** | The starting record number from where the runs should be included, in newest-first order. | [optional] [default to 0]
**RecordSize** | **int** | The number of runs that should be included, between 1 and 100. Applies to run_identifiers too: naming more runs than this returns only the first page. | [optional] [default to 10]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

