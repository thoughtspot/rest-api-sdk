

# ExportLiveboardReportRequestPdfOptions

Options for PDF export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeCoverPage** | **Boolean** | Indicates whether to include the cover page with the Liveboard title. |  [optional] |
|**includeCustomLogo** | **Boolean** | Indicates whether to include customized wide logo in the footer if available. |  [optional] |
|**includeFilterPage** | **Boolean** | Indicates whether to include a page with all applied filters. |  [optional] |
|**includePageNumber** | **Boolean** | Indicates whether to include page number in the footer of each page. |  [optional] |
|**pageOrientation** | [**PageOrientationEnum**](#PageOrientationEnum) | Page orientation of the PDF. |  [optional] |
|**truncateTable** | **Boolean** | Indicates whether to include only the first page of the tables. |  [optional] |
|**pageFooterText** | **String** | Text to include in the footer of each page. |  [optional] |



## Enum: PageOrientationEnum

| Name | Value |
|---- | -----|
| PORTRAIT | &quot;PORTRAIT&quot; |
| LANDSCAPE | &quot;LANDSCAPE&quot; |



