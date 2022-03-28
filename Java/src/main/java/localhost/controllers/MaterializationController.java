/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
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
import localhost.models.TspublicRestV2MaterializationRefreshviewRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MaterializationController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public MaterializationController(Configuration config, HttpClient httpClient,
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
    public MaterializationController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Use this endpoint to refresh data in the materialized view by running the query associated
     * with it.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object refreshMaterializedView(
            final TspublicRestV2MaterializationRefreshviewRequest body) throws ApiException, IOException {
        HttpRequest request = buildRefreshMaterializedViewRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRefreshMaterializedViewResponse(context);
    }

    /**
     * Use this endpoint to refresh data in the materialized view by running the query associated
     * with it.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> refreshMaterializedViewAsync(
            final TspublicRestV2MaterializationRefreshviewRequest body) {
        return makeHttpCallAsync(() -> buildRefreshMaterializedViewRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRefreshMaterializedViewResponse(context));
    }

    /**
     * Builds the HttpRequest object for refreshMaterializedView.
     */
    private HttpRequest buildRefreshMaterializedViewRequest(
            final TspublicRestV2MaterializationRefreshviewRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/materialization/refreshview");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for refreshMaterializedView.
     * @return An object of type Object
     */
    private Object handleRefreshMaterializedViewResponse(
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
        Object result = responseBody;

        return result;
    }

}