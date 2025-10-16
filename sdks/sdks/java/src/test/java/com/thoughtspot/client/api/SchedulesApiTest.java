/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateScheduleRequest;
import com.thoughtspot.client.model.ResponseSchedule;
import com.thoughtspot.client.model.SearchSchedulesRequest;
import com.thoughtspot.client.model.UpdateScheduleRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for SchedulesApi */
@Disabled
public class SchedulesApiTest {

    private final SchedulesApi api = new SchedulesApi();

    /**
     * Create schedule. Version: 9.4.0.cl or later Creates a Liveboard schedule job. Requires at
     * least edit access to Liveboards. To create a schedule on behalf of another user, you need
     * &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can
     * schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required. #### Usage
     * guidelines * The description text is mandatory. The description text appears as
     * **Description: &lt;your content&gt;** in the Liveboard schedule email notifications. * For
     * Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS
     * formats. Schedules created in CSV formats for such Liveboards will fail to run. If
     * &#x60;PDF&#x60; is set as the &#x60;file_format&#x60;, enable &#x60;pdf_options&#x60; to get
     * the correct attachment. Not doing so may cause the attachment to be rendered empty. * To
     * include only specific visualizations, specify the visualization GUIDs in the
     * &#x60;visualization_identifiers&#x60; array. * You can schedule a Liveboard job to run
     * periodically by setting frequency parameters. You can set the schedule to run daily, weekly,
     * monthly or every n minutes or hours. The scheduled job can also be configured to run at a
     * specific time of the day or on specific days of the week or month. Please ensure that when
     * setting the schedule frequency for _minute of the object_, only values that are multiples of
     * 5 are included. * If the &#x60;frequency&#x60; parameters are defined, you can set the time
     * zone to a value that matches your server&#39;s time zone. For example,
     * &#x60;US/Central&#x60;, &#x60;Etc/UTC&#x60;, &#x60;CET&#x60;. The default time zone is
     * &#x60;America/Los_Angeles&#x60;. For more information about Liveboard jobs, see [ThoughtSpot
     * Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createScheduleTest() throws ApiException {
        CreateScheduleRequest createScheduleRequest = null;
        ResponseSchedule response = api.createSchedule(createScheduleRequest);
        // TODO: test validations
    }

    /**
     * Deletes a scheduled job. Version: 9.4.0.cl or later Deletes a scheduled Liveboard job.
     * Requires at least edit access to Liveboard or &#x60;ADMINISTRATION&#x60; (**Can administer
     * Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteScheduleTest() throws ApiException {
        String scheduleIdentifier = null;
        api.deleteSchedule(scheduleIdentifier);
        // TODO: test validations
    }

    /**
     * Search Schedules Version: 9.4.0.cl or later Gets a list of scheduled jobs configured for a
     * Liveboard. To get details of a specific scheduled job, specify the name or GUID of the
     * scheduled job. Requires at least view access to Liveboards. **NOTE**: When filtering
     * schedules by parameters other than &#x60;metadata&#x60;, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for accurate results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSchedulesTest() throws ApiException {
        SearchSchedulesRequest searchSchedulesRequest = null;
        List<ResponseSchedule> response = api.searchSchedules(searchSchedulesRequest);
        // TODO: test validations
    }

    /**
     * Update schedule. Version: 9.4.0.cl or later Updates a scheduled Liveboard job. Requires at
     * least edit access to Liveboards. To update a schedule on behalf of another user, you need
     * &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can
     * schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required. The API
     * endpoint allows you to pause a scheduled job, change the status of a paused job. You can also
     * edit the recipients list, frequency of the job, format of the file to send to the recipients
     * in email notifications, PDF options, and time zone setting.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateScheduleTest() throws ApiException {
        String scheduleIdentifier = null;
        UpdateScheduleRequest updateScheduleRequest = null;
        api.updateSchedule(scheduleIdentifier, updateScheduleRequest);
        // TODO: test validations
    }
}
