
# Api Rest V2 Metadata Favorite Unassign Request

## Structure

`ApiRestV2MetadataFavoriteUnassignRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Name of the user | String getUserName() | setUserName(String userName) |
| `UserId` | `String` | Optional | The GUID of the user | String getUserId() | setUserId(String userId) |
| `MetaObject` | [`List<MetaObjectInput>`](/doc/models/meta-object-input.md) | Required | Metadata object details | List<MetaObjectInput> getMetaObject() | setMetaObject(List<MetaObjectInput> metaObject) |

## Example (as JSON)

```json
{
  "userName": null,
  "userId": null,
  "metaObject": [
    {
      "id": "id0",
      "type": "ANSWER"
    }
  ]
}
```

