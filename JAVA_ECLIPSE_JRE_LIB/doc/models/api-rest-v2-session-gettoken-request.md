
# Api Rest V2 Session Gettoken Request

## Structure

`ApiRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Required | Username of the user account | String getUserName() | setUserName(String userName) |
| `Password` | `String` | Required | The password of the user account | String getPassword() | setPassword(String password) |
| `ExpiryTimeMs` | `String` | Optional | Provide the time duration in milliseconds to expire the token. If no input is provided then the value set at cluster level will be considered | String getExpiryTimeMs() | setExpiryTimeMs(String expiryTimeMs) |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "expiryTimeMs": null
}
```

