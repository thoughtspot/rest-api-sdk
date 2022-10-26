
# Tspublic Rest V2 User Update Request

## Structure

`TspublicRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the user. The username string must be unique. |
| `id` | `string \| undefined` | Optional | The GUID of the user account to query |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user, usually their first and last name. |
| `visibility` | [`Visibility1Enum \| undefined`](../../doc/models/visibility-1-enum.md) | Optional | Visibility of the user account. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `Visibility1Enum.DEFAULT` |
| `mail` | `string \| undefined` | Optional | email of the user. |
| `state` | [`State1Enum \| undefined`](../../doc/models/state-1-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `State1Enum.ACTIVE` |
| `notifyOnShare` | `boolean \| undefined` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true` |
| `showWalkMe` | `boolean \| undefined` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true` |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `false` |
| `type` | [`Type9Enum \| undefined`](../../doc/models/type-9-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `Type9Enum.LOCALUSER` |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. |

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

