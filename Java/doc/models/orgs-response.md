
# Orgs Response

## Structure

`OrgsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrgId` | `String` | Optional | ID of the organization searched for | String getOrgId() | setOrgId(String orgId) |
| `OrgName` | `String` | Optional | Name of the organization searched for | String getOrgName() | setOrgName(String orgName) |
| `Description` | `String` | Optional | Description associated with the organization | String getDescription() | setDescription(String description) |
| `AllGroupUserId` | `String` | Optional | GUID of the ALL group in the organization | String getAllGroupUserId() | setAllGroupUserId(String allGroupUserId) |
| `DefaultAdminUserGroupId` | `String` | Optional | GUID of the admin group in the organization | String getDefaultAdminUserGroupId() | setDefaultAdminUserGroupId(String defaultAdminUserGroupId) |
| `Enabled` | `Boolean` | Optional | Indicates if the organization is enabled or not | Boolean getEnabled() | setEnabled(Boolean enabled) |

## Example (as JSON)

```json
{
  "orgId": null,
  "orgName": null,
  "description": null,
  "allGroupUserId": null,
  "defaultAdminUserGroupId": null,
  "enabled": null
}
```

