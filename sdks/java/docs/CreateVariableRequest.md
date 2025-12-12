

# CreateVariableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of variable |  |
|**name** | **String** | Name of the variable. This is unique across the cluster. |  |
|**isSensitive** | **Boolean** | If the variable contains sensitive values like passwords |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) | Variable Data Type, only for formula_variable type, leave empty for others    Version: 10.15.0.cl or later  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |
| TABLE_MAPPING | &quot;TABLE_MAPPING&quot; |
| CONNECTION_PROPERTY_PER_PRINCIPAL | &quot;CONNECTION_PROPERTY_PER_PRINCIPAL&quot; |
| FORMULA_VARIABLE | &quot;FORMULA_VARIABLE&quot; |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| VARCHAR | &quot;VARCHAR&quot; |
| INT32 | &quot;INT32&quot; |
| INT64 | &quot;INT64&quot; |
| DOUBLE | &quot;DOUBLE&quot; |
| DATE | &quot;DATE&quot; |
| DATE_TIME | &quot;DATE_TIME&quot; |


## Implemented Interfaces

* Serializable


