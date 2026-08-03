# ThoughtSpot.RestApi.Sdk.Model.SearchSchedulesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;MetadataInput&gt;**](MetadataInput.md) | Metadata objects associated with the scheduled jobs. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] 
**RecordSize** | **int** | The number of records that should be included. | [optional] 
**SortOptions** | [**SortingOptions**](SortingOptions.md) | Sort options. | [optional] 
**HistoryRunsOptions** | [**ScheduleHistoryRunsOptionsInput**](ScheduleHistoryRunsOptionsInput.md) | Options while fetching history runs for the schedule. | [optional] 
**ScheduleIdentifiers** | **List&lt;string&gt;** | unique ID or name of the Schedule | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

