# ThoughtSpot.Client.Model.SearchCommitsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataIdentifier** | **string** | Unique ID or name of the metadata. | 
**MetadataType** | **string** | Type of metadata. | [optional] 
**BranchName** | **string** |    Name of the branch from which commit history needs to be displayed.      Note: If no branch_name is specified, then commits will be returned for the default branch for this configuration. | [optional] 
**RecordOffset** | **int** |     Record offset point in the commit history to display the response.       Note: If no record offset is specified, the beginning of the record will be considered. | [optional] 
**RecordSize** | **int** |     Number of history records from record offset point to be displayed in the response.       Note: If no record size is specified, then all the records will be considered. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

