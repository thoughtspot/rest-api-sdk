# Report

```java
ReportController reportController = client.getReportController();
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

```java
CompletableFuture<InputStream> answerReportAsync(
    final TspublicRestV2ReportAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportAnswerRequest`](../../doc/models/tspublic-rest-v2-report-answer-request.md) | Body, Required | - |

## Response Type

`InputStream`

## Example Usage

```java
TspublicRestV2ReportAnswerRequest body = new TspublicRestV2ReportAnswerRequest();
body.setId("id6");
body.setType(Type17Enum.PDF);

reportController.answerReportAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```java
CompletableFuture<InputStream> liveboardReportAsync(
    final TspublicRestV2ReportLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportLiveboardRequest`](../../doc/models/tspublic-rest-v2-report-liveboard-request.md) | Body, Required | - |

## Response Type

`InputStream`

## Example Usage

```java
TspublicRestV2ReportLiveboardRequest body = new TspublicRestV2ReportLiveboardRequest();
body.setType(Type17Enum.PDF);

reportController.liveboardReportAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

