# Logs

```ts
const logsController = new LogsController(client);
```

## Class Name

`LogsController`


# Get Log Events

Note: This endpoint is applicable only for SAAS deployments.

The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system.

To use this API, make sure you have admin user privileges.

ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time.

These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization.

Permission: Requires administration privilege

```ts
async getLogEvents(
  topic: TopicEnum,
  fromEpoch?: string,
  toEpoch?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<LogsResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `topic` | [`TopicEnum`](../../doc/models/topic-enum.md) | Query, Required | Type of the log. |
| `fromEpoch` | `string \| undefined` | Query, Optional | The EPOCH time in milliseconds to set the start time for streaming logs.<br><br>Example: To set the timestamp as June 1, 2021 8 am, specify 1622534400000. |
| `toEpoch` | `string \| undefined` | Query, Optional | The EPOCH time in milliseconds to set the end time for streaming logs.<br><br>Example: To set the timestamp as July 1, 2021, 8 am, specify 1625126400000. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`LogsResponse`](../../doc/models/logs-response.md)

## Example Usage

```ts
const topic = 'security_logs';
try {
  const { result, ...httpResponse } = await logsController.getLogEvents(topic);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

