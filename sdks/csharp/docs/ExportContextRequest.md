# ThoughtSpot.RestApi.Sdk.Model.ExportContextRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ModelIdentifiers** | **List&lt;string&gt;** | GUIDs or obj_ids of the models whose context to export. Exports the context each model owns: entities scoped to that model, or to several models that are all selected. | [optional] 
**AnalystIdentifiers** | **List&lt;string&gt;** | IDs of the Spotter analysts whose context to export. Exports every entity that names only selected analysts, whichever models it also names. | [optional] 
**IncludeAnalystModels** | **bool?** | When &#x60;true&#x60;, also selects every model the selected analysts use. The file lists those models, so importing it replaces exactly them. | [optional] [default to false]
**IncludeOrgLevelContext** | **bool?** | When &#x60;true&#x60;, also selects the org-level context: entities that name no model and no analyst and apply to every question in the Org. Requires the &#x60;ADMINISTRATION&#x60; privilege. | [optional] [default to false]
**ExportAllOrgContext** | **bool?** | When &#x60;true&#x60;, selects everything in the Org: every model, every analyst and the org-level context. Must be used on its own. Importing the resulting file replaces all of the target Org&#39;s context. Requires the &#x60;ADMINISTRATION&#x60; privilege. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

