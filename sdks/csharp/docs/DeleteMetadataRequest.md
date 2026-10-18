# ThoughtSpot.RestApi.Sdk.Model.DeleteMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;DeleteMetadataTypeInput&gt;**](DeleteMetadataTypeInput.md) | Metadata objects. | 
**DeleteDisabledObjects** | **bool?** | Indicates whether to delete disabled metadata objects. | [optional] [default to false]
**DeleteMode** | **string** | How to delete the objects. SOFT_DELETE moves them to the Recycle Bin, from where they can be restored; HARD_DELETE removes them permanently.    Version: 27.1.0.cl or later  | [optional] 
**DeleteReason** | **string** | Reason for the delete, recorded with the Recycle Bin entry. At most 32 characters.    Version: 27.1.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

