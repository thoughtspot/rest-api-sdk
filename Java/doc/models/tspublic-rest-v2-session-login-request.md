
# Tspublic Rest V2 Session Login Request

## Structure

`TspublicRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Username of the user account | String getUserName() | setUserName(String userName) |
| `Password` | `String` | Optional | The password of the user account | String getPassword() | setPassword(String password) |
| `RememberMe` | [`LoginRememberMeEnum`](../../doc/models/login-remember-me-enum.md) | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls. | LoginRememberMeEnum getRememberMe() | setRememberMe(LoginRememberMeEnum rememberMe) |

## Example (as JSON)

```json
{
  "userName": null,
  "password": null,
  "rememberMe": null
}
```

