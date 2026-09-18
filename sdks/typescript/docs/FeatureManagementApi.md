# ThoughtSpotRestApiSdk.FeatureManagementApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchFeatures**](FeatureManagementApi.md#searchFeatures) | **POST** /api/rest/2.0/configurations/features/search | 
[**updateFeatureAssignments**](FeatureManagementApi.md#updateFeatureAssignments) | **POST** /api/rest/2.0/configurations/features/assignments/update | 
[**updateFeatureValue**](FeatureManagementApi.md#updateFeatureValue) | **POST** /api/rest/2.0/configurations/features/values/update | 


# **searchFeatures**
> Array<FeatureGroup> searchFeatures(searchFeaturesRequest)

  Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - `scope` — Determines the administrative view. Use `CLUSTER` for the cluster-admin view (returns the Orgs assigned to each feature); use `ORG` for the org-admin view (returns the current value of each feature for a single Org). - `org_identifier` — Numeric ID of the Org. Required when `scope` is `ORG`; ignored when `scope` is `CLUSTER`. - `category` — Availability category of the features to return. `GENERAL_ACCESS` returns generally available features; `EARLY_ACCESS` returns features still in early access. Defaults to `GENERAL_ACCESS`.  The response fields populated depend on the requested scope. In the cluster-admin view (`scope=CLUSTER`), each feature includes `assigned_orgs`, `is_org_aware`, and (for non-org-aware features) `feature_value`. In the org-admin view (`scope=ORG`), each feature includes `element_type`, `element_config`, and `element_value`.  The following example retrieves the general-access features for the cluster-admin view:  ``` {   \"scope\": \"CLUSTER\",   \"category\": \"GENERAL_ACCESS\" } ```  For the org-admin view, set `scope` to `ORG` and pass the `org_identifier` of the Org to scope the search to (`org_identifier` is required when `scope` is `ORG`; omitting it returns a 400 error):  ``` {   \"scope\": \"ORG\",   \"org_identifier\": 1,   \"category\": \"GENERAL_ACCESS\" } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, FeatureManagementApi, SearchFeaturesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new FeatureManagementApi(configuration);

apiInstance.searchFeatures(
  // SearchFeaturesRequest
  {
    scope: "CLUSTER",
    org_identifier: 1,
    category: "GENERAL_ACCESS",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchFeaturesRequest** | **SearchFeaturesRequest**|  |


### Return type

**Array<FeatureGroup>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Feature groups returned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Insufficient privileges. |  -  |
**404** | Feature management not enabled. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateFeatureAssignments**
> FeatureAssignmentResponse updateFeatureAssignments(updateFeatureAssignmentsRequest)

  Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - `feature_identifier` — User-friendly feature name (`feature_name`) or the underlying feature ID (`feature_id`) of the feature to update. - `org_identifiers` — Numeric IDs of the Orgs to assign. Send an empty array with `operation` set to `REPLACE` to clear all Org assignments for this feature. - `operation` — Type of update to apply. `ADD` assigns the given Orgs in addition to the existing ones; `REMOVE` unassigns the given Orgs; `REPLACE` sets the assignment to exactly the given Orgs. Defaults to `REPLACE`.  The following example assigns Orgs `1` and `2` to a feature, in addition to any Orgs already assigned:  ``` {   \"feature_identifier\": \"index_columns\",   \"org_identifiers\": [1, 2],   \"operation\": \"ADD\" } ```  Clear all Org assignments for a feature by sending an empty array with `operation` set to `REPLACE` (this is the only way to unassign every Org at once):  ``` {   \"feature_identifier\": \"index_columns\",   \"org_identifiers\": [],   \"operation\": \"REPLACE\" } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, FeatureManagementApi, UpdateFeatureAssignmentsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new FeatureManagementApi(configuration);

apiInstance.updateFeatureAssignments(
  // UpdateFeatureAssignmentsRequest
  {
    feature_identifier: "feature_identifier_example",
    org_identifiers: [
      1,
    ],
    operation: "REPLACE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateFeatureAssignmentsRequest** | **UpdateFeatureAssignmentsRequest**|  |


### Return type

**FeatureAssignmentResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Assignments updated. |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Insufficient privileges. |  -  |
**404** | Feature not found or feature management not enabled. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateFeatureValue**
> FeatureValueResponse updateFeatureValue(updateFeatureValueRequest)

  Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - `scope` — Determines the scope at which the value is set. Use `CLUSTER` to set the cluster-level value; use `ORG` to set a per-Org value override. - `org_identifier` — Numeric ID of the Org for which to set the value. Required when `scope` is `ORG`; ignored when `scope` is `CLUSTER`. - `feature_identifier` — User-friendly feature name (`feature_name`) or the underlying feature ID (`feature_id`) of the feature whose value should be set. - `feature_value` — New value to set for the feature. - `reset_org_overrides` — Applicable only when `scope` is `CLUSTER`. When `true`, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when `scope` is `CLUSTER` for an org-aware feature. Must be omitted when `scope` is `ORG`; passing it at `ORG` scope returns a 400 error.  The following example sets a per-Org value override for Org `1`:  ``` {   \"scope\": \"ORG\",   \"org_identifier\": 1,   \"feature_identifier\": \"index_columns\",   \"feature_value\": \"true\" } ```  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). `reset_org_overrides: true` is destructive — it strips existing per-Org overrides cluster-wide:  ``` {   \"scope\": \"CLUSTER\",   \"feature_identifier\": \"index_columns\",   \"feature_value\": \"true\",   \"reset_org_overrides\": true } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, FeatureManagementApi, UpdateFeatureValueRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new FeatureManagementApi(configuration);

apiInstance.updateFeatureValue(
  // UpdateFeatureValueRequest
  {
    scope: "CLUSTER",
    org_identifier: 1,
    feature_identifier: "feature_identifier_example",
    feature_value: "feature_value_example",
    reset_org_overrides: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateFeatureValueRequest** | **UpdateFeatureValueRequest**|  |


### Return type

**FeatureValueResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Value updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Insufficient privileges or org not assigned to feature. |  -  |
**404** | Feature not found or feature management not enabled. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

