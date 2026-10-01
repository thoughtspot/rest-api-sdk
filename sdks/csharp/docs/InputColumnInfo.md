# ThoughtSpot.RestApi.Sdk.Model.InputColumnInfo
A single input table column, with its display name and unique ID. Returned by both createInputTable (all columns of the new table) and createInputTableColumn (the columns just added).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Display name of the column. | 
**Id** | **string** | Unique ID of the column. | 
**MappedColumnId** | **string** | Unique ID of the model column this input column maps to (its join-key source in the linked model). Empty for brand-new columns that do not map to any model column. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

