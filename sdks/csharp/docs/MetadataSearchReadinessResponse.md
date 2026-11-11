# ThoughtSpot.RestApi.Sdk.Model.MetadataSearchReadinessResponse
Search readiness of a metadata object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | **string** | Readiness state of the object. OBJECT_READY means the object is available in Search; OBJECT_NOT_READY means Search has not yet indexed its latest version; OBJECT_NOT_VALID means the identifier is not a valid GUID or no such object exists. | 
**MetadataId** | **string** | GUID of the metadata object that was checked. | 
**ObjectVersion** | **float** | Metadata commit version at which the object was last written. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED. | 
**IndexedVersion** | **float** | Latest metadata version indexed by Search. The object is ready once this is greater than or equal to object_version. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED, or when the Search service is unavailable. | 
**Detail** | **string** | Human-readable explanation of the readiness state. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

