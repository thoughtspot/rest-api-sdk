
# Tspublic Rest V2 Database Table Create Request

## Structure

`TspublicRestV2DatabaseTableCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `CreateDatabase` | `bool?` | Optional | Flag to indicate if the database and schema should be created if they do not exist in Falcon. (Valid values: True/False)<br>**Default**: `true` |
| `Schema` | `string` | Optional | DDL of the table to be created. Example: {"database":{"name":"test_db"},"schema":{"name":"test_schema"},"table":{"id":{"name":"test_table"},"primary_key":[{"name":"test_pk"}],"column":[{"id":{"name":"test_pk"},"size":0,"data_type":"TYPE_INT32"},{"id":{"name":"test_col1"},"size":0,"data_type":"TYPE_FLOAT"},{"id":{"name":"test_col2"},"data_type":"TYPE_INT64","datetime":"TYPE_DATE"}{"id":{"name":"test_col3"},"size":10,"data_type":"TYPE_VAR_CHAR"}]}} |

## Example (as JSON)

```json
{
  "createDatabase": null,
  "schema": null
}
```

