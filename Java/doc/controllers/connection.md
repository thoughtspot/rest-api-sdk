# Connection

```java
ConnectionController connectionController = client.getConnectionController();
```

## Class Name

`ConnectionController`

## Methods

* [Get Connection](/doc/controllers/connection.md#get-connection)
* [Create Connection](/doc/controllers/connection.md#create-connection)
* [Update Connection](/doc/controllers/connection.md#update-connection)
* [Delete Connection](/doc/controllers/connection.md#delete-connection)
* [Add Table to Connection](/doc/controllers/connection.md#add-table-to-connection)
* [Remove Table From Connection](/doc/controllers/connection.md#remove-table-from-connection)
* [Search Connection](/doc/controllers/connection.md#search-connection)


# Get Connection

To get the details of a specific connection use this endpoint

```java
CompletableFuture<ConnectionResponse> getConnectionAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the connection to query |

## Response Type

[`ConnectionResponse`](/doc/models/connection-response.md)

## Example Usage

```java
String id = "id0";

connectionController.getConnectionAsync(id).thenAccept(result -> {
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


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

```java
CompletableFuture<CreateConnectionResponse> createConnectionAsync(
    final ApiRestV2ConnectionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionCreateRequest`](/doc/models/api-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`CreateConnectionResponse`](/doc/models/create-connection-response.md)

## Example Usage

```java
ApiRestV2ConnectionCreateRequest body = new ApiRestV2ConnectionCreateRequest();
body.setType(Type13Enum.TERADATA);
body.setName("name6");
body.setConfiguration("configuration0");

connectionController.createConnectionAsync(body).thenAccept(result -> {
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


# Update Connection

You can use this endpoint to programmatically modify an existing connection

```java
CompletableFuture<Boolean> updateConnectionAsync(
    final ApiRestV2ConnectionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionUpdateRequest`](/doc/models/api-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2ConnectionUpdateRequest body = new ApiRestV2ConnectionUpdateRequest();
body.setId("id6");
body.setConfiguration("configuration0");

connectionController.updateConnectionAsync(body).thenAccept(result -> {
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


# Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```java
CompletableFuture<Boolean> deleteConnectionAsync(
    final List<String> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `List<String>` | Query, Required | A JSON array of GUIDs of the connection |

## Response Type

`boolean`

## Example Usage

```java
List<String> id = new LinkedList<>();
id.add("id0");

connectionController.deleteConnectionAsync(id).thenAccept(result -> {
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


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

```java
CompletableFuture<Boolean> addTableToConnectionAsync(
    final ApiRestV2ConnectionAddtableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionAddtableRequest`](/doc/models/api-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2ConnectionAddtableRequest body = new ApiRestV2ConnectionAddtableRequest();
body.setId("id6");
body.setTables(new LinkedList<>());

AddTableInput bodyTables0 = new AddTableInput();
bodyTables0.setName("name8");
bodyTables0.setDbName("dbName6");
bodyTables0.setSchemaName("schemaName2");
bodyTables0.setColumns(new LinkedList<>());

ColumnsInput bodyTables0Columns0 = new ColumnsInput();
bodyTables0Columns0.setName("name2");
bodyTables0Columns0.setDataType("dataType4");
bodyTables0.getColumns().add(bodyTables0Columns0);

ColumnsInput bodyTables0Columns1 = new ColumnsInput();
bodyTables0Columns1.setName("name3");
bodyTables0Columns1.setDataType("dataType5");
bodyTables0.getColumns().add(bodyTables0Columns1);

ColumnsInput bodyTables0Columns2 = new ColumnsInput();
bodyTables0Columns2.setName("name4");
bodyTables0Columns2.setDataType("dataType6");
bodyTables0.getColumns().add(bodyTables0Columns2);

body.getTables().add(bodyTables0);


connectionController.addTableToConnectionAsync(body).thenAccept(result -> {
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


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

```java
CompletableFuture<Boolean> removeTableFromConnectionAsync(
    final ApiRestV2ConnectionRemovetableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionRemovetableRequest`](/doc/models/api-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
ApiRestV2ConnectionRemovetableRequest body = new ApiRestV2ConnectionRemovetableRequest();
body.setId("id6");
body.setTables(new LinkedList<>());

TableInput bodyTables0 = new TableInput();
body.getTables().add(bodyTables0);


connectionController.removeTableFromConnectionAsync(body).thenAccept(result -> {
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


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```java
CompletableFuture<List<ConnectionResponse>> searchConnectionAsync(
    final ApiRestV2ConnectionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionSearchRequest`](/doc/models/api-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`List<ConnectionResponse>`](/doc/models/connection-response.md)

## Example Usage

```java
ApiRestV2ConnectionSearchRequest body = new ApiRestV2ConnectionSearchRequest();
body.setType(Type14Enum.TERADATA);

connectionController.searchConnectionAsync(body).thenAccept(result -> {
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

