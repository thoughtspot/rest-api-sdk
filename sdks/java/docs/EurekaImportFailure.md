

# EurekaImportFailure

One per-item import failure surfaced by importMemory. `line_number` is the best-effort line number in the uploaded YAML; UI uses it for click-to-locate. `field_name` is a dotted path within the item (e.g. `content.rule_definition`) for inline highlighting; absent when the failure is item-level rather than field-level.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineNumber** | **Integer** | Best-effort line number of the offending item in the uploaded YAML. UI uses it for click-to-locate. May be null when the line cannot be determined. |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Machine-readable category for the failure (e.g. &#x60;VALIDATION&#x60;, &#x60;ACCESS_DENIED&#x60;, &#x60;CHAR_LIMIT&#x60;). UI uses this to decide messaging. |  [optional] |
|**fieldName** | **String** | Dotted path to the offending field within the item (e.g. &#x60;content.rule_definition&#x60;) for inline highlighting. Absent when the failure is item-level rather than field-level. |  [optional] |
|**message** | **String** | Human-readable description of the failure. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| UNKNOWN_FAILURE_REASON | &quot;UNKNOWN_FAILURE_REASON&quot; |
| VALIDATION | &quot;VALIDATION&quot; |
| UNRESOLVED_SOURCE | &quot;UNRESOLVED_SOURCE&quot; |
| ACCESS_DENIED | &quot;ACCESS_DENIED&quot; |
| CHAR_LIMIT | &quot;CHAR_LIMIT&quot; |
| SCHEMA | &quot;SCHEMA&quot; |


## Implemented Interfaces

* Serializable


