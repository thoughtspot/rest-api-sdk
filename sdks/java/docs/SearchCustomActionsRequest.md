

# SearchCustomActionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customActionIdentifier** | **String** | Name or ID of the custom action. |  [optional] |
|**namePattern** | **String** | A pattern to match case-insensitive name of the custom-action object. |  [optional] |
|**defaultActionConfig** | [**SearchCustomActionsRequestDefaultActionConfig**](SearchCustomActionsRequestDefaultActionConfig.md) |  |  [optional] |
|**includeGroupAssociations** | **Boolean** | When set to true, returns the associated groups for a custom action. |  [optional] |
|**includeMetadataAssociations** | **Boolean** | When set to true, returns the associated metadata for a custom action. |  [optional] |
|**metadata** | [**List&lt;CustomActionMetadataTypeInput&gt;**](CustomActionMetadataTypeInput.md) | Search with a given metadata identifier. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Filter the action objects based on type |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CALLBACK | &quot;CALLBACK&quot; |
| URL | &quot;URL&quot; |



