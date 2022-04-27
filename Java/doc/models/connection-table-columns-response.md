
# Connection Table Columns Response

## Structure

`ConnectionTableColumnsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Connection id | String getId() | setId(String id) |
| `Table` | [`List<ConnectionColumnsShema>`](../../doc/models/connection-columns-shema.md) | Optional | List of table details | List<ConnectionColumnsShema> getTable() | setTable(List<ConnectionColumnsShema> table) |

## Example (as JSON)

```json
{
  "id": null,
  "table": null
}
```

