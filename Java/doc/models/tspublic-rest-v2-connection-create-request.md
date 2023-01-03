
# Tspublic Rest V2 Connection Create Request

## Structure

`TspublicRestV2ConnectionCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type14Enum`](../../doc/models/type-14-enum.md) | Required | Type of the data connection. | Type14Enum getType() | setType(Type14Enum type) |
| `Name` | `String` | Required | Name of the connection | String getName() | setName(String name) |
| `Description` | `String` | Optional | A short description of the connection. | String getDescription() | setDescription(String description) |
| `Configuration` | `String` | Required | A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection. | String getConfiguration() | setConfiguration(String configuration) |

## Example (as JSON)

```json
{
  "type": "DENODO",
  "name": "name0",
  "description": null,
  "configuration": "configuration6"
}
```

