/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.Conversation;
import com.thoughtspot.client.model.CreateConversationRequest;
import com.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
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
     * Version: 10.4.0.cl or later Creates a new conversation session tied to a specific data model
     * for AI-driven natural language querying. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and
     * at least view access to the metadata object specified in the request. #### Usage guidelines
     * The request must include: - &#x60;metadata_identifier&#x60;: the unique ID of the data source
     * that provides context for the conversation Optionally, you can provide: - &#x60;tokens&#x60;:
     * a token string to set initial context for the conversation (e.g., &#x60;\&quot;[sales],[item
     * type],[state]\&quot;&#x60;) If the request is successful, ThoughtSpot returns a unique
     * &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendMessage&#x60; to
     * continue the conversation. #### Error responses | Code | Description | |------|-------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
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
     * Version: 10.7.0.cl or later **Deprecated** — Use &#x60;getRelevantQuestions&#x60; instead
     * (available from 10.13.0.cl). Breaks down a topical or goal-oriented natural language question
     * into smaller, actionable analytical sub-questions, each mapped to a relevant data source for
     * independent execution. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level
     * access to the referenced metadata objects. #### Usage guidelines The request accepts the
     * following parameters: - &#x60;nlsRequest&#x60;: contains the user &#x60;query&#x60; to
     * decompose, along with optional &#x60;instructions&#x60; and &#x60;bypassCache&#x60; flag -
     * &#x60;worksheetIds&#x60;: list of data source identifiers to scope the decomposition -
     * &#x60;answerIds&#x60;: list of Answer GUIDs whose data guides the response -
     * &#x60;liveboardIds&#x60;: list of Liveboard GUIDs whose data guides the response -
     * &#x60;conversationId&#x60;: an existing conversation session ID for context continuity -
     * &#x60;content&#x60;: supplementary text or CSV data to improve response quality -
     * &#x60;maxDecomposedQueries&#x60;: maximum number of sub-questions to return (default:
     * &#x60;5&#x60;) If the request is successful, the API returns a
     * &#x60;decomposedQueryResponse&#x60; containing a list of &#x60;decomposedQueries&#x60;, each
     * with: - &#x60;query&#x60;: the generated analytical sub-question - &#x60;worksheetId&#x60;:
     * the unique ID of the data source the question targets - &#x60;worksheetName&#x60;: the
     * display name of the corresponding data source #### Error responses | Code | Description |
     * |------|---------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view access to the referenced metadata objects. | &gt; ###### Note: &gt; * This
     * endpoint is deprecated since 10.13.0.cl. Use &#x60;getRelevantQuestions&#x60; for new
     * integrations. &gt; * This endpoint is currently in Beta. Breaking changes may be introduced
     * before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter —
     * please contact ThoughtSpot support to enable Spotter on your cluster.
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
     * Version: 10.4.0.cl or later Sends a follow-up message to an existing conversation within the
     * context of a data model. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view
     * access to the metadata object specified in the request. A conversation must first be created
     * using the &#x60;createConversation&#x60; API. #### Usage guidelines The request must include:
     * - &#x60;conversation_identifier&#x60;: the unique session ID returned by
     * &#x60;createConversation&#x60; - &#x60;metadata_identifier&#x60;: the unique ID of the data
     * source used for the conversation - &#x60;message&#x60;: a natural language string with the
     * follow-up question If the request is successful, the API returns an array of response
     * messages, each containing: - &#x60;session_identifier&#x60;: the unique ID of the generated
     * response - &#x60;generation_number&#x60;: the generation number of the response -
     * &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) -
     * &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;,
     * &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; /
     * &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the
     * response #### Error responses | Code | Description |
     * |------|-----------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
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
     * Version: 10.4.0.cl or later Processes a natural language query against a specified data model
     * and returns a single AI-generated answer without requiring a conversation session. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object
     * specified in the request. #### Usage guidelines The request must include: -
     * &#x60;query&#x60;: a natural language question (e.g., \&quot;What were total sales last
     * quarter?\&quot;) - &#x60;metadata_identifier&#x60;: the unique ID of the data source to query
     * against If the request is successful, the API returns a response message containing: -
     * &#x60;session_identifier&#x60;: the unique ID of the generated response -
     * &#x60;generation_number&#x60;: the generation number of the response -
     * &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) -
     * &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;,
     * &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; /
     * &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the
     * response #### Error responses | Code | Description |
     * |------|-----------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
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
