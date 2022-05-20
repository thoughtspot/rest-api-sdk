
# Ts Object Search Input

## Structure

`TsObjectSearchInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`TsObjectSearchInputTypeEnum`](../../doc/models/ts-object-search-input-type-enum.md) | Required | Type of the metadata objec | TsObjectSearchInputTypeEnum getType() | setType(TsObjectSearchInputTypeEnum type) |
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

