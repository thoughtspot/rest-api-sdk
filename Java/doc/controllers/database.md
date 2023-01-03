# Database

```java
DatabaseController databaseController = client.getDatabaseController();
```

## Class Name

`DatabaseController`

## Methods

* [Restapi V2 Get Schemas](../../doc/controllers/database.md#restapi-v2-get-schemas)
* [Restapi V2 Get Tables](../../doc/controllers/database.md#restapi-v2-get-tables)
* [Restapi V2 Get Table Details](../../doc/controllers/database.md#restapi-v2-get-table-details)
* [Restapi V2 Create Table](../../doc/controllers/database.md#restapi-v2-create-table)
* [Restapi V2 Run Query](../../doc/controllers/database.md#restapi-v2-run-query)


# Restapi V2 Get Schemas

To list all the schemas in a database in Falcon, use this endpoint.

```java
CompletableFuture<List<String>> restapiV2GetSchemasAsync(
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

databaseController.restapiV2GetSchemasAsync(database).thenAccept(result -> {
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


# Restapi V2 Get Tables

To list all the tables in a schema of a database in Falcon, use this endpoint.

```java
CompletableFuture<List<String>> restapiV2GetTablesAsync(
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

databaseController.restapiV2GetTablesAsync(database, schema).thenAccept(result -> {
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


# Restapi V2 Get Table Details

Note: This endpoint is applicable only for on-prem deployments.

To provide details of a table in a schema of a database in Falcon, use this endpoint.

```java
CompletableFuture<Object> restapiV2GetTableDetailsAsync(
    final String database,
    final String table,
    final String schema)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `String` | Query, Required | Name of the Falcon database |
| `table` | `String` | Query, Required | Name of the table in Falcon database |
| `schema` | `String` | Query, Optional | Name of the schema in Falcon database |

## Response Type

`Object`

## Example Usage

```java
String database = "database0";
String table = "table2";

databaseController.restapiV2GetTableDetailsAsync(database, table, null).thenAccept(result -> {
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


# Restapi V2 Create Table

To create a table in Falcon, use this endpoint.

```java
CompletableFuture<CreateTableResponse> restapiV2CreateTableAsync(
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

databaseController.restapiV2CreateTableAsync(body).thenAccept(result -> {
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


# Restapi V2 Run Query

To run a TQL statement in Falcon, use this endpoint. You can run only following type of statements - Table DDL alter and Table rows update and delete.

```java
CompletableFuture<List<Object>> restapiV2RunQueryAsync(
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

databaseController.restapiV2RunQueryAsync(body).thenAccept(result -> {
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

