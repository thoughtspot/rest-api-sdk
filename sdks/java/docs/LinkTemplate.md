

# LinkTemplate

A URL template with its link type and whether it is set at the requested scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The link type this template applies to. |  |
|**value** | **String** | The effective URL template at the requested scope. |  [optional] |
|**isOverridden** | **Boolean** | True if set at this scope, false if inherited. |  |



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


