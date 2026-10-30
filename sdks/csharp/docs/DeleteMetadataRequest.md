# ThoughtSpot.RestApi.Sdk.Model.DeleteMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;DeleteMetadataTypeInput&gt;**](DeleteMetadataTypeInput.md) | Metadata objects. | 
**DeleteDisabledObjects** | **bool?** | Indicates whether to delete disabled metadata objects. | [optional] [default to false]
**DeleteMode** | **string** | How to delete the objects. SOFT_DELETE moves them to the Recycle Bin, from where they can be restored; HARD_DELETE removes them permanently.    Version: 27.1.0.cl or later  | [optional] 
**DeleteReason** | **string** | Reason for the delete, recorded with the Recycle Bin entry. Optional, and recommended when you move objects you do not own to the Recycle Bin. At most 32 characters. If omitted, a default reason saying that the object was deleted through the API is recorded.    Version: 27.1.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

