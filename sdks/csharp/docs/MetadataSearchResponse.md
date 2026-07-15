# ThoughtSpot.RestApi.Sdk.Model.MetadataSearchResponse
Metadata Search Response Object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataId** | **string** | Unique identifier of the metadata. | [optional] 
**MetadataName** | **string** | Name of the metadata. | [optional] 
**MetadataType** | **string** | Type of the metadata. | 
**MetadataObjId** | **string** | Custom identifier of the metadata. (Available from 10.8.0.cl onwards) | [optional] 
**DependentObjects** | **Object** | Details of dependent objects of the metadata objects. | [optional] 
**IncompleteObjects** | **List&lt;Object&gt;** | Details of incomplete information of the metadata objects if any. | [optional] 
**MetadataDetail** | **Object** | Complete details of the metadata objects. | [optional] 
**MetadataHeader** | **Object** | Header information of the metadata objects. | [optional] 
**VisualizationHeaders** | **List&lt;Object&gt;** | Visualization header information of the metadata objects. | [optional] 
**Stats** | **Object** | Stats of the metadata object. Includes views, favorites, last_accessed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

