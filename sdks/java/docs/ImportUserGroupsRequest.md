

# ImportUserGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groups** | [**List&lt;GroupsImportListInput&gt;**](GroupsImportListInput.md) | Details of groups which are to be imported |  [optional] |
|**deleteUnspecifiedGroups** | **Boolean** | If set to true, removes groups that are not specified in the API request. |  [optional] |
|**dryRun** | **Boolean** | If true, the API performs a test operation and returns user IDs whose data will be edited after the import. |  [optional] |



