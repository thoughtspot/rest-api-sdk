
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Required | - | String getUserName() | setUserName(String userName) |
| `Password` | `String` | Required | - | String getPassword() | setPassword(String password) |
| `RememberMe` | `Boolean` | Optional | - | Boolean getRememberMe() | setRememberMe(Boolean rememberMe) |
| `TokenType` | [`TokenTypeEnum`](/doc/models/token-type-enum.md) | Optional | - | TokenTypeEnum getTokenType() | setTokenType(TokenTypeEnum tokenType) |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "rememberMe": null,
  "tokenType": null
}
```

