

# ToolResultResponseItem

Result returned from a tool invocation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;tool_result\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**toolCallId** | **String** | Matches the originating tool_call. |  [optional] |
|**toolName** | **String** | Name of the tool that produced this result. |  [optional] |
|**content** | **String** | Result body (tool output, or &#x60;\&quot;&lt;code&gt;: &lt;message&gt;\&quot;&#x60; for errors). |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Rendering hint for the result content; defaults to &#x60;TEXT_PLAIN&#x60; for tool results. See &#x60;ContentMimeType&#x60; for accepted values. |  [optional] |
|**success** | **Boolean** | False when the tool invocation errored; true otherwise. |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TEXT_PLAIN | &quot;TEXT_PLAIN&quot; |
| TEXT_MARKDOWN | &quot;TEXT_MARKDOWN&quot; |
| TEXT_X_MARKDOWN_WITH_CODE | &quot;TEXT_X_MARKDOWN_WITH_CODE&quot; |
| TEXT_HTML | &quot;TEXT_HTML&quot; |


## Implemented Interfaces

* Serializable


