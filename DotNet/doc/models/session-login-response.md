
# Session Login Response

Login response

## Structure

`SessionLoginResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `UserName` | `string` | Optional | Username of the user account for which token is generated |
| `Token` | `string` | Optional | Bearer token generated. This will be blank when token type is Cookie |
| `TokenCreatedTime` | `string` | Optional | Date and time at which the token is generated |
| `TokenExpiryDuration` | `string` | Optional | Duration in seconds after which the token expires |
| `TokenType` | `string` | Optional | Type of token generated |

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

