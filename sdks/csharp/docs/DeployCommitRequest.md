# ThoughtSpot.RestApi.Sdk.Model.DeployCommitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CommitId** | **string** |    Commit_id against which the files should be picked to deploy.      Note: If no commit_id is specified, then the head of the branch is considered. | [optional] 
**BranchName** | **string** | Name of the remote branch where changes should be picked | 
**DeployType** | **string** | Indicates if all files or only modified file at specified commit point should be considered | [optional] [default to DeployTypeEnum.DELTA]
**DeployPolicy** | **string** | Define the policy to follow while importing TML in the ThoughtSpot environment. Use “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even if other objects in the same deploy operations fail to import. | [optional] [default to DeployPolicyEnum.ALLORNONE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

