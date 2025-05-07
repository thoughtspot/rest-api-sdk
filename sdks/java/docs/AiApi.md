# AiApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConversation**](AiApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create |  |
| [**queryGetDecomposedQuery**](AiApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions |  |
| [**sendMessage**](AiApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |  |
| [**singleAnswer**](AiApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create |  |


<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)



 Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.AiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiApi apiInstance = new AiApi(defaultClient);
    CreateConversationRequest createConversationRequest = new CreateConversationRequest(); // CreateConversationRequest | 
    try {
      Conversation result = apiInstance.createConversation(createConversationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#createConversation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)|  | |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="queryGetDecomposedQuery"></a>
# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)



Version: 10.7.0.cl or later 

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.AiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiApi apiInstance = new AiApi(defaultClient);
    QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest = new QueryGetDecomposedQueryRequest(); // QueryGetDecomposedQueryRequest | 
    try {
      EurekaDecomposeQueryResponse result = apiInstance.queryGetDecomposedQuery(queryGetDecomposedQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#queryGetDecomposedQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queryGetDecomposedQueryRequest** | [**QueryGetDecomposedQueryRequest**](QueryGetDecomposedQueryRequest.md)|  | |

### Return type

[**EurekaDecomposeQueryResponse**](EurekaDecomposeQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> List&lt;ResponseMessage&gt; sendMessage(conversationIdentifier, sendMessageRequest)



 Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.AiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiApi apiInstance = new AiApi(defaultClient);
    String conversationIdentifier = "conversationIdentifier_example"; // String | Unique identifier of the conversation.
    SendMessageRequest sendMessageRequest = new SendMessageRequest(); // SendMessageRequest | 
    try {
      List<ResponseMessage> result = apiInstance.sendMessage(conversationIdentifier, sendMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#sendMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationIdentifier** | **String**| Unique identifier of the conversation. | |
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md)|  | |

### Return type

[**List&lt;ResponseMessage&gt;**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="singleAnswer"></a>
# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.AiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiApi apiInstance = new AiApi(defaultClient);
    SingleAnswerRequest singleAnswerRequest = new SingleAnswerRequest(); // SingleAnswerRequest | 
    try {
      ResponseMessage result = apiInstance.singleAnswer(singleAnswerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#singleAnswer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **singleAnswerRequest** | [**SingleAnswerRequest**](SingleAnswerRequest.md)|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

