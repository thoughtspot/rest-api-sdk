# ThoughtSpot.RestApi.Sdk.Model.InputColumnSchemaInput
Schema definition for a single input column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the column. | 
**DataType** | **string** | Physical data type of the column as recognized by the connected warehouse (for example, VARCHAR, INT64, DOUBLE, BOOL, DATE). The accepted values depend on the underlying Cloud Data Warehouse. | 
**Type** | **string** | Semantic role of the column in ThoughtSpot. Use ATTRIBUTE for dimensional data such as text, dates, and identifiers, and MEASURE for numeric or aggregatable values. | 
**AllowedValues** | **List&lt;string&gt;** | Optional list of permitted values for the column. When provided, data written to this column is restricted to these values. Omit or leave empty to allow any value supported by the data type.    Version: 26.9.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

