
# Api Rest V2 Metadata Favorite Unassign Request

## Structure

`ApiRestV2MetadataFavoriteUnassignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `UserName` | `string` | Optional | Name of the user |
| `UserId` | `string` | Optional | The GUID of the user |
| `MetaObject` | [`List<Models.MetaObjectInput>`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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
