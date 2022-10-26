
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Orientation` | [`Models.OrientationEnum?`](../../doc/models/orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT |
| `TruncateTables` | `bool?` | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false |
| `IncludeLogo` | `bool?` | Optional | Include customized wide logo if available in the footer. Default: true |
| `FooterText` | `string` | Optional | Footer text to include in the footer of each page of the PDF. |
| `IncludePageNumber` | `bool?` | Optional | When set to true, the page number is included in the footer of each page. Default: true |
| `IncludeCoverPage` | `bool?` | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true |
| `IncludeFilterPage` | `bool?` | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true |

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

