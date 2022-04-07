
# Tspublic Rest V2 User Create Request

## Structure

`TspublicRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Required | Name of the user account. The username string must be unique. |
| `DisplayName` | `string` | Required | A display name string for the user, usually their first and last name. |
| `Visibility` | [`Models.VisibilityEnum?`](../../doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.<br><br>The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `VisibilityEnum.DEFAULT` |
| `Mail` | `string` | Optional | Email id associated with the user account |
| `Password` | `string` | Required | Password for the user account. |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `State` | [`Models.StateEnum?`](../../doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `StateEnum.ACTIVE` |
| `NotifyOnShare` | [`Models.NotifyOnShareEnum?`](../../doc/models/notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `NotifyOnShareEnum.true` |
| `ShowWalkMe` | [`Models.ShowWalkMeEnum?`](../../doc/models/show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `ShowWalkMeEnum.true` |
| `AnalystOnboardingComplete` | [`Models.AnalystOnboardingCompleteEnum?`](../../doc/models/analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `AnalystOnboardingCompleteEnum.false` |
| `Type` | [`Models.Type2Enum?`](../../doc/models/type-2-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type2Enum.LOCAL_USER` |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "mail": null,
  "password": "password4",
  "groups": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

