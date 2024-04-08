

# FetchPermissionsOnMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;PermissionsMetadataTypeInput&gt;**](PermissionsMetadataTypeInput.md) | GUID or name of the metadata object. |  |
|**principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects. |  [optional] |
|**includeDependentObjects** | **Boolean** | Indicates whether to fetch permissions of dependent metadata objects. |  [optional] |



