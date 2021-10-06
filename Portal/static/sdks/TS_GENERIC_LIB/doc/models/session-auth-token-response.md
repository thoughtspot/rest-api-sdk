
# Session Auth Token Response

Login response

## Structure

`SessionAuthTokenResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Optional | Username of the user account for which token is generated |
| `token` | `string \| undefined` | Optional | Bearer token generated. This will be blank when token type is Cookie |
| `tokenCreatedTime` | `string \| undefined` | Optional | Date and time at which the token is generated |
| `tokenExpiryDuration` | `string \| undefined` | Optional | Duration in seconds after which the token expires |
| `tokenType` | `string \| undefined` | Optional | Type of token generated |

## Example (as JSON)

```json
{
  "userName": null,
  "token": null,
  "tokenCreatedTime": null,
  "tokenExpiryDuration": null,
  "tokenType": null
}
```

