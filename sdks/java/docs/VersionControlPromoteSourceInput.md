

# VersionControlPromoteSourceInput

Where a promotion takes content from. Name the source either by Org or by branch, not both: an Org and the branch it versions to determine each other, and the response reports both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique ID or name of the Org to promote from. Promoting from any Org other than your own requires tenant administration privilege. |  [optional] |
|**sourceBranch** | **String** | Branch to promote from, when naming it directly rather than by Org. |  [optional] |
|**sourceRevision** | **String** | Revision to promote, for example a Git commit SHA. Required when the strategy type is CHERRY_PICK, and ignored otherwise. |  [optional] |


## Implemented Interfaces

* Serializable


