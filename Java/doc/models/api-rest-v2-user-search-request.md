
# Api Rest V2 User Search Request

## Structure

`ApiRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user. | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account to query | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user, usually their first and last name. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`Visibility2Enum`](/doc/models/visibility-2-enum.md) | Optional | Visibility of the user.<br><br>The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `Visibility2Enum.DEFAULT` | Visibility2Enum getVisibility() | setVisibility(Visibility2Enum visibility) |
| `Mail` | `String` | Optional | email of the user account | String getMail() | setMail(String mail) |
| `Groups` | [`List<GroupNameAndIDInput>`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Privileges` | [`List<PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the user | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |
| `State` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive. | StateEnum getState() | setState(StateEnum state) |
| `NotifyOnShare` | [`NotifyOnShareEnum`](/doc/models/notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. | NotifyOnShareEnum getNotifyOnShare() | setNotifyOnShare(NotifyOnShareEnum notifyOnShare) |
| `ShowWalkMe` | [`ShowWalkMeEnum`](/doc/models/show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience. | ShowWalkMeEnum getShowWalkMe() | setShowWalkMe(ShowWalkMeEnum showWalkMe) |
| `AnalystOnboardingComplete` | [`AnalystOnboardingCompleteEnum`](/doc/models/analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. | AnalystOnboardingCompleteEnum getAnalystOnboardingComplete() | setAnalystOnboardingComplete(AnalystOnboardingCompleteEnum analystOnboardingComplete) |
| `Type` | [`Type2Enum`](/doc/models/type-2-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. | Type2Enum getType() | setType(Type2Enum type) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "mail": null,
  "groups": null,
  "privileges": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

