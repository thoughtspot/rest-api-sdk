
# Group Response

## Structure

`GroupResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the group |
| `DisplayName` | `string` | Optional | A unique display name string for the user group |
| `Id` | `string` | Optional | GUID of the group |
| `Visibility` | `string` | Optional | Visibility of the group |
| `Description` | `string` | Optional | Description of the group |
| `Privileges` | `List<string>` | Optional | Privileges assigned to the group |
| `Orgs` | [`List<Models.OrgType>`](../../doc/models/org-type.md) | Optional | The organizations that user belongs to |
| `Groups` | [`List<Models.GroupNameAndID>`](../../doc/models/group-name-and-id.md) | Optional | Name of the group to which is added |
| `Users` | [`List<Models.UserNameAndID>`](../../doc/models/user-name-and-id.md) | Optional | User Group Information by Id or Name. |
| `AssignedLiveboards` | [`List<Models.LiveboardNameAndID>`](../../doc/models/liveboard-name-and-id.md) | Optional | Liveboards assigned to the group |
| `UserGroupContent` | `object` | Optional | - |
| `Tags` | `List<string>` | Optional | Tags assigned to the group |
| `IsDeleted` | `bool?` | Optional | Indicates if the group is deleted |
| `IsHidden` | `bool?` | Optional | Indicates if the group is hidden |
| `IsExternal` | `bool?` | Optional | Indicates if the group is from external system |
| `IsDeprecated` | `bool?` | Optional | - |
| `Complete` | `bool?` | Optional | Indicates if the all the properties of group is provided |
| `IsSystemPrincipal` | `bool?` | Optional | Indicates if the group is system principal |
| `Type` | `string` | Optional | Indicates the type of group |
| `Parenttype` | `string` | Optional | Indicates the type of parent object |
| `GroupIdx` | `int?` | Optional | - |
| `MetadataVersion` | `int?` | Optional | - |
| `TenantId` | `string` | Optional | Tenant id associated with the group |
| `IndexVersion` | `double?` | Optional | - |
| `GenerationNum` | `double?` | Optional | - |
| `Created` | `double?` | Optional | Date and time when group was created |
| `Modified` | `double?` | Optional | Date and time of last modification of the group |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `ModifiedBy` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Owner` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |

## Example (as JSON)

```json
{
  "name": null,
  "displayName": null,
  "id": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "orgs": null,
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
  "author": null,
  "modifiedBy": null,
  "owner": null
}
```

