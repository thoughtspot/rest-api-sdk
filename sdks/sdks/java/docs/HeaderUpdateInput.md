

# HeaderUpdateInput

Favorite object options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Unique ID of a specified type to identify the header. |  [optional] |
|**objIdentifier** | **String** | Custom object identifier to uniquely identify header. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Optional type of the header object. |  [optional] |
|**attributes** | [**List&lt;HeaderAttributeInput&gt;**](HeaderAttributeInput.md) | List of attributes to update |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ACTION_OBJECT | &quot;ACTION_OBJECT&quot; |
| DATA_SOURCE | &quot;DATA_SOURCE&quot; |
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |


## Implemented Interfaces

* Serializable


