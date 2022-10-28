
# Tspublic Rest V2 Connection Update Request

## Structure

`TspublicRestV2ConnectionUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | GUID of the connection |
| `Name` | `string` | Optional | The text to update the name of the connection. |
| `Description` | `string` | Optional | The text to update the description of the connection. |
| `Configuration` | `string` | Required | A JSON object of the connection metadata. Include all the configuration attributes with original value along with the changes required to any attribute. |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": null,
  "description": null,
  "configuration": "configuration6"
}
```

