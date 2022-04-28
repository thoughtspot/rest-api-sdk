# Data

```python
data_controller = client.data
```

## Class Name

`DataController`

## Methods

* [Search Query Data](../../doc/controllers/data.md#search-query-data)
* [Answer Data](../../doc/controllers/data.md#answer-data)
* [Liveboard Data](../../doc/controllers/data.md#liveboard-data)
* [Answer Query Sql](../../doc/controllers/data.md#answer-query-sql)
* [Liveboard Query Sql](../../doc/controllers/data.md#liveboard-query-sql)


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

Permission: Requires at least view access to the dataobject and datadownloading privilege

```python
def search_query_data(self,
                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataSearchRequest`](../../doc/models/tspublic-rest-v2-data-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2DataSearchRequest()
body.query_string = 'queryString0'
body.data_object_id = 'dataObjectId6'

result = data_controller.search_query_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.

Permission: Requires at least view access to the object and datadownloading privilege

```python
def answer_data(self,
               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataAnswerRequest`](../../doc/models/tspublic-rest-v2-data-answer-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2DataAnswerRequest()
body.id = 'id6'

result = data_controller.answer_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

Permission: Requires at least view access to the object and datadownloading privilege

```python
def liveboard_data(self,
                  body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2DataLiveboardRequest`](../../doc/models/tspublic-rest-v2-data-liveboard-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2DataLiveboardRequest()

result = data_controller.liveboard_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```python
def answer_query_sql(self,
                    id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Answer |

## Response Type

[`AnswerQueryResponse`](../../doc/models/answer-query-response.md)

## Example Usage

```python
id = 'id0'

result = data_controller.answer_query_sql(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint.

Permission: Requires at least view access to the object

```python
def liveboard_query_sql(self,
                       id,
                       viz_id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Liveboard |
| `viz_id` | `List of string` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```python
id = 'id0'

result = data_controller.liveboard_query_sql(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

