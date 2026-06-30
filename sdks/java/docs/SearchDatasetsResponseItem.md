

# SearchDatasetsResponseItem

Result of a dataset discovery step.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;search_datasets\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**text** | **String** | Summary message describing the dataset search results. |  |
|**dataSources** | [**List&lt;DataSourceInfo&gt;**](DataSourceInfo.md) | Dataset descriptors returned by the &#x60;search_datasets&#x60; tool. |  [optional] |


## Implemented Interfaces

* Serializable


