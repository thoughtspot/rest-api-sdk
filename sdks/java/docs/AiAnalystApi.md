# AiAnalystApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createAnalyst**](AiAnalystApi.md#createAnalyst) | **POST** /api/rest/2.0/ai/agent/analysts/create |
| [**deleteAnalyst**](AiAnalystApi.md#deleteAnalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/delete |
| [**searchAnalysts**](AiAnalystApi.md#searchAnalysts) | **POST** /api/rest/2.0/ai/agent/analysts/search |
| [**shareAnalyst**](AiAnalystApi.md#shareAnalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/share |
| [**updateAnalyst**](AiAnalystApi.md#updateAnalyst) | **POST** /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update |


<a id="createAnalyst"></a>
# **createAnalyst**
> Analyst createAnalyst(createAnalystRequest)



 Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior for this analyst. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). The caller must have view access to every referenced source. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors to link to the analyst. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned &#x60;id&#x60;. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;), the last-update time as &#x60;updated_time_in_millis&#x60; (epoch milliseconds), and the &#x60;created_by&#x60; and &#x60;updated_by&#x60; users.  #### Error conditions  - &#x60;403&#x60; — missing privileges, or no view access to a referenced data source. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createAnalystRequest** | [**CreateAnalystRequest**](CreateAnalystRequest.md)

### Return type

[**Analyst**](Analyst.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="deleteAnalyst"></a>
# **deleteAnalyst**
> AnalystDeleteResponse deleteAnalyst(analystIdentifier)



 Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the &#x60;id&#x60; of the deleted analyst. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the &#x60;analyst_identifier&#x60; path parameter, as returned by the create analyst API.  A successful request returns the &#x60;id&#x60; of the deleted analyst.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;429&#x60; — rate limit exceeded.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **analystIdentifier** | **String**

### Return type

[**AnalystDeleteResponse**](AnalystDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="searchAnalysts"></a>
# **searchAnalysts**
> AnalystSearchResponse searchAnalysts(searchAnalystsRequest)



 Searches Spotter Analysts. Two modes: - Fetch mode: when &#x60;analyst_identifier&#x60; is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (&#x60;query&#x60;) and by ownership (&#x60;type&#x60;). Results are ordered   by most recently accessed. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when &#x60;analyst_identifier&#x60; is provided, the response contains exactly that analyst (&#x60;total_size&#x60; is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when &#x60;analyst_identifier&#x60; is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - &#x60;record_size&#x60; (optional): number of records per page. Default 50, between 1 and 500. - &#x60;record_offset&#x60; (optional): zero-based index of the first record. Default 0, maximum 10000. - &#x60;query&#x60; (optional): case-insensitive substring match applied to the analyst **name only**. - &#x60;type&#x60; (optional): ownership filter — &#x60;ALL&#x60; (default; created by or shared with me), &#x60;CREATED_BY_ME&#x60;, or &#x60;SHARED_TO_ME&#x60;.  The response contains &#x60;analysts&#x60; — the page of matching analysts — and &#x60;total_size&#x60;, the total number of matches before pagination. Each analyst includes its &#x60;id&#x60;, &#x60;name&#x60;, &#x60;description&#x60;, &#x60;instructions&#x60;, &#x60;sources&#x60; (with &#x60;id&#x60;, &#x60;type&#x60;, and display &#x60;name&#x60;), enriched &#x60;mcp_connectors&#x60; (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;icon_url&#x60;), &#x60;icon_id&#x60;, &#x60;starter_prompts&#x60; (including the server-managed fixed prompt, marked &#x60;is_fixed&#x60;), &#x60;updated_time_in_millis&#x60; and &#x60;last_accessed_time_in_millis&#x60; (epoch milliseconds), and &#x60;created_by&#x60; / &#x60;updated_by&#x60; user references (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;display_name&#x60;).  #### Error conditions  - &#x60;403&#x60; — missing privileges, or (fetch mode) no access to the requested analyst. - &#x60;404&#x60; — (fetch mode) no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as &#x60;record_size&#x60; or &#x60;record_offset&#x60; out of range.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchAnalystsRequest** | [**SearchAnalystsRequest**](SearchAnalystsRequest.md)

### Return type

[**AnalystSearchResponse**](AnalystSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="shareAnalyst"></a>
# **shareAnalyst**
> Object shareAnalyst(analystIdentifier, shareAnalystRequest)



 Updates share permissions on a Spotter Analyst, one entry per principal (user or group). &#x60;READ_ONLY&#x60; and &#x60;MODIFY&#x60; grant or change the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it. Granting access also shares the analyst&#39;s data sources with the principal so the analyst keeps working for them. A successful share returns an empty &#x60;204 No Content&#x60; response. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the &#x60;analyst_identifier&#x60; path parameter. The request body contains a &#x60;permissions&#x60; array with one entry per principal:  - &#x60;principal.identifier&#x60; (required): unique identifier of the user or group. - &#x60;principal.type&#x60; (required): &#x60;USER&#x60; or &#x60;USER_GROUP&#x60;. - &#x60;share_mode&#x60; (required): &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; grants (or changes) the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it.  A principal may appear at most once per request. When access is granted, the analyst&#39;s data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty &#x60;204 No Content&#x60; response.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as an empty &#x60;permissions&#x60; array, a duplicate principal, or a missing field. - &#x60;429&#x60; — rate limit exceeded.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **analystIdentifier** | **String**
| **shareAnalystRequest** | [**ShareAnalystRequest**](ShareAnalystRequest.md)

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="updateAnalyst"></a>
# **updateAnalyst**
> Analyst updateAnalyst(analystIdentifier, updateAnalystRequest)



 Updates a Spotter Analyst. The request body is identical to &#x60;createAnalyst&#x60; and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. Omitting this field clears any existing instructions. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed &#x60;updated_time_in_millis&#x60; timestamp (epoch milliseconds) and &#x60;updated_by&#x60; user. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, and starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;).  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **analystIdentifier** | **String**
| **updateAnalystRequest** | [**UpdateAnalystRequest**](UpdateAnalystRequest.md)

### Return type

[**Analyst**](Analyst.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

