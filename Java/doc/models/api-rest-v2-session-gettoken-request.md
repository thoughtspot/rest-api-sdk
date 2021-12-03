
# Api Rest V2 Session Gettoken Request

## Structure

`ApiRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Required | Username of the user account | String getUserName() | setUserName(String userName) |
| `Password` | `String` | Required | The password of the user account | String getPassword() | setPassword(String password) |
| `TokenExpiryDuration` | `String` | Optional | Provide duration in seconds after which the token should expire | String getTokenExpiryDuration() | setTokenExpiryDuration(String tokenExpiryDuration) |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "tokenExpiryDuration": null
}
```

