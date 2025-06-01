

# VariableDetailInput

Input for variable details in search

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Unique ID or name of the variable |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of variable |  [optional] |
|**namePattern** | **String** | A pattern to match case-insensitive name of the variable. User % for a wildcard match |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |
| TABLE_MAPPING | &quot;TABLE_MAPPING&quot; |
| CONNECTION_PROPERTY_PER_PRINCIPAL | &quot;CONNECTION_PROPERTY_PER_PRINCIPAL&quot; |


## Implemented Interfaces

* Serializable


