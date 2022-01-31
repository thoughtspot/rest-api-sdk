# Data

```java
DataController dataController = client.getDataController();
```

## Class Name

`DataController`

## Methods

* [Search Query Data](/doc/controllers/data.md#search-query-data)
* [Answer Data](/doc/controllers/data.md#answer-data)
* [Liveboard Data](/doc/controllers/data.md#liveboard-data)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```java
CompletableFuture<Object> searchQueryDataAsync(
    final ApiRestV2DataSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataSearchRequest`](/doc/models/api-rest-v2-data-search-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2DataSearchRequest body = new ApiRestV2DataSearchRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```java
CompletableFuture<Object> answerDataAsync(
    final ApiRestV2DataAnswerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataAnswerRequest`](/doc/models/api-rest-v2-data-answer-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2DataAnswerRequest body = new ApiRestV2DataAnswerRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```java
CompletableFuture<Object> liveboardDataAsync(
    final ApiRestV2DataLiveboardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DataLiveboardRequest`](/doc/models/api-rest-v2-data-liveboard-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2DataLiveboardRequest body = new ApiRestV2DataLiveboardRequest();
body.setId("id6");

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

