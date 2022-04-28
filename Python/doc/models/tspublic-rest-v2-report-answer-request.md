
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the Answer to download. |
| `mtype` | [`AnswerReportTypeEnum`](../../doc/models/answer-report-type-enum.md) | Required | Type of file to be generated.<br>**Default**: `'PDF'` |

## Example (as JSON)

```json
{
  "id": null,
  "type": "PDF"
}
```

