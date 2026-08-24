# ThoughtSpot.RestApi.Sdk.Model.SearchSemanticIntegrationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SortOptions** | [**SemanticIntegrationSortOptions**](SemanticIntegrationSortOptions.md) | Sort options for the search results. | [optional] 
**RecordOffset** | **int** | Number of records to skip for pagination. Minimum value is 0. | [optional] [default to 0]
**RecordSize** | **int** | Maximum number of records to return. Use 0 to return all records (no pagination). | [optional] [default to 10]
**Pattern** | **string** | Name filter substring to narrow search results. | [optional] 
**AuthorIdentifiers** | **List&lt;string&gt;** | Filter by author IDs or names who created the integrations. | [optional] 
**ConnectionIdentifiers** | **List&lt;string&gt;** | Filter by connection IDs or names associated with the integrations. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

