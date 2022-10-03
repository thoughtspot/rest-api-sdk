
# Orgs Response

## Structure

`OrgsResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org_id` | `int` | Optional | ID of the organization searched for |
| `org_name` | `string` | Optional | Name of the organization searched for |
| `description` | `string` | Optional | Description associated with the organization |
| `all_group_user_id` | `string` | Optional | GUID of the ALL group in the organization |
| `default_admin_user_group_id` | `string` | Optional | GUID of the admin group in the organization |
| `active` | `bool` | Optional | Indicates if the organization is active or not |

## Example (as JSON)

```json
{
  "orgId": null,
  "orgName": null,
  "description": null,
  "allGroupUserId": null,
  "defaultAdminUserGroupId": null,
  "active": null
}
```

