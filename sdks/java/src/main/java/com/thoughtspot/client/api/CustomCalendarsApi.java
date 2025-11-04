/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.google.gson.reflect.TypeToken;
import com.thoughtspot.client.ApiCallback;
import com.thoughtspot.client.ApiClient;
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.ApiResponse;
import com.thoughtspot.client.Configuration;
import com.thoughtspot.client.Pair;
import com.thoughtspot.client.model.CalendarResponse;
import com.thoughtspot.client.model.CreateCalendarRequest;
import com.thoughtspot.client.model.GenerateCSVRequest;
import com.thoughtspot.client.model.SearchCalendarsRequest;
import com.thoughtspot.client.model.UpdateCalendarRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CustomCalendarsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomCalendarsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomCalendarsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public CustomCalendarsApi(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        this.localVarApiClient = new ApiClient(apiClientConfiguration);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClientConfiguration getApiClientConfiguration() {
        return localVarApiClientConfiguration;
    }

    public void applyApiClientConfiguration(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        if (localVarApiClient != null) {
            localVarApiClient.applyApiClientConfiguration(apiClientConfiguration);
        } else {
            localVarApiClient = new ApiClient(apiClientConfiguration);
        }
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createCalendar
     *
     * @param createCalendarRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCalendarCall(
            CreateCalendarRequest createCalendarRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createCalendarRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/calendars/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCalendarValidateBeforeCall(
            CreateCalendarRequest createCalendarRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createCalendarRequest' is set
        if (createCalendarRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createCalendarRequest' when calling"
                            + " createCalendar(Async)");
        }

        return createCalendarCall(createCalendarRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Creates a new [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can create a custom calendar from scratch or
     * an existing Table in ThoughtSpot. For both methods of calendar creation, the following
     * parameters are required: * Name of the custom calendar. * Calendar creation method. To create
     * a calendar from an existing table, specify the method: - &#x60;FROM_EXISTING_TABLE&#x60; -
     * Creates calendar from the table reference provided in the API request. -
     * &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API
     * request. * Connection ID and Table name * Database and schema name attributes: For most Cloud
     * Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60;
     * attributes are required. However, the attribute requirements are conditional and vary based
     * on the connector type and its metadata structure. For example, for connectors such as
     * Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL,
     * the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is
     * not. Similarly, connectors such as ClickHouse require you to specify the
     * &#x60;database_name&#x60; and the schema specification in such cases is optional. **NOTE**:
     * If you are creating a calendar from an existing table, ensure that the referenced table
     * matches the required DDL for custom calendars. If the schema does not match, the API returns
     * an error. ##### Calendar type The API allows you to create the following types of calendars:
     * * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is
     * offset by a few months from the standard calendar months (January to December) and the year
     * begins with the month defined in the request. For example, if the &#x60;month_offset&#x60;
     * value is set as &#x60;April&#x60;, the calendar year begins in April. * &#x60;4-4-5&#x60;.
     * Each quarter in the calendar will include two 4-week months followed by one 5-week month. *
     * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week
     * month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two
     * 4-week months. To start and end the calendar on a specific date, specify the dates in the
     * &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the
     * &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.
     * You can also set the starting day of the week and customize the prefixes for year and quarter
     * labels. #### Examples To create a calendar from an existing table: &#x60;&#x60;&#x60; {
     * \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60; To
     * create a calendar from scratch: &#x60;&#x60;&#x60; { \&quot;name\&quot;:
     * \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;calendar_type\&quot;:
     * \&quot;MONTH_OFFSET\&quot;, \&quot;month_offset\&quot;: \&quot;April\&quot;,
     * \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;, \&quot;quarter_name_prefix\&quot;:
     * \&quot;Q\&quot;, \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;, \&quot;start_date\&quot;:
     * \&quot;04/01/2025\&quot;, \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; }
     * &#x60;&#x60;&#x60;
     *
     * @param createCalendarRequest (required)
     * @return CalendarResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public CalendarResponse createCalendar(CreateCalendarRequest createCalendarRequest)
            throws ApiException {
        ApiResponse<CalendarResponse> localVarResp =
                createCalendarWithHttpInfo(createCalendarRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.12.0.cl or later Creates a new [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can create a custom calendar from scratch or
     * an existing Table in ThoughtSpot. For both methods of calendar creation, the following
     * parameters are required: * Name of the custom calendar. * Calendar creation method. To create
     * a calendar from an existing table, specify the method: - &#x60;FROM_EXISTING_TABLE&#x60; -
     * Creates calendar from the table reference provided in the API request. -
     * &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API
     * request. * Connection ID and Table name * Database and schema name attributes: For most Cloud
     * Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60;
     * attributes are required. However, the attribute requirements are conditional and vary based
     * on the connector type and its metadata structure. For example, for connectors such as
     * Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL,
     * the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is
     * not. Similarly, connectors such as ClickHouse require you to specify the
     * &#x60;database_name&#x60; and the schema specification in such cases is optional. **NOTE**:
     * If you are creating a calendar from an existing table, ensure that the referenced table
     * matches the required DDL for custom calendars. If the schema does not match, the API returns
     * an error. ##### Calendar type The API allows you to create the following types of calendars:
     * * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is
     * offset by a few months from the standard calendar months (January to December) and the year
     * begins with the month defined in the request. For example, if the &#x60;month_offset&#x60;
     * value is set as &#x60;April&#x60;, the calendar year begins in April. * &#x60;4-4-5&#x60;.
     * Each quarter in the calendar will include two 4-week months followed by one 5-week month. *
     * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week
     * month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two
     * 4-week months. To start and end the calendar on a specific date, specify the dates in the
     * &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the
     * &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.
     * You can also set the starting day of the week and customize the prefixes for year and quarter
     * labels. #### Examples To create a calendar from an existing table: &#x60;&#x60;&#x60; {
     * \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60; To
     * create a calendar from scratch: &#x60;&#x60;&#x60; { \&quot;name\&quot;:
     * \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;calendar_type\&quot;:
     * \&quot;MONTH_OFFSET\&quot;, \&quot;month_offset\&quot;: \&quot;April\&quot;,
     * \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;, \&quot;quarter_name_prefix\&quot;:
     * \&quot;Q\&quot;, \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;, \&quot;start_date\&quot;:
     * \&quot;04/01/2025\&quot;, \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; }
     * &#x60;&#x60;&#x60;
     *
     * @param createCalendarRequest (required)
     * @return ApiResponse&lt;CalendarResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CalendarResponse> createCalendarWithHttpInfo(
            CreateCalendarRequest createCalendarRequest) throws ApiException {
        okhttp3.Call localVarCall = createCalendarValidateBeforeCall(createCalendarRequest, null);
        Type localVarReturnType = new TypeToken<CalendarResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Creates a new [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can create a custom calendar from scratch or
     * an existing Table in ThoughtSpot. For both methods of calendar creation, the following
     * parameters are required: * Name of the custom calendar. * Calendar creation method. To create
     * a calendar from an existing table, specify the method: - &#x60;FROM_EXISTING_TABLE&#x60; -
     * Creates calendar from the table reference provided in the API request. -
     * &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API
     * request. * Connection ID and Table name * Database and schema name attributes: For most Cloud
     * Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60;
     * attributes are required. However, the attribute requirements are conditional and vary based
     * on the connector type and its metadata structure. For example, for connectors such as
     * Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL,
     * the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is
     * not. Similarly, connectors such as ClickHouse require you to specify the
     * &#x60;database_name&#x60; and the schema specification in such cases is optional. **NOTE**:
     * If you are creating a calendar from an existing table, ensure that the referenced table
     * matches the required DDL for custom calendars. If the schema does not match, the API returns
     * an error. ##### Calendar type The API allows you to create the following types of calendars:
     * * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is
     * offset by a few months from the standard calendar months (January to December) and the year
     * begins with the month defined in the request. For example, if the &#x60;month_offset&#x60;
     * value is set as &#x60;April&#x60;, the calendar year begins in April. * &#x60;4-4-5&#x60;.
     * Each quarter in the calendar will include two 4-week months followed by one 5-week month. *
     * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week
     * month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two
     * 4-week months. To start and end the calendar on a specific date, specify the dates in the
     * &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the
     * &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.
     * You can also set the starting day of the week and customize the prefixes for year and quarter
     * labels. #### Examples To create a calendar from an existing table: &#x60;&#x60;&#x60; {
     * \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60; To
     * create a calendar from scratch: &#x60;&#x60;&#x60; { \&quot;name\&quot;:
     * \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;calendar_type\&quot;:
     * \&quot;MONTH_OFFSET\&quot;, \&quot;month_offset\&quot;: \&quot;April\&quot;,
     * \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;, \&quot;quarter_name_prefix\&quot;:
     * \&quot;Q\&quot;, \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;, \&quot;start_date\&quot;:
     * \&quot;04/01/2025\&quot;, \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; }
     * &#x60;&#x60;&#x60;
     *
     * @param createCalendarRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCalendarAsync(
            CreateCalendarRequest createCalendarRequest,
            final ApiCallback<CalendarResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createCalendarValidateBeforeCall(createCalendarRequest, _callback);
        Type localVarReturnType = new TypeToken<CalendarResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCalendar
     *
     * @param calendarIdentifier Unique ID or name of the Calendar. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCalendarCall(String calendarIdentifier, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/calendars/{calendar_identifier}/delete"
                        .replace(
                                "{" + "calendar_identifier" + "}",
                                localVarApiClient.escapeString(calendarIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCalendarValidateBeforeCall(
            String calendarIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'calendarIdentifier' is set
        if (calendarIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'calendarIdentifier' when calling"
                            + " deleteCalendar(Async)");
        }

        return deleteCalendarCall(calendarIdentifier, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Deletes a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines To delete a custom calendar, specify the
     * calendar ID as a path parameter in the request URL.
     *
     * @param calendarIdentifier Unique ID or name of the Calendar. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteCalendar(String calendarIdentifier) throws ApiException {
        deleteCalendarWithHttpInfo(calendarIdentifier);
    }

    /**
     * Version: 10.12.0.cl or later Deletes a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines To delete a custom calendar, specify the
     * calendar ID as a path parameter in the request URL.
     *
     * @param calendarIdentifier Unique ID or name of the Calendar. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteCalendarWithHttpInfo(String calendarIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall = deleteCalendarValidateBeforeCall(calendarIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Deletes a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines To delete a custom calendar, specify the
     * calendar ID as a path parameter in the request URL.
     *
     * @param calendarIdentifier Unique ID or name of the Calendar. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCalendarAsync(
            String calendarIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCalendarValidateBeforeCall(calendarIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateCSV
     *
     * @param generateCSVRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Generate custom calendar data based on specifications, as a CSV file. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call generateCSVCall(
            GenerateCSVRequest generateCSVRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = generateCSVRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/calendars/generate-csv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateCSVValidateBeforeCall(
            GenerateCSVRequest generateCSVRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'generateCSVRequest' is set
        if (generateCSVRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'generateCSVRequest' when calling"
                            + " generateCSV(Async)");
        }

        return generateCSVCall(generateCSVRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Exports a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines Use this API to download a custom calendar in
     * the CSV file format. In your API request, specify the following parameters. * Start and end
     * date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the
     * month defined in the &#x60;month_offset&#x60; attribute. You can also specify optional
     * parameters such as the starting day of the week and prefixes for the quarter and year labels.
     *
     * @param generateCSVRequest (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Generate custom calendar data based on specifications, as a CSV file. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object generateCSV(GenerateCSVRequest generateCSVRequest) throws ApiException {
        ApiResponse<Object> localVarResp = generateCSVWithHttpInfo(generateCSVRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.12.0.cl or later Exports a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines Use this API to download a custom calendar in
     * the CSV file format. In your API request, specify the following parameters. * Start and end
     * date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the
     * month defined in the &#x60;month_offset&#x60; attribute. You can also specify optional
     * parameters such as the starting day of the week and prefixes for the quarter and year labels.
     *
     * @param generateCSVRequest (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Generate custom calendar data based on specifications, as a CSV file. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> generateCSVWithHttpInfo(GenerateCSVRequest generateCSVRequest)
            throws ApiException {
        okhttp3.Call localVarCall = generateCSVValidateBeforeCall(generateCSVRequest, null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Exports a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines Use this API to download a custom calendar in
     * the CSV file format. In your API request, specify the following parameters. * Start and end
     * date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the
     * month defined in the &#x60;month_offset&#x60; attribute. You can also specify optional
     * parameters such as the starting day of the week and prefixes for the quarter and year labels.
     *
     * @param generateCSVRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Generate custom calendar data based on specifications, as a CSV file. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call generateCSVAsync(
            GenerateCSVRequest generateCSVRequest, final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = generateCSVValidateBeforeCall(generateCSVRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchCalendars
     *
     * @param searchCalendarsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCalendarsCall(
            SearchCalendarsRequest searchCalendarsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchCalendarsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/calendars/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchCalendarsValidateBeforeCall(
            SearchCalendarsRequest searchCalendarsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchCalendarsRequest' is set
        if (searchCalendarsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchCalendarsRequest' when calling"
                            + " searchCalendars(Async)");
        }

        return searchCalendarsCall(searchCalendarsRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Gets a list of [custom
     * calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines By default, the API returns a list of custom
     * calendars for all connection objects. To retrieve custom calendar details for a particular
     * connection, specify the connection ID. You can also use other search parameters such as
     * &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters. The
     * &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the
     * specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.
     *
     * @param searchCalendarsRequest (required)
     * @return List&lt;CalendarResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<CalendarResponse> searchCalendars(SearchCalendarsRequest searchCalendarsRequest)
            throws ApiException {
        ApiResponse<List<CalendarResponse>> localVarResp =
                searchCalendarsWithHttpInfo(searchCalendarsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.12.0.cl or later Gets a list of [custom
     * calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines By default, the API returns a list of custom
     * calendars for all connection objects. To retrieve custom calendar details for a particular
     * connection, specify the connection ID. You can also use other search parameters such as
     * &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters. The
     * &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the
     * specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.
     *
     * @param searchCalendarsRequest (required)
     * @return ApiResponse&lt;List&lt;CalendarResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<CalendarResponse>> searchCalendarsWithHttpInfo(
            SearchCalendarsRequest searchCalendarsRequest) throws ApiException {
        okhttp3.Call localVarCall = searchCalendarsValidateBeforeCall(searchCalendarsRequest, null);
        Type localVarReturnType = new TypeToken<List<CalendarResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Gets a list of [custom
     * calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines By default, the API returns a list of custom
     * calendars for all connection objects. To retrieve custom calendar details for a particular
     * connection, specify the connection ID. You can also use other search parameters such as
     * &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters. The
     * &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the
     * specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.
     *
     * @param searchCalendarsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom calendar fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCalendarsAsync(
            SearchCalendarsRequest searchCalendarsRequest,
            final ApiCallback<List<CalendarResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchCalendarsValidateBeforeCall(searchCalendarsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<CalendarResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCalendar
     *
     * @param calendarIdentifier Unique Id or name of the calendar. (required)
     * @param updateCalendarRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCalendarCall(
            String calendarIdentifier,
            UpdateCalendarRequest updateCalendarRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateCalendarRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/calendars/{calendar_identifier}/update"
                        .replace(
                                "{" + "calendar_identifier" + "}",
                                localVarApiClient.escapeString(calendarIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateCalendarValidateBeforeCall(
            String calendarIdentifier,
            UpdateCalendarRequest updateCalendarRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'calendarIdentifier' is set
        if (calendarIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'calendarIdentifier' when calling"
                            + " updateCalendar(Async)");
        }

        // verify the required parameter 'updateCalendarRequest' is set
        if (updateCalendarRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateCalendarRequest' when calling"
                            + " updateCalendar(Async)");
        }

        return updateCalendarCall(calendarIdentifier, updateCalendarRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Updates the properties of a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can update the properties of a calendar
     * using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar
     * properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60;
     * Creates a calendar from the parameters defined in the API request. To update a custom
     * calendar, specify the calendar ID as a path parameter in the request URL and the following
     * parameters in the request body: * Connection ID and Table name * Database and schema name
     * attributes: For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60;
     * and &#x60;schema_name&#x60; attributes are required. However, the attribute requirements are
     * conditional and vary based on the connector type and its metadata structure. For example, for
     * connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL,
     * Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the
     * &#x60;database_name&#x60; attribute is not. Similarly, connectors such as ClickHouse require
     * you to specify the &#x60;database_name&#x60; and the schema specification in such cases is
     * optional. The API allows you to modify the calendar type, month offset value, start and end
     * date, starting day of the week, and prefixes assigned to the year and quarter labels. ####
     * Examples Update a custom calendar using an existing Table in ThoughtSpot: &#x60;&#x60;&#x60;
     * { \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,
     * \&quot;table_reference\&quot;: { \&quot;connection_identifier\&quot;:
     * \&quot;Connection1\&quot;, \&quot;database_name\&quot;: \&quot;db1\&quot;,
     * \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;, \&quot;schame_name\&quot;:
     * \&quot;schemaVar\&quot; } } &#x60;&#x60;&#x60; Update a custom calendar with the attributes
     * defined in the API request: &#x60;&#x60;&#x60; { \&quot;update_method\&quot;:
     * \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;, \&quot;database_name\&quot;:
     * \&quot;db1\&quot;, \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,
     * \&quot;schame_name\&quot;: \&quot;schemaVar\&quot; }, \&quot;month_offset\&quot;:
     * \&quot;August\&quot;, \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,
     * \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;, \&quot;end_date\&quot;:
     * \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;
     *
     * @param calendarIdentifier Unique Id or name of the calendar. (required)
     * @param updateCalendarRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateCalendar(
            String calendarIdentifier, UpdateCalendarRequest updateCalendarRequest)
            throws ApiException {
        updateCalendarWithHttpInfo(calendarIdentifier, updateCalendarRequest);
    }

    /**
     * Version: 10.12.0.cl or later Updates the properties of a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can update the properties of a calendar
     * using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar
     * properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60;
     * Creates a calendar from the parameters defined in the API request. To update a custom
     * calendar, specify the calendar ID as a path parameter in the request URL and the following
     * parameters in the request body: * Connection ID and Table name * Database and schema name
     * attributes: For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60;
     * and &#x60;schema_name&#x60; attributes are required. However, the attribute requirements are
     * conditional and vary based on the connector type and its metadata structure. For example, for
     * connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL,
     * Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the
     * &#x60;database_name&#x60; attribute is not. Similarly, connectors such as ClickHouse require
     * you to specify the &#x60;database_name&#x60; and the schema specification in such cases is
     * optional. The API allows you to modify the calendar type, month offset value, start and end
     * date, starting day of the week, and prefixes assigned to the year and quarter labels. ####
     * Examples Update a custom calendar using an existing Table in ThoughtSpot: &#x60;&#x60;&#x60;
     * { \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,
     * \&quot;table_reference\&quot;: { \&quot;connection_identifier\&quot;:
     * \&quot;Connection1\&quot;, \&quot;database_name\&quot;: \&quot;db1\&quot;,
     * \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;, \&quot;schame_name\&quot;:
     * \&quot;schemaVar\&quot; } } &#x60;&#x60;&#x60; Update a custom calendar with the attributes
     * defined in the API request: &#x60;&#x60;&#x60; { \&quot;update_method\&quot;:
     * \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;, \&quot;database_name\&quot;:
     * \&quot;db1\&quot;, \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,
     * \&quot;schame_name\&quot;: \&quot;schemaVar\&quot; }, \&quot;month_offset\&quot;:
     * \&quot;August\&quot;, \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,
     * \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;, \&quot;end_date\&quot;:
     * \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;
     *
     * @param calendarIdentifier Unique Id or name of the calendar. (required)
     * @param updateCalendarRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateCalendarWithHttpInfo(
            String calendarIdentifier, UpdateCalendarRequest updateCalendarRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateCalendarValidateBeforeCall(calendarIdentifier, updateCalendarRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Updates the properties of a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can update the properties of a calendar
     * using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar
     * properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60;
     * Creates a calendar from the parameters defined in the API request. To update a custom
     * calendar, specify the calendar ID as a path parameter in the request URL and the following
     * parameters in the request body: * Connection ID and Table name * Database and schema name
     * attributes: For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60;
     * and &#x60;schema_name&#x60; attributes are required. However, the attribute requirements are
     * conditional and vary based on the connector type and its metadata structure. For example, for
     * connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL,
     * Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the
     * &#x60;database_name&#x60; attribute is not. Similarly, connectors such as ClickHouse require
     * you to specify the &#x60;database_name&#x60; and the schema specification in such cases is
     * optional. The API allows you to modify the calendar type, month offset value, start and end
     * date, starting day of the week, and prefixes assigned to the year and quarter labels. ####
     * Examples Update a custom calendar using an existing Table in ThoughtSpot: &#x60;&#x60;&#x60;
     * { \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,
     * \&quot;table_reference\&quot;: { \&quot;connection_identifier\&quot;:
     * \&quot;Connection1\&quot;, \&quot;database_name\&quot;: \&quot;db1\&quot;,
     * \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;, \&quot;schame_name\&quot;:
     * \&quot;schemaVar\&quot; } } &#x60;&#x60;&#x60; Update a custom calendar with the attributes
     * defined in the API request: &#x60;&#x60;&#x60; { \&quot;update_method\&quot;:
     * \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;, \&quot;database_name\&quot;:
     * \&quot;db1\&quot;, \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,
     * \&quot;schame_name\&quot;: \&quot;schemaVar\&quot; }, \&quot;month_offset\&quot;:
     * \&quot;August\&quot;, \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,
     * \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;, \&quot;end_date\&quot;:
     * \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;
     *
     * @param calendarIdentifier Unique Id or name of the calendar. (required)
     * @param updateCalendarRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom calendar updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCalendarAsync(
            String calendarIdentifier,
            UpdateCalendarRequest updateCalendarRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateCalendarValidateBeforeCall(
                        calendarIdentifier, updateCalendarRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
