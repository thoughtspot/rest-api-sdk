# Data

```java
DataController dataController = client.getDataController();
```

## Class Name

`DataController`

## Methods

* [Restapi V2 Search Query Data](../../doc/controllers/data.md#restapi-v2-search-query-data)
* [Restapi V2 Liveboard Data](../../doc/controllers/data.md#restapi-v2-liveboard-data)
* [Restapi V2 Answer Data](../../doc/controllers/data.md#restapi-v2-answer-data)
* [Restapi V2 Answer Query Sql](../../doc/controllers/data.md#restapi-v2-answer-query-sql)
* [Restapi V2 Liveboard Query Sql](../../doc/controllers/data.md#restapi-v2-liveboard-query-sql)


# Restapi V2 Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```java
CompletableFuture<Object> restapiV2SearchQueryDataAsync(
    final TspublicRestV2DataSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataSearchRequest`](../../doc/models/tspublic-rest-v2-data-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2DataSearchRequest body = new TspublicRestV2DataSearchRequest();
body.setQueryString("queryString0");
body.setDataObjectId("dataObjectId6");

dataController.restapiV2SearchQueryDataAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```java
CompletableFuture<Object> restapiV2LiveboardDataAsync(
    final TspublicRestV2DataLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataLiveboardRequest`](../../doc/models/tspublic-rest-v2-data-liveboard-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2DataLiveboardRequest body = new TspublicRestV2DataLiveboardRequest();

dataController.restapiV2LiveboardDataAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```java
CompletableFuture<Object> restapiV2AnswerDataAsync(
    final TspublicRestV2DataAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataAnswerRequest`](../../doc/models/tspublic-rest-v2-data-answer-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
TspublicRestV2DataAnswerRequest body = new TspublicRestV2DataAnswerRequest();
body.setId("id6");

dataController.restapiV2AnswerDataAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint

```java
CompletableFuture<AnswerQueryResponse> restapiV2AnswerQuerySqlAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the Answer |

## Response Type

[`AnswerQueryResponse`](../../doc/models/answer-query-response.md)

## Example Usage

```java
String id = "id0";

dataController.restapiV2AnswerQuerySqlAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint

```java
CompletableFuture<LiveboardQueryResponse> restapiV2LiveboardQuerySqlAsync(
    final String id,
    final List<String> vizId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the Answer |
| `vizId` | `List<String>` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```java
String id = "id0";

dataController.restapiV2LiveboardQuerySqlAsync(id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

