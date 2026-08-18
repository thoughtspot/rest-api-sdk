

# SemanticIntegrationSearchResponse

Single semantic integration entry returned by search.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the semantic integration. |  [optional] |
|**name** | **String** | Name of the semantic integration. |  [optional] |
|**description** | **String** | Optional description of the semantic integration. |  [optional] |
|**modelId** | **String** | GUID of the associated ThoughtSpot model generated for this integration. |  [optional] |
|**modelName** | **String** | Name of the associated ThoughtSpot model. |  [optional] |
|**importType** | [**ImportTypeEnum**](#ImportTypeEnum) | How the semantic definition was sourced. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | CDW connector type. |  [optional] |
|**connectionId** | **String** | GUID of the CDW connection backing the integration. |  [optional] |
|**connectionName** | **String** | Display name of the CDW connection backing the integration. |  [optional] |
|**authorId** | **String** | GUID of the user who created the integration. |  [optional] |
|**authorName** | **String** | Username of the user who created the integration. |  [optional] |
|**creationTimeInMillis** | **Float** | Creation time in Unix epoch milliseconds. |  [optional] |
|**modificationTimeInMillis** | **Float** | Last modification time in Unix epoch milliseconds. |  [optional] |
|**tags** | [**List&lt;SemanticIntegrationTagReference&gt;**](SemanticIntegrationTagReference.md) | Tags associated with the integration. |  [optional] |



## Enum: ImportTypeEnum

| Name | Value |
|---- | -----|
| CDW | &quot;CDW&quot; |
| FILE | &quot;FILE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RDBMS_SNOWFLAKE | &quot;RDBMS_SNOWFLAKE&quot; |


## Implemented Interfaces

* Serializable


