# Custom Actions

```python
custom_actions_controller = client.custom_actions
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

```python
def restapi_v_2__get_custom_action(self,
                                  id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`object`

## Example Usage

```python
id = 'id0'

result = custom_actions_controller.restapi_v_2__get_custom_action(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Custom Action

To search custom actions available on a ThoughtSpot instance, use this endpoint

```python
def restapi_v_2__search_custom_action(self,
                                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionSearchRequest`](../../doc/models/tspublic-rest-v2-customaction-search-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2CustomactionSearchRequest()

result = custom_actions_controller.restapi_v_2__search_custom_action(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Custom Action Association

ThoughtSpot supports associating custom actions to Liveboards, answers, and worksheets. To get the details of the ThoughtSpot objects associated with a custom action, use this endpoint.

```python
def restapi_v_2__get_custom_action_association(self,
                                              id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`object`

## Example Usage

```python
id = 'id0'

result = custom_actions_controller.restapi_v_2__get_custom_action_association(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Custom Action

To programmatically create custom actions on ThoughtSpot clusters that support embedding configuration, use this endpoint

```python
def restapi_v_2__create_custom_action(self,
                                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionCreateRequest`](../../doc/models/tspublic-rest-v2-customaction-create-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2CustomactionCreateRequest()
body.configuration = 'configuration0'

result = custom_actions_controller.restapi_v_2__create_custom_action(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Custom Action

To programmatically edit an existing custom action, use this endpoint

```python
def restapi_v_2__update_custom_action(self,
                                     body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-update-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2CustomactionUpdateRequest()
body.id = 'id6'
body.configuration = 'configuration0'

result = custom_actions_controller.restapi_v_2__update_custom_action(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Custom Action

To programmatically delete a custom action, use this endpoint

```python
def restapi_v_2__delete_custom_action(self,
                                     id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`object`

## Example Usage

```python
id = 'id0'

result = custom_actions_controller.restapi_v_2__delete_custom_action(id)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Custom Action Association

To programmatically associate a custom action to a ThoughtSpot object, use this endpoint

```python
def restapi_v_2__update_custom_action_association(self,
                                                 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2CustomactionAssociationUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-association-update-request.md) | Body, Required | - |

## Response Type

`object`

## Example Usage

```python
body = TspublicRestV2CustomactionAssociationUpdateRequest()
body.id = 'id6'
body.association = 'association6'

result = custom_actions_controller.restapi_v_2__update_custom_action_association(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Custom Action Association

To remove custom action associations to ThoughtSpot objects, use this endpoint

```python
def restapi_v_2__delete_custom_action_association(self,
                                                 id,
                                                 association)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `association` | `string` | Query, Required | A JSON map of the attributes with association of the action to ThoughtSpot object ID<br><br>Example:<br><br>{"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} |

## Response Type

`object`

## Example Usage

```python
id = 'id0'
association = 'association0'

result = custom_actions_controller.restapi_v_2__delete_custom_action_association(id, association)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

