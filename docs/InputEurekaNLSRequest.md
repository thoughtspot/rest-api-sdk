# ThoughtSpot.Client.Model.InputEurekaNLSRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgentVersion** | **int?** | Cluster version like 10.4.0.cl, 10.5.0.cl, so on. | [optional] 
**BypassCache** | **bool?** | If true, results are not returned from cache &amp; calculated every time. Can incur high costs &amp; latency. | [optional] 
**Instructions** | **List&lt;string&gt;** | User specific instructions for processing the @query. | [optional] 
**Query** | **string** | User query which is a topical/goal oriented question that needs to be broken down into smaller simple analytical questions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

