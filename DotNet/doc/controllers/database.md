# Database

```csharp
DatabaseController databaseController = client.DatabaseController;
```

## Class Name

`DatabaseController`

## Methods

* [Get Databases](/doc/controllers/database.md#get-databases)
* [Get Schemas](/doc/controllers/database.md#get-schemas)
* [Get Tables](/doc/controllers/database.md#get-tables)
* [Create Table](/doc/controllers/database.md#create-table)
* [Run Query](/doc/controllers/database.md#run-query)


# Get Databases

Note: This endpoint is applicable only for on-prem deployments

To list all the databases in Falcon, use this endpoint.

```csharp
GetDatabasesAsync()
```

## Response Type

`Task<List<string>>`

## Example Usage

```csharp
try
{
    List<string> result = await databaseController.GetDatabasesAsync();
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Schemas

Note: This endpoint is applicable only for on-prem deployments

To list all the schemas in a database in Falcon, use this endpoint.

```csharp
GetSchemasAsync(
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
    List<string> result = await databaseController.GetSchemasAsync(database);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Get Tables

Note: This endpoint is applicable only for on-prem deployments.

To list all the tables in a schema of a database in Falcon, use this endpoint.

```csharp
GetTablesAsync(
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
    List<string> result = await databaseController.GetTablesAsync(database, schema);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Table

Note: This endpoint is applicable only for on-prem deployments.

To create a table in Falcon, use this endpoint.

```csharp
CreateTableAsync(
    Models.ApiRestV2DatabaseTableCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2DatabaseTableCreateRequest`](/doc/models/api-rest-v2-database-table-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.CreateTableResponse>`](/doc/models/create-table-response.md)

## Example Usage

```csharp
var body = new ApiRestV2DatabaseTableCreateRequest();

try
{
    CreateTableResponse result = await databaseController.CreateTableAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Run Query

Note: This endpoint is applicable only for on-prem deployments.

To run a TQL statement in Falcon, use this endpoint.

You can run only following type of statements - Table DDL alter and Table rows update and delete.

```csharp
RunQueryAsync(
    Models.ApiRestV2DatabaseTableRunqueryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.ApiRestV2DatabaseTableRunqueryRequest`](/doc/models/api-rest-v2-database-table-runquery-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new ApiRestV2DatabaseTableRunqueryRequest();
body.Statement = new List<string>();
body.Statement.Add("statement6");
body.Statement.Add("statement7");

try
{
    object result = await databaseController.RunQueryAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

