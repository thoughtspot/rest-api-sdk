
# Api Rest V2 Database Table Create Request

## Structure

`ApiRestV2DatabaseTableCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreateDatabase` | `Boolean` | Optional | Flag to indicate if the database and schema should be created if they do not exist in Falcon. (Valid values: True/False)<br>**Default**: `true` | Boolean getCreateDatabase() | setCreateDatabase(Boolean createDatabase) |
| `Schema` | `String` | Optional | DDL of the table to be created. | String getSchema() | setSchema(String schema) |

## Example (as JSON)

```json
{
  "createDatabase": null,
  "schema": null
}
```

