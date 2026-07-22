# ThoughtSpot.RestApi.Sdk.Model.SearchDatasetsResponseItem
Result of a dataset discovery step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;search_datasets\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**Text** | **string** | Summary message describing the dataset search results. | 
**DataSources** | [**List&lt;DataSourceInfo&gt;**](DataSourceInfo.md) | Dataset descriptors returned by the &#x60;search_datasets&#x60; tool. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

