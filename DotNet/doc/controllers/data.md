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
* [Answer Query Sql](../../doc/controllers/data.md#answer-query-sql)
* [Liveboard Query Sql](../../doc/controllers/data.md#liveboard-query-sql)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

Permission: Requires at least view access to the dataobject and datadownloading privilege

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

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.

Permission: Requires at least view access to the object and datadownloading privilege

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

Permission: Requires at least view access to the object and datadownloading privilege

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


# Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```csharp
AnswerQuerySqlAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Answer |

## Response Type

[`Task<Models.AnswerQueryResponse>`](../../doc/models/answer-query-response.md)

## Example Usage

```csharp
string id = "id0";

try
{
    AnswerQueryResponse result = await dataController.AnswerQuerySqlAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```csharp
LiveboardQuerySqlAsync(
    string id,
    List<string> vizId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Liveboard |
| `vizId` | `List<string>` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |

## Response Type

[`Task<Models.LiveboardQueryResponse>`](../../doc/models/liveboard-query-response.md)

## Example Usage

```csharp
string id = "id0";

try
{
    LiveboardQueryResponse result = await dataController.LiveboardQuerySqlAsync(id, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

