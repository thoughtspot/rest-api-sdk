

# CreateCommitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objects** | [**List&lt;VersionControlCommitObjectInput&gt;**](VersionControlCommitObjectInput.md) | Objects to version in this run, named by object ID. Every object must be distinct, must already exist in your Org, and must be a Liveboard or an Answer. A run carries at most 50. |  |
|**commitMessage** | **String** | Message for the single Git commit this run produces. Omit this to let ThoughtSpot generate one. |  [optional] |
|**pruneDeletedObjectFiles** | **Boolean** | Remove the repository file of any named object that no longer exists in ThoughtSpot, so the branch stops carrying deleted content. |  [optional] |


## Implemented Interfaces

* Serializable


