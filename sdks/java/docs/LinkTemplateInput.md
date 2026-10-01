

# LinkTemplateInput

One link type to act on, and the URL template to set for it under REPLACE.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The link type this entry applies to. |  |
|**value** | **String** | URL template to set, including the placeholders this type requires. Required under REPLACE; supplying it with RESET is rejected. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD_SHARE_URL | &quot;LIVEBOARD_SHARE_URL&quot; |
| VISUALIZATION_SHARE_URL | &quot;VISUALIZATION_SHARE_URL&quot; |
| ANSWER_SHARE_URL | &quot;ANSWER_SHARE_URL&quot; |
| SPOTIQ_ANALYSIS_URL | &quot;SPOTIQ_ANALYSIS_URL&quot; |
| UNSUBSCRIBE_URL | &quot;UNSUBSCRIBE_URL&quot; |
| GENERIC_URL | &quot;GENERIC_URL&quot; |
| CONVERSATION_SHARE_URL | &quot;CONVERSATION_SHARE_URL&quot; |


## Implemented Interfaces

* Serializable


