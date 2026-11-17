// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Analyst } from '../models/Analyst';
import { AnalystDeleteResponse } from '../models/AnalystDeleteResponse';
import { AnalystSearchResponse } from '../models/AnalystSearchResponse';
import { CreateAnalystRequest } from '../models/CreateAnalystRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { SearchAnalystsRequest } from '../models/SearchAnalystsRequest';
import { ShareAnalystRequest } from '../models/ShareAnalystRequest';
import { UpdateAnalystRequest } from '../models/UpdateAnalystRequest';

/**
 * no description
 */
export class AIAnalystApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *  Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges, plus view access to every data source referenced in `sources`.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges, plus view access to every data source referenced in `sources`. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - `name` (required): display name of the analyst. - `description` (required): up to 200 characters. - `instructions` (optional): natural-language instructions that guide the agent\'s behavior for this analyst. Instructions that conflict with system guardrails are rejected with `409`. - `sources` (required): at least one data source the analyst can query, each with an `identifier`, an optional `name`, and a `type` (`MODEL`, `ANSWER`, `LIVEBOARD`, or `CONVERSATION`). The caller must have view access to every referenced source. - `mcp_connector_identifiers` (optional): identifiers of MCP connectors to link to the analyst. - `starter_prompts` (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned `id`. In responses, sources are returned with `id` and `type`, connector identifiers as `mcp_connectors`, starter prompts as structured objects (`label`, `text`, `order`, `is_ai_generated`), the last-update time as `updated_time_in_millis` (epoch milliseconds), and the `created_by` and `updated_by` users.  #### Error conditions  - `403` — missing privileges, or no view access to a referenced data source. - `409` — `instructions` conflict with system guardrails. - `422` — validation failure, such as a missing required field (`name`, `description`, or `sources`), an empty `sources` list, too many starter prompts, or field-length violations. - `429` — rate limit exceeded.      
     * @param createAnalystRequest 
     */
    public async createAnalyst(createAnalystRequest: CreateAnalystRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createAnalystRequest' is not null or undefined
        if (createAnalystRequest === null || createAnalystRequest === undefined) {
            throw new RequiredError("AIAnalystApi", "createAnalyst", "createAnalystRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/analysts/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createAnalystRequest, "CreateAnalystRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the `id` of the deleted analyst. Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the `analyst_identifier` path parameter, as returned by the create analyst API.  A successful request returns the `id` of the deleted analyst.  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst\'s author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller\'s Org. - `429` — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to delete.
     */
    public async deleteAnalyst(analystIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'analystIdentifier' is not null or undefined
        if (analystIdentifier === null || analystIdentifier === undefined) {
            throw new RequiredError("AIAnalystApi", "deleteAnalyst", "analystIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/delete'
            .replace('{analyst_identifier}', encodeURIComponent(String(analystIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Searches Spotter Analysts. Two modes: - Fetch mode: when `analyst_identifier` is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (`query`) and by ownership (`type`). Results are ordered   by most recently accessed. Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of `ADMINISTRATION`, `CAN_MANAGE_SPOTTER`, or `CAN_USE_SPOTTER` privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when `analyst_identifier` is provided, the response contains exactly that analyst (`total_size` is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when `analyst_identifier` is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - `record_size` (optional): number of records per page. Default 50, between 1 and 500. - `record_offset` (optional): zero-based index of the first record. Default 0, maximum 10000. - `query` (optional): case-insensitive substring match applied to the analyst **name only**. - `type` (optional): ownership filter — `ALL` (default; created by or shared with me), `CREATED_BY_ME`, or `SHARED_TO_ME`.  The response contains `analysts` — the page of matching analysts — and `total_size`, the total number of matches before pagination. Each analyst includes its `id`, `name`, `description`, `instructions`, `sources` (with `id`, `type`, and display `name`), enriched `mcp_connectors` (with `id`, `name`, and `icon_url`), `icon_id`, `starter_prompts` (including the server-managed fixed prompt, marked `is_fixed`), `updated_time_in_millis` and `last_accessed_time_in_millis` (epoch milliseconds), and `created_by` / `updated_by` user references (with `id`, `name`, and `display_name`).  #### Error conditions  - `403` — missing privileges, or (fetch mode) no access to the requested analyst. - `404` — (fetch mode) no analyst with the given identifier exists in the caller\'s Org. - `422` — validation failure, such as `record_size` or `record_offset` out of range.      
     * @param searchAnalystsRequest 
     */
    public async searchAnalysts(searchAnalystsRequest: SearchAnalystsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchAnalystsRequest' is not null or undefined
        if (searchAnalystsRequest === null || searchAnalystsRequest === undefined) {
            throw new RequiredError("AIAnalystApi", "searchAnalysts", "searchAnalystsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/analysts/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchAnalystsRequest, "SearchAnalystsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Updates share permissions on a Spotter Analyst, one entry per principal (user or group). `READ_ONLY` and `MODIFY` grant or change the principal\'s access; `NO_ACCESS` revokes it. Granting access also shares the analyst\'s data sources with the principal so the analyst keeps working for them. A successful share returns an empty `204 No Content` response. Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the `analyst_identifier` path parameter. The request body contains a `permissions` array with one entry per principal:  - `principal.identifier` (required): unique identifier of the user or group. - `principal.type` (required): `USER` or `USER_GROUP`. - `share_mode` (required): `READ_ONLY` or `MODIFY` grants (or changes) the principal\'s access; `NO_ACCESS` revokes it.  A principal may appear at most once per request. When access is granted, the analyst\'s data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty `204 No Content` response.  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst\'s author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller\'s Org. - `422` — validation failure, such as an empty `permissions` array, a duplicate principal, or a missing field. - `429` — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to share.
     * @param shareAnalystRequest 
     */
    public async shareAnalyst(analystIdentifier: string, shareAnalystRequest: ShareAnalystRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'analystIdentifier' is not null or undefined
        if (analystIdentifier === null || analystIdentifier === undefined) {
            throw new RequiredError("AIAnalystApi", "shareAnalyst", "analystIdentifier");
        }


        // verify required parameter 'shareAnalystRequest' is not null or undefined
        if (shareAnalystRequest === null || shareAnalystRequest === undefined) {
            throw new RequiredError("AIAnalystApi", "shareAnalyst", "shareAnalystRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/share'
            .replace('{analyst_identifier}', encodeURIComponent(String(analystIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(shareAnalystRequest, "ShareAnalystRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Updates a Spotter Analyst. The request body is identical to `createAnalyst` and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or `ADMINISTRATION` or `CAN_MANAGE_SPOTTER` privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - `name` (required): display name of the analyst. - `description` (required): up to 200 characters. - `instructions` (optional): natural-language instructions that guide the agent\'s behavior. Instructions that conflict with system guardrails are rejected with `409`. Omitting this field clears any existing instructions. - `sources` (required): at least one data source the analyst can query, each with an `identifier`, an optional `name`, and a `type` (`MODEL`, `ANSWER`, `LIVEBOARD`, or `CONVERSATION`). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - `mcp_connector_identifiers` (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - `starter_prompts` (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed `updated_time_in_millis` timestamp (epoch milliseconds) and `updated_by` user. In responses, sources are returned with `id` and `type`, connector identifiers as `mcp_connectors`, and starter prompts as structured objects (`label`, `text`, `order`, `is_ai_generated`).  #### Error conditions  - `400` — malformed analyst identifier. - `403` — the caller is not the analyst\'s author and lacks admin / Spotter-management privileges. - `404` — no analyst with the given identifier exists in the caller\'s Org. - `409` — `instructions` conflict with system guardrails. - `422` — validation failure, such as a missing required field (`name`, `description`, or `sources`), an empty `sources` list, too many starter prompts, or field-length violations. - `429` — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to update.
     * @param updateAnalystRequest 
     */
    public async updateAnalyst(analystIdentifier: string, updateAnalystRequest: UpdateAnalystRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'analystIdentifier' is not null or undefined
        if (analystIdentifier === null || analystIdentifier === undefined) {
            throw new RequiredError("AIAnalystApi", "updateAnalyst", "analystIdentifier");
        }


        // verify required parameter 'updateAnalystRequest' is not null or undefined
        if (updateAnalystRequest === null || updateAnalystRequest === undefined) {
            throw new RequiredError("AIAnalystApi", "updateAnalyst", "updateAnalystRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update'
            .replace('{analyst_identifier}', encodeURIComponent(String(analystIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateAnalystRequest, "UpdateAnalystRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class AIAnalystApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createAnalyst
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createAnalystWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Analyst >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteAnalyst
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteAnalystWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AnalystDeleteResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AnalystDeleteResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystDeleteResponse", ""
            ) as AnalystDeleteResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: AnalystDeleteResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystDeleteResponse", ""
            ) as AnalystDeleteResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AnalystDeleteResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystDeleteResponse", ""
            ) as AnalystDeleteResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchAnalysts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchAnalystsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AnalystSearchResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AnalystSearchResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystSearchResponse", ""
            ) as AnalystSearchResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: AnalystSearchResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystSearchResponse", ""
            ) as AnalystSearchResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AnalystSearchResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnalystSearchResponse", ""
            ) as AnalystSearchResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to shareAnalyst
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async shareAnalystWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateAnalyst
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateAnalystWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Analyst >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Analyst = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Analyst", ""
            ) as Analyst;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
