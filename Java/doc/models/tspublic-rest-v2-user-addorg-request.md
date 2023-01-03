
# Tspublic Rest V2 User Addorg Request

## Structure

`TspublicRestV2UserAddorgRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrgId` | `Integer` | Optional | The ID of the organization. | Integer getOrgId() | setOrgId(Integer orgId) |
| `Users` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Required | Array of objects. A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<UserNameAndIDInput> getUsers() | setUsers(List<UserNameAndIDInput> users) |

## Example (as JSON)

```json
{
  "orgId": null,
  "users": [
    {
      "name": null,
      "id": null
    },
    {
      "name": null,
      "id": null
    }
  ]
}
```

