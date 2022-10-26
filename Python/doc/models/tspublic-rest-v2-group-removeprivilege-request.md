
# Tspublic Rest V2 Group Removeprivilege Request

## Structure

`TspublicRestV2GroupRemoveprivilegeRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the group |
| `id` | `string` | Optional | The GUID of the group to query. |
| `privileges` | [`List of PrivilegeEnum`](../../doc/models/privilege-enum.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

