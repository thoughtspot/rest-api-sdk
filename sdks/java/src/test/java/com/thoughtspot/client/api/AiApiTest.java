/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AgentConversation;
import com.thoughtspot.client.model.Conversation;
import com.thoughtspot.client.model.CreateAgentConversationRequest;
import com.thoughtspot.client.model.CreateConversationRequest;
import com.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import com.thoughtspot.client.model.EurekaGetRelevantQuestionsResponse;
import com.thoughtspot.client.model.GetRelevantQuestionsRequest;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
import com.thoughtspot.client.model.SingleAnswerRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for AiApi */
@Disabled
public class AiApiTest {

    private final AiApi api = new AiApi();

    /**
     * Version: 10.13.0.cl or later
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAgentConversationTest() throws ApiException {
        CreateAgentConversationRequest createAgentConversationRequest = null;
        AgentConversation response = api.createAgentConversation(createAgentConversationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Creates a Conversation object to start an AI-driven conversation
     * based on a specific data model. Requires at least view access to the metadata object
     * specified in the request. #### Usage guidelines This API requires the
     * &#x60;metadata_identifier&#x60; parameter to define the context for the conversation. You can
     * also specify the tokens to initiate the conversation as shown in this example:
     * &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60; If the API request is
     * successful, ThoughtSpot returns the ID of the conversation. &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConversationTest() throws ApiException {
        CreateConversationRequest createConversationRequest = null;
        Conversation response = api.createConversation(createConversationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later Breaks down a user-submitted query into a series of analytical
     * sub-questions using relevant contextual metadata. To use this API, the user must have at
     * least view-level access to the referenced metadata objects. #### Usage guidelines To
     * accurately generate relevant questions, the request must include at least one of the
     * following metadata identifiers within &#x60;metadata_context&#x60; :
     * &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;,
     * &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;. You can further
     * enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60;
     * such as: - &#x60;content&#x60;: User provided content like text data, csv data as a string
     * message to provide context &amp; potentially improve the quality of the response. -
     * &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing
     * the query. Additional optional parameters include: - &#x60;limit_relevant_questions&#x60;:
     * Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. -
     * &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning
     * cached results. If the API request is successful, ThoughtSpot returns a list of relevant
     * analytical queries, each aligned with the user&#39;s original question. Each returned
     * question includes the query string, along with the identifier and name of the corresponding
     * data source. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes
     * may be introduced before the endpoint is made Generally Available. &gt; * This endpoint
     * requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRelevantQuestionsTest() throws ApiException {
        GetRelevantQuestionsRequest getRelevantQuestionsRequest = null;
        EurekaGetRelevantQuestionsResponse response =
                api.getRelevantQuestions(getRelevantQuestionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.7.0.cl or later
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryGetDecomposedQueryTest() throws ApiException {
        QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest = null;
        EurekaDecomposeQueryResponse response =
                api.queryGetDecomposedQuery(queryGetDecomposedQueryRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type Additionally, user can specify what tool can be included
     * &#x60;conversation_settings&#x60; parameter, which supports: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: false) -
     * &#x60;enable_natural_language_answer_generation&#x60; (default: true) -
     * &#x60;enable_reasoning&#x60; (default: false) If the request is valid, the API returns a
     * stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the
     * request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g.,
     * markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics -
     * &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for
     * operation being performed &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentMessageStreamingTest() throws ApiException {
        SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest = null;
        SendAgentMessageResponse response =
                api.sendAgentMessageStreaming(sendAgentMessageStreamingRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Allows sending a follow-up message to an ongoing conversation
     * within the context of the metadata model. Requires at least view access to the metadata
     * object specified in the request. #### Usage guidelines The API requires you to specify the
     * &#x60;conversation_identifier&#x60; in the request path, and a
     * &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body. If the
     * API request is successful, ThoughtSpot returns the session ID, tokens used in the
     * conversation, and visualization type. &gt; ###### Note: &gt; * This endpoint is currently in
     * Beta. Breaking changes may be introduced before the endpoint is made Generally Available.
     * &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter
     * on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String conversationIdentifier = null;
        SendMessageRequest sendMessageRequest = null;
        List<ResponseMessage> response =
                api.sendMessage(conversationIdentifier, sendMessageRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Processes a natural language query and returns an AI-generated
     * response based on a specified data model. Requires at least view access to the metadata
     * object specified in the request. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleAnswerTest() throws ApiException {
        SingleAnswerRequest singleAnswerRequest = null;
        ResponseMessage response = api.singleAnswer(singleAnswerRequest);
        // TODO: test validations
    }
}
