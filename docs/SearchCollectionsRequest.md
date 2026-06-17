# ThoughtSpot.Client.Model.SearchCollectionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NamePattern** | **string** | A pattern to match case-insensitive name of the Collection object. Use &#39;%&#39; for wildcard match. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included. -1 implies no pagination. | [optional] [default to 10]
**CollectionIdentifiers** | **List&lt;string&gt;** | Unique GUIDs of collections to search. Note: Collection names cannot be used as identifiers since duplicate names are allowed. | [optional] 
**CreatedByUserIdentifiers** | **List&lt;string&gt;** | Filter collections by author. Provide unique IDs or names of users who created the collections. | [optional] 
**IncludeMetadata** | **bool?** | Include collection metadata items in the response. | [optional] [default to false]
**SortOptions** | [**SortOptions**](SortOptions.md) | Sort options. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

