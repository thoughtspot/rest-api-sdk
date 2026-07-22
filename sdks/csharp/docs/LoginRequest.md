# ThoughtSpot.RestApi.Sdk.Model.LoginRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | Username of the ThoughtSpot user | [optional] 
**Password** | **string** | Password of the user account | [optional] 
**OrgIdentifier** | **string** | ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session. | [optional] 
**RememberMe** | **bool?** | A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

