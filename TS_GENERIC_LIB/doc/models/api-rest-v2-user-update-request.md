
# Api Rest V2 User Update Request

## Structure

`ApiRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the user account. The username string must be unique. |
| `id` | `string \| undefined` | Optional | The GUID of the user account |
| `displayName` | `string \| undefined` | Optional | A display name string for the user, usually their first and last name. |
| `visibility` | [`VisibilityEnum \| undefined`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects<br>**Default**: `VisibilityEnum.DEFAULT` |
| `mail` | `string \| undefined` | Optional | Email id associated with the user account |
| `password` | `string \| undefined` | Optional | Password for the user account. |
| `state` | [`StateEnum \| undefined`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `StateEnum.ACTIVE` |
| `notifyOnShare` | `boolean \| undefined` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `true` |
| `showWalkMe` | `boolean \| undefined` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `true` |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `true` |
| `type` | [`TypeEnum \| undefined`](/doc/models/type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `TypeEnum.LOCALUSER` |
| `groupNames` | `string[] \| undefined` | Optional | A JSON array of group names |

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
  "groupNames": null
}
```

