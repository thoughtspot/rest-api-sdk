

# UpdateScheduleRequestPdfOptions

Options for PDF export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completeLiveboard** | **Boolean** | Indicates whether to include complete Liveboard. |  [optional] |
|**includeCoverPage** | **Boolean** | Indicates whether to include cover page with the Liveboard title. |  [optional] |
|**includeCustomLogo** | **Boolean** | Indicates whether to include customized wide logo in the footer if available. |  [optional] |
|**includeFilterPage** | **Boolean** | Indicates whether to include a page with all applied filters. |  [optional] |
|**includePageNumber** | **Boolean** | Indicates whether to include page number in the footer of each page |  [optional] |
|**pageFooterText** | **String** | Text to include in the footer of each page. |  [optional] |
|**pageOrientation** | **String** | Page orientation of the PDF. |  [optional] |
|**pageSize** | [**PageSizeEnum**](#PageSizeEnum) | Page size. |  [optional] |
|**truncateTable** | **Boolean** | Indicates whether to include only first page of the tables. |  [optional] |



## Enum: PageSizeEnum

| Name | Value |
|---- | -----|
| A4 | &quot;A4&quot; |



