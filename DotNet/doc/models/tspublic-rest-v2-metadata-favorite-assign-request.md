
# Tspublic Rest V2 Metadata Favorite Assign Request

## Structure

`TspublicRestV2MetadataFavoriteAssignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `UserName` | `string` | Optional | Name of the user |
| `UserId` | `string` | Optional | The GUID of the user |
| `TsObject` | [`List<Models.TsObjectInput>`](../../doc/models/ts-object-input.md) | Required | A JSON Array of GUIDs and type of metadata object. |

## Example (as JSON)

```json
{
  "userName": null,
  "userId": null,
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

