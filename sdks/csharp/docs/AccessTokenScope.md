# ThoughtSpot.RestApi.Sdk.Model.AccessTokenScope
The set of Orgs a token is authorized to operate in, recorded at issuance. Used for token types (e.g. AccessToken) that have no other {@code scope} field of their own.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgScope** | **string** | Org scope the token is authorized for: SPECIFIC_ORGS or ALL_MEMBER_ORGS. | 
**OrgIds** | [**List&lt;OrgInfo&gt;**](OrgInfo.md) | Orgs the token is authorized for when org_scope is SPECIFIC_ORGS. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

