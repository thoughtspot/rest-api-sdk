
# Api Rest V2 User Update Request

## Structure

`ApiRestV2UserUpdateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the user. The username string must be unique. |
| `id` | `string` | Optional | The GUID of the user account to query. |
| `display_name` | `string` | Optional | A unique display name string for the user, usually their first and last name. |
| `visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `'DEFAULT'`<br>*Default: `'DEFAULT'`* |
| `mail` | `string` | Optional | email of the user |
| `password` | `string` | Optional | Password for the user account. |
| `state` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `'ACTIVE'`<br>*Default: `'ACTIVE'`* |
| `notify_on_share` | `bool` | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `True`<br>*Default: `True`* |
| `show_walk_me` | `bool` | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `True`<br>*Default: `True`* |
| `analyst_onboarding_complete` | `bool` | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `True`<br>*Default: `True`* |
| `mtype` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `'LOCAL_USER'`<br>*Default: `'LOCAL_USER'`* |
| `group_names` | `List of string` | Optional | A JSON array of group names |

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
