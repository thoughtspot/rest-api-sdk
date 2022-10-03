# Org

```ts
const orgController = new OrgController(client);
```

## Class Name

`OrgController`

## Methods

* [Get Org](../../doc/controllers/org.md#get-org)
* [Create Org](../../doc/controllers/org.md#create-org)
* [Update Org](../../doc/controllers/org.md#update-org)
* [Delete Org](../../doc/controllers/org.md#delete-org)
* [Search Orgs](../../doc/controllers/org.md#search-orgs)


# Get Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To get the details of a specific organization by name or id, use this endpoint.

At least one value needed. When both are given,then id will be considered to fetch organization information.

Requires Administration privilege for tenant.

```ts
async getOrg(
  name?: string,
  id?: number,
  requestOptions?: RequestOptions
): Promise<ApiResponse<OrgsResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the organization. |
| `id` | `number \| undefined` | Query, Optional | The ID of the organization. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await orgController.getOrg();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Create Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically create an organization in the ThoughtSpot system, use this API endpoint.

```ts
async createOrg(
  body: TspublicRestV2OrgCreateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<OrgsResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgCreateRequest`](../../doc/models/tspublic-rest-v2-org-create-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2OrgCreateRequest = {
  name: 'name6',
};

try {
  const { result, ...httpResponse } = await orgController.createOrg(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Update Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

You can use this endpoint to programmatically modify an existing org.

Provide name or id of the organization to update the properties. When both id and name are given, then id will be considered and name of the organization will be updated.

Requires Administration privilege for tenant.

```ts
async updateOrg(
  body: TspublicRestV2OrgUpdateRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<OrgsResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgUpdateRequest`](../../doc/models/tspublic-rest-v2-org-update-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2OrgUpdateRequest = {};

try {
  const { result, ...httpResponse } = await orgController.updateOrg(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Delete Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value is needed. When both id and name are given, then id will be considered.

Requires Administration privilege for tenant.

```ts
async deleteOrg(
  name?: string,
  id?: number,
  requestOptions?: RequestOptions
): Promise<ApiResponse<boolean>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Query, Optional | Name of the organization. |
| `id` | `number \| undefined` | Query, Optional | The ID of the organization. |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

`boolean`

## Example Usage

```ts
try {
  const { result, ...httpResponse } = await orgController.deleteOrg();
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |


# Search Orgs

This is endpoint is applicable only if organization feature is enabled in the cluster.

To get the details of a specific organization or all organizations in the ThoughtSpot system use this end point.

If no input is provided, then all organizations are included in the response.

Requires Administration privilege for tenant.

```ts
async searchOrgs(
  body: TspublicRestV2OrgSearchRequest,
  requestOptions?: RequestOptions
): Promise<ApiResponse<OrgsResponse[]>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgSearchRequest`](../../doc/models/tspublic-rest-v2-org-search-request.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`OrgsResponse[]`](../../doc/models/orgs-response.md)

## Example Usage

```ts
const contentType = null;
const body: TspublicRestV2OrgSearchRequest = {};

try {
  const { result, ...httpResponse } = await orgController.searchOrgs(body);
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
| 500 | Operation failed or unauthorized request | [`ErrorResponseError`](../../doc/models/error-response-error.md) |

