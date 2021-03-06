
# Tspublic Rest V2 Database Table Create Request

## Structure

`TspublicRestV2DatabaseTableCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `create_database` | [`CreateTableCreateDatabaseEnum`](../../doc/models/create-table-create-database-enum.md) | Optional | Flag to indicate if the database and schema should be created if they do not exist in Falcon. (Valid values: True/False)<br>**Default**: `'true'` |
| `schema` | `string` | Optional | DDL of the table to be created.<br><br>Example:<br><br>{"database":{"name":"geo"},<br><br>"schema":{"name":"falcon_default_schema"},<br><br>"table":{"id":{"name":"test_table"},<br><br>"primary_key":[{"name":"test_pk"}],<br><br>"column":[<br><br>{"id":{"name":"test_pk"},"size":0,"data_type":"TYPE_INT32"},<br><br>{"id":{"name":"test_col1"},"size":0,"data_type":"TYPE_FLOAT"},<br><br>{"id":{"name":"test_col2"},"data_type":"TYPE_INT64","datetime":"TYPE_DATE"},<br><br>{"id":{"name":"test_col3"},"size":10,"data_type":"TYPE_VAR_CHAR"}<br><br>]<br><br>}<br><br>} |

## Example (as JSON)

```json
{
  "createDatabase": null,
  "schema": null
}
```

