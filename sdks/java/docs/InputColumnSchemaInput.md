

# InputColumnSchemaInput

Schema definition for a single input column.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the column. |  |
|**dataType** | **String** | Physical data type of the column as recognized by the connected warehouse (for example, VARCHAR, INT64, DOUBLE, BOOL, DATE). The accepted values depend on the underlying Cloud Data Warehouse. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Semantic role of the column in ThoughtSpot. Use ATTRIBUTE for dimensional data such as text, dates, and identifiers, and MEASURE for numeric or aggregatable values. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ATTRIBUTE | &quot;ATTRIBUTE&quot; |
| MEASURE | &quot;MEASURE&quot; |


## Implemented Interfaces

* Serializable


