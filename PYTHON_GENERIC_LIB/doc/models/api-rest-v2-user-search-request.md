
# Api Rest V2 User Search Request

## Structure

`ApiRestV2UserSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the user |
| `id` | `string` | Optional | The GUID of the user account to query |
| `display_name` | `string` | Optional | A unique display name string for the user account, usually their first and last name |
| `visibility` | [`VisibilityEnum`](/doc/models/visibility-enum.md) | Optional | Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.<br>**Default**: `'DEFAULT'`<br>*Default: `'DEFAULT'`* |
| `mail` | `string` | Optional | Email of the user account |
| `group_names` | `List of string` | Optional | A JSON array of group names |
| `privileges` | [`List of PrivilegeEnum`](/doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the user |
| `state` | [`StateEnum`](/doc/models/state-enum.md) | Optional | Status of user account. acitve or inactive. |
| `notify_on_share` | [`NotifyOnShareEnum`](/doc/models/notify-on-share-enum.md) | Optional | User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. |
| `show_walk_me` | [`ShowWalkMeEnum`](/doc/models/show-walk-me-enum.md) | Optional | The user preference for revisiting the onboarding experience. |
| `analyst_onboarding_complete` | [`AnalystOnboardingCompleteEnum`](/doc/models/analyst-onboarding-complete-enum.md) | Optional | Status of the Onboarding experience in ThoughtSpot UI. |
| `mtype` | [`TypeEnum`](/doc/models/type-enum.md) | Optional | Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "mail": null,
  "groupNames": null,
  "privileges": null,
  "state": null,
  "notifyOnShare": null,
  "showWalkMe": null,
  "analystOnboardingComplete": null,
  "type": null
}
```

