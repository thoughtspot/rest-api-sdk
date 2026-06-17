# ThoughtSpot.Client.Model.RevokeRefreshTokensRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConfigurationIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the configuration. When provided, the refresh tokens of the users associated with the connection configuration will be revoked. | [optional] 
**UserIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the users. When provided, the refresh tokens of the specified users will be revoked. If the request includes the user ID or name of the connection author, their token will also be revoked. | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the Org. When provided, the refresh tokens of all users associated with the published connection in the Org will be revoked. This parameter is valid only for published connections. Using it with unpublished connections will result in an error. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

