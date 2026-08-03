# ThoughtSpot.RestApi.Sdk.Model.CommitBranchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;MetadataObject&gt;**](MetadataObject.md) | Metadata objects. | 
**DeleteAware** | **bool?** | Delete the tml files from version control repo if it does not exist in the ThoughSpot instance | [optional] [default to true]
**BranchName** | **string** |    Name of the remote branch where object should be pushed      Note: If no branch_name is specified, then the commit_branch_name will be considered. | [optional] 
**Comment** | **string** | Comment to be added to the commit | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

