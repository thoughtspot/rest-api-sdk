

# QueryGetDecomposedQueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**answerIds** | **List&lt;String&gt;** | List of answer unique identifiers (GUIDs) whose data will be used to guide the response. |  [optional] |
|**content** | **List&lt;String&gt;** | User provided content like text data, csv data as a string message to provide context &amp; potentially improve the quality of the response. |  [optional] |
|**conversationId** | **String** | Unique identifier to denote current conversation. |  [optional] |
|**liveboardIds** | **List&lt;String&gt;** | List of liveboard unique identifiers (GUIDs) whose data will be used to guide the response. |  [optional] |
|**maxDecomposedQueries** | **Integer** | Maximum number of decomposed queries that is allowed in the response, default &#x3D; 5. |  [optional] |
|**nlsRequest** | [**InputEurekaNLSRequest**](InputEurekaNLSRequest.md) | NLSRequest object containing user query &amp; instructions. |  [optional] |
|**worksheetIds** | **List&lt;String&gt;** | List of worksheetIds to provide context for decomposing user query into analytical queries that can be run on them. |  [optional] |



