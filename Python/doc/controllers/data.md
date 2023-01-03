# Data

```python
data_controller = client.data
```

## Class Name

`DataController`

## Methods

* [Restapi V2 Search Query Data](../../doc/controllers/data.md#restapi-v2-search-query-data)
* [Restapi V2 Liveboard Data](../../doc/controllers/data.md#restapi-v2-liveboard-data)
* [Restapi V2 Answer Data](../../doc/controllers/data.md#restapi-v2-answer-data)
* [Restapi V2 Answer Query Sql](../../doc/controllers/data.md#restapi-v2-answer-query-sql)
* [Restapi V2 Liveboard Query Sql](../../doc/controllers/data.md#restapi-v2-liveboard-query-sql)


# Restapi V2 Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

```python
def restapi_v_2__search_query_data(self,
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

result = data_controller.restapi_v_2__search_query_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Liveboard Data

To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use this endpoint

```python
def restapi_v_2__liveboard_data(self,
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

result = data_controller.restapi_v_2__liveboard_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Answer Data

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

```python
def restapi_v_2__answer_data(self,
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

result = data_controller.restapi_v_2__answer_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Answer Query Sql

To retrieve the query SQL related to an Answer that is run on the data platform, you can use this endpoint

```python
def restapi_v_2__answer_query_sql(self,
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

result = data_controller.restapi_v_2__answer_query_sql(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Liveboard Query Sql

To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform, you can use this endpoint

```python
def restapi_v_2__liveboard_query_sql(self,
                                    id,
                                    viz_id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | The GUID of the Answer |
| `viz_id` | `List of string` | Query, Optional | A JSON array of GUIDs of the visualizations in the Liveboard. |

## Response Type

[`LiveboardQueryResponse`](../../doc/models/liveboard-query-response.md)

## Example Usage

```python
id = 'id0'

result = data_controller.restapi_v_2__liveboard_query_sql(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

