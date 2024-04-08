

# SearchDataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryString** | **String** | Data search query string token. |  |
|**logicalTableIdentifier** | **String** | GUID of the data source object, such as a Worksheet, View, or Table. |  |
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



