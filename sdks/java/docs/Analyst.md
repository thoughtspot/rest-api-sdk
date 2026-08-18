

# Analyst

A Spotter Analyst: a configured agent with a name, description, agent instructions, data sources, MCP connectors, and starter prompts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the analyst. |  |
|**name** | **String** | Display name of the analyst. |  [optional] |
|**description** | **String** | Description of the analyst. |  [optional] |
|**instructions** | **String** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. |  [optional] |
|**sources** | [**List&lt;AnalystSource&gt;**](AnalystSource.md) | Data sources the analyst can query. |  |
|**mcpConnectors** | **List&lt;String&gt;** | IDs of MCP connectors linked to this analyst. |  |
|**starterPrompts** | [**List&lt;AnalystStarterPrompt&gt;**](AnalystStarterPrompt.md) | User-defined starter prompts, in display order. |  |
|**updatedTimeInMillis** | **Object** | Epoch milliseconds of the last update. |  [optional] |
|**createdBy** | **String** | ID of the user who created the analyst. |  [optional] |
|**updatedBy** | **String** | ID of the user who last updated the analyst. |  [optional] |


## Implemented Interfaces

* Serializable


