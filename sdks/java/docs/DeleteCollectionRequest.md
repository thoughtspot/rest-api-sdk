

# DeleteCollectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectionIdentifiers** | **List&lt;String&gt;** | Unique GUIDs of collections to delete. Note: Collection names cannot be used as identifiers since duplicate names are allowed. |  |
|**deleteChildren** | **Boolean** | Flag to delete child objects of the collection that the user has access to. |  [optional] |
|**dryRun** | **Boolean** | Preview deletion without actually deleting. When set to true, returns what would be deleted without performing the actual deletion. |  [optional] |


## Implemented Interfaces

* Serializable


