
# Tspublic Rest V2 User Update Request

## Structure

`TspublicRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user account. The username string must be unique. | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A display name string for the user, usually their first and last name. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`UpdateUserVisibilityEnum`](../../doc/models/update-user-visibility-enum.md) | Optional | Visibility of the user account.<br><br>The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `UpdateUserVisibilityEnum.DEFAULT` | UpdateUserVisibilityEnum getVisibility() | setVisibility(UpdateUserVisibilityEnum visibility) |
| `Mail` | `String` | Optional | Email id associated with the user account | String getMail() | setMail(String mail) |
| `State` | [`UpdateUserStateEnum`](../../doc/models/update-user-state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `UpdateUserStateEnum.ACTIVE` | UpdateUserStateEnum getState() | setState(UpdateUserStateEnum state) |
| `NotifyOnShare` | [`UpdateUserNotifyOnShareEnum`](../../doc/models/update-user-notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `UpdateUserNotifyOnShareEnum.ENUM_TRUE` | UpdateUserNotifyOnShareEnum getNotifyOnShare() | setNotifyOnShare(UpdateUserNotifyOnShareEnum notifyOnShare) |
| `ShowWalkMe` | [`UpdateUserShowWalkMeEnum`](../../doc/models/update-user-show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `UpdateUserShowWalkMeEnum.ENUM_TRUE` | UpdateUserShowWalkMeEnum getShowWalkMe() | setShowWalkMe(UpdateUserShowWalkMeEnum showWalkMe) |
| `AnalystOnboardingComplete` | [`UpdateUserAnalystOnboardingCompleteEnum`](../../doc/models/update-user-analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `UpdateUserAnalystOnboardingCompleteEnum.ENUM_FALSE` | UpdateUserAnalystOnboardingCompleteEnum getAnalystOnboardingComplete() | setAnalystOnboardingComplete(UpdateUserAnalystOnboardingCompleteEnum analystOnboardingComplete) |
| `Type` | [`UpdateUserTypeEnum`](../../doc/models/update-user-type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `UpdateUserTypeEnum.LOCAL_USER` | UpdateUserTypeEnum getType() | setType(UpdateUserTypeEnum type) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "mail": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null,
  "groups": null
}
```

