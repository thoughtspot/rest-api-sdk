# ThoughtSpot.RestApi.Sdk.Model.VersionControlObjectResult
Outcome for one object in a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ObjId** | **string** | Object ID of the object. The same object carries the same ID in every Org, so this is not the Org-local GUID. On a commit this is the resolved object ID even when the request named the object by name or GUID. | 
**Type** | **string** | Type of the object. | [optional] 
**FileName** | **string** | Repository path of the object&#39;s file. | [optional] 
**Action** | **string** | What the run did to the object. | [optional] 
**Status** | **string** | Outcome for the object. | 
**Message** | **string** | Why the object is FAILED or SKIPPED, always present then. It may also carry a warning on SUCCESS or VALIDATED. | [optional] 
**IsDependency** | **bool?** | True for an object the request did not name, exported because a requested object depends on it. Commit runs only. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

