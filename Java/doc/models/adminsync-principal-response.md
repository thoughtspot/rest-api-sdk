
# Adminsync Principal Response

## Structure

`AdminsyncPrincipalResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UsersAdded` | `List<String>` | Optional | Username of list of users added | List<String> getUsersAdded() | setUsersAdded(List<String> usersAdded) |
| `UsersDeleted` | `List<String>` | Optional | Username of list of users deleted | List<String> getUsersDeleted() | setUsersDeleted(List<String> usersDeleted) |
| `UsersUpdated` | `List<String>` | Optional | Username of list of users updated | List<String> getUsersUpdated() | setUsersUpdated(List<String> usersUpdated) |
| `GroupsAdded` | `List<String>` | Optional | Group name of list of groups added | List<String> getGroupsAdded() | setGroupsAdded(List<String> groupsAdded) |
| `GroupsDeleted` | `List<String>` | Optional | Group name of list of groups deleted | List<String> getGroupsDeleted() | setGroupsDeleted(List<String> groupsDeleted) |
| `GroupsUpdated` | `List<String>` | Optional | Group name of list of groups updated | List<String> getGroupsUpdated() | setGroupsUpdated(List<String> groupsUpdated) |

## Example (as JSON)

```json
{
  "usersAdded": null,
  "usersDeleted": null,
  "usersUpdated": null,
  "groupsAdded": null,
  "groupsDeleted": null,
  "groupsUpdated": null
}
```

