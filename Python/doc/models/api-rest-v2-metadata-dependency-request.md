
# Api Rest V2 Metadata Dependency Request

## Structure

`ApiRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mtype` | [`Type10Enum`](/doc/models/type-10-enum.md) | Required | Type of the data object |
| `id` | `List of string` | Required | A JSON array of GUIDs of the objects |
| `batch_size` | `int` | Optional | he maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1 |

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

