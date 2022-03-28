# Database

```java
DatabaseController databaseController = client.getDatabaseController();
```

## Class Name

`DatabaseController`

## Methods

* [Get Databases](../../doc/controllers/database.md#get-databases)
* [Get Schemas](../../doc/controllers/database.md#get-schemas)
* [Get Tables](../../doc/controllers/database.md#get-tables)
* [Create Table](../../doc/controllers/database.md#create-table)
* [Run Query](../../doc/controllers/database.md#run-query)


# Get Databases

Note: This endpoint is applicable only for on-prem deployments

To list all the databases in Falcon, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<List<String>> getDatabasesAsync()
```

## Response Type

`List<String>`

## Example Usage

```java
databaseController.getDatabasesAsync().thenAccept(result -> {
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


# Get Schemas

Note: This endpoint is applicable only for on-prem deployments

To list all the schemas in a database in Falcon, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<List<String>> getSchemasAsync(
    final String database)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `String` | Query, Required | Name of the Falcon database |

## Response Type

`List<String>`

## Example Usage

```java
String database = "database0";

databaseController.getSchemasAsync(database).thenAccept(result -> {
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


# Get Tables

Note: This endpoint is applicable only for on-prem deployments.

To list all the tables in a schema of a database in Falcon, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<List<String>> getTablesAsync(
    final String database,
    final String schema)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `String` | Query, Required | Name of the Falcon database |
| `schema` | `String` | Query, Required | Name of the schema in Falcon database |

## Response Type

`List<String>`

## Example Usage

```java
String database = "database0";
String schema = "schema2";

databaseController.getTablesAsync(database, schema).thenAccept(result -> {
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


# Create Table

Note: This endpoint is applicable only for on-prem deployments.

To create a table in Falcon, use this endpoint.

Permission: Requires administration privilege

```java
CompletableFuture<CreateTableResponse> createTableAsync(
    final TspublicRestV2DatabaseTableCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableCreateRequest`](../../doc/models/tspublic-rest-v2-database-table-create-request.md) | Body, Required | - |

## Response Type

[`CreateTableResponse`](../../doc/models/create-table-response.md)

## Example Usage

```java
TspublicRestV2DatabaseTableCreateRequest body = new TspublicRestV2DatabaseTableCreateRequest();

databaseController.createTableAsync(body).thenAccept(result -> {
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


# Run Query

Note: This endpoint is applicable only for on-prem deployments.

To run a TQL statement in Falcon, use this endpoint.

You can run only following type of statements - Table DDL alter and Table rows update and delete.

Permission: Requires administration privilege

```java
CompletableFuture<List<Object>> runQueryAsync(
    final TspublicRestV2DatabaseTableRunqueryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableRunqueryRequest`](../../doc/models/tspublic-rest-v2-database-table-runquery-request.md) | Body, Required | - |

## Response Type

`List<Object>`

## Example Usage

```java
TspublicRestV2DatabaseTableRunqueryRequest body = new TspublicRestV2DatabaseTableRunqueryRequest();
body.setStatement(new LinkedList<>());
body.getStatement().add("statement6");
body.getStatement().add("statement7");

databaseController.runQueryAsync(body).thenAccept(result -> {
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

