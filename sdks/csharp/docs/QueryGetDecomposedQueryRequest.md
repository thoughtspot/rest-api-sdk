# ThoughtSpot.RestApi.Sdk.Model.QueryGetDecomposedQueryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnswerIds** | **List&lt;string&gt;** | List of answer unique identifiers (GUIDs) whose data will be used to guide the response. | [optional] 
**Content** | **List&lt;string&gt;** | User provided content like text data, csv data as a string message to provide context &amp; potentially improve the quality of the response. | [optional] 
**ConversationId** | **string** | Unique identifier to denote current conversation. | [optional] 
**LiveboardIds** | **List&lt;string&gt;** | List of liveboard unique identifiers (GUIDs) whose data will be used to guide the response. | [optional] 
**MaxDecomposedQueries** | **int** | Maximum number of decomposed queries that is allowed in the response, default &#x3D; 5. | [optional] 
**NlsRequest** | [**InputEurekaNLSRequest**](InputEurekaNLSRequest.md) | NLSRequest object containing user query &amp; instructions. | [optional] 
**WorksheetIds** | **List&lt;string&gt;** | List of worksheetIds to provide context for decomposing user query into analytical queries that can be run on them. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

