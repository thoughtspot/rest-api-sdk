# Database

```ts
const databaseController = new DatabaseController(client);
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

To list all the databases in Falcon, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Schemas

To list all the schemas in a database in Falcon, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Get Tables

To list all the schemas in a database in Falcon, use this endpoint.

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Create Table

To create a table in Falcon, use this endpoint.

```ts
async createTable(
  body: ApiRestV2DatabaseTableCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<CreateTableResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DatabaseTableCreateRequest`](/doc/models/api-rest-v2-database-table-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`CreateTableResponse`](/doc/models/create-table-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2DatabaseTableCreateRequest = {};

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |


# Run Query

To create a table in Falcon, use this endpoint.

```ts
async runQuery(
  body: ApiRestV2DatabaseTableRunqueryRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DatabaseTableRunqueryRequest`](/doc/models/api-rest-v2-database-table-runquery-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown[]`

## Example Usage

```ts
const contentType = null;
const bodyStatement: string[] = ['statement6', 'statement7'];
const body: ApiRestV2DatabaseTableRunqueryRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

