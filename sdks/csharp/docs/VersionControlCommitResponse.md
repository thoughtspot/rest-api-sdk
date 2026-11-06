# ThoughtSpot.RestApi.Sdk.Model.VersionControlCommitResponse
Admission receipt for a versioning run. It confirms the request was accepted and identifies the run; it says nothing about what was committed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunId** | **string** | ID of this run, and the trace key across the API, the worker, the Git commit and the logs. Pass it to run search to read per-object outcomes. | 
**AcceptedTimeInMillis** | **float** | Admission time, in milliseconds since the Unix epoch. | 
**Author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

