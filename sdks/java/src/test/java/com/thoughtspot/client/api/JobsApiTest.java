/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.SearchChannelHistoryRequest;
import com.thoughtspot.client.model.SearchChannelHistoryResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for JobsApi */
@Disabled
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    /**
     * Version: 26.4.0.cl or later Searches delivery history for communication channels such as
     * webhooks. Returns channel-level delivery status for each job execution record. Use this to
     * monitor channel health and delivery success rates across events. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action. **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the
     * following constraints apply: - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and
     * &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided,
     * it is used as the sole lookup key and other filter fields are ignored. - When
     * &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60;
     * are both required. Each must contain exactly one element, and the event object must include
     * the &#x60;identifier&#x60; field. - Records older than the configured retention period are
     * not returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchChannelHistoryTest() throws ApiException {
        SearchChannelHistoryRequest searchChannelHistoryRequest = null;
        SearchChannelHistoryResponse response =
                api.searchChannelHistory(searchChannelHistoryRequest);
        // TODO: test validations
    }
}
