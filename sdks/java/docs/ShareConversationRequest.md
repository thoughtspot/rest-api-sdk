

# ShareConversationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refreshSharedContent** | **Boolean** | When &#x60;true&#x60;, always regenerates the shared view from the latest conversation state, even if one already exists. When &#x60;false&#x60; (default), reuses the existing shared view. |  [optional] |
|**grant** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to grant read-only access to the conversation. |  |
|**revoke** | [**List&lt;PrincipalRefInput&gt;**](PrincipalRefInput.md) | Principals to revoke access from the conversation. |  |


## Implemented Interfaces

* Serializable


