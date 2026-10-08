

# PromoteBranchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**VersionControlPromoteSourceInput**](VersionControlPromoteSourceInput.md) | Where to promote content from, named either by Org or by branch. |  |
|**strategy** | [**VersionControlPromoteStrategyInput**](VersionControlPromoteStrategyInput.md) | How the source is applied to your Org&#39;s branch, and what to do when files conflict. |  |
|**commitMessage** | **String** | Message for the promotion commit. Omit this to let Git generate one. |  [optional] |
|**dryRun** | **Boolean** | Report what the promotion would change without writing anything. Defaults to true, so a request that omits this performs a dry run. |  [optional] |


## Implemented Interfaces

* Serializable


