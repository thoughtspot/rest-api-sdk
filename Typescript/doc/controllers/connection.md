# Connection

```ts
const connectionController = new ConnectionController(client);
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

```ts
async getConnection(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ConnectionResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection to query |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ConnectionResponse`](/doc/models/connection-response.md)

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await connectionController.getConnection(id);
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


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

```ts
async createConnection(
  body: ApiRestV2ConnectionCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<CreateConnectionResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionCreateRequest`](/doc/models/api-rest-v2-connection-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`CreateConnectionResponse`](/doc/models/create-connection-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2ConnectionCreateRequest = {
  type: 'TERADATA',
  name: 'name6',
  configuration: 'configuration0',
};

try {
  const { result, ...httpResponse } = await connectionController.createConnection(body);
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


# Update Connection

You can use this endpoint to programmatically modify an existing connection

```ts
async updateConnection(
  body: ApiRestV2ConnectionUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionUpdateRequest`](/doc/models/api-rest-v2-connection-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2ConnectionUpdateRequest = {
  id: 'id6',
  configuration: 'configuration0',
};

try {
  const { result, ...httpResponse } = await connectionController.updateConnection(body);
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


# Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```ts
async deleteConnection(
  id: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string[]` | Query, Required | A JSON array of GUIDs of the connection |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const Id: string[] = ['id0'];
try {
  const { result, ...httpResponse } = await connectionController.deleteConnection(id);
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


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

```ts
async addTableToConnection(
  body: ApiRestV2ConnectionAddtableRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionAddtableRequest`](/doc/models/api-rest-v2-connection-addtable-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTables: AddTableInput[] = [];

const bodytables0Columns: ColumnsInput[] = [];

const bodytables0columns0: ColumnsInput = {
  name: 'name2',
  dataType: 'dataType4',
};

bodytables0Columns[0] = bodytables0columns0;

const bodytables0columns1: ColumnsInput = {
  name: 'name3',
  dataType: 'dataType5',
};

bodytables0Columns[1] = bodytables0columns1;

const bodytables0columns2: ColumnsInput = {
  name: 'name4',
  dataType: 'dataType6',
};

bodytables0Columns[2] = bodytables0columns2;

const bodytables0: AddTableInput = {
  name: 'name8',
  dbName: 'dbName6',
  schemaName: 'schemaName2',
  columns: bodytables0Columns,
};

bodyTables[0] = bodytables0;

const body: ApiRestV2ConnectionAddtableRequest = {
  id: 'id6',
  tables: bodyTables,
};

try {
  const { result, ...httpResponse } = await connectionController.addTableToConnection(body);
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


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

```ts
async removeTableFromConnection(
  body: ApiRestV2ConnectionRemovetableRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionRemovetableRequest`](/doc/models/api-rest-v2-connection-removetable-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTables: TableInput[] = [];

const bodytables0: TableInput = {};

bodyTables[0] = bodytables0;

const body: ApiRestV2ConnectionRemovetableRequest = {
  id: 'id6',
  tables: bodyTables,
};

try {
  const { result, ...httpResponse } = await connectionController.removeTableFromConnection(body);
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


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```ts
async searchConnection(
  body: ApiRestV2ConnectionSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ConnectionResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionSearchRequest`](/doc/models/api-rest-v2-connection-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ConnectionResponse[]`](/doc/models/connection-response.md)

## Example Usage

```ts
const contentType = null;
const body: ApiRestV2ConnectionSearchRequest = {
  type: 'TERADATA',
};

try {
  const { result, ...httpResponse } = await connectionController.searchConnection(body);
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

