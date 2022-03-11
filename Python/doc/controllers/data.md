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


# Search Query Data

To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint

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

To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint

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
body.id = 'id6'

result = data_controller.liveboard_data(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

