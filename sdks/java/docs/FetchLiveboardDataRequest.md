

# FetchLiveboardDataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | GUID or name of the Liveboard. |  |
|**visualizationIdentifiers** | **List&lt;String&gt;** | GUIDs or names of the visualizations on the Liveboard. |  [optional] |
|**transientContent** | **String** | Transient content of the Liveboard. |  [optional] |
|**dataFormat** | [**DataFormatEnum**](#DataFormatEnum) | JSON output format. By default, the API returns full data in the JSON. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records to include in a batch. |  [optional] |
|**runtimeFilter** | **Object** | JSON object representing filter condition to filter the data. |  [optional] |
|**runtimeSort** | **Object** | JSON object representing columns to sort the data. |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters in runtime. |  [optional] |



## Enum: DataFormatEnum

| Name | Value |
|---- | -----|
| COMPACT | &quot;COMPACT&quot; |



