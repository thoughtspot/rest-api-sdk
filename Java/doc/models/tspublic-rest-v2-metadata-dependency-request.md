
# Tspublic Rest V2 Metadata Dependency Request

## Structure

`TspublicRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type13Enum`](../../doc/models/type-13-enum.md) | Required | Type of the data object | Type13Enum getType() | setType(Type13Enum type) |
| `Id` | `List<String>` | Required | A JSON array of GUIDs of the objects | List<String> getId() | setId(List<String> id) |
| `BatchSize` | `Integer` | Optional | The maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1<br>**Default**: `-1` | Integer getBatchSize() | setBatchSize(Integer batchSize) |

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

