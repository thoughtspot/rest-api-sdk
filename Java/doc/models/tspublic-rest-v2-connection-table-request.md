
# Tspublic Rest V2 Connection Table Request

## Structure

`TspublicRestV2ConnectionTableRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The GUID of the connection | String getId() | setId(String id) |
| `Configuration` | `String` | Optional | A JSON object of the connection metadata. If this field is left empty, then the configuration saved in the connection is considered.<br><br>To get the tables based on a different configuration, include required attributes in the connection configuration JSON.<br><br>Example:<br><br>Get tables from Snowflake with a different user account than specified in the connection: {"user":"test_user","password":"test_pwd","role":"test_role"}<br><br>Get tables from Redshift for different database than specified in the connection: {"database":"test_db"} | String getConfiguration() | setConfiguration(String configuration) |
| `IncludeColumn` | `Boolean` | Optional | When set to true, the response will include column level details as well<br>**Default**: `true` | Boolean getIncludeColumn() | setIncludeColumn(Boolean includeColumn) |

## Example (as JSON)

```json
{
  "id": "id0",
  "configuration": null,
  "includeColumn": null
}
```

