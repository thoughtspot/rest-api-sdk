# ThoughtSpot.RestApi.Sdk.Model.UpdateLinkCustomizationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Scope to apply the templates at. CLUSTER sets the defaults inherited by all orgs and is available only in the primary org. ORG applies to the org the caller is signed in to. | [default to ScopeEnum.ORG]
**Operation** | **string** | Operation to perform. REPLACE sets each listed type to its value. RESET reverts each listed type to the value its scope inherits. | [optional] [default to OperationEnum.REPLACE]
**Templates** | [**List&lt;LinkTemplateInput&gt;**](LinkTemplateInput.md) | Link types to act on. This is a partial update: types not listed keep the value they resolve to today. Duplicate entries for the same type are rejected. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

