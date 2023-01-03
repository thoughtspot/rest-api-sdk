
# Tspublic Rest V2 User Search Request

## Structure

`TspublicRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `output_fields` | `List of string` | Optional | Array of field names that need to be included in the response |
| `name` | `string` | Optional | User name of the user account |
| `id` | `string` | Optional | The GUID of the user account |
| `display_name` | `string` | Optional | A unique display name string for the user, usually their first and last name. |
| `visibility` | `string` | Optional | Visibility of the user account. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects. |
| `mail` | `string` | Optional | email of the user. |
| `groups` | [`List of GroupNameAndIDInput`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. |
| `privileges` | [`List of PrivilegeEnum`](../../doc/models/privilege-enum.md) | Optional | Privileges assigned to user account |
| `state` | `string` | Optional | Status of user account. acitve or inactive. |
| `notify_on_share` | `bool` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `show_walk_me` | `bool` | Optional | The user preference for revisiting the onboarding experience. |
| `analyst_onboarding_complete` | `bool` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. |
| `mtype` | `string` | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

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

