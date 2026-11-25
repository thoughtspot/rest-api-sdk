

# SendAgentConversationMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messages** | **List&lt;String&gt;** | messages to be sent to the agent |  |
|**spotterExperienceVersion** | [**SpotterExperienceVersionEnum**](#SpotterExperienceVersionEnum) | Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. Returns a list of   messages (&#x60;AgentMessagesResponse&#x60;). - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Returns the turn&#39;s   events (&#x60;AgentTurnResponse&#x60;) and can start a new conversation without   &#x60;conversation_identifier&#x60;. Requires a cluster admin to set Spotter 3   Liveboard experience to Liveboard side panel (New); otherwise the   request returns a 400.    Version: 26.12.0.cl or later  |  [optional] |



## Enum: SpotterExperienceVersionEnum

| Name | Value |
|---- | -----|
| V1 | &quot;V1&quot; |
| V2 | &quot;V2&quot; |


## Implemented Interfaces

* Serializable


