
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the Answer to download. | String getId() | setId(String id) |
| `Type` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Required | Type of file to be generated.<br>**Default**: `Type16Enum.CSV` | Type16Enum getType() | setType(Type16Enum type) |

## Example (as JSON)

```json
{
  "id": null,
  "type": "CSV"
}
```

