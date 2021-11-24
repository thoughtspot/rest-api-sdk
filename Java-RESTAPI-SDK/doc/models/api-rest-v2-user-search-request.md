
# Api Rest V2 User Search Request

## Structure

`ApiRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the user | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account to query | String getId() | setId(String id) |
| `DisplayName` | `String` | Optional | A unique display name string for the user account, usually their first and last name | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `VisibilityEnum.DEFAULT`<br>*Default: `VisibilityEnum.DEFAULT`* | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |
| `Mail` | `String` | Optional | Email of the user account | String getMail() | setMail(String mail) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |
| `Privileges` | [`List<PrivilegeEnum>`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the user | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |
| `State` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive. | StateEnum getState() | setState(StateEnum state) |
| `NotifyOnShare` | [`NotifyOnShareEnum`](/doc/models/notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. | NotifyOnShareEnum getNotifyOnShare() | setNotifyOnShare(NotifyOnShareEnum notifyOnShare) |
| `ShowWalkMe` | [`ShowWalkMeEnum`](/doc/models/show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience. | ShowWalkMeEnum getShowWalkMe() | setShowWalkMe(ShowWalkMeEnum showWalkMe) |
| `AnalystOnboardingComplete` | [`AnalystOnboardingCompleteEnum`](/doc/models/analyst-onboarding-complete-enum.md) | Optional | Status of the Onboarding experience in ThoughtSpot UI. | AnalystOnboardingCompleteEnum getAnalystOnboardingComplete() | setAnalystOnboardingComplete(AnalystOnboardingCompleteEnum analystOnboardingComplete) |
| `Type` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. | TypeEnum getType() | setType(TypeEnum type) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "mail": null,
  "groupNames": null,
  "privileges": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

