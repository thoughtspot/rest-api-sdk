# ThoughtSpot.RestApi.Sdk.Model.SearchOrgsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgIdentifier** | **string** | ID or name of the Org | [optional] 
**Description** | **string** | Description of the Org | [optional] 
**Visibility** | **string** | Visibility of the Org | [optional] 
**Status** | **string** | Status of the Org | [optional] 
**UserIdentifiers** | **List&lt;string&gt;** | GUIDs or names of the users for which you want to retrieve the Orgs data | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included.    Version: 27.1.0.cl or later  | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included.    Version: 27.1.0.cl or later  | [optional] [default to 10]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

