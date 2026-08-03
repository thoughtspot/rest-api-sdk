# ThoughtSpot.RestApi.Sdk.Model.FetchPermissionsOnMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;PermissionsMetadataTypeInput&gt;**](PermissionsMetadataTypeInput.md) | GUID or name of the metadata object. | 
**Principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects. | [optional] 
**IncludeDependentObjects** | **bool?** | Indicates whether to fetch permissions of dependent metadata objects. | [optional] [default to false]
**RecordOffset** | **int** | The starting record number from where the records should be included for each metadata type. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included for each metadata type. | [optional] [default to -1]
**PermissionType** | **string** | &lt;div&gt;Version: 10.3.0.cl or later &lt;/div&gt;  Specifies the type of permission. Valid values are:     EFFECTIVE - If the user permission to the metadata objects is granted by the privileges assigned to the groups to which they belong.     DEFINED - If a user or user group received access to metadata objects via object sharing by another user. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

