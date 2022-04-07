
# Tspublic Rest V2 Metadata Favorite Assign Request

## Structure

`TspublicRestV2MetadataFavoriteAssignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Optional | Name of the user |
| `user_id` | `string` | Optional | The GUID of the user |
| `ts_object` | [`List of TsObjectInput`](../../doc/models/ts-object-input.md) | Required | A JSON Array of GUIDs and type of metadata object. |

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

