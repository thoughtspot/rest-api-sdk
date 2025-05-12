

# CommitBranchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;MetadataObject&gt;**](MetadataObject.md) | Metadata objects. |  |
|**deleteAware** | **Boolean** | Delete the tml files from version control repo if it does not exist in the ThoughSpot instance |  [optional] |
|**branchName** | **String** |    Name of the remote branch where object should be pushed      Note: If no branch_name is specified, then the commit_branch_name will be considered. |  [optional] |
|**comment** | **String** | Comment to be added to the commit |  |


## Implemented Interfaces

* Serializable


