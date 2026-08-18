

# AnalystItem

A Spotter Analyst as returned in search results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the analyst. |  |
|**name** | **String** | Display name of the analyst. |  [optional] |
|**description** | **String** | Description of the analyst. |  [optional] |
|**instructions** | **String** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. |  [optional] |
|**sources** | [**List&lt;AnalystItemSource&gt;**](AnalystItemSource.md) | Data sources the analyst can query. |  |
|**mcpConnectors** | [**List&lt;AnalystMcpConnector&gt;**](AnalystMcpConnector.md) | MCP connectors linked to this analyst. |  |
|**iconId** | **String** | Icon identifier. Empty string means the default icon. |  |
|**starterPrompts** | [**List&lt;AnalystItemStarterPrompt&gt;**](AnalystItemStarterPrompt.md) | Starter prompts in display order, including the fixed prompt. |  |
|**updatedTimeInMillis** | **Object** | Epoch milliseconds of the last update. |  [optional] |
|**lastAccessedTimeInMillis** | **Object** | Epoch milliseconds of the caller&#39;s last interaction with the analyst. |  [optional] |
|**createdBy** | [**AnalystUser**](AnalystUser.md) |  |  [optional] |
|**updatedBy** | [**AnalystUser**](AnalystUser.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


