# ThoughtSpot.RestApi.Sdk.Model.ReferencedColumnTimeDimension
Pins a referenced model date column to a specific time dimension (grain) in the created input table.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ColumnIdentifier** | **string** | The referenced model column to restrict, named exactly as it is in referenced_columns. | 
**TimeDimension** | **string** | Time dimension (grain) to lock the column to. Applies to DATE and DATE_TIME columns; a grain on a TIME (time-of-day) column has no meaning and is not supported. HOURLY needs a DATE_TIME column — on a plain DATE column it is ignored and the column stays detailed. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

