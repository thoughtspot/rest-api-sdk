# ThoughtSpot.RestApi.Sdk.Model.CreateInputTableRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TableName** | **string** | Physical table name to create in the external warehouse. Must start with a letter or an underscore and contain only letters, digits, and underscores — no spaces or other punctuation — and be at most 128 characters. | 
**ModelIdentifier** | **string** | Unique ID or name of the model (worksheet) to link the input table to. | 
**TableDefinition** | [**InputTableDefinitionInput**](InputTableDefinitionInput.md) | Definition of the input table, including new columns and referenced model columns. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

