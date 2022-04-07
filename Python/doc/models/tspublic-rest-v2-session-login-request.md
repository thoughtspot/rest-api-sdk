
# Tspublic Rest V2 Session Login Request

## Structure

`TspublicRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Optional | Username of the user account |
| `password` | `string` | Optional | The password of the user account |
| `remember_me` | [`RememberMeEnum`](../../doc/models/remember-me-enum.md) | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls. |

## Example (as JSON)

```json
{
  "userName": null,
  "password": null,
  "rememberMe": null
}
```

