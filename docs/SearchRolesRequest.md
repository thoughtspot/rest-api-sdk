# ThoughtSpot.Client.Model.SearchRolesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RoleIdentifiers** | **List&lt;string&gt;** | unique ID or name of the Roles | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | Unique Id or name of the Organisation | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | Unique Id or name of the User Group | [optional] 
**Privileges** | **List&lt;SearchRolesRequest.PrivilegesEnum&gt;** | Privileges assigned to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges. | [optional] 
**Deprecated** | **bool?** | Indicates whether the Role is deprecated. | [optional] 
**External** | **bool?** | Indicates whether the Role is external | [optional] 
**SharedViaConnection** | **bool?** | Indicates whether the Role is shared via connection | [optional] 
**Permissions** | **List&lt;SearchRolesRequest.PermissionsEnum&gt;** | Permission details of the Role | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

