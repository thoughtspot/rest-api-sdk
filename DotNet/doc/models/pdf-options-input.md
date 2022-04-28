
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Orientation` | [`Models.PdfOptionsInputOrientationEnum?`](../../doc/models/pdf-options-input-orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT<br>**Default**: `PdfOptionsInputOrientationEnum.PORTRAIT` |
| `TruncateTables` | [`Models.PdfOptionsInputTruncateTablesEnum?`](../../doc/models/pdf-options-input-truncate-tables-enum.md) | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false<br>**Default**: `PdfOptionsInputTruncateTablesEnum.false` |
| `IncludeLogo` | [`Models.PdfOptionsInputIncludeLogoEnum?`](../../doc/models/pdf-options-input-include-logo-enum.md) | Optional | Include customized wide logo if available in the footer. Default: true<br>**Default**: `PdfOptionsInputIncludeLogoEnum.true` |
| `FooterText` | `string` | Optional | Footer text to include in the footer of each page of the PDF. |
| `IncludePageNumber` | [`Models.PdfOptionsInputIncludePageNumberEnum?`](../../doc/models/pdf-options-input-include-page-number-enum.md) | Optional | When set to true, the page number is included in the footer of each page. Default: true<br>**Default**: `PdfOptionsInputIncludePageNumberEnum.true` |
| `IncludeCoverPage` | [`Models.PdfOptionsInputIncludeCoverPageEnum?`](../../doc/models/pdf-options-input-include-cover-page-enum.md) | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true<br>**Default**: `PdfOptionsInputIncludeCoverPageEnum.true` |
| `IncludeFilterPage` | [`Models.PdfOptionsInputIncludeFilterPageEnum?`](../../doc/models/pdf-options-input-include-filter-page-enum.md) | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true<br>**Default**: `PdfOptionsInputIncludeFilterPageEnum.true` |

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

