
# Tspublic Rest V2 User Update Request

## Structure

`TspublicRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the user. The username string must be unique. |
| `Id` | `string` | Optional | The GUID of the user account to query |
| `DisplayName` | `string` | Optional | A unique display name string for the user, usually their first and last name. |
| `Visibility` | [`Models.Visibility1Enum?`](../../doc/models/visibility-1-enum.md) | Optional | Visibility of the user account. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `Visibility1Enum.DEFAULT` |
| `Mail` | `string` | Optional | email of the user. |
| `State` | [`Models.State1Enum?`](../../doc/models/state-1-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `State1Enum.ACTIVE` |
| `NotifyOnShare` | `bool?` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true` |
| `ShowWalkMe` | `bool?` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true` |
| `AnalystOnboardingComplete` | `bool?` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `false` |
| `Type` | [`Models.Type9Enum?`](../../doc/models/type-9-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type9Enum.LOCAL_USER` |
| `Groups` | [`List<Models.GroupNameAndIDInput>`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. |

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

