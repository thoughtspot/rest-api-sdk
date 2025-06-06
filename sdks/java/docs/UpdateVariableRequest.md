

# UpdateVariableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | New name of the variable if we want to rename. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to perform on the values. |  [optional] |
|**values** | [**List&lt;InputVariableValue&gt;**](InputVariableValue.md) | Values of variable to be updated. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |


## Implemented Interfaces

* Serializable


