
# Ts Object Input

## Structure

`TsObjectInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the metadata object | String getId() | setId(String id) |
| `Type` | [`TsObjectInputTypeEnum`](../../doc/models/ts-object-input-type-enum.md) | Required | Type of the metadata object | TsObjectInputTypeEnum getType() | setType(TsObjectInputTypeEnum type) |

## Example (as JSON)

```json
{
  "id": "id0",
  "type": "DATAOBJECT"
}
```

