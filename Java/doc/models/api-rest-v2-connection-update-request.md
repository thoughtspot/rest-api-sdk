
# Api Rest V2 Connection Update Request

## Structure

`ApiRestV2ConnectionUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the connection | String getId() | setId(String id) |
| `Name` | `String` | Optional | The text to update the name of the connection. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The text to update the description of the connection. | String getDescription() | setDescription(String description) |
| `Configuration` | `String` | Required | A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection.<br><br>Example:<br><br>Snowflake: {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}<br><br>Redshift: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}<br><br>Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"}<br><br>Azure Synapse: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}<br><br>Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}<br><br>Oracle ADW: {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}<br><br>Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}<br><br>Databricks: {"host":"test_host","http_path":"https://test ","user":"test_user","password":"test_pwd"}<br><br>SAP HANA: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}<br><br>Denodo: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"} | String getConfiguration() | setConfiguration(String configuration) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": null,
  "description": null,
  "configuration": "configuration6"
}
```

