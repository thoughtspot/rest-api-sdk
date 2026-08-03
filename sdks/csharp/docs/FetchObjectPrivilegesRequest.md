# ThoughtSpot.RestApi.Sdk.Model.FetchObjectPrivilegesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;ObjectPrivilegesMetadataInput&gt;**](ObjectPrivilegesMetadataInput.md) | Metadata objects for which you want to fetch object privileges. For now only LOGICAL_TABLE is supported. It may be extended to other metadata types in the future. | 
**Principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects for which you want to fetch object privileges. If not specified, the API returns all users and groups that have object privileges on the specified metadata objects. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included for each metadata type. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included for each metadata type. | [optional] [default to 20]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

