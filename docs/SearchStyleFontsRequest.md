# ThoughtSpot.Client.Model.SearchStyleFontsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Scope of the font library to search. CLUSTER searches the cluster-level library. ORG searches the authenticated user&#39;s org library. Returns both Cluster and Org level font if omitted. | [optional] 
**FontIdentifier** | **string** | Filter by UUID or name of a specific font. | [optional] 
**NamePattern** | **string** | Filter by font display name. Supports partial, case-insensitive matching. | [optional] 
**IncludeFontAssignments** | **bool?** | When true, includes visualization areas this font is assigned to in the response. Defaults to false if omitted. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

