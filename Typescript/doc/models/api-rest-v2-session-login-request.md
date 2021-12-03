
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Required | Username of the user account |
| `password` | `string` | Required | The password of the user account |
| `rememberMe` | `boolean \| undefined` | Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.<br>**Default**: `false` |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "rememberMe": null
}
```

