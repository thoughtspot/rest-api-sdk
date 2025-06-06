/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;


import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.FetchLogsRequest;
import com.thoughtspot.client.model.LogResponse;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for LogApi */
@Disabled
public class LogApiTest {

    private final LogApi api = new LogApi();

    /**
     * Version: 9.0.0.cl or later Fetches security audit logs. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin
     * Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are
     * required. #### Usage guidelines By default, the API retrieves logs for the last 24 hours. You
     * can set a custom duration in EPOCH time. Make sure the log duration specified in your API
     * request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the
     * duration and make multiple sequential API requests. Upon successful execution, the API
     * returns logs with the following information: * timestamp of the event * event ID * event type
     * * name and GUID of the user * IP address of ThoughtSpot instance For more information see
     * [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchLogsTest() throws ApiException {
        FetchLogsRequest fetchLogsRequest = null;
        List<LogResponse> response = api.fetchLogs(fetchLogsRequest);
        // TODO: test validations
    }
}
