

# TextResponseItem

Agent text output.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;text\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**content** | **String** | The text body. |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Rendering hint for the text content. See &#x60;ContentMimeType&#x60; for accepted values. |  [optional] |
|**fileReference** | [**FileReference**](FileReference.md) |  |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TEXT_PLAIN | &quot;TEXT_PLAIN&quot; |
| TEXT_MARKDOWN | &quot;TEXT_MARKDOWN&quot; |
| TEXT_X_MARKDOWN_WITH_CODE | &quot;TEXT_X_MARKDOWN_WITH_CODE&quot; |
| TEXT_HTML | &quot;TEXT_HTML&quot; |


## Implemented Interfaces

* Serializable


