# Custom Actions

```ts
const customActionsController = new CustomActionsController(client);
```

## Class Name

`CustomActionsController`

## Methods

* [Restapi V2 Get Custom Action](../../doc/controllers/custom-actions.md#restapi-v2-get-custom-action)
* [Restapi V2 Search Custom Action](../../doc/controllers/custom-actions.md#restapi-v2-search-custom-action)
* [Restapi V2 Get Custom Action Association](../../doc/controllers/custom-actions.md#restapi-v2-get-custom-action-association)
* [Restapi V2 Create Custom Action](../../doc/controllers/custom-actions.md#restapi-v2-create-custom-action)
* [Restapi V2 Update Custom Action](../../doc/controllers/custom-actions.md#restapi-v2-update-custom-action)
* [Restapi V2 Delete Custom Action](../../doc/controllers/custom-actions.md#restapi-v2-delete-custom-action)
* [Restapi V2 Update Custom Action Association](../../doc/controllers/custom-actions.md#restapi-v2-update-custom-action-association)
* [Restapi V2 Delete Custom Action Association](../../doc/controllers/custom-actions.md#restapi-v2-delete-custom-action-association)


# Restapi V2 Get Custom Action

To get details of a specific custom action configured in the ThoughtSpot system, use this endpoint

```ts
async restapiV2GetCustomAction(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await customActionsController.restapiV2GetCustomAction(id);
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


# Restapi V2 Search Custom Action

To search custom actions available on a ThoughtSpot instance, use this endpoint

```ts
async restapiV2SearchCustomAction(
  body: TspublicRestV2CustomactionSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionSearchRequest`](../../doc/models/tspublic-rest-v2-customaction-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2CustomactionSearchRequest = {};

try {
  const { result, ...httpResponse } = await customActionsController.restapiV2SearchCustomAction(body);
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


# Restapi V2 Get Custom Action Association

ThoughtSpot supports associating custom actions to Liveboards, answers, and worksheets. To get the details of the ThoughtSpot objects associated with a custom action, use this endpoint.

```ts
async restapiV2GetCustomActionAssociation(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await customActionsController.restapiV2GetCustomActionAssociation(id);
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


# Restapi V2 Create Custom Action

To programmatically create custom actions on ThoughtSpot clusters that support embedding configuration, use this endpoint

```ts
async restapiV2CreateCustomAction(
  body: TspublicRestV2CustomactionCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionCreateRequest`](../../doc/models/tspublic-rest-v2-customaction-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2CustomactionCreateRequest = {
  configuration: 'configuration0',
};

try {
  const { result, ...httpResponse } = await customActionsController.restapiV2CreateCustomAction(body);
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


# Restapi V2 Update Custom Action

To programmatically edit an existing custom action, use this endpoint

```ts
async restapiV2UpdateCustomAction(
  body: TspublicRestV2CustomactionUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2CustomactionUpdateRequest = {
  id: 'id6',
  configuration: 'configuration0',
};

try {
  const { result, ...httpResponse } = await customActionsController.restapiV2UpdateCustomAction(body);
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


# Restapi V2 Delete Custom Action

To programmatically delete a custom action, use this endpoint

```ts
async restapiV2DeleteCustomAction(
  id: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const id = 'id0';
try {
  const { result, ...httpResponse } = await customActionsController.restapiV2DeleteCustomAction(id);
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


# Restapi V2 Update Custom Action Association

To programmatically associate a custom action to a ThoughtSpot object, use this endpoint

```ts
async restapiV2UpdateCustomActionAssociation(
  body: TspublicRestV2CustomactionAssociationUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionAssociationUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-association-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2CustomactionAssociationUpdateRequest = {
  id: 'id6',
  association: 'association6',
};

try {
  const { result, ...httpResponse } = await customActionsController.restapiV2UpdateCustomActionAssociation(body);
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


# Restapi V2 Delete Custom Action Association

To remove custom action associations to ThoughtSpot objects, use this endpoint

```ts
async restapiV2DeleteCustomActionAssociation(
  id: string,
  association: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<unknown>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `association` | `string` | Query, Required | A JSON map of the attributes with association of the action to ThoughtSpot object ID<br><br>Example:<br><br>{"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`unknown`

## Example Usage

```ts
const id = 'id0';
const association = 'association0';
try {
  const { result, ...httpResponse } = await customActionsController.restapiV2DeleteCustomActionAssociation(id, association);
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

