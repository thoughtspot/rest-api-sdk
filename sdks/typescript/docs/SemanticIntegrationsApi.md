# ThoughtSpotRestApiSdk.SemanticIntegrationsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSemanticIntegration**](SemanticIntegrationsApi.md#createSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/create | 
[**deleteSemanticIntegration**](SemanticIntegrationsApi.md#deleteSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/delete | 
[**importSemanticIntegration**](SemanticIntegrationsApi.md#importSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/import | 
[**searchSemanticIntegrations**](SemanticIntegrationsApi.md#searchSemanticIntegrations) | **POST** /api/rest/2.0/semantic-integrations/search | 


# **createSemanticIntegration**
> SemanticIntegrationResponse createSemanticIntegration(createSemanticIntegrationRequest)

  Version: 26.9.0.cl or later   Creates a new semantic integration in ThoughtSpot from a CDW semantic view.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About create semantic integration  A semantic integration imports an externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API resolves the source semantic view from the specified `connection_identifier`, `database_name`, `schema_name`, and `semantic_view_name`, generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula import report (`semantic_report`) summarizing how many formulas were successfully imported, failed, or skipped.  - `connection_identifier`, `name`, `database_name`, `schema_name`, `semantic_view_name`, and `type` are required. - `name` must be unique across the user\'s organization. The integration\'s display name is also used as the generated model name. - Supported `type` values are listed in the `SemanticIntegrationType` enum. - The response includes a `semantic_report.summary` with `total`, `imported`, `failed`, and `skipped` counts, and a `formulas` array with the per-formula translation details.  > **Note:** Creating a semantic integration using a YAML file upload is not supported through the public API.      

### Example


```typescript
import { createBearerAuthenticationConfig, SemanticIntegrationsApi, CreateSemanticIntegrationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SemanticIntegrationsApi(configuration);

apiInstance.createSemanticIntegration(
  // CreateSemanticIntegrationRequest
  {
    connection_identifier: "connection_identifier_example",
    name: "name_example",
    database_name: "database_name_example",
    schema_name: "schema_name_example",
    semantic_view_name: "semantic_view_name_example",
    type: "RDBMS_SNOWFLAKE",
    description: "description_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSemanticIntegrationRequest** | **CreateSemanticIntegrationRequest**|  |


### Return type

**SemanticIntegrationResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Semantic integration created successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | Connection not found. |  -  |
**409** | Duplicate integration name. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteSemanticIntegration**
> void deleteSemanticIntegration()

  Version: 26.9.0.cl or later   Deletes a semantic integration and its associated ThoughtSpot model.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About delete semantic integration  Removes the specified semantic integration and its generated ThoughtSpot model from the system.  - `semantic_integration_identifier` is the GUID or name of the integration to delete. - Deletions cannot be undone. Re-import the integration with `createSemanticIntegration` if needed.      

### Example


```typescript
import { createBearerAuthenticationConfig, SemanticIntegrationsApi, DeleteSemanticIntegrationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SemanticIntegrationsApi(configuration);

apiInstance.deleteSemanticIntegration(
  // string | ID or name of the semantic integration to delete.
  "semantic_integration_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **semanticIntegrationIdentifier** | [**string**] | ID or name of the semantic integration to delete. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Semantic integration deleted successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **importSemanticIntegration**
> SemanticIntegrationResponse importSemanticIntegration()

  Version: 26.9.0.cl or later   Imports semantic updates for an existing semantic integration from its CDW source and refreshes the associated ThoughtSpot model.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About import semantic integration  Re-imports the semantic view from the CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this after the source semantic view has been updated in the CDW (added, removed, or modified formulas, dimensions, or measures) to bring the ThoughtSpot model back in line.  - `semantic_integration_identifier` is the GUID or name of the integration to import updates for. - Import preserves the integration\'s GUID, name, and `model_id`; only the underlying formula set is refreshed. - The response includes the same `semantic_report` as create, with an additional `change_status` per formula indicating whether each formula is `NEW`, `UPDATED`, or `UNCHANGED` since the previous import.  > **Note:** Importing updates for a semantic integration that was created using the file upload option in the ThoughtSpot UI is not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.      

### Example


```typescript
import { createBearerAuthenticationConfig, SemanticIntegrationsApi, ImportSemanticIntegrationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SemanticIntegrationsApi(configuration);

apiInstance.importSemanticIntegration(
  // string | ID or name of the semantic integration to import updates for.
  "semantic_integration_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **semanticIntegrationIdentifier** | [**string**] | ID or name of the semantic integration to import updates for. | defaults to undefined


### Return type

**SemanticIntegrationResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Semantic integration imported successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | Semantic integration not found. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchSemanticIntegrations**
> Array<SemanticIntegrationSearchResponse> searchSemanticIntegrations(searchSemanticIntegrationsRequest)

  Version: 26.9.0.cl or later   Searches and lists semantic integrations available to the authenticated user in the current organization, with optional filters, sort, and pagination.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About search semantic integrations  Returns a paginated batch of semantic integrations, each with its identifier, name, description, source connection, generated model identifier, author, creation/modification timestamps, and associated tags. Use the filters to narrow results by author, connection, tag, or name pattern.  - `pattern` matches the integration name as a case-insensitive substring. - `author_identifiers` and `connection_identifiers` accept either GUIDs or names. - `sort_options.field_name` defaults to `MODIFIED_TIME`; set `sort_options.order` to `ASC` or `DESC` to control sort direction. - `record_offset` and `record_size` control pagination. Use `record_size: 0` to return all matching records in a single response.      

### Example


```typescript
import { createBearerAuthenticationConfig, SemanticIntegrationsApi, SearchSemanticIntegrationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SemanticIntegrationsApi(configuration);

apiInstance.searchSemanticIntegrations(
  // SearchSemanticIntegrationsRequest
  {
    sort_options: null,
    record_offset: 0,
    record_size: 10,
    pattern: "pattern_example",
    author_identifiers: [
      "author_identifiers_example",
    ],
    connection_identifiers: [
      "connection_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchSemanticIntegrationsRequest** | **SearchSemanticIntegrationsRequest**|  |


### Return type

**Array<SemanticIntegrationSearchResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Semantic integrations retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

