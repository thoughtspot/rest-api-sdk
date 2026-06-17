# ThoughtSpot.Client.Model.FetchPermissionsOfPrincipalsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | GUID or name of the user or group. | 
**Metadata** | [**List&lt;PermissionsMetadataTypeInput&gt;**](PermissionsMetadataTypeInput.md) | Metadata objects for which you want to fetch permission details. If not specified, the API returns permission details for all metadata objects that the specified users and groups can access. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included for each metadata type. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included for each metadata type. | [optional] [default to -1]
**DefaultMetadataType** | **string** | When no metadata objects input is passed, metadata objects of this type are fetched. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

