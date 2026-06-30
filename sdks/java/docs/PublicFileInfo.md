

# PublicFileInfo

Sanitized metadata for a file attached to or produced by a conversation turn. Never exposes internal Azure or blob-storage identifiers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | Unique identifier of the file. |  |
|**displayName** | **String** | Human-readable file name. |  [optional] |
|**fileType** | **String** | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;. |  [optional] |
|**createdTimeInMillis** | **Object** | Milliseconds since Unix epoch when the file was created. |  [optional] |
|**sizeBytes** | **Integer** | File size in bytes. |  [optional] |


## Implemented Interfaces

* Serializable


