
# Tspublic Rest V2 User Changepassword Request

## Structure

`TspublicRestV2UserChangepasswordRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | User name of the user account. |
| `Id` | `string` | Optional | The GUID of the user account to query. |
| `CurrentPassword` | `string` | Required | The current password of the user. |
| `NewPassword` | `string` | Required | A new password for the user. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "currentPassword": "currentPassword6",
  "newPassword": "newPassword6"
}
```

