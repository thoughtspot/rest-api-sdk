# ThoughtSpot.Client.Model.PdfOptionsInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PageSize** | **string** | Size of PDF page. &#x60;A4&#x60; generates a paginated A4 PDF. &#x60;CONTINUOUS&#x60; generates a continuous PDF that matches the Liveboard layout. Each Liveboard tab has its own page of variable length. Defaults to &#x60;A4&#x60; if not specified.   Version: 26.5.0.cl or later  | [optional] 
**ZoomLevel** | **int?** | Zoom level percentage for the PDF. Only applicable when &#x60;page_size&#x60; is &#x60;CONTINUOUS&#x60;. Acceptable values are integers in the range [45, 175]. Defaults to 100 if not specified.   Version: 26.5.0.cl or later  | [optional] 
**IncludeCoverPage** | **bool?** | Indicates whether to include the cover page with the Liveboard title. | [optional] [default to true]
**IncludeCustomLogo** | **bool?** | Indicates whether to include customized wide logo in the footer if available. | [optional] [default to true]
**IncludeFilterPage** | **bool?** | Indicates whether to include a page with all applied filters. For &#x60;CONTINUOUS&#x60; page_size, this parameter indicates whether to include the filter header. | [optional] [default to true]
**IncludePageNumber** | **bool?** | Indicates whether to include page number in the footer of each page. | [optional] [default to true]
**PageOrientation** | **string** | Page orientation of the PDF. | [optional] [default to PageOrientationEnum.PORTRAIT]
**TruncateTable** | **bool?** | Indicates whether to include only the first page of the tables. | [optional] [default to false]
**PageFooterText** | **string** | Text to include in the footer of each page. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

