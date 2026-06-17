# ThoughtSpot.Client.Model.UserGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthorId** | **string** | The unique identifier of the object | [optional] 
**CompleteDetail** | **bool?** | Indicates whether the response has complete detail of the group. | [optional] 
**Content** | **Object** | Content details of the group | [optional] 
**CreationTimeInMillis** | **float?** | Creation time of the group in milliseconds | [optional] 
**DefaultLiveboards** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Liveboards that are assigned as default Liveboards to the group. | [optional] 
**Deleted** | **bool?** | Indicates whether the group is deleted | [optional] 
**Deprecated** | **bool?** | Indicates whether the group is deprecated | [optional] 
**Description** | **string** | Description of the group | [optional] 
**DisplayName** | **string** | Display name of the group. | 
**External** | **bool?** | Indicates whether the group is external | [optional] 
**GenerationNumber** | **int?** | Generation number of the group | [optional] 
**Hidden** | **bool?** | Indicates whether the group is hidden | [optional] 
**Id** | **string** | The unique identifier of the object | 
**Index** | **int?** | Index number of the group | [optional] 
**IndexVersion** | **int?** | Index version number of the group | [optional] 
**MetadataVersion** | **int?** | Metadata version number of the group | [optional] 
**ModificationTimeInMillis** | **float?** | Last modified time of the group in milliseconds. | [optional] 
**ModifierId** | **string** | The unique identifier of the object | [optional] 
**Name** | **string** | Name of the group. | 
**Orgs** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Orgs in which group exists. | [optional] 
**OwnerId** | **string** | The unique identifier of the object | [optional] 
**ParentType** | **string** | Parent type of the group. | [optional] 
**Privileges** | **List&lt;string&gt;** | Privileges which are assigned to the group | [optional] 
**SubGroups** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Groups who are part of the group | [optional] 
**SystemGroup** | **bool?** | Indicates whether the group is a system group. | [optional] 
**Tags** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Tags associated with the group. | [optional] 
**Type** | **string** | Type of the group. | [optional] 
**Users** | [**List&lt;UserGroup&gt;**](UserGroup.md) | Users who are part of the group. | [optional] 
**Visibility** | **string** | Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects. | 
**Roles** | [**List&lt;Role&gt;**](Role.md) | List of roles assgined to the user | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

