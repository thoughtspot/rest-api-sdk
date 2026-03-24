

# SearchCollectionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**namePattern** | **String** | A pattern to match case-insensitive name of the Collection object. Use &#39;%&#39; for wildcard match. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. -1 implies no pagination. |  [optional] |
|**collectionIdentifiers** | **List&lt;String&gt;** | Unique GUIDs of collections to search. Note: Collection names cannot be used as identifiers since duplicate names are allowed. |  [optional] |
|**createdByUserIdentifiers** | **List&lt;String&gt;** | Filter collections by author. Provide unique IDs or names of users who created the collections. |  [optional] |
|**includeMetadata** | **Boolean** | Include collection metadata items in the response. |  [optional] |
|**sortOptions** | [**SortOptions**](SortOptions.md) | Sort options. |  [optional] |


## Implemented Interfaces

* Serializable


