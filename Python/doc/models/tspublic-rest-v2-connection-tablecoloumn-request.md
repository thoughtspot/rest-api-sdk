
# Tspublic Rest V2 Connection Tablecoloumn Request

## Structure

`TspublicRestV2ConnectionTablecoloumnRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | The GUID of the connection |
| `configuration` | `string` | Optional | A JSON object of the connection metadata. If this field is left empty, then the configuration saved in the connection is considered.<br><br>To get the tables based on a different configuration, include required attributes in the connection configuration JSON.<br><br>Example:<br><br>Get tables from Snowflake with a different user account than specified in the connection: {"user":"test_user","password":"test_pwd","role":"test_role"}<br><br>Get tables from Redshift for different database than specified in the connection: {"database":"test_db"} |
| `table` | [`List of ConnectionTableColumnsInput`](../../doc/models/connection-table-columns-input.md) | Required | List of table details |

## Example (as JSON)

```json
{
  "id": "id0",
  "configuration": null,
  "table": [
    {
      "dbName": "dbName4",
      "schemaName": "schemaName0",
      "name": "name6"
    }
  ]
}
```

