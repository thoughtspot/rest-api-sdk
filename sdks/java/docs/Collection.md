

# Collection

Response object for a collection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the collection. |  |
|**name** | **String** | Name of the collection. |  |
|**objId** | **String** | Custom object ID (obj_id) of the collection, if one is set.    Version: 26.9.0.cl or later  |  [optional] |
|**description** | **String** | Description of the collection. |  [optional] |
|**metadata** | [**List&lt;CollectionMetadataItem&gt;**](CollectionMetadataItem.md) | Metadata objects in the collection. |  [optional] |
|**createdAt** | **String** | Creation timestamp in milliseconds. |  [optional] |
|**updatedAt** | **String** | Last updated timestamp in milliseconds. |  [optional] |
|**authorName** | **String** | Name of the author who created the collection. |  [optional] |
|**authorId** | **String** | Unique identifier of the author. |  [optional] |
|**org** | [**CollectionEntityIdentifier**](CollectionEntityIdentifier.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


