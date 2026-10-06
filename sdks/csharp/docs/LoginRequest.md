# ThoughtSpot.RestApi.Sdk.Model.LoginRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | Username of the ThoughtSpot user | [optional] 
**Password** | **string** | Password of the user account | [optional] 
**OrgIdentifier** | **string** | ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session. | [optional] 
**RememberMe** | **bool?** | A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests. | [optional] [default to false]
**RedirectUrl** | **string** | Path on this cluster to redirect to after a successful login, for example /pinboards. It must start with a single /, and an absolute URL is rejected. When omitted, no redirect is issued and the response is unchanged.    Version: 26.12.0.cl or later  | [optional] 
**NoUrlRedirection** | **bool?** | A flag to suppress the redirect. When set to true, the resolved URL is returned in the location header instead of a 302 redirect. Applies only when redirect_url is set.    Version: 26.12.0.cl or later  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

