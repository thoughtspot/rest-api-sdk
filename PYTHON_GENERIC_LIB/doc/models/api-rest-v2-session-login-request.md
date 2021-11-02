
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Required | Username of the user account<br>**Default**: `'abc'` |
| `password` | `string` | Required | The password of the user account<br>**Default**: `'abc'` |
| `remember_me` | `bool` | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.<br>**Default**: `False` |

## Example (as JSON)

```json
{
  "userName": "abc",
  "password": "abc"
}
```

