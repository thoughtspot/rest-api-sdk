
# Rest API Session Info

Session Info

## Structure

`RestAPISessionInfo`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string \| undefined` | Optional | Username of the user account for which the session information is returned |
| `userDisplayName` | `string \| undefined` | Optional | A unique display name string for the user |
| `userEmail` | `string \| undefined` | Optional | Email of the user account |
| `userCreatedTime` | `number \| undefined` | Optional | Date and time of creation of the user account |
| `userGUID` | `string \| undefined` | Optional | GUID of the user account |
| `canChangePassword` | `boolean \| undefined` | Optional | Indicates if the user account can change the password |
| `isSystemUser` | `boolean \| undefined` | Optional | Indicates if the user account is system or external user |
| `userGroupMask` | `number \| undefined` | Optional | Group mask of the user account |
| `privileges` | `string[] \| undefined` | Optional | Privileges assigned to the user account |
| `expirationTime` | `number \| undefined` | Optional | Expiration time of the token for the user account |
| `authToken` | `string \| undefined` | Optional | Auth token for the user account |
| `locale` | `string \| undefined` | Optional | Locale of the token for the user account |
| `timezone` | `string \| undefined` | Optional | Timezone assigned to the user account |
| `dateFormat` | [`EFormat \| undefined`](/doc/models/e-format.md) | Optional | - |
| `timeFormat` | [`EFormat \| undefined`](/doc/models/e-format.md) | Optional | - |
| `dateTimeFormat` | [`EFormat \| undefined`](/doc/models/e-format.md) | Optional | - |
| `partialJSessionGUID` | `string \| undefined` | Optional | Partial GUID of the user account |
| `isFirstLogin` | `boolean \| undefined` | Optional | Indicates if the user account is logging in for the first time |
| `firstLoginDate` | `number \| undefined` | Optional | Date on which the user account logged in for the first time |
| `userProperties` | [`UserProperties \| undefined`](/doc/models/user-properties.md) | Optional | - |
| `state` | `string \| undefined` | Optional | Indicates if the user account is active or inactive |

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

