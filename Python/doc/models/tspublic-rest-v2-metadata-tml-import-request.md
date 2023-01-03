
# Tspublic Rest V2 Metadata Tml Import Request

## Structure

`TspublicRestV2MetadataTmlImportRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `object_tml` | `List of string` | Required | A string array of TML objects to upload, in YAML or JSON format.<br><br>If TML is in YAML format, then use escape characters for quotes and new line characters.<br><br>Example TML:<br><br>guid: 6d2c1c9b-a407-409c-8c0c-819aeb51350f\ntable:\n  name: TESTINT\n  db: SUPPLYCHAIN_MAIN\n  schema: PUBLIC\n  db_table: TESTINT\n  connection:\n    name: SnowflakeConnection\n  columns:\n  - name: C1\n    db_column_name: C1\n    properties:\n      column_type: MEASURE\n      aggregation: SUM\n      index_type: DONT_INDEX\n    db_column_properties:\n      data_type: INT64\n<br><br>If TML is in JSON format, then use escape characters for quotes.<br><br>Example TML:<br><br>{\\"guid\\": \\"6d2c1c9b-a407-409c-8c0c-819aeb51350f\\", \\"table\\": {     \\"name\\": \\"TESTINT\\", \\"db\\": \\"SUPPLYCHAIN_MAIN\\", \\"schema\\": \\"PUBLIC\\", \\"db_table\\": \\"TESTINT\\",     \\"connection\\": { \\"name\\": \\"SnowflakeConnection\\" }, \\"columns\\": [ { \\"name\\": \\"C1\\", \\"db_column_name\\": \\"C1\\", \\"properties\\": { \\"column_type\\": \\"MEASURE\\", \\"aggregation\\": \\"SUM\\", \\"index_type\\": \\"DONT_INDEX\\" }, \\"db_column_properties\\": { \\"data_type\\": \\"INT64\\" } } ] } }', |
| `import_policy` | [`ImportPolicyEnum`](../../doc/models/import-policy-enum.md) | Optional | Policy to follow during import<br>**Default**: `'PARTIAL'` |
| `force_create` | `bool` | Optional | Specifies if you are updating or creating objects. To create new objects, specify true. By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.<br>**Default**: `False` |

## Example (as JSON)

```json
{
  "objectTML": [
    "objectTML7"
  ],
  "importPolicy": null,
  "forceCreate": null
}
```

