# Data

```java
DataController dataController = client.getDataController();
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

```java
CompletableFuture<Object> searchQueryDataAsync(
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

dataController.searchQueryDataAsync(body).thenAccept(result -> {
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


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.

Permission: Requires at least view access to the object and datadownloading privilege

```java
CompletableFuture<Object> answerDataAsync(
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

dataController.answerDataAsync(body).thenAccept(result -> {
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


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```java
CompletableFuture<Object> liveboardDataAsync(
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

dataController.liveboardDataAsync(body).thenAccept(result -> {
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


# Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```java
CompletableFuture<AnswerQueryResponse> answerQuerySqlAsync(
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

dataController.answerQuerySqlAsync(id).thenAccept(result -> {
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


# Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```java
CompletableFuture<LiveboardQueryResponse> liveboardQuerySqlAsync(
    final String id,
    final List<String> vizId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the Liveboard |
| `vizId` | `List<String>` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```java
String id = "id0";

dataController.liveboardQuerySqlAsync(id, null).thenAccept(result -> {
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

