# ThoughtSpot.RestApi.Sdk.Model.ExportMetadataTypeInput
MetadataType InputType used in Export MetadataType API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** |   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier. | [optional] 
**Identifier** | **string** | Unique ID or name of the metadata object. Not required if the metadata type is ANSWER when session_id and generation_number is set. | [optional] 
**SessionIdentifier** | **string** | Unique ID of the Answer session. Required if the metadata type is ANSWER and identifier is not set. | [optional] 
**GenerationNumber** | **int?** | Generation Number of the Answer session. Required if the metadata type is ANSWER and identifier is not set. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

