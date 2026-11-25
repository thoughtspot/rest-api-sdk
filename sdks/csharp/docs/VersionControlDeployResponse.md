# ThoughtSpot.RestApi.Sdk.Model.VersionControlDeployResponse
Admission receipt for a deploy run. It identifies the run and the revisions it was admitted against; it says nothing about what was imported.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunId** | **string** | ID of this run, and the trace key across the API, the worker and the logs. Pass it to run search to read per-object outcomes. | 
**TargetDeploymentRevision** | **string** | Revision this run was admitted against, pinned at admission. Resolved from the head of the configured branch when target_revision was omitted. | 
**LastDeployedRevision** | **string** | Revision the Org last received, which this run compared against. Absent when there was none: the Org&#39;s first deploy, or deploy_type FULL. | [optional] 
**AcceptedTimeInMillis** | **float** | Admission time, in milliseconds since the Unix epoch. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

