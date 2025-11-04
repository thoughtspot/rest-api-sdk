/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CalendarResponse;
import com.thoughtspot.client.model.CreateCalendarRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.GenerateCSVRequest;
import com.thoughtspot.client.model.SearchCalendarsRequest;
import com.thoughtspot.client.model.UpdateCalendarRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomCalendarsApi
 */
@Disabled
public class CustomCalendarsApiTest {

    private final CustomCalendarsApi api = new CustomCalendarsApi();

    /**
     *   Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - &#x60;FROM_EXISTING_TABLE&#x60; - Creates calendar from the table reference provided in the API request.  - &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60; attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is not.   Similarly, connectors such as ClickHouse require you to specify the &#x60;database_name&#x60; and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the &#x60;month_offset&#x60; value is set as &#x60;April&#x60;, the calendar year begins in April.  * &#x60;4-4-5&#x60;. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  &#x60;&#x60;&#x60; {   \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,     \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;,     \&quot;database_name\&quot;: \&quot;RETAILAPPAREL\&quot;,     \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot;   },   \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60;  To create a calendar from scratch:  &#x60;&#x60;&#x60; {   \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,     \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;,     \&quot;database_name\&quot;: \&quot;RETAILAPPAREL\&quot;,     \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot;   },   \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;,   \&quot;calendar_type\&quot;: \&quot;MONTH_OFFSET\&quot;,   \&quot;month_offset\&quot;: \&quot;April\&quot;,   \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,   \&quot;quarter_name_prefix\&quot;: \&quot;Q\&quot;,   \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;,   \&quot;start_date\&quot;: \&quot;04/01/2025\&quot;,   \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; } &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCalendarTest() throws ApiException {
        CreateCalendarRequest createCalendarRequest = null;
        CalendarResponse response = api.createCalendar(createCalendarRequest);
        // TODO: test validations
    }

    /**
     *   Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCalendarTest() throws ApiException {
        String calendarIdentifier = null;
        api.deleteCalendar(calendarIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the month defined in the &#x60;month_offset&#x60; attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateCSVTest() throws ApiException {
        GenerateCSVRequest generateCSVRequest = null;
        Object response = api.generateCSV(generateCSVRequest);
        // TODO: test validations
    }

    /**
     *   Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters.  The &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCalendarsTest() throws ApiException {
        SearchCalendarsRequest searchCalendarsRequest = null;
        List<CalendarResponse> response = api.searchCalendars(searchCalendarsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60; Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60; attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is not.   Similarly, connectors such as ClickHouse require you to specify the &#x60;database_name&#x60; and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  &#x60;&#x60;&#x60; {   \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;,     \&quot;database_name\&quot;: \&quot;db1\&quot;,     \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,     \&quot;schame_name\&quot;: \&quot;schemaVar\&quot;   } } &#x60;&#x60;&#x60;  Update a custom calendar with the attributes defined in the API request:  &#x60;&#x60;&#x60; {   \&quot;update_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;,     \&quot;database_name\&quot;: \&quot;db1\&quot;,     \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,     \&quot;schame_name\&quot;: \&quot;schemaVar\&quot;   },   \&quot;month_offset\&quot;: \&quot;August\&quot;,   \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,   \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;,   \&quot;end_date\&quot;: \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCalendarTest() throws ApiException {
        String calendarIdentifier = null;
        UpdateCalendarRequest updateCalendarRequest = null;
        api.updateCalendar(calendarIdentifier, updateCalendarRequest);
        // TODO: test validations
    }

}
