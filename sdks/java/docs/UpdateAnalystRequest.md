

# UpdateAnalystRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Display name of the analyst. |  |
|**description** | **String** | Description of the analyst. Maximum 200 characters. |  |
|**instructions** | **String** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. Omitting this field clears any existing instructions. |  [optional] |
|**sources** | [**List&lt;AnalystSourceInput&gt;**](AnalystSourceInput.md) | Data sources the analyst can query. At least one is required, and the caller must have view access to every referenced source. Replaces the existing list in full. |  |
|**mcpConnectorIdentifiers** | **List&lt;String&gt;** | Identifiers of MCP connectors linked to this analyst. Replaces the existing list in full; omit or pass an empty array to clear. |  [optional] |
|**starterPrompts** | **List&lt;String&gt;** | Plain-text starter prompts (max 4, each between 10 and 250 characters; display order follows list position). Replaces the existing list in full; omit or pass an empty array to clear. |  [optional] |


## Implemented Interfaces

* Serializable


