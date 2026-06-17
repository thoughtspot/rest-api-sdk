# ThoughtSpot.Client.Model.ExportAnswerReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataIdentifier** | **string** | Unique ID or name of the metadata object. | [optional] 
**SessionIdentifier** | **string** | Unique ID of the answer session. | [optional] 
**GenerationNumber** | **int** | Generation number of the answer session. | [optional] 
**FileFormat** | **string** | Export file format. | [optional] [default to FileFormatEnum.CSV]
**RuntimeFilter** | **Object** | JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast } | [optional] 
**RuntimeSort** | **Object** | JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date } | [optional] 
**RuntimeParamOverride** | **Object** | JSON object for setting values of parameters in runtime. | [optional] 
**RegionalSettings** | [**RegionalSettingsInput**](RegionalSettingsInput.md) | Options for specific region specific overrides to support date/number/string/currency formatting. | [optional] 
**PngOptions** | [**AnswerPngOptionsInput**](AnswerPngOptionsInput.md) | Options for PNG export.   Version: 26.6.0.cl or later  | [optional] 
**PersonalisedViewIdentifier** | **string** | GUID or name of the personalised view of the Answer object.   Version: 26.6.0.cl or later  | [optional] 
**Type** | **string** | Type of the answer being exported.   Version: 26.6.0.cl or later  | [optional] [default to TypeEnum.SAVED]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

