
# Tspublic Rest V2 Customaction Update Request

## Structure

`TspublicRestV2CustomactionUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the custom action | String getId() | setId(String id) |
| `Configuration` | `String` | Required | A JSON object with the key-value pair of configuration attributes<br><br>Example:<br><br>{"id":"3f7eac93-cce1-4ffc-b7a8-429353edbc6b","name":"unpkg test","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"unpkg-test","authSelect":"BEARER","authToken":"asdfasadf3q4534534","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{\\"url_header1\\":{\\"id\\":\\"6a82908c-9328-40ff-b347-65adeda12f57\\",\\"key\\":\\"key1\\",\\"value\\":\\"value1\\"}}"},"actionAssociationMap":{"ANSWER":{"e4079d3f-ae71-4b0a-a70a-f17ecaf157a5":{"enabled":"true","context":"MENU"}}},"context":"NONE","availability":["GLOBAL"],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} | String getConfiguration() | setConfiguration(String configuration) |

## Example (as JSON)

```json
{
  "id": "id0",
  "configuration": "configuration6"
}
```

