# Database

```python
database_controller = client.database
```

## Class Name

`DatabaseController`

## Methods

* [Get Databases](../../doc/controllers/database.md#get-databases)
* [Get Schemas](../../doc/controllers/database.md#get-schemas)
* [Get Tables](../../doc/controllers/database.md#get-tables)
* [Create Table](../../doc/controllers/database.md#create-table)
* [Run Query](../../doc/controllers/database.md#run-query)


# Get Databases

Note: This endpoint is applicable only for on-prem deployments

To list all the databases in Falcon, use this endpoint.

```python
def get_databases(self)
```

## Response Type

`List of string`

## Example Usage

```python
result = database_controller.get_databases()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Schemas

Note: This endpoint is applicable only for on-prem deployments

To list all the schemas in a database in Falcon, use this endpoint.

```python
def get_schemas(self,
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

result = database_controller.get_schemas(database)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Tables

Note: This endpoint is applicable only for on-prem deployments.

To list all the tables in a schema of a database in Falcon, use this endpoint.

```python
def get_tables(self,
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

result = database_controller.get_tables(database, schema)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Table

Note: This endpoint is applicable only for on-prem deployments.

To create a table in Falcon, use this endpoint.

```python
def create_table(self,
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

result = database_controller.create_table(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Run Query

Note: This endpoint is applicable only for on-prem deployments.

To run a TQL statement in Falcon, use this endpoint.

You can run only following type of statements - Table DDL alter and Table rows update and delete.

```python
def run_query(self,
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

result = database_controller.run_query(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

