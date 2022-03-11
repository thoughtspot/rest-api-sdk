
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orientation` | [`OrientationEnum \| undefined`](../../doc/models/orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT |
| `truncateTables` | `boolean \| undefined` | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false |
| `includeLogo` | `boolean \| undefined` | Optional | Include customized wide logo if available in the footer. Default: true |
| `footerText` | `string \| undefined` | Optional | Footer text to include in the footer of each page of the PDF. |
| `includePageNumber` | `boolean \| undefined` | Optional | When set to true, the page number is included in the footer of each page. Default: true |
| `includeCoverPage` | `boolean \| undefined` | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true |
| `includeFilterPage` | `boolean \| undefined` | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true |

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

