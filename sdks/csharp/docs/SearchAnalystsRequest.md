# ThoughtSpot.RestApi.Sdk.Model.SearchAnalystsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnalystIdentifier** | **string** | Unique identifier of an analyst. When provided, fetch mode: the response contains exactly that analyst and the other filters are ignored. | [optional] 
**RecordSize** | **int** | List mode: number of records per page. Default 50, maximum 500. | [optional] [default to 50]
**RecordOffset** | **int** | List mode: zero-based index of the first record to return. Maximum 10000. | [optional] [default to 0]
**Query** | **string** | List mode: case-insensitive substring match on the analyst name. | [optional] 
**Type** | **string** | List mode: ownership filter — ALL (created by or shared with me), CREATED_BY_ME, or SHARED_TO_ME. | [optional] [default to TypeEnum.ALL]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

