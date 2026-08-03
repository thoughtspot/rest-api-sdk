# ThoughtSpot.RestApi.Sdk.Model.ImportMemoryResponse
Response from importMemory. On `SUCCESS`, `summary` is fully populated. `diagnostics` carries any fatal errors, rollbacks, and non-fatal warnings produced during the import.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Terminal status of the import. | 
**Summary** | [**List&lt;ImportSummary&gt;**](ImportSummary.md) | Per (memory type, target source) result entries. Null when the import failed before any record processing occurred. | [optional] 
**ValidationFailures** | [**List&lt;ImportFailure&gt;**](ImportFailure.md) | Per-item validation failure entries. Null when the import failed before item validation could run. | [optional] 
**Diagnostics** | [**List&lt;ImportDiagnostic&gt;**](ImportDiagnostic.md) | Diagnostic message groups (errors, rollbacks, and non-fatal warnings), each keyed by a &#x60;sub_status&#x60;. Null when the import produced no diagnostics. | [optional] 
**OperationId** | **string** | Server-generated identifier for this import operation. Include it in support tickets to help correlate server-side logs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

