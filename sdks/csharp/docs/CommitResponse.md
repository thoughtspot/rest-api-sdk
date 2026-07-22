# ThoughtSpot.RestApi.Sdk.Model.CommitResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Committer** | [**CommiterType**](CommiterType.md) |  | [optional] 
**Author** | [**AuthorType**](AuthorType.md) |  | [optional] 
**Comment** | **string** | Comments associated with the commit | [optional] 
**CommitTime** | **string** | Time at which the changes were committed. | [optional] 
**CommitId** | **string** | SHA id associated with the commit | [optional] 
**Branch** | **string** | Branch where changes were committed | [optional] 
**CommittedFiles** | [**List&lt;CommitFileType&gt;**](CommitFileType.md) | Files that were pushed as part of this commit | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

