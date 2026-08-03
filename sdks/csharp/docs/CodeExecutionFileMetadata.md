# ThoughtSpot.RestApi.Sdk.Model.CodeExecutionFileMetadata
Sanitized public metadata for a code-execution-generated file. Internal storage identifiers (e.g. Azure blob ids) are deliberately not exposed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | Unique identifier of the code-execution-generated file. Stable across conversation turns. | 
**DisplayName** | **string** | Human-readable file name. | [optional] 
**FileType** | **string** | File type hint. Either a MIME string (e.g. &#x60;text/csv&#x60;) or an extension (e.g. &#x60;csv&#x60;). | [optional] 
**CreatedTimeInMillis** | **Object** | Milliseconds since Unix epoch when the file was created. | [optional] 
**Expired** | **bool** | True when the file is no longer downloadable (storage expired or evicted). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

