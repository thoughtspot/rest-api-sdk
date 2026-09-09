

# InputColumnSchemaInput

Schema definition for a single input column.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the column. |  |
|**dataType** | **String** | Physical data type of the column as recognized by the connected warehouse (for example, VARCHAR, INT64, DOUBLE, BOOL, DATE). The accepted values depend on the underlying Cloud Data Warehouse. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Semantic role of the column in ThoughtSpot. Use ATTRIBUTE for dimensional data such as text, dates, and identifiers, and MEASURE for numeric or aggregatable values. |  |
|**allowedValues** | **List&lt;String&gt;** | Optional list of permitted values for the column, at most 500, which makes it a fixed-choice column. Every non-empty value written into the column by updateInputTable must then be an exact member of the list, and the API rejects a write that is not. Each value must be non-empty, at most 8192 characters, and representable as the column&#39;s data_type — a number for the numeric types, true or false for BOOL, and an epoch integer for DATE, DATE_TIME, and TIME. Omit or leave empty to allow any value supported by the data type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ATTRIBUTE | &quot;ATTRIBUTE&quot; |
| MEASURE | &quot;MEASURE&quot; |


## Implemented Interfaces

* Serializable


