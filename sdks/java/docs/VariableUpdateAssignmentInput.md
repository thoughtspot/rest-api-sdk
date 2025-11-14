

# VariableUpdateAssignmentInput

Input for variable value update in batch operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**variableIdentifier** | **String** | ID or Name of the variable |  |
|**variableValues** | **List&lt;String&gt;** | Values of the variable |  |
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to perform |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |
| RESET | &quot;RESET&quot; |


## Implemented Interfaces

* Serializable


