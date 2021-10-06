
# Rest API Session Info

Session Info

## Structure

`RestAPISessionInfo`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Optional | Username of the user account for which the session information is returned |
| `user_display_name` | `string` | Optional | A unique display name string for the user |
| `user_email` | `string` | Optional | Email of the user account |
| `user_created_time` | `float` | Optional | Date and time of creation of the user account |
| `user_guid` | `string` | Optional | GUID of the user account |
| `can_change_password` | `bool` | Optional | Indicates if the user account can change the password |
| `is_system_user` | `bool` | Optional | Indicates if the user account is system or external user |
| `user_group_mask` | `int` | Optional | Group mask of the user account |
| `privileges` | `List of string` | Optional | Privileges assigned to the user account |
| `expiration_time` | `int` | Optional | Expiration time of the token for the user account |
| `auth_token` | `string` | Optional | Auth token for the user account |
| `locale` | `string` | Optional | Locale of the token for the user account |
| `timezone` | `string` | Optional | Timezone assigned to the user account |
| `date_format` | [`EFormat`](/doc/models/e-format.md) | Optional | - |
| `time_format` | [`EFormat`](/doc/models/e-format.md) | Optional | - |
| `date_time_format` | [`EFormat`](/doc/models/e-format.md) | Optional | - |
| `partial_j_session_guid` | `string` | Optional | Partial GUID of the user account |
| `is_first_login` | `bool` | Optional | Indicates if the user account is logging in for the first time |
| `first_login_date` | `float` | Optional | Date on which the user account logged in for the first time |
| `user_properties` | [`UserProperties`](/doc/models/user-properties.md) | Optional | - |
| `state` | `string` | Optional | Indicates if the user account is active or inactive |

## Example (as JSON)

```json
{
  "userName": null,
  "userDisplayName": null,
  "userEmail": null,
  "userCreatedTime": null,
  "userGUID": null,
  "canChangePassword": null,
  "isSystemUser": null,
  "userGroupMask": null,
  "privileges": null,
  "expirationTime": null,
  "authToken": null,
  "locale": null,
  "timezone": null,
  "dateFormat": null,
  "timeFormat": null,
  "dateTimeFormat": null,
  "partialJSessionGUID": null,
  "isFirstLogin": null,
  "firstLoginDate": null,
  "userProperties": null,
  "state": null
}
```

