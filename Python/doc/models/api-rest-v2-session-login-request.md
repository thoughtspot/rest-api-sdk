
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Required | Username of the user account |
| `password` | `string` | Required | The password of the user account |
| `remember_me` | `bool` | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.<br>**Default**: `False` |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "rememberMe": null
}
```

