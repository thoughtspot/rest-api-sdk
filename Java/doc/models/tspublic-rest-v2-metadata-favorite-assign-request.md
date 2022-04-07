
# Tspublic Rest V2 Metadata Favorite Assign Request

## Structure

`TspublicRestV2MetadataFavoriteAssignRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Name of the user | String getUserName() | setUserName(String userName) |
| `UserId` | `String` | Optional | The GUID of the user | String getUserId() | setUserId(String userId) |
| `TsObject` | [`List<TsObjectInput>`](../../doc/models/ts-object-input.md) | Required | A JSON Array of GUIDs and type of metadata object. | List<TsObjectInput> getTsObject() | setTsObject(List<TsObjectInput> tsObject) |

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

