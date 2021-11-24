
# Session Info Response

Session Info

## Structure

`SessionInfoResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Username of the user account for which the session information is returned | String getUserName() | setUserName(String userName) |
| `UserDisplayName` | `String` | Optional | A unique display name string for the user | String getUserDisplayName() | setUserDisplayName(String userDisplayName) |
| `UserEmail` | `String` | Optional | Email of the user account | String getUserEmail() | setUserEmail(String userEmail) |
| `UserCreatedTime` | `Double` | Optional | Date and time of creation of the user account | Double getUserCreatedTime() | setUserCreatedTime(Double userCreatedTime) |
| `UserGUID` | `String` | Optional | GUID of the user account | String getUserGUID() | setUserGUID(String userGUID) |
| `CanChangePassword` | `Boolean` | Optional | Indicates if the user account can change the password | Boolean getCanChangePassword() | setCanChangePassword(Boolean canChangePassword) |
| `IsSystemUser` | `Boolean` | Optional | Indicates if the user account is system or external user | Boolean getIsSystemUser() | setIsSystemUser(Boolean isSystemUser) |
| `UserGroupMask` | `Integer` | Optional | Group mask of the user account | Integer getUserGroupMask() | setUserGroupMask(Integer userGroupMask) |
| `Privileges` | `List<String>` | Optional | Privileges assigned to the user account | List<String> getPrivileges() | setPrivileges(List<String> privileges) |
| `ExpirationTime` | `Integer` | Optional | Expiration time of the token for the user account | Integer getExpirationTime() | setExpirationTime(Integer expirationTime) |
| `AuthToken` | `String` | Optional | Auth token for the user account | String getAuthToken() | setAuthToken(String authToken) |
| `Locale` | `String` | Optional | Locale of the token for the user account | String getLocale() | setLocale(String locale) |
| `Timezone` | `String` | Optional | Timezone assigned to the user account | String getTimezone() | setTimezone(String timezone) |
| `DateFormat` | [`SessionDateTimeFormat`](/doc/models/session-date-time-format.md) | Optional | - | SessionDateTimeFormat getDateFormat() | setDateFormat(SessionDateTimeFormat dateFormat) |
| `TimeFormat` | [`SessionDateTimeFormat`](/doc/models/session-date-time-format.md) | Optional | - | SessionDateTimeFormat getTimeFormat() | setTimeFormat(SessionDateTimeFormat timeFormat) |
| `DateTimeFormat` | [`SessionDateTimeFormat`](/doc/models/session-date-time-format.md) | Optional | - | SessionDateTimeFormat getDateTimeFormat() | setDateTimeFormat(SessionDateTimeFormat dateTimeFormat) |
| `PartialJSessionGUID` | `String` | Optional | Partial GUID of the user account | String getPartialJSessionGUID() | setPartialJSessionGUID(String partialJSessionGUID) |
| `IsFirstLogin` | `Boolean` | Optional | Indicates if the user account is logging in for the first time | Boolean getIsFirstLogin() | setIsFirstLogin(Boolean isFirstLogin) |
| `FirstLoginDate` | `Double` | Optional | Date on which the user account logged in for the first time | Double getFirstLoginDate() | setFirstLoginDate(Double firstLoginDate) |
| `UserProperties` | [`SessionUserProperties`](/doc/models/session-user-properties.md) | Optional | - | SessionUserProperties getUserProperties() | setUserProperties(SessionUserProperties userProperties) |
| `State` | `String` | Optional | Indicates if the user account is active or inactive | String getState() | setState(String state) |

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

