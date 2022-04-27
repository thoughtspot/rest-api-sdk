
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the Answer to download. | String getId() | setId(String id) |
| `Type` | [`AnswerReportTypeEnum`](../../doc/models/answer-report-type-enum.md) | Required | Type of file to be generated.<br>**Default**: `AnswerReportTypeEnum.PDF` | AnswerReportTypeEnum getType() | setType(AnswerReportTypeEnum type) |

## Example (as JSON)

```json
{
  "id": null,
  "type": "PDF"
}
```

