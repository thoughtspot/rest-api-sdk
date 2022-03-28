# Report

```csharp
ReportController reportController = client.ReportController;
```

## Class Name

`ReportController`

## Methods

* [Answer Report](../../doc/controllers/report.md#answer-report)
* [Liveboard Report](../../doc/controllers/report.md#liveboard-report)


# Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

Permission: Requires at least view access to the object and datadownloading privilege

```csharp
AnswerReportAsync(
    Models.TspublicRestV2ReportAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ReportAnswerRequest`](../../doc/models/tspublic-rest-v2-report-answer-request.md) | Body, Required | - |

## Response Type

`Task<Stream>`

## Example Usage

```csharp
var body = new TspublicRestV2ReportAnswerRequest();
body.Id = "id6";
body.Type = Type17Enum.PDF;

try
{
    Stream result = await reportController.AnswerReportAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```csharp
LiveboardReportAsync(
    Models.TspublicRestV2ReportLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ReportLiveboardRequest`](../../doc/models/tspublic-rest-v2-report-liveboard-request.md) | Body, Required | - |

## Response Type

`Task<Stream>`

## Example Usage

```csharp
var body = new TspublicRestV2ReportLiveboardRequest();
body.Type = Type17Enum.PDF;

try
{
    Stream result = await reportController.LiveboardReportAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

