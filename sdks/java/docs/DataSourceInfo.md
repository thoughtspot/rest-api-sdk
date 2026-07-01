

# DataSourceInfo

A data source descriptor returned by the agent's `search_datasets` tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataSourceIdentifier** | **String** | Unique identifier of the data source (mirrors &#x60;header.guid&#x60;). |  [optional] |
|**dataSourceName** | **String** | Display name of the data source (mirrors &#x60;header.display_name&#x60;). |  [optional] |
|**description** | **String** | Optional description of the data source. |  [optional] |
|**confidence** | **Float** | Tool-reported confidence that this data source matches the query, in &#x60;[0, 1]&#x60;. |  [optional] |
|**reasoning** | **String** | LLM reasoning describing why the data source was selected. |  [optional] |
|**header** | [**DataSourceHeader**](DataSourceHeader.md) |  |  [optional] |
|**relatedLiveboardVisualizations** | **List&lt;Object&gt;** | Related liveboard visualizations for this data source. Open-ended JSON shape driven by the underlying proto. |  [optional] |
|**relatedAnswers** | **List&lt;Object&gt;** | Related saved answers for this data source. Open-ended JSON shape driven by the underlying proto. |  [optional] |
|**relatedSpotterQueries** | **List&lt;String&gt;** | Related Spotter queries previously run against this data source. Truncated to a small upper bound by the tool. |  [optional] |
|**popularity** | [**DataSourcePopularity**](DataSourcePopularity.md) |  |  [optional] |
|**userUsage** | [**DataSourceUserUsage**](DataSourceUserUsage.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


