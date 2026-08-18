

# SearchSemanticIntegrationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sortOptions** | [**SemanticIntegrationSortOptions**](SemanticIntegrationSortOptions.md) | Sort options for the search results. |  [optional] |
|**recordOffset** | **Integer** | Number of records to skip for pagination. Minimum value is 0. |  [optional] |
|**recordSize** | **Integer** | Maximum number of records to return. Use 0 to return all records (no pagination). |  [optional] |
|**pattern** | **String** | Name filter substring to narrow search results. |  [optional] |
|**authorIdentifiers** | **List&lt;String&gt;** | Filter by author IDs or names who created the integrations. |  [optional] |
|**connectionIdentifiers** | **List&lt;String&gt;** | Filter by connection IDs or names associated with the integrations. |  [optional] |


## Implemented Interfaces

* Serializable


