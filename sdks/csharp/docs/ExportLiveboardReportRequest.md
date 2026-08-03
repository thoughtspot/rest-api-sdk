# ThoughtSpot.RestApi.Sdk.Model.ExportLiveboardReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataIdentifier** | **string** | GUID or name of the Liveboard object. | 
**TabIdentifiers** | **List&lt;string&gt;** | GUID or name of the tab of the Liveboard object.    Version: 10.9.0.cl or later  | [optional] 
**PersonalisedViewIdentifier** | **string** | GUID or name of the personalised view of the Liveboard object.    Version: 10.9.0.cl or later  | [optional] 
**VisualizationIdentifiers** | **List&lt;string&gt;** | GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API returns a report with all visualizations saved on a Liveboard. | [optional] 
**TransientContent** | **string** | Transient content of the Liveboard. | [optional] 
**FileFormat** | **string** | Export file format. | [optional] [default to FileFormatEnum.PDF]
**RuntimeFilter** | **Object** | JSON object with representing filter condition to apply filters at runtime. For example, {\&quot;col1\&quot;: \&quot;region\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;northeast\&quot; }. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters). | [optional] 
**OverrideFilters** | **Object** | Applied to the liveboard and overrides any filters already applied on the same columns in liveboard. Following example illustrate different kinds of filters: {   \&quot;override_filters\&quot;: [     {       \&quot;column_name\&quot;: \&quot;Color\&quot;,       \&quot;generic_filter\&quot;: {         \&quot;op\&quot;: \&quot;IN\&quot;,         \&quot;values\&quot;: [           \&quot;almond\&quot;,           \&quot;turquoise\&quot;         ]       },       \&quot;negate\&quot;: false     },     {       \&quot;column_name\&quot;: \&quot;Commit Date\&quot;,       \&quot;date_filter\&quot;: {         \&quot;datePeriod\&quot;: \&quot;HOUR\&quot;,         \&quot;number\&quot;: 3,         \&quot;type\&quot;: \&quot;LAST_N_PERIOD\&quot;,         \&quot;op\&quot;: \&quot;EQ\&quot;       }     },     {       \&quot;column_name\&quot;: \&quot;Sales\&quot;,       \&quot;generic_filter\&quot;: {         \&quot;op\&quot;: \&quot;BW_INC\&quot;,         \&quot;values\&quot;: [           \&quot;100000\&quot;,           \&quot;70000\&quot;         ]       },       \&quot;negate\&quot;: true     }   ] } | [optional] 
**RuntimeSort** | **Object** | JSON string representing runtime sort. For example, {\&quot;sortCol1\&quot;: \&quot;region\&quot;, \&quot;asc1\&quot; : true}. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort). | [optional] 
**PdfOptions** | [**PdfOptionsInput**](PdfOptionsInput.md) | Options for PDF export. | [optional] 
**PngOptions** | [**PngOptionsInput**](PngOptionsInput.md) | Options for PNG export. | [optional] 
**RuntimeParamOverride** | **Object** | JSON object for setting values of parameters at runtime. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters). | [optional] 
**RegionalSettings** | [**RegionalSettingsInput**](RegionalSettingsInput.md) | Options for specific region specific overrides to support date/number/string/currency formatting. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

