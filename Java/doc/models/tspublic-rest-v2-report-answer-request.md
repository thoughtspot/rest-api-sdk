
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the Answer to download. | String getId() | setId(String id) |
| `Type` | [`Type17Enum`](../../doc/models/type-17-enum.md) | Required | Type of file to be generated.<br>**Default**: `Type17Enum.PDF` | Type17Enum getType() | setType(Type17Enum type) |

## Example (as JSON)

```json
{
  "id": null,
  "type": "PDF"
}
```

