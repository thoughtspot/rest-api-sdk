# ThoughtSpot.RestApi.Sdk.Model.ImportUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**List&lt;ImportUser&gt;**](ImportUser.md) | List of users needs to be imported. | 
**DefaultPassword** | **string** | The default password to assign to users if they do not have a password assigned in ThoughtSpot. | [optional] 
**DryRun** | **bool?** | If true, the API performs a test operation and returns user IDs whose data will be edited after the import. | [optional] [default to true]
**DeleteUnspecifiedUsers** | **bool?** | If set to true, removes the users that are not specified in the API request. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

