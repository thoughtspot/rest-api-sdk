

# RevertCommitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;MetadataObject&gt;**](MetadataObject.md) | Metadata objects. |  [optional] |
|**branchName** | **String** |    Name of the branch where the reverted version should be committed      Note: If no branch_name is specified, then the commit_branch_name will be considered. |  [optional] |
|**revertPolicy** | [**RevertPolicyEnum**](#RevertPolicyEnum) | Policy to apply when reverting a commit. Valid values: [ALL_OR_NONE, PARTIAL] |  [optional] |



## Enum: RevertPolicyEnum

| Name | Value |
|---- | -----|
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |


## Implemented Interfaces

* Serializable


