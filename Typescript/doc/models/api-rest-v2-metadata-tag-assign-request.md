
# Api Rest V2 Metadata Tag Assign Request

## Structure

`ApiRestV2MetadataTagAssignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the tag |
| `id` | `string \| undefined` | Optional | The GUID of the tag |
| `metaObject` | [`MetaObjectInput[]`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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

