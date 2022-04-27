
# Tspublic Rest V2 User Search Request

## Structure

`TspublicRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OutputFields` | `List<String>` | Optional | Array of field names that need to be included in the response. | List<String> getOutputFields() | setOutputFields(List<String> outputFields) |
| `Name` | `String` | Optional | Name of the user. | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account to query | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user, usually their first and last name. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`SearchUsersVisibilityEnum`](../../doc/models/search-users-visibility-enum.md) | Optional | Visibility of the user.<br><br>The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects | SearchUsersVisibilityEnum getVisibility() | setVisibility(SearchUsersVisibilityEnum visibility) |
| `Mail` | `String` | Optional | email of the user account | String getMail() | setMail(String mail) |
| `Groups` | [`List<GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered | List<GroupNameAndIDInput> getGroups() | setGroups(List<GroupNameAndIDInput> groups) |
| `Privileges` | [`List<SearchUsersPrivilegesEnum>`](../../doc/models/search-users-privileges-enum.md) | Optional | A JSON array of privileges assigned to the user | List<SearchUsersPrivilegesEnum> getPrivileges() | setPrivileges(List<SearchUsersPrivilegesEnum> privileges) |
| `State` | [`SearchUsersStateEnum`](../../doc/models/search-users-state-enum.md) | Optional | Status of user account. acitve or inactive. | SearchUsersStateEnum getState() | setState(SearchUsersStateEnum state) |
| `NotifyOnShare` | [`SearchUsersNotifyOnShareEnum`](../../doc/models/search-users-notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. | SearchUsersNotifyOnShareEnum getNotifyOnShare() | setNotifyOnShare(SearchUsersNotifyOnShareEnum notifyOnShare) |
| `ShowWalkMe` | [`SearchUsersShowWalkMeEnum`](../../doc/models/search-users-show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience. | SearchUsersShowWalkMeEnum getShowWalkMe() | setShowWalkMe(SearchUsersShowWalkMeEnum showWalkMe) |
| `AnalystOnboardingComplete` | [`SearchUsersAnalystOnboardingCompleteEnum`](../../doc/models/search-users-analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. | SearchUsersAnalystOnboardingCompleteEnum getAnalystOnboardingComplete() | setAnalystOnboardingComplete(SearchUsersAnalystOnboardingCompleteEnum analystOnboardingComplete) |
| `Type` | [`SearchUsersTypeEnum`](../../doc/models/search-users-type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. | SearchUsersTypeEnum getType() | setType(SearchUsersTypeEnum type) |

## Example (as JSON)

```json
{
  "outputFields": null,
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

