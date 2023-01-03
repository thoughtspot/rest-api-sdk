# Connection

```java
ConnectionController connectionController = client.getConnectionController();
```

## Class Name

`ConnectionController`

## Methods

* [Restapi V2 Get Connection](../../doc/controllers/connection.md#restapi-v2-get-connection)
* [Restapi V2 Get Connection Database](../../doc/controllers/connection.md#restapi-v2-get-connection-database)
* [Restapi V2 Create Connection](../../doc/controllers/connection.md#restapi-v2-create-connection)
* [Restapi V2 Update Connection](../../doc/controllers/connection.md#restapi-v2-update-connection)
* [Restapi V2 Delete Connection](../../doc/controllers/connection.md#restapi-v2-delete-connection)
* [Restapi V2 Add Table to Connection](../../doc/controllers/connection.md#restapi-v2-add-table-to-connection)
* [Restapi V2 Remove Table From Connection](../../doc/controllers/connection.md#restapi-v2-remove-table-from-connection)
* [Restapi V2 Search Connection](../../doc/controllers/connection.md#restapi-v2-search-connection)
* [Restapi V2 Get Connection Tables](../../doc/controllers/connection.md#restapi-v2-get-connection-tables)
* [Restapi V2 Get Connection Table Columns](../../doc/controllers/connection.md#restapi-v2-get-connection-table-columns)


# Restapi V2 Get Connection

To get the details of a specific connection use this endpoint

```java
CompletableFuture<ConnectionResponse> restapiV2GetConnectionAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the connection to query |

## Response Type

[`ConnectionResponse`](../../doc/models/connection-response.md)

## Example Usage

```java
String id = "id0";

connectionController.restapiV2GetConnectionAsync(id).thenAccept(result -> {
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


# Restapi V2 Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

```java
CompletableFuture<List<String>> restapiV2GetConnectionDatabaseAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The GUID of the connection |

## Response Type

`List<String>`

## Example Usage

```java
String id = "id0";

connectionController.restapiV2GetConnectionDatabaseAsync(id).thenAccept(result -> {
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


# Restapi V2 Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.
Using this API, you can create a connection and assign groups.
To create a connection, you require admin connection privileges.
All connections created in the ThoughtSpot system are added to ALL_GROUP

```java
CompletableFuture<CreateConnectionResponse> restapiV2CreateConnectionAsync(
    final TspublicRestV2ConnectionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionCreateRequest`](../../doc/models/tspublic-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`CreateConnectionResponse`](../../doc/models/create-connection-response.md)

## Example Usage

```java
TspublicRestV2ConnectionCreateRequest body = new TspublicRestV2ConnectionCreateRequest();
body.setType(Type14Enum.ORACLE_ADW);
body.setName("name6");
body.setConfiguration("configuration0");

connectionController.restapiV2CreateConnectionAsync(body).thenAccept(result -> {
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


# Restapi V2 Update Connection

You can use this endpoint to programmatically modify an existing connection
To modify a connection, you require admin connection privileges.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered and connectionname will be updated

```java
CompletableFuture<Boolean> restapiV2UpdateConnectionAsync(
    final TspublicRestV2ConnectionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionUpdateRequest`](../../doc/models/tspublic-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2ConnectionUpdateRequest body = new TspublicRestV2ConnectionUpdateRequest();
body.setId("id6");
body.setConfiguration("configuration0");

connectionController.restapiV2UpdateConnectionAsync(body).thenAccept(result -> {
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


# Restapi V2 Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```java
CompletableFuture<Boolean> restapiV2DeleteConnectionAsync(
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

connectionController.restapiV2DeleteConnectionAsync(id).thenAccept(result -> {
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


# Restapi V2 Add Table to Connection

To programmatically add table to an existing connection use this endpoint.
When you assign groups to a connection, the connection inherits the privileges assigned to those groups.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered.

```java
CompletableFuture<Boolean> restapiV2AddTableToConnectionAsync(
    final TspublicRestV2ConnectionAddtableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionAddtableRequest`](../../doc/models/tspublic-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2ConnectionAddtableRequest body = new TspublicRestV2ConnectionAddtableRequest();
body.setId("id6");
body.setTable(new LinkedList<>());

AddTableInput bodyTable0 = new AddTableInput();
bodyTable0.setName("name0");
bodyTable0.setDbName("dbName8");
bodyTable0.setSchemaName("schemaName4");
bodyTable0.setColumns(new LinkedList<>());

ColumnsInput bodyTable0Columns0 = new ColumnsInput();
bodyTable0Columns0.setName("name0");
bodyTable0Columns0.setDataType("dataType2");
bodyTable0.getColumns().add(bodyTable0Columns0);

ColumnsInput bodyTable0Columns1 = new ColumnsInput();
bodyTable0Columns1.setName("name1");
bodyTable0Columns1.setDataType("dataType3");
bodyTable0.getColumns().add(bodyTable0Columns1);

body.getTable().add(bodyTable0);

AddTableInput bodyTable1 = new AddTableInput();
bodyTable1.setName("name1");
bodyTable1.setDbName("dbName9");
bodyTable1.setSchemaName("schemaName5");
bodyTable1.setColumns(new LinkedList<>());

ColumnsInput bodyTable1Columns0 = new ColumnsInput();
bodyTable1Columns0.setName("name9");
bodyTable1Columns0.setDataType("dataType1");
bodyTable1.getColumns().add(bodyTable1Columns0);

body.getTable().add(bodyTable1);

AddTableInput bodyTable2 = new AddTableInput();
bodyTable2.setName("name2");
bodyTable2.setDbName("dbName0");
bodyTable2.setSchemaName("schemaName6");
bodyTable2.setColumns(new LinkedList<>());

ColumnsInput bodyTable2Columns0 = new ColumnsInput();
bodyTable2Columns0.setName("name8");
bodyTable2Columns0.setDataType("dataType0");
bodyTable2.getColumns().add(bodyTable2Columns0);

ColumnsInput bodyTable2Columns1 = new ColumnsInput();
bodyTable2Columns1.setName("name9");
bodyTable2Columns1.setDataType("dataType1");
bodyTable2.getColumns().add(bodyTable2Columns1);

ColumnsInput bodyTable2Columns2 = new ColumnsInput();
bodyTable2Columns2.setName("name0");
bodyTable2Columns2.setDataType("dataType2");
bodyTable2.getColumns().add(bodyTable2Columns2);

body.getTable().add(bodyTable2);


connectionController.restapiV2AddTableToConnectionAsync(body).thenAccept(result -> {
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


# Restapi V2 Remove Table From Connection

To programmatically remove a table from a connection use API endpoint.
The API removes only the connection association. It does not delete the connection or group from the Thoughtspot system.
At least one of id or name of connection is required. When both are given connection id will be considered.

```java
CompletableFuture<Boolean> restapiV2RemoveTableFromConnectionAsync(
    final TspublicRestV2ConnectionRemovetableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionRemovetableRequest`](../../doc/models/tspublic-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`boolean`

## Example Usage

```java
TspublicRestV2ConnectionRemovetableRequest body = new TspublicRestV2ConnectionRemovetableRequest();
body.setId("id6");
body.setTable(new LinkedList<>());

TableInput bodyTable0 = new TableInput();
body.getTable().add(bodyTable0);

TableInput bodyTable1 = new TableInput();
body.getTable().add(bodyTable1);

TableInput bodyTable2 = new TableInput();
body.getTable().add(bodyTable2);


connectionController.restapiV2RemoveTableFromConnectionAsync(body).thenAccept(result -> {
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


# Restapi V2 Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```java
CompletableFuture<List<ConnectionResponse>> restapiV2SearchConnectionAsync(
    final TspublicRestV2ConnectionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionSearchRequest`](../../doc/models/tspublic-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`List<ConnectionResponse>`](../../doc/models/connection-response.md)

## Example Usage

```java
TspublicRestV2ConnectionSearchRequest body = new TspublicRestV2ConnectionSearchRequest();
body.setType(Type15Enum.ORACLE_ADW);

connectionController.restapiV2SearchConnectionAsync(body).thenAccept(result -> {
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


# Restapi V2 Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

```java
CompletableFuture<ConnectionTableResponse> restapiV2GetConnectionTablesAsync(
    final TspublicRestV2ConnectionTableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTableRequest`](../../doc/models/tspublic-rest-v2-connection-table-request.md) | Body, Required | - |

## Response Type

[`ConnectionTableResponse`](../../doc/models/connection-table-response.md)

## Example Usage

```java
TspublicRestV2ConnectionTableRequest body = new TspublicRestV2ConnectionTableRequest();
body.setId("id6");

connectionController.restapiV2GetConnectionTablesAsync(body).thenAccept(result -> {
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


# Restapi V2 Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

```java
CompletableFuture<ConnectionTableColumnsResponse> restapiV2GetConnectionTableColumnsAsync(
    final TspublicRestV2ConnectionTablecoloumnRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTablecoloumnRequest`](../../doc/models/tspublic-rest-v2-connection-tablecoloumn-request.md) | Body, Required | - |

## Response Type

[`ConnectionTableColumnsResponse`](../../doc/models/connection-table-columns-response.md)

## Example Usage

```java
TspublicRestV2ConnectionTablecoloumnRequest body = new TspublicRestV2ConnectionTablecoloumnRequest();
body.setId("id6");
body.setTable(new LinkedList<>());

ConnectionTableColumnsInput bodyTable0 = new ConnectionTableColumnsInput();
bodyTable0.setDbName("dbName8");
bodyTable0.setSchemaName("schemaName4");
bodyTable0.setName("name0");
body.getTable().add(bodyTable0);

ConnectionTableColumnsInput bodyTable1 = new ConnectionTableColumnsInput();
bodyTable1.setDbName("dbName9");
bodyTable1.setSchemaName("schemaName5");
bodyTable1.setName("name1");
body.getTable().add(bodyTable1);

ConnectionTableColumnsInput bodyTable2 = new ConnectionTableColumnsInput();
bodyTable2.setDbName("dbName0");
bodyTable2.setSchemaName("schemaName6");
bodyTable2.setName("name2");
body.getTable().add(bodyTable2);


connectionController.restapiV2GetConnectionTableColumnsAsync(body).thenAccept(result -> {
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

