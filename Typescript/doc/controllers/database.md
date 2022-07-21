# Database

```ts
const databaseController = new DatabaseController(client);
```

## Class Name

`DatabaseController`

## Methods

* [Get Databases](../../doc/controllers/database.md#get-databases)
* [Get Schemas](../../doc/controllers/database.md#get-schemas)
* [Get Tables](../../doc/controllers/database.md#get-tables)
* [Get Table Details](../../doc/controllers/database.md#get-table-details)
* [Create Table](../../doc/controllers/database.md#create-table)
* [Run Query](../../doc/controllers/database.md#run-query)


# Get Databases

Note: This endpoint is applicable only for on-prem deployments

To list all the databases in Falcon, use this endpoint.

Permission: Requires administration privilege

```ts
async getDatabases(
  requestOptions?: RequestOptions
): Promise<ApiResponse<string[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`string[]`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await databaseController.getDatabases();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Get Schemas

Note: This endpoint is applicable only for on-prem deployments

To list all the schemas in a database in Falcon, use this endpoint.

Permission: Requires administration privilege

```ts
async getSchemas(
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
  const { result, ...httpResponse } = await databaseController.getSchemas(database);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Get Tables

Note: This endpoint is applicable only for on-prem deployments.

To list all the tables in a schema of a database in Falcon, use this endpoint.

Permission: Requires administration privilege

```ts
async getTables(
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
  const { result, ...httpResponse } = await databaseController.getTables(database, schema);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Get Table Details

Note: This endpoint is applicable only for on-prem deployments.

To provide details of a table in a schema of a database in Falcon, use this endpoint.

```ts
async getTableDetails(
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
  const { result, ...httpResponse } = await databaseController.getTableDetails(database, table);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Create Table

Note: This endpoint is applicable only for on-prem deployments.

To create a table in Falcon, use this endpoint.

Permission: Requires administration privilege

```ts
async createTable(
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
  const { result, ...httpResponse } = await databaseController.createTable(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Run Query

Note: This endpoint is applicable only for on-prem deployments.

To run a TQL statement in Falcon, use this endpoint.

You can run only following type of statements - Table DDL alter and Table rows update and delete.

Permission: Requires administration privilege

```ts
async runQuery(
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
  const { result, ...httpResponse } = await databaseController.runQuery(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

