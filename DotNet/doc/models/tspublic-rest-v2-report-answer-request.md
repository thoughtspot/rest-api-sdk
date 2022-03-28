
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | GUID of the Answer to download. |
| `Type` | [`Models.Type17Enum`](../../doc/models/type-17-enum.md) | Required | Type of file to be generated.<br>**Default**: `Type17Enum.PDF` |

## Example (as JSON)

```json
{
  "id": null,
  "type": "PDF"
}
```

