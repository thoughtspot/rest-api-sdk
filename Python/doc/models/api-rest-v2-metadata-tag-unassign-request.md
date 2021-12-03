
# Api Rest V2 Metadata Tag Unassign Request

## Structure

`ApiRestV2MetadataTagUnassignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the tag |
| `id` | `string` | Optional | The GUID of the tag |
| `meta_object` | [`List of MetaObjectInput`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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

