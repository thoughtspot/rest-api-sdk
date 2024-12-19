

# FetchPermissionsOnMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;PermissionsMetadataTypeInput&gt;**](PermissionsMetadataTypeInput.md) | GUID or name of the metadata object. |  |
|**principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects. |  [optional] |
|**includeDependentObjects** | **Boolean** | Indicates whether to fetch permissions of dependent metadata objects. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included for each metadata type. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included for each metadata type. |  [optional] |
|**permissionType** | **String** | &lt;div&gt;Version: 10.3.0.cl or later &lt;/div&gt;  Specifies the type of permission. Valid values are:     EFFECTIVE - If the user permission to the metadata objects is granted by the privileges assigned to the groups to which they belong.     DEFINED - If a user or user group received access to metadata objects via object sharing by another user. |  [optional] |



