
# Pdf Options Input

## Structure

`PdfOptionsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Orientation` | [`OrientationEnum`](../../doc/models/orientation-enum.md) | Optional | Page orientation for the PDF. Default: PORTRAIT | OrientationEnum getOrientation() | setOrientation(OrientationEnum orientation) |
| `TruncateTables` | `Boolean` | Optional | When set to true, only the first page of the tables is displayed in the file.<br><br>This setting is applicable only when generating report for specific visualization ids. Default: false | Boolean getTruncateTables() | setTruncateTables(Boolean truncateTables) |
| `IncludeLogo` | `Boolean` | Optional | Include customized wide logo if available in the footer. Default: true | Boolean getIncludeLogo() | setIncludeLogo(Boolean includeLogo) |
| `FooterText` | `String` | Optional | Footer text to include in the footer of each page of the PDF. | String getFooterText() | setFooterText(String footerText) |
| `IncludePageNumber` | `Boolean` | Optional | When set to true, the page number is included in the footer of each page. Default: true | Boolean getIncludePageNumber() | setIncludePageNumber(Boolean includePageNumber) |
| `IncludeCoverPage` | `Boolean` | Optional | When set to true, a cover page with the Liveboard title is added in the PDF. Default: true | Boolean getIncludeCoverPage() | setIncludeCoverPage(Boolean includeCoverPage) |
| `IncludeFilterPage` | `Boolean` | Optional | When set to true, a second page with a list of all applied filters is added in the PDF. Default: true | Boolean getIncludeFilterPage() | setIncludeFilterPage(Boolean includeFilterPage) |

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

