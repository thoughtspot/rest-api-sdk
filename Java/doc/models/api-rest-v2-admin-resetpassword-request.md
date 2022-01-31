
# Api Rest V2 Admin Resetpassword Request

## Structure

`ApiRestV2AdminResetpasswordRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | User name of the user account. | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account to query. | String getId() | setId(String id) |
| `NewPassword` | `String` | Required | A new password for the user. | String getNewPassword() | setNewPassword(String newPassword) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "newPassword": "newPassword6"
}
```

