# ThoughtSpot.Client.Model.UpdateRoleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the Role. | 
**Description** | **string** | Description of the Role. | [optional] 
**Privileges** | **List&lt;UpdateRoleRequest.PrivilegesEnum&gt;** | Privileges granted to the role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges. Note: AUTHORING is a no-op — always inherited via ALL_GROUP, assigning it has no effect. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

