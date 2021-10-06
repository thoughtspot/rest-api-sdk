
# Api Rest V2 User Create Request

## Structure

`ApiRestV2UserCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | - | String getDisplayName() | setDisplayName(String displayName) |
| `Visibility` | `String` | Optional | - | String getVisibility() | setVisibility(String visibility) |
| `Mail` | `String` | Optional | - | String getMail() | setMail(String mail) |
| `Password` | `String` | Required | - | String getPassword() | setPassword(String password) |
| `Groups` | `List<String>` | Optional | - | List<String> getGroups() | setGroups(List<String> groups) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `NotifyOnShare` | `Boolean` | Optional | - | Boolean getNotifyOnShare() | setNotifyOnShare(Boolean notifyOnShare) |
| `ShowWalkMe` | `Boolean` | Optional | - | Boolean getShowWalkMe() | setShowWalkMe(Boolean showWalkMe) |
| `AnalystOnboardingComplete` | `Boolean` | Optional | - | Boolean getAnalystOnboardingComplete() | setAnalystOnboardingComplete(Boolean analystOnboardingComplete) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

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

