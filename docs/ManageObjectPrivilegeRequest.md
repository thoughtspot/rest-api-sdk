# ThoughtSpot.Client.Model.ManageObjectPrivilegeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** | Operation to perform to manage object privileges. Available operations are: &#x60;ADD&#x60;, &#x60;REMOVE&#x60;. | 
**MetadataType** | **string** | Type of metadata objects on which you want to perform the operation. For now only LOGICAL_TABLE is supported. It may be extended to other metadata types in the future. | 
**ObjectPrivilegeTypes** | **List&lt;ManageObjectPrivilegeRequest.ObjectPrivilegeTypesEnum&gt;** | List of object privilege types on which you want to perform the operation. | 
**MetadataIdentifiers** | **List&lt;string&gt;** | List of metadata identifiers (GUID or name) on which you want to perform the operation. | 
**Principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects (GUID or name) to which you want to apply the given operation and given object privileges. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

