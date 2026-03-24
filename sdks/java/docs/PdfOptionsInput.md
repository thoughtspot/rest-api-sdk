

# PdfOptionsInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageSize** | [**PageSizeEnum**](#PageSizeEnum) | Size of PDF page. &#x60;A4&#x60; generates a paginated A4 PDF. &#x60;CONTINUOUS&#x60; generates a continuous PDF that matches the Liveboard layout. Each Liveboard tab has its own page of variable length. Defaults to &#x60;A4&#x60; if not specified.   Version: 26.5.0.cl or later  |  [optional] |
|**zoomLevel** | **Integer** | Zoom level percentage for the PDF. Only applicable when &#x60;page_size&#x60; is &#x60;CONTINUOUS&#x60;. Acceptable values are integers in the range [45, 175]. Defaults to 100 if not specified.   Version: 26.5.0.cl or later  |  [optional] |
|**includeCoverPage** | **Boolean** | Indicates whether to include the cover page with the Liveboard title. |  [optional] |
|**includeCustomLogo** | **Boolean** | Indicates whether to include customized wide logo in the footer if available. |  [optional] |
|**includeFilterPage** | **Boolean** | Indicates whether to include a page with all applied filters. For &#x60;CONTINUOUS&#x60; page_size, this parameter indicates whether to include the filter header. |  [optional] |
|**includePageNumber** | **Boolean** | Indicates whether to include page number in the footer of each page. |  [optional] |
|**pageOrientation** | [**PageOrientationEnum**](#PageOrientationEnum) | Page orientation of the PDF. |  [optional] |
|**truncateTable** | **Boolean** | Indicates whether to include only the first page of the tables. |  [optional] |
|**pageFooterText** | **String** | Text to include in the footer of each page. |  [optional] |



## Enum: PageSizeEnum

| Name | Value |
|---- | -----|
| A4 | &quot;A4&quot; |
| CONTINUOUS | &quot;CONTINUOUS&quot; |



## Enum: PageOrientationEnum

| Name | Value |
|---- | -----|
| PORTRAIT | &quot;PORTRAIT&quot; |
| LANDSCAPE | &quot;LANDSCAPE&quot; |


## Implemented Interfaces

* Serializable


