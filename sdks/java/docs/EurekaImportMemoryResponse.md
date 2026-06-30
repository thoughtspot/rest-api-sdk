

# EurekaImportMemoryResponse

Response from importMemory. On `SUCCESS`, `summary` is fully populated. `diagnostics` carries any fatal errors, rollbacks, and non-fatal observations (including residual-orphan doc ids that a follow-up sweeper will reconcile).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Terminal status of the import. |  |
|**summary** | [**List&lt;EurekaImportSummary&gt;**](EurekaImportSummary.md) | Per (memory type, target source) result entries. Null when the import failed before any record processing occurred. |  [optional] |
|**validationFailures** | [**List&lt;EurekaImportFailure&gt;**](EurekaImportFailure.md) | Per-item validation failure entries. Null when the import failed before item validation could run. |  [optional] |
|**diagnostics** | [**List&lt;EurekaImportDiagnostic&gt;**](EurekaImportDiagnostic.md) | Diagnostic message groups (errors, rollbacks, and non-fatal warnings), each keyed by a &#x60;sub_status&#x60;. Null when the import produced no diagnostics. |  [optional] |
|**operationId** | **String** | Server-minted UUID for log correlation. Echo this in support tickets and in the follow-up orphan-cleanup call. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


