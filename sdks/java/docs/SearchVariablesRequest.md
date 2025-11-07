

# SearchVariablesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**variableDetails** | [**List&lt;VariableDetailInput&gt;**](VariableDetailInput.md) | Variable details |  [optional] |
|**valueScope** | [**List&lt;ValueScopeInput&gt;**](ValueScopeInput.md) | Array of scope filters |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included |  [optional] |
|**outputFormat** | [**OutputFormatEnum**](#OutputFormatEnum) | Format in which we want the output |  [optional] |



## Enum: OutputFormatEnum

| Name | Value |
|---- | -----|
| METADATA_ONLY | &quot;METADATA_ONLY&quot; |
| METADATA_AND_VALUES | &quot;METADATA_AND_VALUES&quot; |


## Implemented Interfaces

* Serializable


