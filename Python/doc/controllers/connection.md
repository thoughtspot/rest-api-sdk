# Connection

```python
connection_controller = client.connection
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

```python
def restapi_v_2__get_connection(self,
                               id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection to query |

## Response Type

[`ConnectionResponse`](../../doc/models/connection-response.md)

## Example Usage

```python
id = 'id0'

result = connection_controller.restapi_v_2__get_connection(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Database

To get the list of databases for a connection, use this endpoint.

The response will include databases from the data platform corresponding to the connection id provided.

```python
def restapi_v_2__get_connection_database(self,
                                        id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection |

## Response Type

`List of string`

## Example Usage

```python
id = 'id0'

result = connection_controller.restapi_v_2__get_connection_database(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.
Using this API, you can create a connection and assign groups.
To create a connection, you require admin connection privileges.
All connections created in the ThoughtSpot system are added to ALL_GROUP

```python
def restapi_v_2__create_connection(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionCreateRequest`](../../doc/models/tspublic-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`CreateConnectionResponse`](../../doc/models/create-connection-response.md)

## Example Usage

```python
body = TspublicRestV2ConnectionCreateRequest()
body.mtype = Type14Enum.ORACLE_ADW
body.name = 'name6'
body.configuration = 'configuration0'

result = connection_controller.restapi_v_2__create_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Connection

You can use this endpoint to programmatically modify an existing connection
To modify a connection, you require admin connection privileges.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered and connectionname will be updated

```python
def restapi_v_2__update_connection(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionUpdateRequest`](../../doc/models/tspublic-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2ConnectionUpdateRequest()
body.id = 'id6'
body.configuration = 'configuration0'

result = connection_controller.restapi_v_2__update_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```python
def restapi_v_2__delete_connection(self,
                                  id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `List of string` | Query, Required | A JSON array of GUIDs of the connection |

## Response Type

`bool`

## Example Usage

```python
id = ['id0']

result = connection_controller.restapi_v_2__delete_connection(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Add Table to Connection

To programmatically add table to an existing connection use this endpoint.
When you assign groups to a connection, the connection inherits the privileges assigned to those groups.
At least one of Connection Id or connectionname is mandatory. When both are given, then connection id will be considered.

```python
def restapi_v_2__add_table_to_connection(self,
                                        body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionAddtableRequest`](../../doc/models/tspublic-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2ConnectionAddtableRequest()
body.id = 'id6'
body.table = []

body.table.append(AddTableInput())
body.table[0].name = 'name0'
body.table[0].db_name = 'dbName8'
body.table[0].schema_name = 'schemaName4'
body.table[0].columns = []

body.table[0].columns.append(ColumnsInput())
body.table[0].columns[0].name = 'name0'
body.table[0].columns[0].data_type = 'dataType2'

body.table[0].columns.append(ColumnsInput())
body.table[0].columns[1].name = 'name1'
body.table[0].columns[1].data_type = 'dataType3'


body.table.append(AddTableInput())
body.table[1].name = 'name1'
body.table[1].db_name = 'dbName9'
body.table[1].schema_name = 'schemaName5'
body.table[1].columns = []

body.table[1].columns.append(ColumnsInput())
body.table[1].columns[0].name = 'name9'
body.table[1].columns[0].data_type = 'dataType1'


body.table.append(AddTableInput())
body.table[2].name = 'name2'
body.table[2].db_name = 'dbName0'
body.table[2].schema_name = 'schemaName6'
body.table[2].columns = []

body.table[2].columns.append(ColumnsInput())
body.table[2].columns[0].name = 'name8'
body.table[2].columns[0].data_type = 'dataType0'

body.table[2].columns.append(ColumnsInput())
body.table[2].columns[1].name = 'name9'
body.table[2].columns[1].data_type = 'dataType1'

body.table[2].columns.append(ColumnsInput())
body.table[2].columns[2].name = 'name0'
body.table[2].columns[2].data_type = 'dataType2'



result = connection_controller.restapi_v_2__add_table_to_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Remove Table From Connection

To programmatically remove a table from a connection use API endpoint.
The API removes only the connection association. It does not delete the connection or group from the Thoughtspot system.
At least one of id or name of connection is required. When both are given connection id will be considered.

```python
def restapi_v_2__remove_table_from_connection(self,
                                             body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionRemovetableRequest`](../../doc/models/tspublic-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2ConnectionRemovetableRequest()
body.id = 'id6'
body.table = []

body.table.append(TableInput())

body.table.append(TableInput())

body.table.append(TableInput())


result = connection_controller.restapi_v_2__remove_table_from_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```python
def restapi_v_2__search_connection(self,
                                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionSearchRequest`](../../doc/models/tspublic-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`List of ConnectionResponse`](../../doc/models/connection-response.md)

## Example Usage

```python
body = TspublicRestV2ConnectionSearchRequest()
body.mtype = Type15Enum.ORACLE_ADW

result = connection_controller.restapi_v_2__search_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Tables

To get the details of tables from a connection, use this endpoint.

You can get the details of tables in the data platform for the connection id provided.

```python
def restapi_v_2__get_connection_tables(self,
                                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTableRequest`](../../doc/models/tspublic-rest-v2-connection-table-request.md) | Body, Required | - |

## Response Type

[`ConnectionTableResponse`](../../doc/models/connection-table-response.md)

## Example Usage

```python
body = TspublicRestV2ConnectionTableRequest()
body.id = 'id6'

result = connection_controller.restapi_v_2__get_connection_tables(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Connection Table Columns

To get the details of columns in a table associated to a connection, use this endpoint.

You can get the columns of any table available in the data platform for the connection id provided.

```python
def restapi_v_2__get_connection_table_columns(self,
                                             body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2ConnectionTablecoloumnRequest`](../../doc/models/tspublic-rest-v2-connection-tablecoloumn-request.md) | Body, Required | - |

## Response Type

[`ConnectionTableColumnsResponse`](../../doc/models/connection-table-columns-response.md)

## Example Usage

```python
body = TspublicRestV2ConnectionTablecoloumnRequest()
body.id = 'id6'
body.table = []

body.table.append(ConnectionTableColumnsInput())
body.table[0].db_name = 'dbName8'
body.table[0].schema_name = 'schemaName4'
body.table[0].name = 'name0'

body.table.append(ConnectionTableColumnsInput())
body.table[1].db_name = 'dbName9'
body.table[1].schema_name = 'schemaName5'
body.table[1].name = 'name1'

body.table.append(ConnectionTableColumnsInput())
body.table[2].db_name = 'dbName0'
body.table[2].schema_name = 'schemaName6'
body.table[2].name = 'name2'


result = connection_controller.restapi_v_2__get_connection_table_columns(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

