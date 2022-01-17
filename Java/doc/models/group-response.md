
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `DisplayName` | `String` | Optional | A unique display name string for the user group | String getDisplayName() | setDisplayName(String displayName) |
| `Id` | `String` | Optional | GUID of the group | String getId() | setId(String id) |
| `Visibility` | `String` | Optional | Visibility of the group | String getVisibility() | setVisibility(String visibility) |
| `Description` | `String` | Optional | Description of the group | String getDescription() | setDescription(String description) |
| `Privileges` | `List<String>` | Optional | Privileges assigned to the group | List<String> getPrivileges() | setPrivileges(List<String> privileges) |
| `Groups` | [`List<GroupNameAndID>`](/doc/models/group-name-and-id.md) | Optional | Name of the group to which is added | List<GroupNameAndID> getGroups() | setGroups(List<GroupNameAndID> groups) |
| `Users` | [`List<UserNameAndID>`](/doc/models/user-name-and-id.md) | Optional | User Group Information by Id or Name. | List<UserNameAndID> getUsers() | setUsers(List<UserNameAndID> users) |
| `AssignedLiveboards` | [`List<LiveboardNameAndID>`](/doc/models/liveboard-name-and-id.md) | Optional | Liveboards assigned to the group | List<LiveboardNameAndID> getAssignedLiveboards() | setAssignedLiveboards(List<LiveboardNameAndID> assignedLiveboards) |
| `UserGroupContent` | `Object` | Optional | - | Object getUserGroupContent() | setUserGroupContent(Object userGroupContent) |
| `Tags` | `List<String>` | Optional | Tags assigned to the group | List<String> getTags() | setTags(List<String> tags) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the group is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the group is hidden | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `IsExternal` | `Boolean` | Optional | Indicates if the group is from external system | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | - | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `Complete` | `Boolean` | Optional | Indicates if the all the properties of group is provided | Boolean getComplete() | setComplete(Boolean complete) |
| `IsSystemPrincipal` | `Boolean` | Optional | Indicates if the group is system principal | Boolean getIsSystemPrincipal() | setIsSystemPrincipal(Boolean isSystemPrincipal) |
| `Type` | `String` | Optional | Indicates the type of group | String getType() | setType(String type) |
| `Parenttype` | `String` | Optional | Indicates the type of parent object | String getParenttype() | setParenttype(String parenttype) |
| `GroupIdx` | `Integer` | Optional | - | Integer getGroupIdx() | setGroupIdx(Integer groupIdx) |
| `MetadataVersion` | `Integer` | Optional | - | Integer getMetadataVersion() | setMetadataVersion(Integer metadataVersion) |
| `TenantId` | `String` | Optional | Tenant id associated with the group | String getTenantId() | setTenantId(String tenantId) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `Created` | `Double` | Optional | Date and time when group was created | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | Date and time of last modification of the group | Double getModified() | setModified(Double modified) |
| `ModifiedBy` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getModifiedBy() | setModifiedBy(UserNameAndID modifiedBy) |
| `Author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `Owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getOwner() | setOwner(UserNameAndID owner) |

## Example (as JSON)

```json
{
  "name": null,
  "displayName": null,
  "id": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "assignedLiveboards": null,
  "userGroupContent": null,
  "tags": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "complete": null,
  "isSystemPrincipal": null,
  "type": null,
  "parenttype": null,
  "groupIdx": null,
  "metadataVersion": null,
  "tenantId": null,
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "modifiedBy": null,
  "author": null,
  "owner": null
}
```

