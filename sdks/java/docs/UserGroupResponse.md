

# UserGroupResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorId** | **String** | The unique identifier of the object |  [optional] |
|**completeDetail** | **Boolean** | Indicates whether the response has complete detail of the group. |  [optional] |
|**content** | **Object** | Content details of the group |  [optional] |
|**creationTimeInMillis** | **Float** | Creation time of the group in milliseconds |  [optional] |
|**defaultLiveboards** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Liveboards that are assigned as default Liveboards to the group. |  [optional] |
|**deleted** | **Boolean** | Indicates whether the group is deleted |  [optional] |
|**deprecated** | **Boolean** | Indicates whether the group is deprecated |  [optional] |
|**description** | **String** | Description of the group |  [optional] |
|**displayName** | **String** | Display name of the group. |  |
|**external** | **Boolean** | Indicates whether the group is external |  [optional] |
|**generationNumber** | **Integer** | Generation number of the group |  [optional] |
|**hidden** | **Boolean** | Indicates whether the group is hidden |  [optional] |
|**id** | **String** | The unique identifier of the object |  |
|**index** | **Integer** | Index number of the group |  [optional] |
|**indexVersion** | **Integer** | Index version number of the group |  [optional] |
|**metadataVersion** | **Integer** | Metadata version number of the group |  [optional] |
|**modificationTimeInMillis** | **Float** | Last modified time of the group in milliseconds. |  [optional] |
|**modifierId** | **String** | The unique identifier of the object |  [optional] |
|**name** | **String** | Name of the group. |  |
|**orgs** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Orgs in which group exists. |  [optional] |
|**ownerId** | **String** | The unique identifier of the object |  [optional] |
|**parentType** | [**ParentTypeEnum**](#ParentTypeEnum) | Parent type of the group. |  [optional] |
|**privileges** | **List&lt;String&gt;** | Privileges which are assigned to the group |  [optional] |
|**subGroups** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Groups who are part of the group |  [optional] |
|**systemGroup** | **Boolean** | Indicates whether the group is a system group. |  [optional] |
|**tags** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Tags associated with the group. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the group. |  [optional] |
|**users** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Users who are part of the group. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects. |  |
|**roles** | [**List&lt;Role&gt;**](Role.md) | List of roles assgined to the user |  [optional] |



## Enum: ParentTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCAL_GROUP | &quot;LOCAL_GROUP&quot; |
| LDAP_GROUP | &quot;LDAP_GROUP&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHARABLE | &quot;SHARABLE&quot; |
| NON_SHARABLE | &quot;NON_SHARABLE&quot; |



