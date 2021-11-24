
# Api Rest V2 User Create Request

## Structure

`ApiRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the user. The username string must be unique. | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | A unique display name string for the user, usually their first and last name. | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `VisibilityEnum.DEFAULT`<br>*Default: `VisibilityEnum.DEFAULT`* | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |
| `Mail` | `String` | Optional | email of the user | String getMail() | setMail(String mail) |
| `Password` | `String` | Required | Password for the user account. | String getPassword() | setPassword(String password) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |
| `State` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `StateEnum.ACTIVE`<br>*Default: `StateEnum.ACTIVE`* | StateEnum getState() | setState(StateEnum state) |
| `NotifyOnShare` | `Boolean` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true`<br>*Default: `true`* | Boolean getNotifyOnShare() | setNotifyOnShare(Boolean notifyOnShare) |
| `ShowWalkMe` | `Boolean` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true`<br>*Default: `true`* | Boolean getShowWalkMe() | setShowWalkMe(Boolean showWalkMe) |
| `AnalystOnboardingComplete` | `Boolean` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `true`<br>*Default: `true`* | Boolean getAnalystOnboardingComplete() | setAnalystOnboardingComplete(Boolean analystOnboardingComplete) |
| `Type` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `TypeEnum.LOCAL_USER`<br>*Default: `TypeEnum.LOCAL_USER`* | TypeEnum getType() | setType(TypeEnum type) |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "mail": null,
  "password": "password4",
  "groupNames": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

