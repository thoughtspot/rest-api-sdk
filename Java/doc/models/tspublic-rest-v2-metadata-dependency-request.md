
# Tspublic Rest V2 Metadata Dependency Request

## Structure

`TspublicRestV2MetadataDependencyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`GetObjectDependencyTypeEnum`](../../doc/models/get-object-dependency-type-enum.md) | Required | Type of the data object | GetObjectDependencyTypeEnum getType() | setType(GetObjectDependencyTypeEnum type) |
| `Id` | `List<String>` | Required | A JSON array of GUIDs of the objects | List<String> getId() | setId(List<String> id) |
| `BatchSize` | `Integer` | Optional | The maximum number of batches to fetch in a query.<br><br>If this attribute is not defined, then the list of all dependent objects is included in the response | Integer getBatchSize() | setBatchSize(Integer batchSize) |

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

