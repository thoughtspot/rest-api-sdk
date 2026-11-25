

# ExportContextResponse

Response from exportContext: the exported file, and what it holds per owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | The exported context as a YAML file. Pass it to importContext in the target environment, as is or after editing. |  [optional] |
|**summary** | [**List&lt;ContextExportSummary&gt;**](ContextExportSummary.md) | What the file holds, one entry per owner. Every selected model and analyst has an entry, even with a count of 0, and so does the Org when org-level context is selected. With &#x60;export_all_org_context&#x60;, only the owners that have context have an entry. |  [optional] |
|**additionalModelIdentifiers** | **List&lt;String&gt;** | Context that a selected model shares with models outside the selection is left out of the file, because importing this selection wouldn&#39;t replace it. These are the GUIDs of those other models: add them to &#x60;model_identifiers&#x60; and export again to include that context. For example, a metric scoped to models M1 and M2 is left out when only M1 is selected, and M2 is listed here. Empty when nothing was left out. |  [optional] |
|**additionalAnalystIdentifiers** | **List&lt;String&gt;** | Context that a selected Spotter analyst shares with analysts outside the selection is left out of the file, because importing this selection wouldn&#39;t replace it. These are the IDs of those other analysts: add them to &#x60;analyst_identifiers&#x60; and export again to include that context. For example, an instruction scoped to analysts A and B is left out when only A is selected, and B is listed here. Empty when nothing was left out. |  [optional] |


## Implemented Interfaces

* Serializable


