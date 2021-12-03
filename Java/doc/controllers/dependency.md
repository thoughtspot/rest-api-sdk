# Dependency

```java
DependencyController dependencyController = client.getDependencyController();
```

## Class Name

`DependencyController`


# Get Object Dependency

To create a table in Falcon, use this endpoint.

```java
CompletableFuture<Object> getObjectDependencyAsync(
    final ApiRestV2DependencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DependencyRequest`](/doc/models/api-rest-v2-dependency-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
ApiRestV2DependencyRequest body = new ApiRestV2DependencyRequest();
body.setType(Type10Enum.COLUMN);
body.setId(new LinkedList<>());
body.getId().add("id6");
body.getId().add("id7");

dependencyController.getObjectDependencyAsync(body).thenAccept(result -> {
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

