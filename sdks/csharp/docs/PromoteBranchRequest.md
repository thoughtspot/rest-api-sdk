# ThoughtSpot.RestApi.Sdk.Model.PromoteBranchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Source** | [**VersionControlPromoteSourceInput**](VersionControlPromoteSourceInput.md) | Where to promote content from, named either by Org or by branch. | 
**Strategy** | [**VersionControlPromoteStrategyInput**](VersionControlPromoteStrategyInput.md) | How the source is applied to your Org&#39;s branch, and what to do when files conflict. | 
**CommitMessage** | **string** | Message for the promotion commit. Omit this to let Git generate one. | [optional] 
**DryRun** | **bool?** | Report what the promotion would change without writing anything. Defaults to true, so a request that omits this performs a dry run. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

