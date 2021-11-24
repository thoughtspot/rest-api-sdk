
# Session Login Response

Login response

## Structure

`SessionLoginResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Optional | Username of the user account for which token is generated |
| `token` | `string` | Optional | Bearer token generated. This will be blank when token type is Cookie |
| `token_created_time` | `string` | Optional | Date and time at which the token is generated |
| `token_expiry_duration` | `string` | Optional | Duration in seconds after which the token expires |
| `token_type` | `string` | Optional | Type of token generated |

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

