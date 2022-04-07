
# Tspublic Rest V2 Metadata Tag Unassign Request

## Structure

`TspublicRestV2MetadataTagUnassignRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the tag | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the tag | String getId() | setId(String id) |
| `TsObject` | [`List<TsObjectInput>`](../../doc/models/ts-object-input.md) | Required | A JSON Array of GUIDs and type of metadata object. | List<TsObjectInput> getTsObject() | setTsObject(List<TsObjectInput> tsObject) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "tsObject": [
    {
      "id": "id2",
      "type": "DATAOBJECT"
    },
    {
      "id": "id3",
      "type": "CONNECTION"
    }
  ]
}
```

