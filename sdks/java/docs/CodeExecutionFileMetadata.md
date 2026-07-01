

# CodeExecutionFileMetadata

Sanitized public metadata for a code-execution-generated file. Internal storage identifiers (e.g. Azure blob ids) are deliberately not exposed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | Unique identifier of the code-execution-generated file. Stable across conversation turns. |  |
|**displayName** | **String** | Human-readable file name. |  [optional] |
|**fileType** | **String** | File type hint. Either a MIME string (e.g. &#x60;text/csv&#x60;) or an extension (e.g. &#x60;csv&#x60;). |  [optional] |
|**createdTimeInMillis** | **Object** | Milliseconds since Unix epoch when the file was created. |  [optional] |
|**expired** | **Boolean** | True when the file is no longer downloadable (storage expired or evicted). |  |


## Implemented Interfaces

* Serializable


