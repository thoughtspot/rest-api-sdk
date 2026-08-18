# SemanticIntegrationsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createSemanticIntegration**](SemanticIntegrationsApi.md#createSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/create |
| [**deleteSemanticIntegration**](SemanticIntegrationsApi.md#deleteSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/delete |
| [**importSemanticIntegration**](SemanticIntegrationsApi.md#importSemanticIntegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/import |
| [**searchSemanticIntegrations**](SemanticIntegrationsApi.md#searchSemanticIntegrations) | **POST** /api/rest/2.0/semantic-integrations/search |


<a id="createSemanticIntegration"></a>
# **createSemanticIntegration**
> SemanticIntegrationResponse createSemanticIntegration(createSemanticIntegrationRequest)



  Version: 26.9.0.cl or later   Creates a new semantic integration in ThoughtSpot from a CDW semantic view.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage data models**  #### About create semantic integration  A semantic integration imports an externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API resolves the source semantic view from the specified &#x60;connection_identifier&#x60;, &#x60;database_name&#x60;, &#x60;schema_name&#x60;, and &#x60;semantic_view_name&#x60;, generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula import report (&#x60;semantic_report&#x60;) summarizing how many formulas were successfully imported, failed, or skipped.  - &#x60;connection_identifier&#x60;, &#x60;name&#x60;, &#x60;database_name&#x60;, &#x60;schema_name&#x60;, &#x60;semantic_view_name&#x60;, and &#x60;type&#x60; are required. - &#x60;name&#x60; must be unique across the user&#39;s organization. The integration&#39;s display name is also used as the generated model name. - Supported &#x60;type&#x60; values are listed in the &#x60;SemanticIntegrationType&#x60; enum. - The response includes a &#x60;semantic_report.summary&#x60; with &#x60;total&#x60;, &#x60;imported&#x60;, &#x60;failed&#x60;, and &#x60;skipped&#x60; counts, and a &#x60;formulas&#x60; array with the per-formula translation details.  &gt; **Note:** Creating a semantic integration using a YAML file upload is not supported through the public API.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createSemanticIntegrationRequest** | [**CreateSemanticIntegrationRequest**](CreateSemanticIntegrationRequest.md)

### Return type

[**SemanticIntegrationResponse**](SemanticIntegrationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integration created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Connection not found. |  -  |
| **409** | Duplicate integration name. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteSemanticIntegration"></a>
# **deleteSemanticIntegration**
> deleteSemanticIntegration(semanticIntegrationIdentifier)



  Version: 26.9.0.cl or later   Deletes a semantic integration and its associated ThoughtSpot model.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage data models**  #### About delete semantic integration  Removes the specified semantic integration and its generated ThoughtSpot model from the system.  - &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to delete. - Deletions cannot be undone. Re-import the integration with &#x60;createSemanticIntegration&#x60; if needed.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **semanticIntegrationIdentifier** | **String**

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Semantic integration deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="importSemanticIntegration"></a>
# **importSemanticIntegration**
> SemanticIntegrationResponse importSemanticIntegration(semanticIntegrationIdentifier)



  Version: 26.9.0.cl or later   Imports semantic updates for an existing semantic integration from its CDW source and refreshes the associated ThoughtSpot model.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage data models**  #### About import semantic integration  Re-imports the semantic view from the CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this after the source semantic view has been updated in the CDW (added, removed, or modified formulas, dimensions, or measures) to bring the ThoughtSpot model back in line.  - &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to import updates for. - Import preserves the integration&#39;s GUID, name, and &#x60;model_id&#x60;; only the underlying formula set is refreshed. - The response includes the same &#x60;semantic_report&#x60; as create, with an additional &#x60;change_status&#x60; per formula indicating whether each formula is &#x60;NEW&#x60;, &#x60;UPDATED&#x60;, or &#x60;UNCHANGED&#x60; since the previous import.  &gt; **Note:** Importing updates for a semantic integration that was created using the file upload option in the ThoughtSpot UI is not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **semanticIntegrationIdentifier** | **String**

### Return type

[**SemanticIntegrationResponse**](SemanticIntegrationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integration imported successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Semantic integration not found. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchSemanticIntegrations"></a>
# **searchSemanticIntegrations**
> List&lt;SemanticIntegrationSearchResponse&gt; searchSemanticIntegrations(searchSemanticIntegrationsRequest)



  Version: 26.9.0.cl or later   Searches and lists semantic integrations available to the authenticated user in the current organization, with optional filters, sort, and pagination.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage data models**  #### About search semantic integrations  Returns a paginated batch of semantic integrations, each with its identifier, name, description, source connection, generated model identifier, author, creation/modification timestamps, and associated tags. Use the filters to narrow results by author, connection, tag, or name pattern.  - &#x60;pattern&#x60; matches the integration name as a case-insensitive substring. - &#x60;author_identifiers&#x60; and &#x60;connection_identifiers&#x60; accept either GUIDs or names. - &#x60;sort_options.field_name&#x60; defaults to &#x60;MODIFIED_TIME&#x60;; set &#x60;sort_options.order&#x60; to &#x60;ASC&#x60; or &#x60;DESC&#x60; to control sort direction. - &#x60;record_offset&#x60; and &#x60;record_size&#x60; control pagination. Use &#x60;record_size: 0&#x60; to return all matching records in a single response.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchSemanticIntegrationsRequest** | [**SearchSemanticIntegrationsRequest**](SearchSemanticIntegrationsRequest.md)

### Return type

[**List&lt;SemanticIntegrationSearchResponse&gt;**](SemanticIntegrationSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integrations retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

