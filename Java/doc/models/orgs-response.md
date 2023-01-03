
# Orgs Response

## Structure

`OrgsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrgId` | `Integer` | Optional | ID of the organization searched for | Integer getOrgId() | setOrgId(Integer orgId) |
| `OrgName` | `String` | Optional | Name of the organization searched for | String getOrgName() | setOrgName(String orgName) |
| `Description` | `String` | Optional | Description associated with the organization | String getDescription() | setDescription(String description) |
| `AllGroupUserId` | `String` | Optional | GUID of the ALL group in the organization | String getAllGroupUserId() | setAllGroupUserId(String allGroupUserId) |
| `DefaultAdminUserGroupId` | `String` | Optional | GUID of the admin group in the organization | String getDefaultAdminUserGroupId() | setDefaultAdminUserGroupId(String defaultAdminUserGroupId) |
| `Active` | `Boolean` | Optional | Indicates if the organization is active or not | Boolean getActive() | setActive(Boolean active) |

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

