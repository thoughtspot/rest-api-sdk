# Logs

```csharp
LogsController logsController = client.LogsController;
```

## Class Name

`LogsController`


# Get Log Events

Note: This endpoint is applicable only for SAAS deployments.

The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system.

ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time.

These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization.

Permission: Requires administration privilege.

```csharp
GetLogEventsAsync(
    Models.GetLogEventsTopicEnum topic,
    string fromEpoch = null,
    string toEpoch = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `topic` | [`Models.GetLogEventsTopicEnum`](../../doc/models/get-log-events-topic-enum.md) | Query, Required | Type of the log. |
| `fromEpoch` | `string` | Query, Optional | The EPOCH time in milliseconds to set the start time for streaming logs.<br><br>Example: To set the timestamp as June 1, 2021 8 am, specify 1622534400000. |
| `toEpoch` | `string` | Query, Optional | The EPOCH time in milliseconds to set the end time for streaming logs.<br><br>Example: To set the timestamp as July 1, 2021, 8 am, specify 1625126400000. |

## Response Type

[`Task<Models.LogsResponse>`](../../doc/models/logs-response.md)

## Example Usage

```csharp
GetLogEventsTopicEnum topic = GetLogEventsTopicEnum.SecurityLogs;

try
{
    LogsResponse result = await logsController.GetLogEventsAsync(topic, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

