# ThoughtSpot.RestApi.Sdk.Model.LiveboardContent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvailableDataRowCount** | **int** | Total available data row count. | 
**ColumnNames** | **List&lt;string&gt;** | Name of the columns. | 
**DataRows** | **List&lt;Object&gt;** | Rows of data set. | 
**RecordOffset** | **int** | The starting record number from where the records should be included. | 
**RecordSize** | **int** | The number of records that should be included. | 
**ReturnedDataRowCount** | **int** | Total returned data row count. | 
**SamplingRatio** | **float** | Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the data set to the total number of keys expected in the query. If the value is 1.0, this means that the complete result is returned. | 
**VisualizationId** | **string** | Unique ID of the visualization. | [optional] 
**VisualizationName** | **string** | Name of the visualization. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

