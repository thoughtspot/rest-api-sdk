# ThoughtSpot.Client.Model.ImportUserGroupsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groups** | [**List&lt;GroupsImportListInput&gt;**](GroupsImportListInput.md) | Details of groups which are to be imported | [optional] 
**DeleteUnspecifiedGroups** | **bool?** | If set to true, removes groups that are not specified in the API request. | [optional] [default to false]
**DryRun** | **bool?** | If true, the API performs a test operation and returns user IDs whose data will be edited after the import. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

