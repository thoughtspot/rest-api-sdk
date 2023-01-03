
# Tspublic Rest V2 User Search Request

## Structure

`TspublicRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `outputFields` | `string[] \| undefined` | Optional | Array of field names that need to be included in the response |
| `name` | `string \| undefined` | Optional | User name of the user account |
| `id` | `string \| undefined` | Optional | The GUID of the user account |
| `displayName` | `string \| undefined` | Optional | A unique display name string for the user, usually their first and last name. |
| `visibility` | `string \| undefined` | Optional | Visibility of the user account. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects. |
| `mail` | `string \| undefined` | Optional | email of the user. |
| `groups` | [`GroupNameAndIDInput[] \| undefined`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. |
| `privileges` | [`PrivilegeEnum[] \| undefined`](../../doc/models/privilege-enum.md) | Optional | Privileges assigned to user account |
| `state` | `string \| undefined` | Optional | Status of user account. acitve or inactive. |
| `notifyOnShare` | `boolean \| undefined` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `showWalkMe` | `boolean \| undefined` | Optional | The user preference for revisiting the onboarding experience. |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `type` | `string \| undefined` | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

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

