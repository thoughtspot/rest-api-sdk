# Org

```csharp
OrgController orgController = client.OrgController;
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

```csharp
GetOrgAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the organization. |
| `id` | `string` | Query, Optional | The ID of the organization. |

## Response Type

[`Task<Models.OrgsResponse>`](../../doc/models/orgs-response.md)

## Example Usage

```csharp
try
{
    OrgsResponse result = await orgController.GetOrgAsync(null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Org

This is endpoint is applicable only if organization feature is enabled in the cluster.

To programmatically create an organization in the ThoughtSpot system, use this API endpoint.

```csharp
CreateOrgAsync(
    Models.TspublicRestV2OrgCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2OrgCreateRequest`](../../doc/models/tspublic-rest-v2-org-create-request.md) | Body, Required | - |

## Response Type

[`Task<Models.OrgsResponse>`](../../doc/models/orgs-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2OrgCreateRequest();
body.Name = "name6";

try
{
    OrgsResponse result = await orgController.CreateOrgAsync(body);
}
catch (ApiException e){};
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

```csharp
UpdateOrgAsync(
    Models.TspublicRestV2OrgUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2OrgUpdateRequest`](../../doc/models/tspublic-rest-v2-org-update-request.md) | Body, Required | - |

## Response Type

[`Task<Models.OrgsResponse>`](../../doc/models/orgs-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2OrgUpdateRequest();

try
{
    OrgsResponse result = await orgController.UpdateOrgAsync(body);
}
catch (ApiException e){};
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

```csharp
DeleteOrgAsync(
    string name = null,
    string id = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the organization. |
| `id` | `string` | Query, Optional | The ID of the organization. |

## Response Type

`Task<bool>`

## Example Usage

```csharp
try
{
    bool? result = await orgController.DeleteOrgAsync(null, null);
}
catch (ApiException e){};
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

```csharp
SearchOrgsAsync(
    Models.TspublicRestV2OrgSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2OrgSearchRequest`](../../doc/models/tspublic-rest-v2-org-search-request.md) | Body, Required | - |

## Response Type

[`Task<List<Models.OrgsResponse>>`](../../doc/models/orgs-response.md)

## Example Usage

```csharp
var body = new TspublicRestV2OrgSearchRequest();

try
{
    List<OrgsResponse> result = await orgController.SearchOrgsAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

