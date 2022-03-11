
# Tspublic Rest V2 Metadata Dependency Request

## Structure

`TspublicRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type13Enum`](../../doc/models/type-13-enum.md) | Required | Type of the data object |
| `id` | `string[]` | Required | A JSON array of GUIDs of the objects |
| `batchSize` | `number \| undefined` | Optional | The maximum number of batches to fetch in a query.<br><br>If this attribute is not defined, then the list of all dependent objects is included in the response |

## Example (as JSON)

```json
{
  "type": "COLUMN",
  "id": [
    "id0"
  ],
  "batchSize": null
}
```

