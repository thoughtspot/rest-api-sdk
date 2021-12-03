
# User Response

## Structure

`UserResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username of the user account | String getName() | setName(String name) |
| `DisplayName` | `String` | Optional | Display name of the user account | String getDisplayName() | setDisplayName(String displayName) |
| `Id` | `String` | Optional | GUID of the user account | String getId() | setId(String id) |
| `Visibility` | `String` | Optional | Visibility of the user account | String getVisibility() | setVisibility(String visibility) |
| `Mail` | `String` | Optional | Email of the user account | String getMail() | setMail(String mail) |
| `Groups` | [`List<GroupNameAndID>`](/doc/models/group-name-and-id.md) | Optional | Name of the group to which user account is added | List<GroupNameAndID> getGroups() | setGroups(List<GroupNameAndID> groups) |
| `Privileges` | `List<String>` | Optional | Privileges assigned to user account | List<String> getPrivileges() | setPrivileges(List<String> privileges) |
| `Tags` | `List<String>` | Optional | Tags assigned to the user | List<String> getTags() | setTags(List<String> tags) |
| `State` | `String` | Optional | Indicates if the user account is active or inactive | String getState() | setState(String state) |
| `NotifyOnShare` | `Boolean` | Optional | Indicates if the email should be sent when object is shared with the user | Boolean getNotifyOnShare() | setNotifyOnShare(Boolean notifyOnShare) |
| `ShowWalkMe` | `Boolean` | Optional | Indicates if the walk me should be shown when logging in | Boolean getShowWalkMe() | setShowWalkMe(Boolean showWalkMe) |
| `AnalystOnboardingComplete` | `Boolean` | Optional | Indicates if the onboarding is completed for the user | Boolean getAnalystOnboardingComplete() | setAnalystOnboardingComplete(Boolean analystOnboardingComplete) |
| `FirstLogin` | `Integer` | Optional | Indicates if the use is logging in for the first time | Integer getFirstLogin() | setFirstLogin(Integer firstLogin) |
| `WelcomeEmailSent` | `Boolean` | Optional | Indicates if the welcome email is sent to email associated with the user account | Boolean getWelcomeEmailSent() | setWelcomeEmailSent(Boolean welcomeEmailSent) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the user account is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the user account is hidden | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `IsExternal` | `Boolean` | Optional | Indicates if the user account is from external system<br>isDeprecated | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | - | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `Complete` | `Boolean` | Optional | Indicates if the all the properties of user account is provided | Boolean getComplete() | setComplete(Boolean complete) |
| `IsSuperUser` | `Boolean` | Optional | Indicates if the user account is super user | Boolean getIsSuperUser() | setIsSuperUser(Boolean isSuperUser) |
| `IsSystemPrincipal` | `Boolean` | Optional | Indicates if the user account is system principal | Boolean getIsSystemPrincipal() | setIsSystemPrincipal(Boolean isSystemPrincipal) |
| `Type` | `String` | Optional | Indicates the type of user account | String getType() | setType(String type) |
| `Parenttype` | `String` | Optional | Indicates the type of parent object | String getParenttype() | setParenttype(String parenttype) |
| `TenantId` | `String` | Optional | Tenant id associated with the user account | String getTenantId() | setTenantId(String tenantId) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `Created` | `Double` | Optional | Date and time when user account was created | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | Date and time of last modification of user account | Double getModified() | setModified(Double modified) |
| `Author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `ModifiedBy` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getModifiedBy() | setModifiedBy(UserNameAndID modifiedBy) |
| `Owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getOwner() | setOwner(UserNameAndID owner) |

## Example (as JSON)

```json
{
  "name": null,
  "displayName": null,
  "id": null,
  "visibility": null,
  "mail": null,
  "groups": null,
  "privileges": null,
  "tags": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "firstLogin": null,
  "welcomeEmailSent": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "complete": null,
  "isSuperUser": null,
  "isSystemPrincipal": null,
  "type": null,
  "parenttype": null,
  "tenantId": null,
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null
}
```

