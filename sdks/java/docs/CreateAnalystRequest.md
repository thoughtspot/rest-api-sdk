

# CreateAnalystRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Display name of the analyst. |  |
|**description** | **String** | Description of the analyst. Maximum 200 characters. |  |
|**instructions** | **String** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. |  [optional] |
|**sources** | [**List&lt;AnalystSourceInput&gt;**](AnalystSourceInput.md) | Data sources the analyst can query. At least one is required, and the caller must have view access to every referenced source. |  |
|**mcpConnectorIdentifiers** | **List&lt;String&gt;** | Identifiers of MCP connectors to link to this analyst. |  [optional] |
|**starterPrompts** | **List&lt;String&gt;** | Plain-text starter prompts shown on the analyst landing page. Maximum 4, each between 10 and 250 characters; display order follows list position. |  [optional] |


## Implemented Interfaces

* Serializable


