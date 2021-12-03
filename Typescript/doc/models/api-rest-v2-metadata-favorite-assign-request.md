
# Api Rest V2 Metadata Favorite Assign Request

## Structure

`ApiRestV2MetadataFavoriteAssignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Optional | Name of the user |
| `userId` | `string \| undefined` | Optional | The GUID of the user |
| `metaObject` | [`MetaObjectInput[]`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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

