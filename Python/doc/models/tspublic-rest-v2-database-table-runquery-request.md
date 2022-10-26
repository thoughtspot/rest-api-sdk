
# Tspublic Rest V2 Database Table Runquery Request

## Structure

`TspublicRestV2DatabaseTableRunqueryRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `statement` | `List of string` | Required | A JSON array of TQL statements separated by semi-colon (;). Each TQL statement should end with semi-colon (;). The TQL operations that can be run through this API are restricted to create database and schema, alter table, delete and update table rows. If a TQL statement fails, then the subsequent statements in the array are not run. Example: ["alter table test_db.test_schema.test_table drop contraint primary key;";"alter table test_db.test_schema.test_table add column test_col4 varchar(10) DEFAULT '';"] |

## Example (as JSON)

```json
{
  "statement": [
    "statement0"
  ]
}
```

