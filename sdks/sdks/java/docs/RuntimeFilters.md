

# RuntimeFilters

Objects to apply the Runtime_Filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnName** | **String** | The column name to apply filter. |  |
|**values** | **List&lt;String&gt;** | Value of the filters. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator value. Example: EQ |  |
|**persist** | **Boolean** | Flag to persist the runtime filters.    Version: 9.12.0.cl or later  |  [optional] |
|**objects** | [**List&lt;UserObject&gt;**](UserObject.md) | Object to apply the runtime filter. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQ | &quot;EQ&quot; |
| NE | &quot;NE&quot; |
| LT | &quot;LT&quot; |
| LE | &quot;LE&quot; |
| GT | &quot;GT&quot; |
| GE | &quot;GE&quot; |
| IN | &quot;IN&quot; |
| BW | &quot;BW&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| BW_INC | &quot;BW_INC&quot; |
| BW_INC_MIN | &quot;BW_INC_MIN&quot; |
| BW_INC_MAX | &quot;BW_INC_MAX&quot; |
| LIKE | &quot;LIKE&quot; |
| NOT_IN | &quot;NOT_IN&quot; |


## Implemented Interfaces

* Serializable


