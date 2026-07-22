# ThoughtSpot.RestApi.Sdk.Model.CreateRoleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Unique name of the Role. | 
**Description** | **string** | Description of the Role. | [optional] 
**Privileges** | **List&lt;CreateRoleRequest.PrivilegesEnum&gt;** | Privileges granted to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges. | [optional] 
**ReadOnly** | **bool?** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Indicates whether the role is read only. A readonly role can neither be updated nor deleted. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

