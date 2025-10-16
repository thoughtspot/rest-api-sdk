

# FilterRules

Filter Rules to be applied on Objects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnName** | **String** | The name of the column to apply the filter on. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator to use for filtering. Example: EQ (equals), GT(greater than), etc. |  |
|**values** | **List&lt;Object&gt;** | The values to filter on. To get all records, use TS_WILDCARD_ALL as values. |  |



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


