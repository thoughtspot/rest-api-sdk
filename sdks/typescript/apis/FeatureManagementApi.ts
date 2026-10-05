// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { ErrorResponse } from '../models/ErrorResponse';
import { FeatureAssignmentResponse } from '../models/FeatureAssignmentResponse';
import { FeatureGroup } from '../models/FeatureGroup';
import { FeatureValueResponse } from '../models/FeatureValueResponse';
import { SearchFeaturesRequest } from '../models/SearchFeaturesRequest';
import { UpdateFeatureAssignmentsRequest } from '../models/UpdateFeatureAssignmentsRequest';
import { UpdateFeatureValueRequest } from '../models/UpdateFeatureValueRequest';

/**
 * no description
 */
export class FeatureManagementApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - `scope` — Determines the administrative view. Use `CLUSTER` for the cluster-admin view (returns the Orgs assigned to each feature); use `ORG` for the org-admin view (returns the current value of each feature for a single Org). - `org_identifier` — Numeric ID of the Org. Required when `scope` is `ORG`; ignored when `scope` is `CLUSTER`. - `category` — Availability category of the features to return. `GENERAL_ACCESS` returns generally available features; `EARLY_ACCESS` returns features still in early access. Defaults to `GENERAL_ACCESS`.  The response fields populated depend on the requested scope. In the cluster-admin view (`scope=CLUSTER`), each feature includes `assigned_orgs`, `is_org_aware`, and (for non-org-aware features) `feature_value`. In the org-admin view (`scope=ORG`), each feature includes `element_type`, `element_config`, and `element_value`.  The following example retrieves the general-access features for the cluster-admin view:  ``` {   \"scope\": \"CLUSTER\",   \"category\": \"GENERAL_ACCESS\" } ```  For the org-admin view, set `scope` to `ORG` and pass the `org_identifier` of the Org to scope the search to (`org_identifier` is required when `scope` is `ORG`; omitting it returns a 400 error):  ``` {   \"scope\": \"ORG\",   \"org_identifier\": 1,   \"category\": \"GENERAL_ACCESS\" } ```      
     * @param searchFeaturesRequest 
     */
    public async searchFeatures(searchFeaturesRequest: SearchFeaturesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchFeaturesRequest' is not null or undefined
        if (searchFeaturesRequest === null || searchFeaturesRequest === undefined) {
            throw new RequiredError("FeatureManagementApi", "searchFeatures", "searchFeaturesRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/configurations/features/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.29.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.29.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchFeaturesRequest, "SearchFeaturesRequest", ""),
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
     *   Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - `feature_identifier` — User-friendly feature name (`feature_name`) or the underlying feature ID (`feature_id`) of the feature to update. - `org_identifiers` — Numeric IDs of the Orgs to assign. Send an empty array with `operation` set to `REPLACE` to clear all Org assignments for this feature. - `operation` — Type of update to apply. `ADD` assigns the given Orgs in addition to the existing ones; `REMOVE` unassigns the given Orgs; `REPLACE` sets the assignment to exactly the given Orgs. Defaults to `REPLACE`.  The following example assigns Orgs `1` and `2` to a feature, in addition to any Orgs already assigned:  ``` {   \"feature_identifier\": \"index_columns\",   \"org_identifiers\": [1, 2],   \"operation\": \"ADD\" } ```  Clear all Org assignments for a feature by sending an empty array with `operation` set to `REPLACE` (this is the only way to unassign every Org at once):  ``` {   \"feature_identifier\": \"index_columns\",   \"org_identifiers\": [],   \"operation\": \"REPLACE\" } ```      
     * @param updateFeatureAssignmentsRequest 
     */
    public async updateFeatureAssignments(updateFeatureAssignmentsRequest: UpdateFeatureAssignmentsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'updateFeatureAssignmentsRequest' is not null or undefined
        if (updateFeatureAssignmentsRequest === null || updateFeatureAssignmentsRequest === undefined) {
            throw new RequiredError("FeatureManagementApi", "updateFeatureAssignments", "updateFeatureAssignmentsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/configurations/features/assignments/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.29.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.29.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateFeatureAssignmentsRequest, "UpdateFeatureAssignmentsRequest", ""),
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
     *   Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - `scope` — Determines the scope at which the value is set. Use `CLUSTER` to set the cluster-level value; use `ORG` to set a per-Org value override. - `org_identifier` — Numeric ID of the Org for which to set the value. Required when `scope` is `ORG`; ignored when `scope` is `CLUSTER`. - `feature_identifier` — User-friendly feature name (`feature_name`) or the underlying feature ID (`feature_id`) of the feature whose value should be set. - `feature_value` — New value to set for the feature. - `reset_org_overrides` — Applicable only when `scope` is `CLUSTER`. When `true`, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when `scope` is `CLUSTER` for an org-aware feature. Must be omitted when `scope` is `ORG`; passing it at `ORG` scope returns a 400 error.  The following example sets a per-Org value override for Org `1`:  ``` {   \"scope\": \"ORG\",   \"org_identifier\": 1,   \"feature_identifier\": \"index_columns\",   \"feature_value\": \"true\" } ```  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). `reset_org_overrides: true` is destructive — it strips existing per-Org overrides cluster-wide:  ``` {   \"scope\": \"CLUSTER\",   \"feature_identifier\": \"index_columns\",   \"feature_value\": \"true\",   \"reset_org_overrides\": true } ```      
     * @param updateFeatureValueRequest 
     */
    public async updateFeatureValue(updateFeatureValueRequest: UpdateFeatureValueRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'updateFeatureValueRequest' is not null or undefined
        if (updateFeatureValueRequest === null || updateFeatureValueRequest === undefined) {
            throw new RequiredError("FeatureManagementApi", "updateFeatureValue", "updateFeatureValueRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/configurations/features/values/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.29.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.29.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateFeatureValueRequest, "UpdateFeatureValueRequest", ""),
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

export class FeatureManagementApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchFeatures
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchFeaturesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<FeatureGroup> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<FeatureGroup> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<FeatureGroup>", ""
            ) as Array<FeatureGroup>;
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Insufficient privileges.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Feature management not enabled.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<FeatureGroup> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<FeatureGroup>", ""
            ) as Array<FeatureGroup>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateFeatureAssignments
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateFeatureAssignmentsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<FeatureAssignmentResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: FeatureAssignmentResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FeatureAssignmentResponse", ""
            ) as FeatureAssignmentResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request parameters.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Insufficient privileges.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Feature not found or feature management not enabled.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: FeatureAssignmentResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FeatureAssignmentResponse", ""
            ) as FeatureAssignmentResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateFeatureValue
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateFeatureValueWithHttpInfo(response: ResponseContext): Promise<HttpInfo<FeatureValueResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: FeatureValueResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FeatureValueResponse", ""
            ) as FeatureValueResponse;
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Insufficient privileges or org not assigned to feature.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Feature not found or feature management not enabled.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: FeatureValueResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FeatureValueResponse", ""
            ) as FeatureValueResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
