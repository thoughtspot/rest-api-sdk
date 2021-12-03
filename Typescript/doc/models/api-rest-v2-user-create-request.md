
# Api Rest V2 User Create Request

## Structure

`ApiRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the user account. The username string must be unique. |
| `displayName` | `string` | Required | A display name string for the user, usually their first and last name. |
| `visibility` | [`VisibilityEnum \| undefined`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `VisibilityEnum.DEFAULT` |
| `mail` | `string \| undefined` | Optional | Email id associated with the user account |
| `password` | `string` | Required | Password for the user account. |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](/doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `state` | [`StateEnum \| undefined`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `StateEnum.ACTIVE` |
| `notifyOnShare` | `boolean \| undefined` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true` |
| `showWalkMe` | `boolean \| undefined` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true` |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `true` |
| `type` | [`Type4Enum \| undefined`](/doc/models/type-4-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type4Enum.LOCALUSER` |

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

