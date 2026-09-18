// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { ErrorResponse } from '../models/ErrorResponse';
import { LinkPreference } from '../models/LinkPreference';
import { SearchLinkCustomizationsRequest } from '../models/SearchLinkCustomizationsRequest';
import { UpdateLinkCustomizationRequest } from '../models/UpdateLinkCustomizationRequest';

/**
 * no description
 */
export class LinkCustomizationApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - `scope: CLUSTER` returns the cluster templates, and is available only to callers in the primary Org. - `scope: ORG` returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit `scope` to return whichever of these the caller can access. - Every link type is always returned, customized or not. `is_overridden` is `true` when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for `ORG`, the ThoughtSpot default for `CLUSTER` — and `false` when it matches.      
     * @param searchLinkCustomizationsRequest 
     */
    public async searchLinkCustomizations(searchLinkCustomizationsRequest: SearchLinkCustomizationsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchLinkCustomizationsRequest' is not null or undefined
        if (searchLinkCustomizationsRequest === null || searchLinkCustomizationsRequest === undefined) {
            throw new RequiredError("LinkCustomizationApi", "searchLinkCustomizations", "searchLinkCustomizationsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/links/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchLinkCustomizationsRequest, "SearchLinkCustomizationsRequest", ""),
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
     *   Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at cluster level or for the authenticated user\'s org. Use it to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - `scope: CLUSTER` changes the defaults inherited by all orgs, and is available only to callers in the primary org. - `scope: ORG` (default) changes the authenticated user\'s org, and requires Orgs to be enabled. - List only the types you want to change in `templates`. Unlisted types are left unchanged by either operation, and a repeated type is rejected. - **REPLACE** (default) sets each listed type to its `value`. - **RESET** reverts each listed type to the value its scope inherits: the ThoughtSpot default at cluster scope, and the cluster template at org scope. Supply only `type`; a `value` alongside `RESET` is rejected. To clear every override, list all types with `RESET`.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires:  | Link type | Required | | --- | --- | | `LIVEBOARD_SHARE_URL` | `{object-id}`, `{ts-query-params}` | | `VISUALIZATION_SHARE_URL` | `{object-id}`, `{sub-object-id}`, `{ts-query-params}` | | `ANSWER_SHARE_URL` | `{object-id}`, `{ts-query-params}` | | `SPOTIQ_ANALYSIS_URL` | `{object-id}` | | `CONVERSATION_SHARE_URL` | `{conversation-id}`, `{ts-query-params}` | | `GENERIC_URL` | `{path}` | | `UNSUBSCRIBE_URL` | none |  `{ts-query-params}` is optional on any type that does not require it, including `SPOTIQ_ANALYSIS_URL` and `UNSUBSCRIBE_URL`: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      
     * @param updateLinkCustomizationRequest 
     */
    public async updateLinkCustomization(updateLinkCustomizationRequest: UpdateLinkCustomizationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'updateLinkCustomizationRequest' is not null or undefined
        if (updateLinkCustomizationRequest === null || updateLinkCustomizationRequest === undefined) {
            throw new RequiredError("LinkCustomizationApi", "updateLinkCustomization", "updateLinkCustomizationRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/customization/links/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateLinkCustomizationRequest, "UpdateLinkCustomizationRequest", ""),
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

export class LinkCustomizationApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchLinkCustomizations
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchLinkCustomizationsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<LinkPreference> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<LinkPreference> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LinkPreference>", ""
            ) as Array<LinkPreference>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<LinkPreference> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LinkPreference>", ""
            ) as Array<LinkPreference>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateLinkCustomization
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateLinkCustomizationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
