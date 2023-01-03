# Connection

```csharp
ConnectionController connectionController = client.ConnectionController;
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

```csharp
RestapiV2GetConnectionAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection to query |

## Response Type

[`Task<Models.ConnectionResponse>`](../../doc/models/connection-response.md)

## Example Usage

```csharp
string id = "id0";

try
{
    ConnectionResponse result = await connectionController.RestapiV2GetConnectionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

```csharp
RestapiV2GetConnectionDatabaseAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection |

## Response Type

`Task<List<string>>`

## Example Usage

```csharp
string id = "id0";

try
{
    List<string> result = await connectionController.RestapiV2GetConnectionDatabaseAsync(id);
}
catch (ApiException e){};
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

```csharp
RestapiV2CreateConnectionAsync(
    Models.TspublicRestV2ConnectionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionCreateRequest`](../../doc/models/tspublic-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.CreateConnectionResponse>`](../../doc/models/create-connection-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionCreateRequest();
body.Type = Type14Enum.ORACLEADW;
body.Name = "name6";
body.Configuration = "configuration0";

try
{
    CreateConnectionResponse result = await connectionController.RestapiV2CreateConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Connection

You can use this endpoint to programmatically modify an existing connection
To modify a connection, you require admin connection privileges.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered and connectionname will be updated

```csharp
RestapiV2UpdateConnectionAsync(
    Models.TspublicRestV2ConnectionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionUpdateRequest`](../../doc/models/tspublic-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionUpdateRequest();
body.Id = "id6";
body.Configuration = "configuration0";

try
{
    bool? result = await connectionController.RestapiV2UpdateConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```csharp
RestapiV2DeleteConnectionAsync(
    List<string> id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `List<string>` | Query, Required | A JSON array of GUIDs of the connection |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var id = new List<string>();
id.Add("id0");

try
{
    bool? result = await connectionController.RestapiV2DeleteConnectionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add Table to Connection

To programmatically add table to an existing connection use this endpoint.
When you assign groups to a connection, the connection inherits the privileges assigned to those groups.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered.

```csharp
RestapiV2AddTableToConnectionAsync(
    Models.TspublicRestV2ConnectionAddtableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionAddtableRequest`](../../doc/models/tspublic-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionAddtableRequest();
body.Id = "id6";
body.Table = new List<AddTableInput>();

var bodyTable0 = new AddTableInput();
bodyTable0.Name = "name0";
bodyTable0.DbName = "dbName8";
bodyTable0.SchemaName = "schemaName4";
bodyTable0.Columns = new List<ColumnsInput>();

var bodyTable0Columns0 = new ColumnsInput();
bodyTable0Columns0.Name = "name0";
bodyTable0Columns0.DataType = "dataType2";
bodyTable0.Columns.Add(bodyTable0Columns0);

var bodyTable0Columns1 = new ColumnsInput();
bodyTable0Columns1.Name = "name1";
bodyTable0Columns1.DataType = "dataType3";
bodyTable0.Columns.Add(bodyTable0Columns1);

body.Table.Add(bodyTable0);

var bodyTable1 = new AddTableInput();
bodyTable1.Name = "name1";
bodyTable1.DbName = "dbName9";
bodyTable1.SchemaName = "schemaName5";
bodyTable1.Columns = new List<ColumnsInput>();

var bodyTable1Columns0 = new ColumnsInput();
bodyTable1Columns0.Name = "name9";
bodyTable1Columns0.DataType = "dataType1";
bodyTable1.Columns.Add(bodyTable1Columns0);

body.Table.Add(bodyTable1);

var bodyTable2 = new AddTableInput();
bodyTable2.Name = "name2";
bodyTable2.DbName = "dbName0";
bodyTable2.SchemaName = "schemaName6";
bodyTable2.Columns = new List<ColumnsInput>();

var bodyTable2Columns0 = new ColumnsInput();
bodyTable2Columns0.Name = "name8";
bodyTable2Columns0.DataType = "dataType0";
bodyTable2.Columns.Add(bodyTable2Columns0);

var bodyTable2Columns1 = new ColumnsInput();
bodyTable2Columns1.Name = "name9";
bodyTable2Columns1.DataType = "dataType1";
bodyTable2.Columns.Add(bodyTable2Columns1);

var bodyTable2Columns2 = new ColumnsInput();
bodyTable2Columns2.Name = "name0";
bodyTable2Columns2.DataType = "dataType2";
bodyTable2.Columns.Add(bodyTable2Columns2);

body.Table.Add(bodyTable2);


try
{
    bool? result = await connectionController.RestapiV2AddTableToConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove Table From Connection

To programmatically remove a table from a connection use API endpoint.
The API removes only the connection association. It does not delete the connection or group from the Thoughtspot system.
At least one of id or name of connection is required. When both are given connection id will be considered.

```csharp
RestapiV2RemoveTableFromConnectionAsync(
    Models.TspublicRestV2ConnectionRemovetableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionRemovetableRequest`](../../doc/models/tspublic-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionRemovetableRequest();
body.Id = "id6";
body.Table = new List<TableInput>();

var bodyTable0 = new TableInput();
body.Table.Add(bodyTable0);

var bodyTable1 = new TableInput();
body.Table.Add(bodyTable1);

var bodyTable2 = new TableInput();
body.Table.Add(bodyTable2);


try
{
    bool? result = await connectionController.RestapiV2RemoveTableFromConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```csharp
RestapiV2SearchConnectionAsync(
    Models.TspublicRestV2ConnectionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionSearchRequest`](../../doc/models/tspublic-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`Task<List<Models.ConnectionResponse>>`](../../doc/models/connection-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionSearchRequest();
body.Type = Type15Enum.ORACLEADW;

try
{
    List<ConnectionResponse> result = await connectionController.RestapiV2SearchConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

```csharp
RestapiV2GetConnectionTablesAsync(
    Models.TspublicRestV2ConnectionTableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionTableRequest`](../../doc/models/tspublic-rest-v2-connection-table-request.md) | Body, Required | - |

## Response Type

[`Task<Models.ConnectionTableResponse>`](../../doc/models/connection-table-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionTableRequest();
body.Id = "id6";

try
{
    ConnectionTableResponse result = await connectionController.RestapiV2GetConnectionTablesAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

```csharp
RestapiV2GetConnectionTableColumnsAsync(
    Models.TspublicRestV2ConnectionTablecoloumnRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2ConnectionTablecoloumnRequest`](../../doc/models/tspublic-rest-v2-connection-tablecoloumn-request.md) | Body, Required | - |

## Response Type

[`Task<Models.ConnectionTableColumnsResponse>`](../../doc/models/connection-table-columns-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2ConnectionTablecoloumnRequest();
body.Id = "id6";
body.Table = new List<ConnectionTableColumnsInput>();

var bodyTable0 = new ConnectionTableColumnsInput();
bodyTable0.DbName = "dbName8";
bodyTable0.SchemaName = "schemaName4";
bodyTable0.Name = "name0";
body.Table.Add(bodyTable0);

var bodyTable1 = new ConnectionTableColumnsInput();
bodyTable1.DbName = "dbName9";
bodyTable1.SchemaName = "schemaName5";
bodyTable1.Name = "name1";
body.Table.Add(bodyTable1);

var bodyTable2 = new ConnectionTableColumnsInput();
bodyTable2.DbName = "dbName0";
bodyTable2.SchemaName = "schemaName6";
bodyTable2.Name = "name2";
body.Table.Add(bodyTable2);


try
{
    ConnectionTableColumnsResponse result = await connectionController.RestapiV2GetConnectionTableColumnsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

