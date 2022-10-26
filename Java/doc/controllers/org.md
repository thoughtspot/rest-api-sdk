# Org

```java
OrgController orgController = client.getOrgController();
```

## Class Name

`OrgController`

## Methods

* [Restapi V2 Get Org](../../doc/controllers/org.md#restapi-v2-get-org)
* [Restapi V2 Create Org](../../doc/controllers/org.md#restapi-v2-create-org)
* [Restapi V2 Update Org](../../doc/controllers/org.md#restapi-v2-update-org)
* [Restapi V2 Delete Org](../../doc/controllers/org.md#restapi-v2-delete-org)
* [Restapi V2 Search Orgs](../../doc/controllers/org.md#restapi-v2-search-orgs)


# Restapi V2 Get Org

To get the details of a specific organization by name or id, use this endpoint.

At least one value needed. When both are given,then id will be considered to fetch organization information.

Requires Administration privilege for tenant.

```java
CompletableFuture<OrgsResponse> restapiV2GetOrgAsync(
    final String name,
    final Integer id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the organization. |
| `id` | `Integer` | Query, Optional | The ID of the organization. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
orgController.restapiV2GetOrgAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Org

To programmatically create an organization in the ThoughtSpot system, use this API endpoint.

Requires Administration privilege for tenant.

```java
CompletableFuture<OrgsResponse> restapiV2CreateOrgAsync(
    final TspublicRestV2OrgCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgCreateRequest`](../../doc/models/tspublic-rest-v2-org-create-request.md) | Body, Required | - |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
TspublicRestV2OrgCreateRequest body = new TspublicRestV2OrgCreateRequest();
body.setName("name6");

orgController.restapiV2CreateOrgAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Org

You can use this endpoint to programmatically modify an existing org.

Provide name or id of the organization to update the properties. When both id and name are given, then id will be considered and name of the organization will be updated.

Requires Administration privilege for tenant.

```java
CompletableFuture<OrgsResponse> restapiV2UpdateOrgAsync(
    final TspublicRestV2OrgUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgUpdateRequest`](../../doc/models/tspublic-rest-v2-org-update-request.md) | Body, Required | - |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
TspublicRestV2OrgUpdateRequest body = new TspublicRestV2OrgUpdateRequest();

orgController.restapiV2UpdateOrgAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Org

To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value is needed. When both id and name are given, then id will be considered.

Requires Administration privilege for tenant.

```java
CompletableFuture<Boolean> restapiV2DeleteOrgAsync(
    final String name,
    final Integer id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the organization. |
| `id` | `Integer` | Query, Optional | The ID of the organization. |

## Response Type

`boolean`

## Example Usage

```java
orgController.restapiV2DeleteOrgAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Orgs

To get the details of a specific organization or all organizations in the ThoughtSpot system use this end point.

If no input is provided, then all organizations are included in the response.

Requires Administration privilege for tenant.

```java
CompletableFuture<List<OrgsResponse>> restapiV2SearchOrgsAsync(
    final TspublicRestV2OrgSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgSearchRequest`](../../doc/models/tspublic-rest-v2-org-search-request.md) | Body, Required | - |

## Response Type

[`List<OrgsResponse>`](../../doc/models/orgs-response.md)

## Example Usage

```java
TspublicRestV2OrgSearchRequest body = new TspublicRestV2OrgSearchRequest();

orgController.restapiV2SearchOrgsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

