

# UpdateVariableValuesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**variableAssignment** | [**List&lt;VariableUpdateAssignmentInput&gt;**](VariableUpdateAssignmentInput.md) | Array of variable assignment objects specifying the variable identifier, values to assign, and the operation type (ADD, REMOVE, REPLACE, or RESET) to perform on each variable. |  |
|**variableValueScope** | [**List&lt;VariableUpdateScopeInput&gt;**](VariableUpdateScopeInput.md) | Array of scope objects defining where the variable values apply, including organization context, optional principal constraints (user or group), model reference for formula variables, and priority for conflict resolution. |  |


## Implemented Interfaces

* Serializable


