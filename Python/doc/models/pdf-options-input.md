
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orientation` | [`OrientationEnum`](../../doc/models/orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT |
| `truncate_tables` | `bool` | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false |
| `include_logo` | `bool` | Optional | Include customized wide logo if available in the footer. Default: true |
| `footer_text` | `string` | Optional | Footer text to include in the footer of each page of the PDF. |
| `include_page_number` | `bool` | Optional | When set to true, the page number is included in the footer of each page. Default: true |
| `include_cover_page` | `bool` | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true |
| `include_filter_page` | `bool` | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true |

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

