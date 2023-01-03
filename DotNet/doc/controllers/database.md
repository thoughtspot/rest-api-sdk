# Database

```csharp
DatabaseController databaseController = client.DatabaseController;
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

```csharp
RestapiV2GetSchemasAsync(
    string database)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |

## Response Type

`Task<List<string>>`

## Example Usage

```csharp
string database = "database0";

try
{
    List<string> result = await databaseController.RestapiV2GetSchemasAsync(database);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Tables

To list all the tables in a schema of a database in Falcon, use this endpoint.

```csharp
RestapiV2GetTablesAsync(
    string database,
    string schema)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `schema` | `string` | Query, Required | Name of the schema in Falcon database |

## Response Type

`Task<List<string>>`

## Example Usage

```csharp
string database = "database0";
string schema = "schema2";

try
{
    List<string> result = await databaseController.RestapiV2GetTablesAsync(database, schema);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Table Details

Note: This endpoint is applicable only for on-prem deployments.

To provide details of a table in a schema of a database in Falcon, use this endpoint.

```csharp
RestapiV2GetTableDetailsAsync(
    string database,
    string table,
    string schema = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `table` | `string` | Query, Required | Name of the table in Falcon database |
| `schema` | `string` | Query, Optional | Name of the schema in Falcon database |

## Response Type

`Task<object>`

## Example Usage

```csharp
string database = "database0";
string table = "table2";

try
{
    object result = await databaseController.RestapiV2GetTableDetailsAsync(database, table, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Table

To create a table in Falcon, use this endpoint.

```csharp
RestapiV2CreateTableAsync(
    Models.TspublicRestV2DatabaseTableCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2DatabaseTableCreateRequest`](../../doc/models/tspublic-rest-v2-database-table-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.CreateTableResponse>`](../../doc/models/create-table-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2DatabaseTableCreateRequest();

try
{
    CreateTableResponse result = await databaseController.RestapiV2CreateTableAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Run Query

To run a TQL statement in Falcon, use this endpoint. You can run only following type of statements - Table DDL alter and Table rows update and delete.

```csharp
RestapiV2RunQueryAsync(
    Models.TspublicRestV2DatabaseTableRunqueryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2DatabaseTableRunqueryRequest`](../../doc/models/tspublic-rest-v2-database-table-runquery-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2DatabaseTableRunqueryRequest();
body.Statement = new List<string>();
body.Statement.Add("statement6");
body.Statement.Add("statement7");

try
{
    object result = await databaseController.RestapiV2RunQueryAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

