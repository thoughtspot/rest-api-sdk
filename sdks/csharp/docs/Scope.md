# ThoughtSpot.RestApi.Sdk.Model.Scope

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessType** | **string** | Object access scope type. | 
**OrgId** | **int?** | Unique identifier of the Org. | [optional] 
**MetadataId** | **string** | Unique identifier of the metadata. | [optional] 
**OrgScope** | **string** | Org scope the token is authorized for. Absent for a legacy single-org token.   Version: 26.10.0.cl or later  | [optional] 
**OrgIds** | [**List&lt;OrgInfo&gt;**](OrgInfo.md) | Orgs the token is authorized for when org_scope is SPECIFIC_ORGS.   Version: 26.10.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

