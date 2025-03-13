

# ExportAnswerReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | Unique ID or name of the metadata object. |  [optional] |
|**sessionIdentifier** | **String** | Unique ID of the answer session. |  [optional] |
|**generationNumber** | **Integer** | Generation number of the answer session. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Export file format. |  [optional] |
|**runtimeFilter** | **Object** | JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast } |  [optional] |
|**runtimeSort** | **Object** | JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date } |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters in runtime. |  [optional] |
|**regionalSettings** | [**ExportAnswerReportRequestRegionalSettings**](ExportAnswerReportRequestRegionalSettings.md) |  |  [optional] |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;CSV&quot; |
| PDF | &quot;PDF&quot; |
| XLSX | &quot;XLSX&quot; |
| PNG | &quot;PNG&quot; |



