
# Api Rest V2 User Create Request

## Structure

`ApiRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Required | - |
| `displayName` | `string` | Required | - |
| `visibility` | `string \| undefined` | Optional | - |
| `mail` | `string \| undefined` | Optional | - |
| `password` | `string` | Required | - |
| `groups` | `string[] \| undefined` | Optional | - |
| `state` | `string \| undefined` | Optional | - |
| `notifyOnShare` | `boolean \| undefined` | Optional | - |
| `showWalkMe` | `boolean \| undefined` | Optional | - |
| `analystOnboardingComplete` | `boolean \| undefined` | Optional | - |
| `type` | `string \| undefined` | Optional | - |

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

