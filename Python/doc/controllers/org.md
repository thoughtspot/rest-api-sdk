# Org

```python
org_controller = client.org
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

```python
def restapi_v_2__get_org(self,
                        name=None,
                        id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the organization. |
| `id` | `int` | Query, Optional | The ID of the organization. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```python
result = org_controller.restapi_v_2__get_org()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Org

To programmatically create an organization in the ThoughtSpot system, use this API endpoint.

Requires Administration privilege for tenant.

```python
def restapi_v_2__create_org(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgCreateRequest`](../../doc/models/tspublic-rest-v2-org-create-request.md) | Body, Required | - |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```python
body = TspublicRestV2OrgCreateRequest()
body.name = 'name6'

result = org_controller.restapi_v_2__create_org(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Org

You can use this endpoint to programmatically modify an existing org.

Provide name or id of the organization to update the properties. When both id and name are given, then id will be considered and name of the organization will be updated.

Requires Administration privilege for tenant.

```python
def restapi_v_2__update_org(self,
                           body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgUpdateRequest`](../../doc/models/tspublic-rest-v2-org-update-request.md) | Body, Required | - |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```python
body = TspublicRestV2OrgUpdateRequest()

result = org_controller.restapi_v_2__update_org(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Org

To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint.

At least one value is needed. When both id and name are given, then id will be considered.

Requires Administration privilege for tenant.

```python
def restapi_v_2__delete_org(self,
                           name=None,
                           id=None)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Query, Optional | Name of the organization. |
| `id` | `int` | Query, Optional | The ID of the organization. |

## Response Type

`bool`

## Example Usage

```python
result = org_controller.restapi_v_2__delete_org()
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Orgs

To get the details of a specific organization or all organizations in the ThoughtSpot system use this end point.

If no input is provided, then all organizations are included in the response.

Requires Administration privilege for tenant.

```python
def restapi_v_2__search_orgs(self,
                            body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2OrgSearchRequest`](../../doc/models/tspublic-rest-v2-org-search-request.md) | Body, Required | - |

## Response Type

[`List of OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```python
body = TspublicRestV2OrgSearchRequest()

result = org_controller.restapi_v_2__search_orgs(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

