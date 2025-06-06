

# CreateVariableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of variable |  |
|**name** | **String** | Name of the variable. This is unique across the cluster. |  |
|**sensitive** | **Boolean** | If the variable contains sensitive values like passwords |  [optional] |
|**values** | [**List&lt;InputVariableValue&gt;**](InputVariableValue.md) | Values of variable |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |
| TABLE_MAPPING | &quot;TABLE_MAPPING&quot; |
| CONNECTION_PROPERTY_PER_PRINCIPAL | &quot;CONNECTION_PROPERTY_PER_PRINCIPAL&quot; |


## Implemented Interfaces

* Serializable


