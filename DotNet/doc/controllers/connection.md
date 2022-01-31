# Connection

```csharp
ConnectionController connectionController = client.ConnectionController;
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

```csharp
GetConnectionAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection to query |

## Response Type

[`Task<Models.ConnectionResponse>`](/doc/models/connection-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

```csharp
CreateConnectionAsync(
    Models.ApiRestV2ConnectionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2ConnectionCreateRequest`](/doc/models/api-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.CreateConnectionResponse>`](/doc/models/create-connection-response.md)

## Example Usage

```csharp
var body = new ApiRestV2ConnectionCreateRequest();
body.Type = Type13Enum.TERADATA;
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Connection

You can use this endpoint to programmatically modify an existing connection

```csharp
UpdateConnectionAsync(
    Models.ApiRestV2ConnectionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2ConnectionUpdateRequest`](/doc/models/api-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2ConnectionUpdateRequest();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

```csharp
AddTableToConnectionAsync(
    Models.ApiRestV2ConnectionAddtableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2ConnectionAddtableRequest`](/doc/models/api-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2ConnectionAddtableRequest();
body.Id = "id6";
body.Tables = new List<AddTableInput>();

var bodyTables0 = new AddTableInput();
bodyTables0.Name = "name8";
bodyTables0.DbName = "dbName6";
bodyTables0.SchemaName = "schemaName2";
bodyTables0.Columns = new List<ColumnsInput>();

var bodyTables0Columns0 = new ColumnsInput();
bodyTables0Columns0.Name = "name2";
bodyTables0Columns0.DataType = "dataType4";
bodyTables0.Columns.Add(bodyTables0Columns0);

var bodyTables0Columns1 = new ColumnsInput();
bodyTables0Columns1.Name = "name3";
bodyTables0Columns1.DataType = "dataType5";
bodyTables0.Columns.Add(bodyTables0Columns1);

var bodyTables0Columns2 = new ColumnsInput();
bodyTables0Columns2.Name = "name4";
bodyTables0Columns2.DataType = "dataType6";
bodyTables0.Columns.Add(bodyTables0Columns2);

body.Tables.Add(bodyTables0);


try
{
    bool? result = await connectionController.AddTableToConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

```csharp
RemoveTableFromConnectionAsync(
    Models.ApiRestV2ConnectionRemovetableRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2ConnectionRemovetableRequest`](/doc/models/api-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`Task<bool>`

## Example Usage

```csharp
var body = new ApiRestV2ConnectionRemovetableRequest();
body.Id = "id6";
body.Tables = new List<TableInput>();

var bodyTables0 = new TableInput();
body.Tables.Add(bodyTables0);


try
{
    bool? result = await connectionController.RemoveTableFromConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```csharp
SearchConnectionAsync(
    Models.ApiRestV2ConnectionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2ConnectionSearchRequest`](/doc/models/api-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`Task<List<Models.ConnectionResponse>>`](/doc/models/connection-response.md)

## Example Usage

```csharp
var body = new ApiRestV2ConnectionSearchRequest();
body.Type = Type14Enum.TERADATA;

try
{
    List<ConnectionResponse> result = await connectionController.SearchConnectionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

