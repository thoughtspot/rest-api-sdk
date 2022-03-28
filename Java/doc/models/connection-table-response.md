
# Connection Table Response

## Structure

`ConnectionTableResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Connection id | String getId() | setId(String id) |
| `Database` | [`List<ConnectionDatabaseType>`](../../doc/models/connection-database-type.md) | Optional | List of databases | List<ConnectionDatabaseType> getDatabase() | setDatabase(List<ConnectionDatabaseType> database) |

## Example (as JSON)

```json
{
  "id": null,
  "database": null
}
```

