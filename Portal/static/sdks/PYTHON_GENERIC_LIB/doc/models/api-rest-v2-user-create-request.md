
# Api Rest V2 User Create Request

## Structure

`ApiRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | - |
| `display_name` | `string` | Required | - |
| `visibility` | `string` | Optional | - |
| `mail` | `string` | Optional | - |
| `password` | `string` | Required | - |
| `groups` | `List of string` | Optional | - |
| `state` | `string` | Optional | - |
| `notify_on_share` | `bool` | Optional | - |
| `show_walk_me` | `bool` | Optional | - |
| `analyst_onboarding_complete` | `bool` | Optional | - |
| `mtype` | `string` | Optional | - |

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

