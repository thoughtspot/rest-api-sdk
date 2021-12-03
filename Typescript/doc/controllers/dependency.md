# Dependency

```ts
const dependencyController = new DependencyController(client);
```

## Class Name

`DependencyController`


# Get Object Dependency

To create a table in Falcon, use this endpoint.

```ts
async getObjectDependency(
  body: ApiRestV2DependencyRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiRestV2DependencyRequest`](/doc/models/api-rest-v2-dependency-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const bodyId: string[] = ['id6', 'id7'];
const body: ApiRestV2DependencyRequest = {
  type: 'COLUMN',
  id: bodyId,
};

try {
  const { result, ...httpResponse } = await dependencyController.getObjectDependency(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](/doc/models/error-response-error.md) |

