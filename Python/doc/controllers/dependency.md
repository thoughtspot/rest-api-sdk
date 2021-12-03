# Dependency

```python
dependency_controller = client.dependency
```

## Class Name

`DependencyController`


# Get Object Dependency

To create a table in Falcon, use this endpoint.

```python
def get_object_dependency(self,
                         body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DependencyRequest`](/doc/models/api-rest-v2-dependency-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = ApiRestV2DependencyRequest()
body.mtype = Type10Enum.COLUMN
body.id = ['id6', 'id7']

result = dependency_controller.get_object_dependency(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](/doc/models/error-response-exception.md) |

