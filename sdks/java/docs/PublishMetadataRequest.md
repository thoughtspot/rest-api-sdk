

# PublishMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;PublishMetadataListItem&gt;**](PublishMetadataListItem.md) | Metadata objects to be published. |  |
|**orgIdentifiers** | **List&lt;String&gt;** | Unique ID or name of orgs to which metadata objects should be published. |  |
|**skipValidation** | **Boolean** | Skip parameterization validation. By default publishing requires an underlying LOGICAL_TABLE or DATA_SOURCE to carry a template variable with a value for every target org, so each org resolves its own data. Without parameterization every target org reads the owner org&#39;s data through the owner org&#39;s connection. Set this to true only when that is intended. |  [optional] |


## Implemented Interfaces

* Serializable


