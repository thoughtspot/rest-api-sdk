
# Connection Database Type

## Structure

`ConnectionDatabaseType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the database | String getName() | setName(String name) |
| `Schema` | [`List<ConnectionTableSchema>`](../../doc/models/connection-table-schema.md) | Optional | List of schemas | List<ConnectionTableSchema> getSchema() | setSchema(List<ConnectionTableSchema> schema) |

## Example (as JSON)

```json
{
  "name": null,
  "schema": null
}
```

