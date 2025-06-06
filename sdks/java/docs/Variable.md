

# Variable

Variable object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the variable |  |
|**name** | **String** | Name of the variable |  |
|**variableType** | [**VariableTypeEnum**](#VariableTypeEnum) | Type of the variable |  [optional] |
|**sensitive** | **Boolean** | If the variable is sensitive |  [optional] |
|**values** | [**List&lt;VariableValue&gt;**](VariableValue.md) | Values of the variable |  [optional] |



## Enum: VariableTypeEnum

| Name | Value |
|---- | -----|
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |
| TABLE_MAPPING | &quot;TABLE_MAPPING&quot; |
| CONNECTION_PROPERTY_PER_PRINCIPAL | &quot;CONNECTION_PROPERTY_PER_PRINCIPAL&quot; |


## Implemented Interfaces

* Serializable


