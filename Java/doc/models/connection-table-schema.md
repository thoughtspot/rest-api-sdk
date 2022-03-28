
# Connection Table Schema

## Structure

`ConnectionTableSchema`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the schema | String getName() | setName(String name) |
| `Table` | [`List<ConnectionColumn>`](../../doc/models/connection-column.md) | Optional | List of table details | List<ConnectionColumn> getTable() | setTable(List<ConnectionColumn> table) |

## Example (as JSON)

```json
{
  "name": null,
  "table": null
}
```

