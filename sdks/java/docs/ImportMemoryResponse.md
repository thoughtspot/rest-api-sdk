

# ImportMemoryResponse

Response from importMemory. On `SUCCESS`, `summary` is fully populated. `diagnostics` carries any fatal errors, rollbacks, and non-fatal warnings produced during the import.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Terminal status of the import. |  |
|**summary** | [**List&lt;ImportSummary&gt;**](ImportSummary.md) | Per (memory type, target source) result entries. Null when the import failed before any record processing occurred. |  [optional] |
|**validationFailures** | [**List&lt;ImportFailure&gt;**](ImportFailure.md) | Per-item validation failure entries. Null when the import failed before item validation could run. |  [optional] |
|**diagnostics** | [**List&lt;ImportDiagnostic&gt;**](ImportDiagnostic.md) | Diagnostic message groups (errors, rollbacks, and non-fatal warnings), each keyed by a &#x60;sub_status&#x60;. Null when the import produced no diagnostics. |  [optional] |
|**operationId** | **String** | Server-generated identifier for this import operation. Include it in support tickets to help correlate server-side logs. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


