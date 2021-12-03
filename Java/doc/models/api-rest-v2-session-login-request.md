
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Required | Username of the user account | String getUserName() | setUserName(String userName) |
| `Password` | `String` | Required | The password of the user account | String getPassword() | setPassword(String password) |
| `RememberMe` | `Boolean` | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.<br>**Default**: `false` | Boolean getRememberMe() | setRememberMe(Boolean rememberMe) |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "rememberMe": null
}
```

