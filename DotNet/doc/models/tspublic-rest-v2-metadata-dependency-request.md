
# Tspublic Rest V2 Metadata Dependency Request

## Structure

`TspublicRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Type` | [`Models.Type13Enum`](../../doc/models/type-13-enum.md) | Required | Type of the data object |
| `Id` | `List<string>` | Required | A JSON array of GUIDs of the objects |
| `BatchSize` | `int?` | Optional | The maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1<br>**Default**: `-1` |

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

