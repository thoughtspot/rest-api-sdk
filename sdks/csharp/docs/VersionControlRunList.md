# ThoughtSpot.RestApi.Sdk.Model.VersionControlRunList
A page of runs in your Org, newest first.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Runs** | [**List&lt;VersionControlRunStatus&gt;**](VersionControlRunStatus.md) | Current outcome of each matching run, newest first. | 
**LastBatch** | **bool?** | True when no runs follow this page, so a caller that receives a full page knows whether to ask for the next one. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

