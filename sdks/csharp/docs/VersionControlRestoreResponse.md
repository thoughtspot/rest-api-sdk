# ThoughtSpot.RestApi.Sdk.Model.VersionControlRestoreResponse
Admission receipt for a restore run. The revision was resolved and the run has started; it says nothing about what was restored. The restore commit is not here because it does not exist until the run pushes it: read it from run search as the run's revision, along with the per-object outcomes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunId** | **string** | ID of this run, and the trace key across the API, the worker, the Git commit and the logs. | 
**TargetRevision** | **string** | Revision whose content is restored, in full form. Pinned at admission. | 
**AcceptedTimeInMillis** | **float** | Admission time, in milliseconds since the Unix epoch. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

