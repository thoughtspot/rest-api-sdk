
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Orientation` | [`PdfOptionsInputOrientationEnum`](../../doc/models/pdf-options-input-orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT<br>**Default**: `PdfOptionsInputOrientationEnum.PORTRAIT` | PdfOptionsInputOrientationEnum getOrientation() | setOrientation(PdfOptionsInputOrientationEnum orientation) |
| `TruncateTables` | [`PdfOptionsInputTruncateTablesEnum`](../../doc/models/pdf-options-input-truncate-tables-enum.md) | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false<br>**Default**: `PdfOptionsInputTruncateTablesEnum.ENUM_FALSE` | PdfOptionsInputTruncateTablesEnum getTruncateTables() | setTruncateTables(PdfOptionsInputTruncateTablesEnum truncateTables) |
| `IncludeLogo` | [`PdfOptionsInputIncludeLogoEnum`](../../doc/models/pdf-options-input-include-logo-enum.md) | Optional | Include customized wide logo if available in the footer. Default: true<br>**Default**: `PdfOptionsInputIncludeLogoEnum.ENUM_TRUE` | PdfOptionsInputIncludeLogoEnum getIncludeLogo() | setIncludeLogo(PdfOptionsInputIncludeLogoEnum includeLogo) |
| `FooterText` | `String` | Optional | Footer text to include in the footer of each page of the PDF. | String getFooterText() | setFooterText(String footerText) |
| `IncludePageNumber` | [`PdfOptionsInputIncludePageNumberEnum`](../../doc/models/pdf-options-input-include-page-number-enum.md) | Optional | When set to true, the page number is included in the footer of each page. Default: true<br>**Default**: `PdfOptionsInputIncludePageNumberEnum.ENUM_TRUE` | PdfOptionsInputIncludePageNumberEnum getIncludePageNumber() | setIncludePageNumber(PdfOptionsInputIncludePageNumberEnum includePageNumber) |
| `IncludeCoverPage` | [`PdfOptionsInputIncludeCoverPageEnum`](../../doc/models/pdf-options-input-include-cover-page-enum.md) | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true<br>**Default**: `PdfOptionsInputIncludeCoverPageEnum.ENUM_TRUE` | PdfOptionsInputIncludeCoverPageEnum getIncludeCoverPage() | setIncludeCoverPage(PdfOptionsInputIncludeCoverPageEnum includeCoverPage) |
| `IncludeFilterPage` | [`PdfOptionsInputIncludeFilterPageEnum`](../../doc/models/pdf-options-input-include-filter-page-enum.md) | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true<br>**Default**: `PdfOptionsInputIncludeFilterPageEnum.ENUM_TRUE` | PdfOptionsInputIncludeFilterPageEnum getIncludeFilterPage() | setIncludeFilterPage(PdfOptionsInputIncludeFilterPageEnum includeFilterPage) |

## Example (as JSON)

```json
{
  "orientation": null,
  "truncateTables": null,
  "includeLogo": null,
  "footerText": null,
  "includePageNumber": null,
  "includeCoverPage": null,
  "includeFilterPage": null
}
```

