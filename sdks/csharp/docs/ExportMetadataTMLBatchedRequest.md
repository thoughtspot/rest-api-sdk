# ThoughtSpot.RestApi.Sdk.Model.ExportMetadataTMLBatchedRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataType** | **string** | Type of metadata object to export, can be one of USER | ROLE | USER_GROUP | 
**BatchOffset** | **int** | Indicates the position within the complete set from where the API should begin returning objects. | [optional] [default to 0]
**BatchSize** | **int** | Determines the number of objects or items to be retrieved in a single request. | [optional] [default to 20]
**EdocFormat** | **string** | TML EDOC content format. | [optional] [default to EdocFormatEnum.JSON]
**ExportDependent** | **bool?** | Indicates whether to export dependent metadata objects of specified metadata objects. | [optional] [default to false]
**AllOrgsOverride** | **bool?** | Indicates whether to export is happening from all orgs context. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

