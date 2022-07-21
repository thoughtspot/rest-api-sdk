
# Tspublic Rest V2 Admin Forcelogout Request

## Structure

`TspublicRestV2AdminForcelogoutRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `User` | [`List<NameAndIdInput>`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name of users or GUIDs of groups or both. When both are given then id is considered. | List<NameAndIdInput> getUser() | setUser(List<NameAndIdInput> user) |

## Example (as JSON)

```json
{
  "user": null
}
```

