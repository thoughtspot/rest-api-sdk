

# ExportLiveboardReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | GUID or name of the Liveboard object. |  |
|**visualizationIdentifiers** | **List&lt;String&gt;** | GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API returns a report with all visualizations saved on a Liveboard. |  [optional] |
|**transientContent** | **String** | Transient content of the Liveboard. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Export file format. |  [optional] |
|**runtimeFilter** | **Object** | JSON string representing runtime filter. { col1:&#39;region&#39;, op1: &#39;EQ&#39;, val1: &#39;northeast&#39; } |  [optional] |
|**runtimeSort** | **Object** | JSON string representing runtime sort. { sortCol1: &#39;region&#39;, asc1 : true, sortCol2 : &#39;date&#39; } |  [optional] |
|**pdfOptions** | [**PdfOptionsInput**](PdfOptionsInput.md) |  |  [optional] |
|**pngOptions** | [**PngOptionsInput**](PngOptionsInput.md) |  |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters in runtime. |  [optional] |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;CSV&quot; |
| PDF | &quot;PDF&quot; |
| XLSX | &quot;XLSX&quot; |
| PNG | &quot;PNG&quot; |



