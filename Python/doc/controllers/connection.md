# Connection

```python
connection_controller = client.connection
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

```python
def get_connection(self,
                  id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the connection to query |

## Response Type

[`ConnectionResponse`](/doc/models/connection-response.md)

## Example Usage

```python
id = 'id0'

result = connection_controller.get_connection(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Create Connection

To programmatically create a connection in the ThoughtSpot system use this API endpoint.

```python
def create_connection(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionCreateRequest`](/doc/models/api-rest-v2-connection-create-request.md) | Body, Required | - |

## Response Type

[`CreateConnectionResponse`](/doc/models/create-connection-response.md)

## Example Usage

```python
body = ApiRestV2ConnectionCreateRequest()
body.mtype = Type13Enum.TERADATA
body.name = 'name6'
body.configuration = 'configuration0'

result = connection_controller.create_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Update Connection

You can use this endpoint to programmatically modify an existing connection

```python
def update_connection(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionUpdateRequest`](/doc/models/api-rest-v2-connection-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2ConnectionUpdateRequest()
body.id = 'id6'
body.configuration = 'configuration0'

result = connection_controller.update_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Delete Connection

To remove a connection from the ThoughtSpot system, use this endpoint.

```python
def delete_connection(self,
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

result = connection_controller.delete_connection(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Add Table to Connection

To programmatically add table to an existing connection, use this endpoint

```python
def add_table_to_connection(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionAddtableRequest`](/doc/models/api-rest-v2-connection-addtable-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2ConnectionAddtableRequest()
body.id = 'id6'
body.tables = []

body.tables.append(AddTableInput())
body.tables[0].name = 'name8'
body.tables[0].db_name = 'dbName6'
body.tables[0].schema_name = 'schemaName2'
body.tables[0].columns = []

body.tables[0].columns.append(ColumnsInput())
body.tables[0].columns[0].name = 'name2'
body.tables[0].columns[0].data_type = 'dataType4'

body.tables[0].columns.append(ColumnsInput())
body.tables[0].columns[1].name = 'name3'
body.tables[0].columns[1].data_type = 'dataType5'

body.tables[0].columns.append(ColumnsInput())
body.tables[0].columns[2].name = 'name4'
body.tables[0].columns[2].data_type = 'dataType6'



result = connection_controller.add_table_to_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Remove Table From Connection

To programmatically remove a table from a connection, use API endpoint.

```python
def remove_table_from_connection(self,
                                body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionRemovetableRequest`](/doc/models/api-rest-v2-connection-removetable-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = ApiRestV2ConnectionRemovetableRequest()
body.id = 'id6'
body.tables = []

body.tables.append(TableInput())


result = connection_controller.remove_table_from_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |


# Search Connection

To get the details of a specific connection or all connections in the ThoughtSpot system use this end point.

```python
def search_connection(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2ConnectionSearchRequest`](/doc/models/api-rest-v2-connection-search-request.md) | Body, Required | - |

## Response Type

[`List of ConnectionResponse`](/doc/models/connection-response.md)

## Example Usage

```python
body = ApiRestV2ConnectionSearchRequest()
body.mtype = Type14Enum.TERADATA

result = connection_controller.search_connection(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

