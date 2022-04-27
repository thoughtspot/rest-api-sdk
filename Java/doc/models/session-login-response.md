
# Session Login Response

Login response

## Structure

`SessionLoginResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Username of the user account for which token is generated | String getUserName() | setUserName(String userName) |
| `Token` | `String` | Optional | Bearer token generated. This will be blank when token type is Cookie | String getToken() | setToken(String token) |
| `TokenCreatedTime` | `String` | Optional | Date and time at which the token is generated | String getTokenCreatedTime() | setTokenCreatedTime(String tokenCreatedTime) |
| `TokenExpiryDuration` | `String` | Optional | Duration in seconds after which the token expires | String getTokenExpiryDuration() | setTokenExpiryDuration(String tokenExpiryDuration) |
| `TokenType` | `String` | Optional | Type of token generated | String getTokenType() | setTokenType(String tokenType) |

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

