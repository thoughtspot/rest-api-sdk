# ThoughtSpot.RestApi.Sdk.Model.CreateCommitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Objects** | [**List&lt;VersionControlCommitObjectInput&gt;**](VersionControlCommitObjectInput.md) | Objects to version in this run, named by object ID. Every object must be distinct, must already exist in your Org, and must be a Liveboard or an Answer. A run carries at most 50. | 
**CommitMessage** | **string** | Message for the single Git commit this run produces. Omit this to let ThoughtSpot generate one. | [optional] 
**PruneDeletedObjectFiles** | **bool?** | Remove the repository file of any named object that no longer exists in ThoughtSpot, so the branch stops carrying deleted content. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

