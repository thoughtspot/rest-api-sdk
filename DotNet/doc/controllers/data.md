# Data

```csharp
DataController dataController = client.DataController;
```

## Class Name

`DataController`

## Methods

* [Search Query Data](../../doc/controllers/data.md#search-query-data)
* [Answer Data](../../doc/controllers/data.md#answer-data)
* [Liveboard Data](../../doc/controllers/data.md#liveboard-data)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```csharp
SearchQueryDataAsync(
    Models.TspublicRestV2DataSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2DataSearchRequest`](../../doc/models/tspublic-rest-v2-data-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2DataSearchRequest();
body.QueryString = "queryString0";
body.DataObjectId = "dataObjectId6";

try
{
    object result = await dataController.SearchQueryDataAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```csharp
AnswerDataAsync(
    Models.TspublicRestV2DataAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2DataAnswerRequest`](../../doc/models/tspublic-rest-v2-data-answer-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2DataAnswerRequest();
body.Id = "id6";

try
{
    object result = await dataController.AnswerDataAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```csharp
LiveboardDataAsync(
    Models.TspublicRestV2DataLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2DataLiveboardRequest`](../../doc/models/tspublic-rest-v2-data-liveboard-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2DataLiveboardRequest();
body.Id = "id6";

try
{
    object result = await dataController.LiveboardDataAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

