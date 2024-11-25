

# ImportUsersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**users** | [**List&lt;ImportUser&gt;**](ImportUser.md) | List of users needs to be imported. |  |
|**defaultPassword** | **String** | The default password to assign to users if they do not have a password assigned in ThoughtSpot. |  [optional] |
|**dryRun** | **Boolean** | If true, the API performs a test operation and returns user IDs whose data will be edited after the import. |  [optional] |
|**deleteUnspecifiedUsers** | **Boolean** | If set to true, removes the users that are not specified in the API request. |  [optional] |



