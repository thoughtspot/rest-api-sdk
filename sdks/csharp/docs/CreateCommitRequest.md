# ThoughtSpot.RestApi.Sdk.Model.CreateCommitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Objects** | [**List&lt;VersionControlCommitObjectInput&gt;**](VersionControlCommitObjectInput.md) | Objects to version in this run, each named by GUID, object ID, or name with its type. Every object must already exist in your Org, must have an object ID, and must be a Liveboard or an Answer. An object named more than once is versioned once. A run carries at most 50. | 
**CommitMessage** | **string** | Message for the single Git commit this run produces. Omit this to let ThoughtSpot generate one. | [optional] 
**PruneDeletedObjectFiles** | **bool?** | Also check every file on the branch against the objects in your Org, and remove the file of any object that no longer exists there, so the branch stops carrying deleted content. This is not limited to the objects in this request. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

