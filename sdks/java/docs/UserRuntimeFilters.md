

# UserRuntimeFilters

Objects to apply the User_Runtime_Filters.

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
| GE | &quot;GE&quot; |
| GT | &quot;GT&quot; |
| IN | &quot;IN&quot; |
| LE | &quot;LE&quot; |
| LT | &quot;LT&quot; |
| NE | &quot;NE&quot; |
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| BW | &quot;BW&quot; |
| BW_INC | &quot;BW_INC&quot; |
| BW_INC_MAX | &quot;BW_INC_MAX&quot; |
| BW_INC_MIN | &quot;BW_INC_MIN&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |



