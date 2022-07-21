# Org

```java
OrgController orgController = client.getOrgController();
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

```java
CompletableFuture<OrgsResponse> getOrgAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the organization. |
| `id` | `String` | Query, Optional | The ID of the organization. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
orgController.getOrgAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically create an organization in the ThoughtSpot system, use this API endpoint.

```java
CompletableFuture<OrgsResponse> createOrgAsync(
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

orgController.createOrgAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

You can use this endpoint to programmatically modify an existing org.

Provide name or id of the organization to update the properties. When both id and name are given, then id will be considered and name of the organization will be updated.

Requires Administration privilege for tenant.

```java
CompletableFuture<OrgsResponse> updateOrgAsync(
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

orgController.updateOrgAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value is needed. When both id and name are given, then id will be considered.

Requires Administration privilege for tenant.

```java
CompletableFuture<Boolean> deleteOrgAsync(
    final String name,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the organization. |
| `id` | `String` | Query, Optional | The ID of the organization. |

## Response Type

`boolean`

## Example Usage

```java
orgController.deleteOrgAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Orgs

This is endpoint is applicable only if organization feature is enabled in the cluster.

To get the details of a specific organization or all organizations in the ThoughtSpot system use this end point.

If no input is provided, then all organizations are included in the response.

Requires Administration privilege for tenant.

```java
CompletableFuture<List<OrgsResponse>> searchOrgsAsync(
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

orgController.searchOrgsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

