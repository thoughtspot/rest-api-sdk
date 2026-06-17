# ThoughtSpot.Client.Model.RevertCommitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;MetadataObject&gt;**](MetadataObject.md) | Metadata objects. | [optional] 
**BranchName** | **string** |    Name of the branch where the reverted version should be committed      Note: If no branch_name is specified, then the commit_branch_name will be considered. | [optional] 
**RevertPolicy** | **string** | Policy to apply when reverting a commit. Valid values: [ALL_OR_NONE, PARTIAL] | [optional] [default to RevertPolicyEnum.ALLORNONE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

