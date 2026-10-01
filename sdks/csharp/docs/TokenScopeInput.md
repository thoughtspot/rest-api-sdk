# ThoughtSpot.RestApi.Sdk.Model.TokenScopeInput
The set of Orgs a token is authorized to operate in, recorded at issuance. Only applicable to a Tenant Administrator.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgScope** | **string** | The set of Orgs this token is authorized to operate in. SPECIFIC_ORGS authorizes the token for the Orgs listed in org_identifiers; ALL_MEMBER_ORGS authorizes it for all Orgs the user is a member of.   Version: 26.10.0.cl or later  | 
**OrgIdentifiers** | **List&lt;string&gt;** | ID or name of the Orgs the token is authorized for. Required when org_scope is SPECIFIC_ORGS; ignored when org_scope is ALL_MEMBER_ORGS.   Version: 26.10.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

