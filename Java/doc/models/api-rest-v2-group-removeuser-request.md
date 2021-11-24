
# Api Rest V2 Group Removeuser Request

## Structure

`ApiRestV2GroupRemoveuserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group | String getId() | setId(String id) |
| `UserNames` | `List<String>` | Optional | A JSON array of name of users | List<String> getUserNames() | setUserNames(List<String> userNames) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "userNames": null
}
```

