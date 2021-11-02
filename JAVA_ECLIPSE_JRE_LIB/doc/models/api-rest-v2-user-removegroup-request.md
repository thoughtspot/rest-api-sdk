
# Api Rest V2 User Removegroup Request

## Structure

`ApiRestV2UserRemovegroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | User name of the user account | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account | String getId() | setId(String id) |
| `GroupNames` | `List<String>` | Optional | A JSON array of group names | List<String> getGroupNames() | setGroupNames(List<String> groupNames) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "groupNames": null
}
```

