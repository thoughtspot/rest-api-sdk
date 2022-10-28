
# Ts Object Search Input

## Structure

`TsObjectSearchInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type2Enum`](../../doc/models/type-2-enum.md) | Required | Type of the metadata objec | Type2Enum getType() | setType(Type2Enum type) |
| `Id` | `List<String>` | Required | A JSON Array of GUIDs of the metadata object | List<String> getId() | setId(List<String> id) |

## Example (as JSON)

```json
{
  "type": "DATAOBJECT",
  "id": [
    "id0"
  ]
}
```

