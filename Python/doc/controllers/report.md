# Report

```python
report_controller = client.report
```

## Class Name

`ReportController`

## Methods

* [Answer Report](../../doc/controllers/report.md#answer-report)
* [Liveboard Report](../../doc/controllers/report.md#liveboard-report)


# Answer Report

To programmatically download Answer data as a file, use this endpoint.

The PDF will download data in the tabular format even if Answer is saved as chart.

```python
def answer_report(self,
                 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportAnswerRequest`](../../doc/models/tspublic-rest-v2-report-answer-request.md) | Body, Required | - |

## Response Type

`binary`

## Example Usage

```python
body = TspublicRestV2ReportAnswerRequest()
body.id = 'id6'
body.mtype = Type16Enum.CSV

result = report_controller.answer_report(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Report

To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint

```python
def liveboard_report(self,
                    body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ReportLiveboardRequest`](../../doc/models/tspublic-rest-v2-report-liveboard-request.md) | Body, Required | - |

## Response Type

`binary`

## Example Usage

```python
body = TspublicRestV2ReportLiveboardRequest()
body.mtype = Type16Enum.CSV

result = report_controller.liveboard_report(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

