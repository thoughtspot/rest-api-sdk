
# Api Rest V2 Session Login Request

## Structure

`ApiRestV2SessionLoginRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Required | - |
| `password` | `string` | Required | - |
| `remember_me` | `bool` | Optional | - |
| `token_type` | [`TokenTypeEnum`](/doc/models/token-type-enum.md) | Optional | - |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "rememberMe": null,
  "tokenType": null
}
```

