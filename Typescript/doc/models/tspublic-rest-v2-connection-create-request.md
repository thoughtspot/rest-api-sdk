
# Tspublic Rest V2 Connection Create Request

## Structure

`TspublicRestV2ConnectionCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type14Enum`](../../doc/models/type-14-enum.md) | Required | Type of the data connection. |
| `name` | `string` | Required | Name of the connection |
| `description` | `string \| undefined` | Optional | A short description of the connection. |
| `configuration` | `string` | Required | A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection. |

## Example (as JSON)

```json
{
  "type": "DENODO",
  "name": "name0",
  "description": null,
  "configuration": "configuration6"
}
```

