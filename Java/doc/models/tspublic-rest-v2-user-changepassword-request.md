
# Tspublic Rest V2 User Changepassword Request

## Structure

`TspublicRestV2UserChangepasswordRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | User name of the user account. | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account to query. | String getId() | setId(String id) |
| `CurrentPassword` | `String` | Required | The current password of the user. | String getCurrentPassword() | setCurrentPassword(String currentPassword) |
| `NewPassword` | `String` | Required | A new password for the user. | String getNewPassword() | setNewPassword(String newPassword) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "currentPassword": "currentPassword6",
  "newPassword": "newPassword6"
}
```

