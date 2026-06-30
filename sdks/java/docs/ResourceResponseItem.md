

# ResourceResponseItem

MCP (Model Context Protocol) resource — typically a connector-provided artifact such as a document excerpt.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;resource\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**title** | **String** | Human-readable title of the resource. |  |
|**uri** | **String** | Resource URI. |  |
|**name** | **String** | Original name or filename. |  [optional] |
|**mimeType** | **String** | MIME type. |  [optional] |
|**description** | **String** | Short description. |  [optional] |
|**size** | **Integer** | Size in bytes. |  [optional] |
|**connectorId** | **String** | Connector instance identifier. |  [optional] |
|**connectorName** | **String** | Human-readable connector name. |  [optional] |
|**connectorSlug** | **String** | Connector slug or type key. |  [optional] |
|**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | Underlying transport protocol used by the MCP connector. See &#x60;TransportType&#x60; for accepted values. |  [optional] |



## Enum: TransportTypeEnum

| Name | Value |
|---- | -----|
| STREAMABLE_HTTP | &quot;STREAMABLE_HTTP&quot; |
| SSE | &quot;SSE&quot; |


## Implemented Interfaces

* Serializable


