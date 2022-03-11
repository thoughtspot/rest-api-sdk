
# Tspublic Rest V2 Metadata Tag Unassign Request

## Structure

`TspublicRestV2MetadataTagUnassignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the tag |
| `id` | `string \| undefined` | Optional | The GUID of the tag |
| `tsObject` | [`TsObjectInput[]`](../../doc/models/ts-object-input.md) | Required | A JSON Array of GUIDs and type of metadata object. |

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

