

# SearchSchedulesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;MetadataInput&gt;**](MetadataInput.md) | Metadata objects associated with the scheduled jobs. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. |  [optional] |
|**sortOptions** | [**SortingOptions**](SortingOptions.md) | Sort options. |  [optional] |
|**historyRunsOptions** | [**ScheduleHistoryRunsOptionsInput**](ScheduleHistoryRunsOptionsInput.md) | Options while fetching history runs for the schedule. |  [optional] |
|**scheduleIdentifiers** | **List&lt;String&gt;** | unique ID or name of the Schedule |  [optional] |


## Implemented Interfaces

* Serializable


