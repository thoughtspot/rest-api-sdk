
# Tspublic Rest V2 User Create Request

## Structure

`TspublicRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the user account. The username string must be unique. | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | A display name string for the user, usually their first and last name. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`CreateUserVisibilityEnum`](../../doc/models/create-user-visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.<br><br>The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `CreateUserVisibilityEnum.DEFAULT` | CreateUserVisibilityEnum getVisibility() | setVisibility(CreateUserVisibilityEnum visibility) |
| `Mail` | `String` | Optional | Email id associated with the user account | String getMail() | setMail(String mail) |
| `Password` | `String` | Required | Password for the user account. | String getPassword() | setPassword(String password) |
| `OrgIds` | `List<Integer>` | Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>Array of org identifiers. If no value is provided, the organization associated with the login session is considered. | List<Integer> getOrgIds() | setOrgIds(List<Integer> orgIds) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `State` | [`CreateUserStateEnum`](../../doc/models/create-user-state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `CreateUserStateEnum.ACTIVE` | CreateUserStateEnum getState() | setState(CreateUserStateEnum state) |
| `NotifyOnShare` | [`CreateUserNotifyOnShareEnum`](../../doc/models/create-user-notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `CreateUserNotifyOnShareEnum.ENUM_TRUE` | CreateUserNotifyOnShareEnum getNotifyOnShare() | setNotifyOnShare(CreateUserNotifyOnShareEnum notifyOnShare) |
| `ShowWalkMe` | [`CreateUserShowWalkMeEnum`](../../doc/models/create-user-show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `CreateUserShowWalkMeEnum.ENUM_TRUE` | CreateUserShowWalkMeEnum getShowWalkMe() | setShowWalkMe(CreateUserShowWalkMeEnum showWalkMe) |
| `AnalystOnboardingComplete` | [`CreateUserAnalystOnboardingCompleteEnum`](../../doc/models/create-user-analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `CreateUserAnalystOnboardingCompleteEnum.ENUM_FALSE` | CreateUserAnalystOnboardingCompleteEnum getAnalystOnboardingComplete() | setAnalystOnboardingComplete(CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete) |
| `Type` | [`CreateUserTypeEnum`](../../doc/models/create-user-type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `CreateUserTypeEnum.LOCAL_USER` | CreateUserTypeEnum getType() | setType(CreateUserTypeEnum type) |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "mail": null,
  "password": "password4",
  "orgIds": null,
  "groups": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

