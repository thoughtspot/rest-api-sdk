

# ImportContextResponse

Response from importContext. `status` says how the import ended; the other fields say what it changed, or would change in a dry run, and why it failed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Terminal status of the import. &#x60;SUCCESS&#x60; means it completed, or in a dry run that the preview is complete. &#x60;VALIDATION_FAILED&#x60; means the file has problems, all listed in &#x60;validation_failures&#x60;, and nothing was written. &#x60;FAILED&#x60; means a valid file hit a server error; see &#x60;diagnostics&#x60;. |  |
|**summary** | [**List&lt;ContextImportSummary&gt;**](ContextImportSummary.md) | What the import changes, one entry per owner: entities before the import, deleted and inserted. Previews in a dry run. Every selected model and analyst has an entry, and so does the Org when the file selects org-level context. When the file selects the whole Org, only the owners with context in this environment or in the file have an entry. |  [optional] |
|**validationFailures** | [**List&lt;ImportFailure&gt;**](ImportFailure.md) | Every problem found in the file, each with its line, entity key, field, reason and message. Nothing is written when any are present. |  [optional] |
|**diagnostics** | [**List&lt;ImportDiagnostic&gt;**](ImportDiagnostic.md) | Warnings and failure causes, grouped by &#x60;sub_status&#x60;. Warnings include a selected model or analyst left with no context, an analyst&#39;s context deleted on a model the file doesn&#39;t name, analysts outside the selection whose answers change through a replaced model&#39;s context, and references into the replaced context that break because their targets get new IDs. |  [optional] |
|**operationId** | **String** | Server-generated identifier for this import. Include it when contacting support to help correlate server-side logs. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


