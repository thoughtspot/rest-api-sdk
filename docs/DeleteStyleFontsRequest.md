# ThoughtSpot.Client.Model.DeleteStyleFontsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Scope of the font library to delete from. CLUSTER deletes from the cluster-level library. ORG deletes from the authenticated user&#39;s org library. Defaults to ORG if omitted. | [optional] [default to ScopeEnum.ORG]
**FontIdentifiers** | **List&lt;string&gt;** | UUIDs or names of the fonts to delete. At least one identifier is required. | 
**DryRun** | **bool?** | When true, returns affected assignments without applying the deletion. Use this to preview the impact before committing. Defaults to true if omitted. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

