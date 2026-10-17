# ThoughtSpot.RestApi.Sdk.Model.VersionControlRevisionDetails
The revision the target branch points at after a promotion. Absent on a dry run, since nothing was written.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Revision** | **string** | Identifier of the revision. For a Git-backed repository this is the commit SHA. | 
**Message** | **string** | Commit message used. | [optional] 
**CommittedTimeInMillis** | **float** | Commit time, in milliseconds since the Unix epoch. | 
**Author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

