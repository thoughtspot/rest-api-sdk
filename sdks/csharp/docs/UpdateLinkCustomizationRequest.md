# ThoughtSpot.RestApi.Sdk.Model.UpdateLinkCustomizationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Scope to apply the templates at. CLUSTER sets the defaults inherited by all orgs and is available only in the primary org. ORG applies to the authenticated user&#39;s org. | [default to ScopeEnum.ORG]
**Operation** | **string** | Operation to perform. REPLACE sets each listed type to its value. RESET reverts each listed type to the value its scope inherits. | [optional] [default to OperationEnum.REPLACE]
**Templates** | [**List&lt;LinkTemplateInput&gt;**](LinkTemplateInput.md) | Link types to act on. Types not listed are left unchanged. Duplicate entries for the same type are rejected. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

