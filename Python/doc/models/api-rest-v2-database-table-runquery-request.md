
# Api Rest V2 Database Table Runquery Request

## Structure

`ApiRestV2DatabaseTableRunqueryRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `statement` | `List of string` | Required | A JSON array of TQL statements. Each TQL statement should end with semi-colon (;). The TQL operations that can be run through this API are restricted to create database and schema, alter table, delete and update table rows. If a TQL statement fails, then the subsequent statements in the array are not run. Example statement: alter table test_db.test_schema.test_table drop contraint primary key; |

## Example (as JSON)

```json
{
  "statement": [
    "statement0"
  ]
}
```

