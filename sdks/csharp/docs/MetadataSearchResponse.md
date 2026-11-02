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
**DependentObjectsIsLastBatch** | **bool?** | Whether the returned dependent_objects page is the last one for this object. True when the page came back short of the effective page size. A full page reports false even when it happens to be the final one, so a caller pages until it sees true and may pay one final empty page.    Version: 26.11.0.cl or later  | [optional] 
**IncompleteObjects** | **List&lt;Object&gt;** | Details of incomplete information of the metadata objects if any. | [optional] 
**MetadataDetail** | **Object** | Complete details of the metadata objects. | [optional] 
**MetadataHeader** | **Object** | Header information of the metadata objects. | [optional] 
**VisualizationHeaders** | **List&lt;Object&gt;** | Visualization header information of the metadata objects. | [optional] 
**Stats** | **Object** | Stats of the metadata object. Includes views, favorites, last_accessed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

