/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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
import localhost.models.AnswerQueryResponse;
import localhost.models.LiveboardQueryResponse;
import localhost.models.TspublicRestV2DataAnswerRequest;
import localhost.models.TspublicRestV2DataLiveboardRequest;
import localhost.models.TspublicRestV2DataSearchRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DataController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DataController(Configuration config, HttpClient httpClient,
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
    public DataController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * To programmatically retrieve data from ThoughtSpot using search query string, use this
     * endpoint Permission: Requires at least view access to the dataobject and datadownloading
     * privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object searchQueryData(
            final TspublicRestV2DataSearchRequest body) throws ApiException, IOException {
        HttpRequest request = buildSearchQueryDataRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchQueryDataResponse(context);
    }

    /**
     * To programmatically retrieve data from ThoughtSpot using search query string, use this
     * endpoint Permission: Requires at least view access to the dataobject and datadownloading
     * privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> searchQueryDataAsync(
            final TspublicRestV2DataSearchRequest body) {
        return makeHttpCallAsync(() -> buildSearchQueryDataRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleSearchQueryDataResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchQueryData.
     */
    private HttpRequest buildSearchQueryDataRequest(
            final TspublicRestV2DataSearchRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/data/search");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for searchQueryData.
     * @return An object of type Object
     */
    private Object handleSearchQueryDataResponse(
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

    /**
     * To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.
     * Permission: Requires at least view access to the object and datadownloading privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object answerData(
            final TspublicRestV2DataAnswerRequest body) throws ApiException, IOException {
        HttpRequest request = buildAnswerDataRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAnswerDataResponse(context);
    }

    /**
     * To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.
     * Permission: Requires at least view access to the object and datadownloading privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> answerDataAsync(
            final TspublicRestV2DataAnswerRequest body) {
        return makeHttpCallAsync(() -> buildAnswerDataRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleAnswerDataResponse(context));
    }

    /**
     * Builds the HttpRequest object for answerData.
     */
    private HttpRequest buildAnswerDataRequest(
            final TspublicRestV2DataAnswerRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/data/answer");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for answerData.
     * @return An object of type Object
     */
    private Object handleAnswerDataResponse(
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

    /**
     * To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can
     * use this endpoint Permission: Requires at least view access to the object and datadownloading
     * privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object liveboardData(
            final TspublicRestV2DataLiveboardRequest body) throws ApiException, IOException {
        HttpRequest request = buildLiveboardDataRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLiveboardDataResponse(context);
    }

    /**
     * To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can
     * use this endpoint Permission: Requires at least view access to the object and datadownloading
     * privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> liveboardDataAsync(
            final TspublicRestV2DataLiveboardRequest body) {
        return makeHttpCallAsync(() -> buildLiveboardDataRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleLiveboardDataResponse(context));
    }

    /**
     * Builds the HttpRequest object for liveboardData.
     */
    private HttpRequest buildLiveboardDataRequest(
            final TspublicRestV2DataLiveboardRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/data/liveboard");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for liveboardData.
     * @return An object of type Object
     */
    private Object handleLiveboardDataResponse(
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

    /**
     * To retrieve the query SQL related to an Answer that is run on the data platform, you can use
     * this endpoint. Permission: Requires at least view access to the object.
     * @param  id  Required parameter: The GUID of the Answer
     * @return    Returns the AnswerQueryResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AnswerQueryResponse answerQuerySql(
            final String id) throws ApiException, IOException {
        HttpRequest request = buildAnswerQuerySqlRequest(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAnswerQuerySqlResponse(context);
    }

    /**
     * To retrieve the query SQL related to an Answer that is run on the data platform, you can use
     * this endpoint. Permission: Requires at least view access to the object.
     * @param  id  Required parameter: The GUID of the Answer
     * @return    Returns the AnswerQueryResponse response from the API call
     */
    public CompletableFuture<AnswerQueryResponse> answerQuerySqlAsync(
            final String id) {
        return makeHttpCallAsync(() -> buildAnswerQuerySqlRequest(id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleAnswerQuerySqlResponse(context));
    }

    /**
     * Builds the HttpRequest object for answerQuerySql.
     */
    private HttpRequest buildAnswerQuerySqlRequest(
            final String id) {
        //validating required parameters
        if (null == id) {
            throw new NullPointerException("The parameter \"id\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/data/answer/querysql");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("id", id);

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
     * Processes the response for answerQuerySql.
     * @return An object of type AnswerQueryResponse
     */
    private AnswerQueryResponse handleAnswerQuerySqlResponse(
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
        AnswerQueryResponse result = ApiHelper.deserialize(responseBody,
                AnswerQueryResponse.class);

        return result;
    }

    /**
     * To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data
     * platform, you can use this endpoint. Permission: Requires at least view access to the object.
     * @param  id  Required parameter: The GUID of the Liveboard
     * @param  vizId  Optional parameter: A JSON array of GUIDs of the visualizations in the
     *         Liveboard.
     * @return    Returns the LiveboardQueryResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LiveboardQueryResponse liveboardQuerySql(
            final String id,
            final List<String> vizId) throws ApiException, IOException {
        HttpRequest request = buildLiveboardQuerySqlRequest(id, vizId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLiveboardQuerySqlResponse(context);
    }

    /**
     * To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data
     * platform, you can use this endpoint. Permission: Requires at least view access to the object.
     * @param  id  Required parameter: The GUID of the Liveboard
     * @param  vizId  Optional parameter: A JSON array of GUIDs of the visualizations in the
     *         Liveboard.
     * @return    Returns the LiveboardQueryResponse response from the API call
     */
    public CompletableFuture<LiveboardQueryResponse> liveboardQuerySqlAsync(
            final String id,
            final List<String> vizId) {
        return makeHttpCallAsync(() -> buildLiveboardQuerySqlRequest(id, vizId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleLiveboardQuerySqlResponse(context));
    }

    /**
     * Builds the HttpRequest object for liveboardQuerySql.
     */
    private HttpRequest buildLiveboardQuerySqlRequest(
            final String id,
            final List<String> vizId) {
        //validating required parameters
        if (null == id) {
            throw new NullPointerException("The parameter \"id\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/data/liveboard/querysql");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("id", id);
        queryParameters.put("vizId", vizId);

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
     * Processes the response for liveboardQuerySql.
     * @return An object of type LiveboardQueryResponse
     */
    private LiveboardQueryResponse handleLiveboardQuerySqlResponse(
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
        LiveboardQueryResponse result = ApiHelper.deserialize(responseBody,
                LiveboardQueryResponse.class);

        return result;
    }

}