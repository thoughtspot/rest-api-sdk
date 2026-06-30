

# FileResponseItem

Uploaded or generated files attached to a turn.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;file\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**files** | [**List&lt;PublicFileInfo&gt;**](PublicFileInfo.md) | Sanitized file metadata. |  [optional] |


## Implemented Interfaces

* Serializable


