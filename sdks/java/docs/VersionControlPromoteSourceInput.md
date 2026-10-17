

# VersionControlPromoteSourceInput

Where a promotion takes content from. Name the source by exactly one of Org or branch, for every strategy including CHERRY_PICK: an Org and the branch it versions to determine each other, and the response reports both. The source Org must version to the same repository as your Org.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique ID or name of the Org to promote from. Promoting from any Org other than your own requires tenant administration privilege, or ADMINISTRATION privilege in the source Org. |  [optional] |
|**sourceBranch** | **String** | Branch to promote from, when naming it directly rather than by Org. It must be the branch some Org in your repository versions to, and that Org is the source Org for the privilege check. |  [optional] |
|**sourceRevision** | **String** | Revision to promote, for example a Git commit SHA. Required when the strategy type is CHERRY_PICK, together with org_identifier or source_branch, and ignored otherwise. |  [optional] |


## Implemented Interfaces

* Serializable


