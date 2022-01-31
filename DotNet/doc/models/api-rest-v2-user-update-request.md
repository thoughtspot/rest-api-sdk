
# Api Rest V2 User Update Request

## Structure

`ApiRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the user account. The username string must be unique. |
| `Id` | `string` | Optional | The GUID of the user account |
| `DisplayName` | `string` | Optional | A display name string for the user, usually their first and last name. |
| `Visibility` | [`Models.Visibility1Enum?`](/doc/models/visibility-1-enum.md) | Optional | Visibility of the user account.<br><br>The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `Visibility1Enum.DEFAULT` |
| `Mail` | `string` | Optional | Email id associated with the user account |
| `Password` | `string` | Optional | Password for the user account. |
| `State` | [`Models.StateEnum?`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `StateEnum.ACTIVE` |
| `NotifyOnShare` | `bool?` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true` |
| `ShowWalkMe` | `bool?` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true` |
| `AnalystOnboardingComplete` | `bool?` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `false` |
| `Type` | [`Models.Type2Enum?`](/doc/models/type-2-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type2Enum.LOCAL_USER` |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "mail": null,
  "password": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null,
  "groups": null
}
```

