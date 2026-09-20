# ThoughtSpot.RestApi.Sdk.Model.StyleAppColorTheme
App color theme configuration for a specific scope - - the same stored color StyleNavigationPanel expresses, as a brand color plus how it is applied. Returned alongside navigation_panel when the app color theme is enabled on the cluster; omitted otherwise.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BrandColor** | **string** | Brand color as a 6-digit hex string. Null when no brand color is set at this scope. | [optional] 
**ApplyAsTopNavColor** | **bool?** | The effective setting: whether the brand color is painted on the top navigation bar literally, instead of the surface shade derived from it. Always the resolved value - - true iff a brand color is set, unless explicitly overridden. | [optional] 
**IsOverridden** | **bool?** | True if explicitly set at this scope (either the brand color or the apply_as_top_nav_color choice), overriding any inherited value. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

