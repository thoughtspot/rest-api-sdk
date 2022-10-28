
# Tspublic Rest V2 Admin Resetpassword Request

## Structure

`TspublicRestV2AdminResetpasswordRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | User name of the user account |
| `id` | `string` | Optional | The GUID of the user account to query. |
| `new_password` | `string` | Required | A new password for the user. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "newPassword": "newPassword6"
}
```

