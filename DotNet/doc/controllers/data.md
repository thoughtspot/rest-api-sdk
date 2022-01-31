# Data

```csharp
DataController dataController = client.DataController;
```

## Class Name

`DataController`

## Methods

* [Search Query Data](/doc/controllers/data.md#search-query-data)
* [Answer Data](/doc/controllers/data.md#answer-data)
* [Liveboard Data](/doc/controllers/data.md#liveboard-data)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```csharp
SearchQueryDataAsync(
    Models.ApiRestV2DataSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2DataSearchRequest`](/doc/models/api-rest-v2-data-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2DataSearchRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```csharp
AnswerDataAsync(
    Models.ApiRestV2DataAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2DataAnswerRequest`](/doc/models/api-rest-v2-data-answer-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2DataAnswerRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```csharp
LiveboardDataAsync(
    Models.ApiRestV2DataLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2DataLiveboardRequest`](/doc/models/api-rest-v2-data-liveboard-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2DataLiveboardRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

