
# Api Rest V2 Metadata Favorite Unassign Request

## Structure

`ApiRestV2MetadataFavoriteUnassignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Optional | Name of the user |
| `user_id` | `string` | Optional | The GUID of the user |
| `meta_object` | [`List of MetaObjectInput`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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

