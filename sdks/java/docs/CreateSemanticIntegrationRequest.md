

# CreateSemanticIntegrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionIdentifier** | **String** | ID or name of the CDW connection. |  |
|**name** | **String** | Name of the semantic integration. Must be unique. |  |
|**databaseName** | **String** | Database name in the CDW. |  |
|**schemaName** | **String** | Schema name in the CDW. |  |
|**semanticViewName** | **String** | Semantic view name in the CDW. |  |
|**type** | [**TypeEnum**](#TypeEnum) | CDW connector type. |  |
|**description** | **String** | Optional description of the semantic integration. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RDBMS_SNOWFLAKE | &quot;RDBMS_SNOWFLAKE&quot; |


## Implemented Interfaces

* Serializable


