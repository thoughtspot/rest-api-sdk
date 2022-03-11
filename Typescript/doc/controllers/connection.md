# Connection

```ts
const connectionController = new ConnectionController(client);
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

[`ConnectionResponse`](../../doc/models/connection-response.md)

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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

```ts
async getConnectionDatabase(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<string[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`string[]`

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await connectionController.getConnectionDatabase(id);
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


# Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

```ts
async getConnectionTables(
  body: TspublicRestV2ConnectionTableRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ConnectionTableResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTableRequest`](../../doc/models/tspublic-rest-v2-connection-table-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ConnectionTableResponse`](../../doc/models/connection-table-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ConnectionTableRequest = {
  id: 'id6',
};

try {
  const { result, ...httpResponse } = await connectionController.getConnectionTables(body);
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


# Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

```ts
async getConnectionTableColumns(
  body: TspublicRestV2ConnectionTablecoloumnRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ConnectionTableColumnsResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTablecoloumnRequest`](../../doc/models/tspublic-rest-v2-connection-tablecoloumn-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ConnectionTableColumnsResponse`](../../doc/models/connection-table-columns-response.md)

## Example Usage

```ts
const contentType = null;
const bodyTable: ConnectionTableColumnsInput[] = [];

const bodytable0: ConnectionTableColumnsInput = {
  dbName: 'dbName8',
  schemaName: 'schemaName4',
  name: 'name0',
};

bodyTable[0] = bodytable0;

const bodytable1: ConnectionTableColumnsInput = {
  dbName: 'dbName9',
  schemaName: 'schemaName5',
  name: 'name1',
};

bodyTable[1] = bodytable1;

const bodytable2: ConnectionTableColumnsInput = {
  dbName: 'dbName0',
  schemaName: 'schemaName6',
  name: 'name2',
};

bodyTable[2] = bodytable2;

const body: TspublicRestV2ConnectionTablecoloumnRequest = {
  id: 'id6',
  table: bodyTable,
};

try {
  const { result, ...httpResponse } = await connectionController.getConnectionTableColumns(body);
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


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

```ts
async createConnection(
  body: TspublicRestV2ConnectionCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<CreateConnectionResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionCreateRequest`](../../doc/models/tspublic-rest-v2-connection-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`CreateConnectionResponse`](../../doc/models/create-connection-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ConnectionCreateRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Update Connection

You can use this endpoint to programmatically modify an existing connection

```ts
async updateConnection(
  body: TspublicRestV2ConnectionUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionUpdateRequest`](../../doc/models/tspublic-rest-v2-connection-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ConnectionUpdateRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

```ts
async addTableToConnection(
  body: TspublicRestV2ConnectionAddtableRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionAddtableRequest`](../../doc/models/tspublic-rest-v2-connection-addtable-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTable: AddTableInput[] = [];

const bodytable0Columns: ColumnsInput[] = [];

const bodytable0columns0: ColumnsInput = {
  name: 'name0',
  dataType: 'dataType2',
};

bodytable0Columns[0] = bodytable0columns0;

const bodytable0columns1: ColumnsInput = {
  name: 'name1',
  dataType: 'dataType3',
};

bodytable0Columns[1] = bodytable0columns1;

const bodytable0: AddTableInput = {
  name: 'name0',
  dbName: 'dbName8',
  schemaName: 'schemaName4',
  columns: bodytable0Columns,
};

bodyTable[0] = bodytable0;

const bodytable1Columns: ColumnsInput[] = [];

const bodytable1columns0: ColumnsInput = {
  name: 'name9',
  dataType: 'dataType1',
};

bodytable1Columns[0] = bodytable1columns0;

const bodytable1: AddTableInput = {
  name: 'name1',
  dbName: 'dbName9',
  schemaName: 'schemaName5',
  columns: bodytable1Columns,
};

bodyTable[1] = bodytable1;

const bodytable2Columns: ColumnsInput[] = [];

const bodytable2columns0: ColumnsInput = {
  name: 'name8',
  dataType: 'dataType0',
};

bodytable2Columns[0] = bodytable2columns0;

const bodytable2columns1: ColumnsInput = {
  name: 'name9',
  dataType: 'dataType1',
};

bodytable2Columns[1] = bodytable2columns1;

const bodytable2columns2: ColumnsInput = {
  name: 'name0',
  dataType: 'dataType2',
};

bodytable2Columns[2] = bodytable2columns2;

const bodytable2: AddTableInput = {
  name: 'name2',
  dbName: 'dbName0',
  schemaName: 'schemaName6',
  columns: bodytable2Columns,
};

bodyTable[2] = bodytable2;

const body: TspublicRestV2ConnectionAddtableRequest = {
  id: 'id6',
  table: bodyTable,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

```ts
async removeTableFromConnection(
  body: TspublicRestV2ConnectionRemovetableRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionRemovetableRequest`](../../doc/models/tspublic-rest-v2-connection-removetable-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
const contentType = null;
const bodyTable: TableInput[] = [];

const bodytable0: TableInput = {};

bodyTable[0] = bodytable0;

const bodytable1: TableInput = {};

bodyTable[1] = bodytable1;

const bodytable2: TableInput = {};

bodyTable[2] = bodytable2;

const body: TspublicRestV2ConnectionRemovetableRequest = {
  id: 'id6',
  table: bodyTable,
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```ts
async searchConnection(
  body: TspublicRestV2ConnectionSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ConnectionResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionSearchRequest`](../../doc/models/tspublic-rest-v2-connection-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ConnectionResponse[]`](../../doc/models/connection-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2ConnectionSearchRequest = {
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

