
# Api Rest V2 Metadata Dependency Request

## Structure

`ApiRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type10Enum`](/doc/models/type-10-enum.md) | Required | Type of the data object | Type10Enum getType() | setType(Type10Enum type) |
| `Id` | `List<String>` | Required | A JSON array of GUIDs of the objects | List<String> getId() | setId(List<String> id) |
| `BatchSize` | `Integer` | Optional | he maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1 | Integer getBatchSize() | setBatchSize(Integer batchSize) |

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

