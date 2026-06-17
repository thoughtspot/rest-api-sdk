# ThoughtSpot.Client.Model.DataSourceInfo
A data source descriptor returned by the agent's `search_datasets` tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataSourceIdentifier** | **string** | Unique identifier of the data source (mirrors &#x60;header.guid&#x60;). | [optional] 
**DataSourceName** | **string** | Display name of the data source (mirrors &#x60;header.display_name&#x60;). | [optional] 
**Description** | **string** | Optional description of the data source. | [optional] 
**Confidence** | **float?** | Tool-reported confidence that this data source matches the query, in &#x60;[0, 1]&#x60;. | [optional] 
**Reasoning** | **string** | LLM reasoning describing why the data source was selected. | [optional] 
**Header** | [**DataSourceHeader**](DataSourceHeader.md) |  | [optional] 
**RelatedLiveboardVisualizations** | **List&lt;Object&gt;** | Related liveboard visualizations for this data source. Open-ended JSON shape driven by the underlying proto. | [optional] 
**RelatedAnswers** | **List&lt;Object&gt;** | Related saved answers for this data source. Open-ended JSON shape driven by the underlying proto. | [optional] 
**RelatedSpotterQueries** | **List&lt;string&gt;** | Related Spotter queries previously run against this data source. Truncated to a small upper bound by the tool. | [optional] 
**Popularity** | [**DataSourcePopularity**](DataSourcePopularity.md) |  | [optional] 
**UserUsage** | [**DataSourceUserUsage**](DataSourceUserUsage.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

