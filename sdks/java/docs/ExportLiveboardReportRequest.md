

# ExportLiveboardReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataIdentifier** | **String** | GUID or name of the Liveboard object. |  |
|**visualizationIdentifiers** | **List&lt;String&gt;** | GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API returns a report with all visualizations saved on a Liveboard. |  [optional] |
|**transientContent** | **String** | Transient content of the Liveboard. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Export file format. |  [optional] |
|**runtimeFilter** | **Object** | JSON object with representing filter condition to apply filters at runtime. For example, {\&quot;col1\&quot;: \&quot;region\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;northeast\&quot; }. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters). |  [optional] |
|**runtimeSort** | **Object** | JSON string representing runtime sort. For example, {\&quot;sortCol1\&quot;: \&quot;region\&quot;, \&quot;asc1\&quot; : true}. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort). |  [optional] |
|**pdfOptions** | [**ExportLiveboardReportRequestPdfOptions**](ExportLiveboardReportRequestPdfOptions.md) |  |  [optional] |
|**pngOptions** | [**ExportLiveboardReportRequestPngOptions**](ExportLiveboardReportRequestPngOptions.md) |  |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters at runtime. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters). |  [optional] |
|**regionalSettings** | [**ExportAnswerReportRequestRegionalSettings**](ExportAnswerReportRequestRegionalSettings.md) |  |  [optional] |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |
| PNG | &quot;PNG&quot; |



