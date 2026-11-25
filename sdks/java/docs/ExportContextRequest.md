

# ExportContextRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelIdentifiers** | **List&lt;String&gt;** | GUIDs or obj_ids of the models whose context to export. Exports the context each model owns: entities scoped to that model, or to several models that are all selected. |  [optional] |
|**analystIdentifiers** | **List&lt;String&gt;** | IDs of the Spotter analysts whose context to export. Exports every entity that names only selected analysts, whichever models it also names. |  [optional] |
|**includeAnalystModels** | **Boolean** | When &#x60;true&#x60;, also selects every model the selected analysts use. The file lists those models, so importing it replaces exactly them. |  [optional] |
|**includeOrgLevelContext** | **Boolean** | When &#x60;true&#x60;, also selects the org-level context: entities that name no model and no analyst and apply to every question in the Org. Requires the &#x60;ADMINISTRATION&#x60; privilege. |  [optional] |
|**exportAllOrgContext** | **Boolean** | When &#x60;true&#x60;, selects everything in the Org: every model, every analyst and the org-level context. Must be used on its own. Importing the resulting file replaces all of the target Org&#39;s context. Requires the &#x60;ADMINISTRATION&#x60; privilege. |  [optional] |


## Implemented Interfaces

* Serializable


