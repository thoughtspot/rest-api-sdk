
# Tspublic Rest V2 User Create Request

## Structure

`TspublicRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | Name of the user account. The username string must be unique. |
| `display_name` | `string` | Required | A display name string for the user, usually their first and last name. |
| `visibility` | [`CreateUserVisibilityEnum`](../../doc/models/create-user-visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.<br><br>The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `'DEFAULT'` |
| `mail` | `string` | Optional | Email id associated with the user account |
| `password` | `string` | Required | Password for the user account. |
| `org` | [`OrgInput`](../../doc/models/org-input.md) | Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>A JSON object of organization name, id or both, in which the object should be created. When both are given then id is considered. If no value is provided then object will be created in the organization associated with the login session. |
| `groups` | [`List of GroupNameAndIDInput`](../../doc/models/group-name-and-id-input.md) | Optional | A JSON array of group names or GUIDs or both. When both are given then id is considered |
| `state` | [`CreateUserStateEnum`](../../doc/models/create-user-state-enum.md) | Optional | Status of user account. acitve or inactive.<br>**Default**: `'ACTIVE'` |
| `notify_on_share` | [`CreateUserNotifyOnShareEnum`](../../doc/models/create-user-notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.<br>**Default**: `'true'` |
| `show_walk_me` | [`CreateUserShowWalkMeEnum`](../../doc/models/create-user-show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience.<br>**Default**: `'true'` |
| `analyst_onboarding_complete` | [`CreateUserAnalystOnboardingCompleteEnum`](../../doc/models/create-user-analyst-onboarding-complete-enum.md) | Optional | ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.<br><br>The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.<br>**Default**: `'false'` |
| `mtype` | [`CreateUserTypeEnum`](../../doc/models/create-user-type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.<br>**Default**: `'LOCAL_USER'` |

## Example (as JSON)

```json
{
  "name": "name0",
  "displayName": "displayName2",
  "visibility": null,
  "mail": null,
  "password": "password4",
  "org": null,
  "groups": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

