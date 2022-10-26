# Custom Actions

```csharp
CustomActionsController customActionsController = client.CustomActionsController;
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

```csharp
RestapiV2GetCustomActionAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";

try
{
    object result = await customActionsController.RestapiV2GetCustomActionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Search Custom Action

To search custom actions available on a ThoughtSpot instance, use this endpoint

```csharp
RestapiV2SearchCustomActionAsync(
    Models.TspublicRestV2CustomactionSearchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2CustomactionSearchRequest`](../../doc/models/tspublic-rest-v2-customaction-search-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2CustomactionSearchRequest();

try
{
    object result = await customActionsController.RestapiV2SearchCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Custom Action Association

ThoughtSpot supports associating custom actions to Liveboards, answers, and worksheets. To get the details of the ThoughtSpot objects associated with a custom action, use this endpoint.

```csharp
RestapiV2GetCustomActionAssociationAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";

try
{
    object result = await customActionsController.RestapiV2GetCustomActionAssociationAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Create Custom Action

To programmatically create custom actions on ThoughtSpot clusters that support embedding configuration, use this endpoint

```csharp
RestapiV2CreateCustomActionAsync(
    Models.TspublicRestV2CustomactionCreateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2CustomactionCreateRequest`](../../doc/models/tspublic-rest-v2-customaction-create-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2CustomactionCreateRequest();
body.Configuration = "configuration0";

try
{
    object result = await customActionsController.RestapiV2CreateCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Custom Action

To programmatically edit an existing custom action, use this endpoint

```csharp
RestapiV2UpdateCustomActionAsync(
    Models.TspublicRestV2CustomactionUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2CustomactionUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-update-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2CustomactionUpdateRequest();
body.Id = "id6";
body.Configuration = "configuration0";

try
{
    object result = await customActionsController.RestapiV2UpdateCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Custom Action

To programmatically delete a custom action, use this endpoint

```csharp
RestapiV2DeleteCustomActionAsync(
    string id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";

try
{
    object result = await customActionsController.RestapiV2DeleteCustomActionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Update Custom Action Association

To programmatically associate a custom action to a ThoughtSpot object, use this endpoint

```csharp
RestapiV2UpdateCustomActionAssociationAsync(
    Models.TspublicRestV2CustomactionAssociationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.TspublicRestV2CustomactionAssociationUpdateRequest`](../../doc/models/tspublic-rest-v2-customaction-association-update-request.md) | Body, Required | - |

## Response Type

`Task<object>`

## Example Usage

```csharp
var body = new TspublicRestV2CustomactionAssociationUpdateRequest();
body.Id = "id6";
body.Association = "association6";

try
{
    object result = await customActionsController.RestapiV2UpdateCustomActionAssociationAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Delete Custom Action Association

To remove custom action associations to ThoughtSpot objects, use this endpoint

```csharp
RestapiV2DeleteCustomActionAssociationAsync(
    string id,
    string association)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `association` | `string` | Query, Required | A JSON map of the attributes with association of the action to ThoughtSpot object ID<br><br>Example:<br><br>{"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";
string association = "association0";

try
{
    object result = await customActionsController.RestapiV2DeleteCustomActionAssociationAsync(id, association);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

