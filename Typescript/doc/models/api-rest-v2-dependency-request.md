
# Api Rest V2 Dependency Request

## Structure

`ApiRestV2DependencyRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type10Enum`](/doc/models/type-10-enum.md) | Required | Type of the data object |
| `id` | `string[]` | Required | A JSON array of GUIDs of the objects |
| `batchSize` | `number \| undefined` | Optional | he maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1 |

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

