# SchedulesApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createSchedule**](SchedulesApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create |
| [**deleteSchedule**](SchedulesApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete |
| [**searchSchedules**](SchedulesApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search |
| [**updateSchedule**](SchedulesApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update |


<a id="createSchedule"></a>
# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)



 Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: &lt;your content&gt;** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If &#x60;PDF&#x60; is set as the &#x60;file_format&#x60;, enable &#x60;pdf_options&#x60; to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the &#x60;visualization_identifiers&#x60; array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the &#x60;frequency&#x60; parameters are defined, you can set the time zone to a value that matches your server&#39;s time zone. For example, &#x60;US/Central&#x60;, &#x60;Etc/UTC&#x60;, &#x60;CET&#x60;. The default time zone is &#x60;America/Los_Angeles&#x60;.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     

### Parameters

| Name | Type |
|------------- | ------------- |
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md)

### Return type

[**ResponseSchedule**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(scheduleIdentifier)



 Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or &#x60;ADMINISTRATION&#x60; (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scheduleIdentifier** | **String**

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Schedule successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchSchedules"></a>
# **searchSchedules**
> List&lt;ResponseSchedule&gt; searchSchedules(searchSchedulesRequest)



 Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than &#x60;metadata&#x60;, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for accurate results.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchSchedulesRequest** | [**SearchSchedulesRequest**](SearchSchedulesRequest.md)

### Return type

[**List&lt;ResponseSchedule&gt;**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateSchedule"></a>
# **updateSchedule**
> updateSchedule(scheduleIdentifier, updateScheduleRequest)



 Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scheduleIdentifier** | **String**
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Schedule successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

