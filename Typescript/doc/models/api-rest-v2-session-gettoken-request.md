
# Api Rest V2 Session Gettoken Request

## Structure

`ApiRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Required | Username of the user account |
| `password` | `string` | Required | The password of the user account |
| `expiryTimeMs` | `string \| undefined` | Optional | Provide the time duration in milliseconds to expire the token. If no input is provided then the value set at cluster level will be considered |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "expiryTimeMs": null
}
```

