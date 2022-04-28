
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | GUID of the Answer to download. |
| `Type` | [`Models.AnswerReportTypeEnum`](../../doc/models/answer-report-type-enum.md) | Required | Type of file to be generated.<br>**Default**: `AnswerReportTypeEnum.PDF` |

## Example (as JSON)

```json
{
  "id": null,
  "type": "PDF"
}
```

