
# Tspublic Rest V2 User Search Request

## Structure

`TspublicRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `outputFields` | `string[] \| undefined` | Optional | Array of field names that need to be included in the response. |
| `name` | `string \| undefined` | Optional | Name of the user. |
| `id` | `string \| undefined` | Optional | The GUID of the user account to query |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user, usually their first and last name. |
| `visibility` | [`Visibility2Enum \| undefined`](../../doc/models/visibility-2-enum.md) | Optional | Visibility of the user.<br><br>The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects |
| `mail` | `string \| undefined` | Optional | email of the user account |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `privileges` | [`PrivilegeEnum[] \| undefined`](../../doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the user |
| `state` | [`StateEnum \| undefined`](../../doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive. |
| `notifyOnShare` | [`NotifyOnShareEnum \| undefined`](../../doc/models/notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `showWalkMe` | [`ShowWalkMeEnum \| undefined`](../../doc/models/show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience. |
| `analystOnboardingComplete` | [`AnalystOnboardingCompleteEnum \| undefined`](../../doc/models/analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `type` | [`Type4Enum \| undefined`](../../doc/models/type-4-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

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

