# Connection

```ts
const connectionController = new ConnectionController(client);
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

```ts
async restapiV2GetConnection(
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
  const { result, ...httpResponse } = await connectionController.restapiV2GetConnection(id);
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


# Restapi V2 Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

```ts
async restapiV2GetConnectionDatabase(
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
  const { result, ...httpResponse } = await connectionController.restapiV2GetConnectionDatabase(id);
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


# Restapi V2 Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.
Using this API, you can create a connection and assign groups.
To create a connection, you require admin connection privileges.
All connections created in the ThoughtSpot system are added to ALL_GROUP

```ts
async restapiV2CreateConnection(
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
  type: 'ORACLE_ADW',
  name: 'name6',
  configuration: 'configuration0',
};

try {
  const { result, ...httpResponse } = await connectionController.restapiV2CreateConnection(body);
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


# Restapi V2 Update Connection

You can use this endpoint to programmatically modify an existing connection
To modify a connection, you require admin connection privileges.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered and connectionname will be updated

```ts
async restapiV2UpdateConnection(
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
  const { result, ...httpResponse } = await connectionController.restapiV2UpdateConnection(body);
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


# Restapi V2 Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```ts
async restapiV2DeleteConnection(
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
  const { result, ...httpResponse } = await connectionController.restapiV2DeleteConnection(id);
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


# Restapi V2 Add Table to Connection

To programmatically add table to an existing connection use this endpoint.
When you assign groups to a connection, the connection inherits the privileges assigned to those groups.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered.

```ts
async restapiV2AddTableToConnection(
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
  const { result, ...httpResponse } = await connectionController.restapiV2AddTableToConnection(body);
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


# Restapi V2 Remove Table From Connection

To programmatically remove a table from a connection use API endpoint.
The API removes only the connection association. It does not delete the connection or group from the Thoughtspot system.
At least one of id or name of connection is required. When both are given connection id will be considered.

```ts
async restapiV2RemoveTableFromConnection(
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
  const { result, ...httpResponse } = await connectionController.restapiV2RemoveTableFromConnection(body);
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


# Restapi V2 Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```ts
async restapiV2SearchConnection(
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
  type: 'ORACLE_ADW',
};

try {
  const { result, ...httpResponse } = await connectionController.restapiV2SearchConnection(body);
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


# Restapi V2 Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

```ts
async restapiV2GetConnectionTables(
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
  const { result, ...httpResponse } = await connectionController.restapiV2GetConnectionTables(body);
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


# Restapi V2 Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

```ts
async restapiV2GetConnectionTableColumns(
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
  const { result, ...httpResponse } = await connectionController.restapiV2GetConnectionTableColumns(body);
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

