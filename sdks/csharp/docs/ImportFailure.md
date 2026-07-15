# ThoughtSpot.RestApi.Sdk.Model.ImportFailure
One per-item import failure surfaced by importMemory. `line_number` is the best-effort line number in the uploaded YAML; `field_name` is a dotted path within the item (e.g. `content.rule_definition`) for inline highlighting; absent when the failure is item-level rather than field-level.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineNumber** | **int?** | Best-effort line number of the offending item in the uploaded YAML. May be null when the line cannot be determined. | [optional] 
**Reason** | **string** | Machine-readable category for the failure (e.g. &#x60;VALIDATION&#x60;, &#x60;ACCESS_DENIED&#x60;, &#x60;CHAR_LIMIT&#x60;). | [optional] 
**FieldName** | **string** | Dotted path to the offending field within the item (e.g. &#x60;content.rule_definition&#x60;) for inline highlighting. Absent when the failure is item-level rather than field-level. | [optional] 
**Message** | **string** | Human-readable description of the failure. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

