# Connection

```csharp
ConnectionController connectionController = client.ConnectionController;
```

## Class Name

`ConnectionController`

## Methods

* [Get Connection](../../doc/controllers/connection.md#get-connection)
* [Get Connection Database](../../doc/controllers/connection.md#get-connection-database)
* [Get Connection Tables](../../doc/controllers/connection.md#get-connection-tables)
* [Get Connection Table Columns](../../doc/controllers/connection.md#get-connection-table-columns)
* [Create Connection](../../doc/controllers/connection.md#create-connection)
* [Update Connection](../../doc/controllers/connection.md#update-connection)
* [Delete Connection](../../doc/controllers/connection.md#delete-connection)
* [Add Table to Connection](../../doc/controllers/connection.md#add-table-to-connection)
* [Remove Table From Connection](../../doc/controllers/connection.md#remove-table-from-connection)
* [Search Connection](../../doc/controllers/connection.md#search-connection)


# Get Connection

To get the details of a specific connection use this endpoint.

Permission: Requires datamanagement privilege

```csharp
GetConnectionAsync(
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
    ConnectionResponse result = await connectionController.GetConnectionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

Permission: Requires datamanagement privilege

```csharp
GetConnectionDatabaseAsync(
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
    List<string> result = await connectionController.GetConnectionDatabaseAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

Permission: Requires datamanagement privilege

```csharp
GetConnectionTablesAsync(
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
    ConnectionTableResponse result = await connectionController.GetConnectionTablesAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

Permission: Requires datamanagement privilege

```csharp
GetConnectionTableColumnsAsync(
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
    ConnectionTableColumnsResponse result = await connectionController.GetConnectionTableColumnsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

Permission: Requires datamanagement privilege

```csharp
CreateConnectionAsync(
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
body.Type = Type15Enum.TERADATA;
body.Name = "name6";
body.Configuration = "configuration0";

try
{
    CreateConnectionResponse result = await connectionController.CreateConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Connection

You can use this endpoint to programmatically modify an existing connection

Permission: Requires datamanagement privilege

```csharp
UpdateConnectionAsync(
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
    bool? result = await connectionController.UpdateConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

Permission: Requires datamanagement privilege

```csharp
DeleteConnectionAsync(
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
    bool? result = await connectionController.DeleteConnectionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

Permission: Requires datamanagement privilege

```csharp
AddTableToConnectionAsync(
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
    bool? result = await connectionController.AddTableToConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

Permission: Requires datamanagement privilege

```csharp
RemoveTableFromConnectionAsync(
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
    bool? result = await connectionController.RemoveTableFromConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

Permission: Requires datamanagement privilege

```csharp
SearchConnectionAsync(
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
body.Type = Type16Enum.TERADATA;

try
{
    List<ConnectionResponse> result = await connectionController.SearchConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

