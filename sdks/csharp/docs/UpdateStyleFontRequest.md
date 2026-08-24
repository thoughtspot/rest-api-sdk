# ThoughtSpot.RestApi.Sdk.Model.UpdateStyleFontRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Scope of the font library containing this font. CLUSTER targets the cluster-level library. ORG targets the authenticated user&#39;s org library. Defaults to ORG if omitted. | [optional] [default to ScopeEnum.ORG]
**Name** | **string** | New display name for the font. | [optional] 
**Weight** | **string** | New weight for the font. Supported values: NORMAL, LIGHT, BOLD. | [optional] 
**Style** | **string** | New style for the font. Supported values: NORMAL, ITALIC, OBLIQUE. | [optional] 
**Color** | **string** | New color for the font as a 6-digit hex string (e.g. \&quot;#333333\&quot;). Returns an error if the value is malformed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

