# ThoughtSpot.RestApi.Sdk.Model.UpdateFeatureAssignmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeatureIdentifier** | **string** | User-friendly feature name (feature_name) or the underlying feature ID (feature_id) of the feature whose Org assignments should be updated. | 
**OrgIdentifiers** | **List&lt;int&gt;** | Numeric IDs of the Orgs to assign to the feature. Send an empty array with operation REPLACE to clear all Org assignments for this feature. | 
**Operation** | **string** | Type of update to apply to the Org assignments. ADD assigns the given Orgs in addition to existing ones; REMOVE unassigns the given Orgs; REPLACE sets the assignment to exactly the given Orgs. Defaults to REPLACE. | [optional] [default to OperationEnum.REPLACE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

