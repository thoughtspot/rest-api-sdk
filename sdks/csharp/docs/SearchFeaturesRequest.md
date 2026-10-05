# ThoughtSpot.RestApi.Sdk.Model.SearchFeaturesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | **string** | Determines the administrative view for the search. Use CLUSTER for the cluster-admin view (returns org assignments per feature); use ORG for the org-admin view (returns the current value of each feature assigned to the org). | 
**OrgIdentifier** | **int** | Numeric ID of the Org to scope the search to. Required when scope is ORG; ignored when scope is CLUSTER. | [optional] 
**Category** | **string** | Category of features to return. GENERAL_ACCESS returns features that are generally available; EARLY_ACCESS returns features still in early access. Defaults to GENERAL_ACCESS. | [optional] [default to CategoryEnum.GENERALACCESS]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

