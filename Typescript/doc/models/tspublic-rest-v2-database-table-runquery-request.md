
# Tspublic Rest V2 Database Table Runquery Request

## Structure

`TspublicRestV2DatabaseTableRunqueryRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `statement` | `string[]` | Required | A JSON array of TQL statements.<br><br>Each TQL statement should end with semi-colon (;).<br><br>The TQL operations that can be run through this API are restricted to create database and schema, alter table, delete and update table rows.<br><br>If a TQL statement fails, then the subsequent statements in the array are not run.<br><br>Example:<br><br>alter table test_db.test_schema.test_table drop contraint primary key; |

## Example (as JSON)

```json
{
  "statement": [
    "statement0"
  ]
}
```

