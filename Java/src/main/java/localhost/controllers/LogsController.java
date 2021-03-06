/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost.ApiHelper;
import localhost.AuthManager;
import localhost.Configuration;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.Headers;
import localhost.http.client.HttpCallback;
import localhost.http.client.HttpClient;
import localhost.http.client.HttpContext;
import localhost.http.request.HttpRequest;
import localhost.http.response.HttpResponse;
import localhost.http.response.HttpStringResponse;
import localhost.models.GetLogEventsTopicEnum;
import localhost.models.LogsResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class LogsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public LogsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public LogsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Note: This endpoint is applicable only for SAAS deployments. The ThoughtSpot log streaming
     * service API allows you to programmatically get a security audit event log from the
     * ThoughtSpot system. ThoughtSpot cloud deployments allow you to collect security audit events
     * and send them to your Security information and event management (SIEM) application in
     * real-time. These events can help your security operations personnel to detect potential
     * security threats or compromised user accounts in your organization. Permission: Requires
     * administration privilege.
     * @param  topic  Required parameter: Type of the log.
     * @param  fromEpoch  Optional parameter: The EPOCH time in milliseconds to set the start time
     *         for streaming logs. Example: To set the timestamp as June 1, 2021 8 am, specify
     *         1622534400000.
     * @param  toEpoch  Optional parameter: The EPOCH time in milliseconds to set the end time for
     *         streaming logs. Example: To set the timestamp as July 1, 2021, 8 am, specify
     *         1625126400000.
     * @return    Returns the LogsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LogsResponse getLogEvents(
            final GetLogEventsTopicEnum topic,
            final String fromEpoch,
            final String toEpoch) throws ApiException, IOException {
        HttpRequest request = buildGetLogEventsRequest(topic, fromEpoch, toEpoch);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetLogEventsResponse(context);
    }

    /**
     * Note: This endpoint is applicable only for SAAS deployments. The ThoughtSpot log streaming
     * service API allows you to programmatically get a security audit event log from the
     * ThoughtSpot system. ThoughtSpot cloud deployments allow you to collect security audit events
     * and send them to your Security information and event management (SIEM) application in
     * real-time. These events can help your security operations personnel to detect potential
     * security threats or compromised user accounts in your organization. Permission: Requires
     * administration privilege.
     * @param  topic  Required parameter: Type of the log.
     * @param  fromEpoch  Optional parameter: The EPOCH time in milliseconds to set the start time
     *         for streaming logs. Example: To set the timestamp as June 1, 2021 8 am, specify
     *         1622534400000.
     * @param  toEpoch  Optional parameter: The EPOCH time in milliseconds to set the end time for
     *         streaming logs. Example: To set the timestamp as July 1, 2021, 8 am, specify
     *         1625126400000.
     * @return    Returns the LogsResponse response from the API call
     */
    public CompletableFuture<LogsResponse> getLogEventsAsync(
            final GetLogEventsTopicEnum topic,
            final String fromEpoch,
            final String toEpoch) {
        return makeHttpCallAsync(() -> buildGetLogEventsRequest(topic, fromEpoch, toEpoch),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetLogEventsResponse(context));
    }

    /**
     * Builds the HttpRequest object for getLogEvents.
     */
    private HttpRequest buildGetLogEventsRequest(
            final GetLogEventsTopicEnum topic,
            final String fromEpoch,
            final String toEpoch) {
        //validating required parameters
        if (null == topic) {
            throw new NullPointerException("The parameter \"topic\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/logs/events");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("topic",
                (topic != null) ? topic.value() : "security_logs");
        queryParameters.put("fromEpoch", fromEpoch);
        queryParameters.put("toEpoch", toEpoch);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getLogEvents.
     * @return An object of type LogsResponse
     */
    private LogsResponse handleGetLogEventsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        LogsResponse result = ApiHelper.deserialize(responseBody,
                LogsResponse.class);

        return result;
    }

}