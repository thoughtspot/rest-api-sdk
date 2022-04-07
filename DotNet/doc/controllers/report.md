# Report

```csharp
ReportController reportController = client.ReportController;
```

## Class Name

`ReportController`


# Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

```csharp
AnswerReportAsync(
    Models.TspublicRestV2ReportAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ReportAnswerRequest`](../../doc/models/tspublic-rest-v2-report-answer-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2ReportAnswerRequest();
body.Id = "id6";
body.Type = Type16Enum.CSV;

try
{
    object result = await reportController.AnswerReportAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

