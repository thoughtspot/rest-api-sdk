
# Connection Column

## Structure

`ConnectionColumn`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the table | String getName() | setName(String name) |
| `Type` | `String` | Optional | Type of the Table | String getType() | setType(String type) |
| `Column` | [`List<TableColumns>`](../../doc/models/table-columns.md) | Optional | List of columns in the table | List<TableColumns> getColumn() | setColumn(List<TableColumns> column) |

## Example (as JSON)

```json
{
  "name": null,
  "type": null,
  "column": null
}
```

