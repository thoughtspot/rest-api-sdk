# ThoughtSpot.Client.Model.PublicFileInfo
Sanitized metadata for a file attached to or produced by a conversation turn. Never exposes internal Azure or blob-storage identifiers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | Unique identifier of the file. | 
**DisplayName** | **string** | Human-readable file name. | [optional] 
**FileType** | **string** | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;. | [optional] 
**CreatedTimeInMillis** | **Object** | Milliseconds since Unix epoch when the file was created. | [optional] 
**SizeBytes** | **int?** | File size in bytes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

