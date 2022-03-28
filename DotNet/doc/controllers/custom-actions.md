# Custom Actions

```csharp
CustomActionsController customActionsController = client.CustomActionsController;
```

## Class Name

`CustomActionsController`

## Methods

* [Get Custom Action](../../doc/controllers/custom-actions.md#get-custom-action)
* [Create Custom Action](../../doc/controllers/custom-actions.md#create-custom-action)
* [Update Custom Action](../../doc/controllers/custom-actions.md#update-custom-action)
* [Delete Custom Action](../../doc/controllers/custom-actions.md#delete-custom-action)
* [Search Custom Action](../../doc/controllers/custom-actions.md#search-custom-action)
* [Get Custom Action Association](../../doc/controllers/custom-actions.md#get-custom-action-association)
* [Update Custom Action Association](../../doc/controllers/custom-actions.md#update-custom-action-association)
* [Delete Custom Action Association](../../doc/controllers/custom-actions.md#delete-custom-action-association)


# Get Custom Action

To get details of a specific custom action configured in the ThoughtSpot system, use this endpoint

```csharp
GetCustomActionAsync(
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
    object result = await customActionsController.GetCustomActionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Create Custom Action

To programmatically create custom actions on ThoughtSpot clusters that support embedding configuration, use this endpoint

```csharp
CreateCustomActionAsync(
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
    object result = await customActionsController.CreateCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Custom Action

To programmatically edit an existing custom action, use this endpoint

```csharp
UpdateCustomActionAsync(
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
    object result = await customActionsController.UpdateCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Custom Action

To programmatically delete a custom action, use this endpoint

```csharp
DeleteCustomActionAsync(
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
    object result = await customActionsController.DeleteCustomActionAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Search Custom Action

To search custom actions available on a ThoughtSpot instance, use this endpoint

```csharp
SearchCustomActionAsync(
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
    object result = await customActionsController.SearchCustomActionAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Custom Action Association

ThoughtSpot supports associating custom actions to Liveboards, answers, and worksheets. To get the details of the ThoughtSpot objects associated with a custom action, use this endpoint.

```csharp
GetCustomActionAssociationAsync(
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
    object result = await customActionsController.GetCustomActionAssociationAsync(id);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Custom Action Association

To programmatically associate a custom action to a ThoughtSpot object, use this endpoint

```csharp
UpdateCustomActionAssociationAsync(
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
    object result = await customActionsController.UpdateCustomActionAssociationAsync(body);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Delete Custom Action Association

To remove custom action associations to ThoughtSpot objects, use this endpoint

```csharp
DeleteCustomActionAssociationAsync(
    string id,
    string association)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Query, Required | GUID of the custom action |
| `association` | `string` | Query, Required | A JSON map of the attributes with association of the action to ThoughtSpot object ID<br><br>Example:<br><br>{"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]} |

## Response Type

`Task<object>`

## Example Usage

```csharp
string id = "id0";
string association = "association0";

try
{
    object result = await customActionsController.DeleteCustomActionAssociationAsync(id, association);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed or unauthorized request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

