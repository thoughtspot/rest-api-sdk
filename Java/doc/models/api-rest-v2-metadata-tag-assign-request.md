
# Api Rest V2 Metadata Tag Assign Request

## Structure

`ApiRestV2MetadataTagAssignRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the tag | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the tag | String getId() | setId(String id) |
| `MetaObject` | [`List<MetaObjectInput>`](/doc/models/meta-object-input.md) | Required | Metadata object details | List<MetaObjectInput> getMetaObject() | setMetaObject(List<MetaObjectInput> metaObject) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "metaObject": [
    {
      "id": "id0",
      "type": "ANSWER"
    }
  ]
}
```

