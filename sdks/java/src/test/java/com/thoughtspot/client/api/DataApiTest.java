/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AnswerDataResponse;
import com.thoughtspot.client.model.FetchAnswerDataRequest;
import com.thoughtspot.client.model.FetchLiveboardDataRequest;
import com.thoughtspot.client.model.LiveboardDataResponse;
import com.thoughtspot.client.model.SearchDataRequest;
import com.thoughtspot.client.model.SearchDataResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for DataApi */
@Disabled
public class DataApiTest {

    private final DataApi api = new DataApi();

    /**
     * Version: 9.0.0.cl or later Fetches data from a saved Answer. Requires at least view access to
     * the saved Answer. The &#x60;record_size&#x60; attribute determines the number of records to
     * retrieve in an API call. For more information about pagination, record size, and maximum row
     * limit, see [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchAnswerDataTest() throws ApiException {
        FetchAnswerDataRequest fetchAnswerDataRequest = null;
        AnswerDataResponse response = api.fetchAnswerData(fetchAnswerDataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets data from a Liveboard object and its visualization. Requires
     * at least view access to the Liveboard. #### Usage guidelines In the request body, specify the
     * GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or
     * names of the visualizations in the API request. To include unsaved changes in the report,
     * pass the &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes. If the new Liveboard
     * experience mode, the transient content includes ad hoc changes to visualizations such as
     * sorting, toggling of legends, and data drill down. For more information, and see [Liveboard
     * data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchLiveboardDataTest() throws ApiException {
        FetchLiveboardDataRequest fetchLiveboardDataRequest = null;
        LiveboardDataResponse response = api.fetchLiveboardData(fetchLiveboardDataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Generates an Answer from a given data source. Requires at least
     * view access to the data source object (Worksheet or View). #### Usage guidelines To search
     * data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source
     * can be a Worksheet, View, Table, or SQL view. Pass search tokens in the
     * &#x60;query_string&#x60; attribute in the API request as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,
     * \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, }
     * &#x60;&#x60;&#x60; For more information about the &#x60;query_string&#x60; format and data
     * source attribute, see [Search data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).
     * The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API
     * call. For more information about pagination, record size, and maximum row limit, see
     * [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDataTest() throws ApiException {
        SearchDataRequest searchDataRequest = null;
        SearchDataResponse response = api.searchData(searchDataRequest);
        // TODO: test validations
    }
}
