# ThoughtSpot.RestApi.Sdk.Model.StyleFontRecord
A custom font record in the font library.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique UUID identifier of the font. | 
**Scope** | **string** | Scope indicating whether this font belongs to the cluster or org library. | [optional] 
**Org** | [**StyleOrgInfo**](StyleOrgInfo.md) |  | [optional] 
**Name** | **string** | Display name of the font. | 
**Weight** | **string** | Weight of the font. | [optional] 
**Style** | **string** | Style of the font. | [optional] 
**Color** | **string** | Color of the font as a 6-digit hex string. | [optional] 
**CreationTimeInMillis** | **float?** | Timestamp in milliseconds when the font was uploaded. | [optional] 
**Assignments** | [**List&lt;StyleFontAssignment&gt;**](StyleFontAssignment.md) | Visualization areas currently assigned to this font. Empty if not assigned to any area. Populated only when include_font_assignments is true. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

