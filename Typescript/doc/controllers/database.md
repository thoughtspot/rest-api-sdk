# Database

```ts
const databaseController = new DatabaseController(client);
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

```ts
async restapiV2GetSchemas(
  database: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<string[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`string[]`

## Example Usage

```ts
const database = 'database0';
try {
  const { result, ...httpResponse } = await databaseController.restapiV2GetSchemas(database);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Get Tables

To list all the tables in a schema of a database in Falcon, use this endpoint.

```ts
async restapiV2GetTables(
  database: string,
  schema: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<string[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `schema` | `string` | Query, Required | Name of the schema in Falcon database |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`string[]`

## Example Usage

```ts
const database = 'database0';
const schema = 'schema2';
try {
  const { result, ...httpResponse } = await databaseController.restapiV2GetTables(database, schema);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Get Table Details

Note: This endpoint is applicable only for on-prem deployments.

To provide details of a table in a schema of a database in Falcon, use this endpoint.

```ts
async restapiV2GetTableDetails(
  database: string,
  table: string,
  schema?: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `table` | `string` | Query, Required | Name of the table in Falcon database |
| `schema` | `string \| undefined` | Query, Optional | Name of the schema in Falcon database |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const database = 'database0';
const table = 'table2';
try {
  const { result, ...httpResponse } = await databaseController.restapiV2GetTableDetails(database, table);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Create Table

To create a table in Falcon, use this endpoint.

```ts
async restapiV2CreateTable(
  body: TspublicRestV2DatabaseTableCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<CreateTableResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableCreateRequest`](../../doc/models/tspublic-rest-v2-database-table-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`CreateTableResponse`](../../doc/models/create-table-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2DatabaseTableCreateRequest = {};

try {
  const { result, ...httpResponse } = await databaseController.restapiV2CreateTable(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Restapi V2 Run Query

To run a TQL statement in Falcon, use this endpoint. You can run only following type of statements - Table DDL alter and Table rows update and delete.

```ts
async restapiV2RunQuery(
  body: TspublicRestV2DatabaseTableRunqueryRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableRunqueryRequest`](../../doc/models/tspublic-rest-v2-database-table-runquery-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown[]`

## Example Usage

```ts
const contentType = null;
const bodyStatement: string[] = ['statement6', 'statement7'];
const body: TspublicRestV2DatabaseTableRunqueryRequest = {
  statement: bodyStatement,
};

try {
  const { result, ...httpResponse } = await databaseController.restapiV2RunQuery(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error.result;
    // const { statusCode, headers } = error;
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

