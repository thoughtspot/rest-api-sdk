
# Api Rest V2 Session Gettoken Request

## Structure

`ApiRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Required | Username of the user account |
| `password` | `string` | Required | The password of the user account |
| `tokenExpiryDuration` | `number \| undefined` | Optional | Provide duration in seconds after which the token should expire |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": "password4",
  "tokenExpiryDuration": null
}
```

