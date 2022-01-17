
# Meta Object Input

## Structure

`MetaObjectInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the metadata object | String getId() | setId(String id) |
| `Type` | [`TypeEnum`](/doc/models/type-enum.md) | Required | Type of the metadata object | TypeEnum getType() | setType(TypeEnum type) |

## Example (as JSON)

```json
{
  "id": "id0",
  "type": "DATAOBJECT"
}
```

