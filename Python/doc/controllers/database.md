# Database

```python
database_controller = client.database
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

```python
def restapi_v_2__get_schemas(self,
                            database)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |

## Response Type

`List of string`

## Example Usage

```python
database = 'database0'

result = database_controller.restapi_v_2__get_schemas(database)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Tables

To list all the tables in a schema of a database in Falcon, use this endpoint.

```python
def restapi_v_2__get_tables(self,
                           database,
                           schema)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `schema` | `string` | Query, Required | Name of the schema in Falcon database |

## Response Type

`List of string`

## Example Usage

```python
database = 'database0'
schema = 'schema2'

result = database_controller.restapi_v_2__get_tables(database, schema)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Table Details

Note: This endpoint is applicable only for on-prem deployments.

To provide details of a table in a schema of a database in Falcon, use this endpoint.

```python
def restapi_v_2__get_table_details(self,
                                  database,
                                  table,
                                  schema=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `database` | `string` | Query, Required | Name of the Falcon database |
| `table` | `string` | Query, Required | Name of the table in Falcon database |
| `schema` | `string` | Query, Optional | Name of the schema in Falcon database |

## Response Type

`object`

## Example Usage

```python
database = 'database0'
table = 'table2'

result = database_controller.restapi_v_2__get_table_details(database, table)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Table

To create a table in Falcon, use this endpoint.

```python
def restapi_v_2__create_table(self,
                             body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableCreateRequest`](../../doc/models/tspublic-rest-v2-database-table-create-request.md) | Body, Required | - |

## Response Type

[`CreateTableResponse`](../../doc/models/create-table-response.md)

## Example Usage

```python
body = TspublicRestV2DatabaseTableCreateRequest()

result = database_controller.restapi_v_2__create_table(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Run Query

To run a TQL statement in Falcon, use this endpoint. You can run only following type of statements - Table DDL alter and Table rows update and delete.

```python
def restapi_v_2__run_query(self,
                          body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DatabaseTableRunqueryRequest`](../../doc/models/tspublic-rest-v2-database-table-runquery-request.md) | Body, Required | - |

## Response Type

`List of object`

## Example Usage

```python
body = TspublicRestV2DatabaseTableRunqueryRequest()
body.statement = ['statement6', 'statement7']

result = database_controller.restapi_v_2__run_query(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

