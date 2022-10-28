
# Tspublic Rest V2 Connection Update Request

## Structure

`TspublicRestV2ConnectionUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | GUID of the connection | String getId() | setId(String id) |
| `Name` | `String` | Optional | The text to update the name of the connection. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The text to update the description of the connection. | String getDescription() | setDescription(String description) |
| `Configuration` | `String` | Required | A JSON object of the connection metadata. Include all the configuration attributes with original value along with the changes required to any attribute. | String getConfiguration() | setConfiguration(String configuration) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": null,
  "description": null,
  "configuration": "configuration6"
}
```

