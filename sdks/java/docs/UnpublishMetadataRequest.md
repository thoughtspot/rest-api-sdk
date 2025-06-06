

# UnpublishMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**force** | **Boolean** | Force unpublishes the object. This will break all the dependent objects in the unpublished orgs. |  [optional] |
|**includeDependencies** | **Boolean** | Should we unpublish all the dependencies for the objects specified. The dependencies will be unpublished if no other published object is using it. |  |
|**metadata** | [**List&lt;PublishMetadataListItem&gt;**](PublishMetadataListItem.md) | Metadata objects. |  |
|**orgIdentifiers** | **List&lt;String&gt;** | Unique ID or name of orgs. |  |


## Implemented Interfaces

* Serializable


