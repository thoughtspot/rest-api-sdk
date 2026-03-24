

# CollectionDeleteResponse

Response object for delete collection operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataDeleted** | [**List&lt;CollectionDeleteTypeIdentifiers&gt;**](CollectionDeleteTypeIdentifiers.md) | List of metadata objects that were successfully deleted. |  [optional] |
|**metadataSkipped** | [**List&lt;CollectionDeleteTypeIdentifiers&gt;**](CollectionDeleteTypeIdentifiers.md) | List of metadata objects that were skipped during deletion. Objects may be skipped due to lack of permissions, dependencies, or other constraints. |  [optional] |


## Implemented Interfaces

* Serializable


