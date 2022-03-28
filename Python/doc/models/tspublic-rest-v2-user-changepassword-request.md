
# Tspublic Rest V2 User Changepassword Request

## Structure

`TspublicRestV2UserChangepasswordRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | User name of the user account |
| `id` | `string` | Optional | The GUID of the user account to query |
| `current_password` | `string` | Required | The current password of the user. |
| `new_password` | `string` | Required | A new password for the user. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "currentPassword": "currentPassword6",
  "newPassword": "newPassword6"
}
```

