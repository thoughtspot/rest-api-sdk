/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.ExportAnswerReportRequest;
import com.thoughtspot.client.model.ExportLiveboardReportRequest;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for ReportsApi */
@Disabled
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    /**
     * Version: 9.0.0.cl or later Exports an Answer in the given file format. You can download the
     * Answer data as a PDF, PNG, CSV, or XLSX file. Requires at least view access to the Answer.
     * #### Usage guidelines In the request body, the GUID or name of the Answer and set
     * &#x60;file_format&#x60;. The default file format is CSV. **NOTE**: * The downloadable file
     * returned in API response file is extensionless. Please rename the downloaded file by typing
     * in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with
     * tables. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportAnswerReportTest() throws ApiException {
        ExportAnswerReportRequest exportAnswerReportRequest = null;
        File response = api.exportAnswerReport(exportAnswerReportRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Exports a Liveboard and its visualizations in PDF or PNG file
     * format. Requires at least view access to the Liveboard. #### Usage guidelines In the request
     * body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific
     * visualizations, add GUIDs or names of the visualizations. The default &#x60;file_format&#x60;
     * is PDF. For PDF downloads, you can specify additional parameters to customize the page
     * orientation and include or exclude the cover page, logo, footer text, and page numbers.
     * Similar customization options are also available for PNG output. **NOTE**: The downloadable
     * file returned in API response file is extensionless. Please rename the downloaded file by
     * typing in the relevant extension. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data. To include unsaved changes in the report, pass the
     * &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes, including ad hoc
     * changes to visualizations. For more information, see [Liveboard Report
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in
     * the PNG format in the resolution of your choice. To enable this on your instance, contact
     * ThoughtSpot support. When this feature is enabled, the options
     * &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the
     * &#x60;png_options&#x60; will not be available for PNG exports.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportLiveboardReportTest() throws ApiException {
        ExportLiveboardReportRequest exportLiveboardReportRequest = null;
        File response = api.exportLiveboardReport(exportLiveboardReportRequest);
        // TODO: test validations
    }
}
