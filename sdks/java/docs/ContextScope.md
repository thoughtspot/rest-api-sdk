

# ContextScope

The owner of a group of context entities: a kind of owner and its identifiers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | What owns the entities: models, Spotter analysts or the Org. |  [optional] |
|**identifiers** | **List&lt;String&gt;** | GUIDs of the models for &#x60;DATA_MODEL&#x60;, IDs of the analysts for &#x60;ANALYST&#x60;, and empty for &#x60;ORG&#x60;. More than one when the entities are owned jointly. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATA_MODEL | &quot;DATA_MODEL&quot; |
| ANALYST | &quot;ANALYST&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


