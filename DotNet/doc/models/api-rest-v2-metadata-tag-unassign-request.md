
# Api Rest V2 Metadata Tag Unassign Request

## Structure

`ApiRestV2MetadataTagUnassignRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the tag |
| `Id` | `string` | Optional | The GUID of the tag |
| `MetaObject` | [`List<Models.MetaObjectInput>`](/doc/models/meta-object-input.md) | Required | Metadata object details |

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

