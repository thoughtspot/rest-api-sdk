
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username of the user account | String getName() | setName(String name) |
| `DisplayName` | `String` | Optional | Display name of the user account | String getDisplayName() | setDisplayName(String displayName) |
| `Id` | `String` | Optional | GUID of the user account | String getId() | setId(String id) |
| `Visibility` | `String` | Optional | Visibility of the user account | String getVisibility() | setVisibility(String visibility) |
| `Description` | `String` | Optional | Description of the group | String getDescription() | setDescription(String description) |
| `Privileges` | `List<String>` | Optional | Privileges assigned to the group | List<String> getPrivileges() | setPrivileges(List<String> privileges) |
| `Groups` | [`List<GroupNameAndID>`](/doc/models/group-name-and-id.md) | Optional | Groups to which usergroup is added | List<GroupNameAndID> getGroups() | setGroups(List<GroupNameAndID> groups) |
| `AssignedPinboards` | [`List<PinboardNameAndID>`](/doc/models/pinboard-name-and-id.md) | Optional | Pinboards assigned to the group | List<PinboardNameAndID> getAssignedPinboards() | setAssignedPinboards(List<PinboardNameAndID> assignedPinboards) |
| `UserGroupContent` | `String` | Optional | - | String getUserGroupContent() | setUserGroupContent(String userGroupContent) |
| `Tags` | `List<String>` | Optional | Tags assigned to the usergroup | List<String> getTags() | setTags(List<String> tags) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the user account is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the user account is hidden | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `IsExternal` | `Boolean` | Optional | Indicates if the user account is from external system | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | - | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `Complete` | `Boolean` | Optional | Indicates if the all the properties of group is provided | Boolean getComplete() | setComplete(Boolean complete) |
| `IsSystemPrincipal` | `Boolean` | Optional | Indicates if the user account is system principal | Boolean getIsSystemPrincipal() | setIsSystemPrincipal(Boolean isSystemPrincipal) |
| `Type` | `String` | Optional | Indicates the type of user account | String getType() | setType(String type) |
| `Parenttype` | `String` | Optional | Indicates the type of parent object | String getParenttype() | setParenttype(String parenttype) |
| `GroupIdx` | `Integer` | Optional | - | Integer getGroupIdx() | setGroupIdx(Integer groupIdx) |
| `MetadataVersion` | `String` | Optional | - | String getMetadataVersion() | setMetadataVersion(String metadataVersion) |
| `TenantId` | `String` | Optional | Tenant id associated with the user account | String getTenantId() | setTenantId(String tenantId) |
| `GenerationNum` | `String` | Optional | - | String getGenerationNum() | setGenerationNum(String generationNum) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `Created` | `Double` | Optional | Date and time when usergroup was created | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | Date and time of last modification of usergroup | Double getModified() | setModified(Double modified) |
| `Author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `ModifiedBy` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getModifiedBy() | setModifiedBy(UserNameAndID modifiedBy) |
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
  "assignedPinboards": null,
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
  "generationNum": null,
  "indexVersion": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null
}
```

