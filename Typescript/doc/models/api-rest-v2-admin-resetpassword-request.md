
# Api Rest V2 Admin Resetpassword Request

## Structure

`ApiRestV2AdminResetpasswordRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | User name of the user account. |
| `id` | `string \| undefined` | Optional | The GUID of the user account to query. |
| `newPassword` | `string` | Required | A new password for the user. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "newPassword": "newPassword6"
}
```

