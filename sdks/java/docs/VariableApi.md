# VariableApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createVariable**](VariableApi.md#createVariable) | **POST** /api/rest/2.0/template/variables/create |
| [**deleteVariable**](VariableApi.md#deleteVariable) | **POST** /api/rest/2.0/template/variables/{identifier}/delete |
| [**searchVariables**](VariableApi.md#searchVariables) | **POST** /api/rest/2.0/template/variables/search |
| [**updateVariable**](VariableApi.md#updateVariable) | **POST** /api/rest/2.0/template/variables/{identifier}/update |
| [**updateVariableValues**](VariableApi.md#updateVariableValues) | **POST** /api/rest/2.0/template/variables/update |


<a id="createVariable"></a>
# **createVariable**
> Variable createVariable(createVariableRequest)



 Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for fomula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     

### Parameters

| Name | Type |
|------------- | ------------- |
| **createVariableRequest** | [**CreateVariableRequest**](CreateVariableRequest.md)

### Return type

[**Variable**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteVariable"></a>
# **deleteVariable**
> deleteVariable(identifier)



 Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn&#39;t exist * The variable is being used by other objects      

### Parameters

| Name | Type |
|------------- | ------------- |
| **identifier** | **String**

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
| **204** | Deleting the variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchVariables"></a>
# **searchVariables**
> List&lt;Variable&gt; searchVariables(searchVariablesRequest)



 Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchVariablesRequest** | [**SearchVariablesRequest**](SearchVariablesRequest.md)

### Return type

[**List&lt;Variable&gt;**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of variables is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateVariable"></a>
# **updateVariable**
> updateVariable(identifier, updateVariableRequest)



 Update a variable&#39;s properties   Version: 10.9.0.cl or later   Allows updating a variable&#39;s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name     

### Parameters

| Name | Type |
|------------- | ------------- |
| **identifier** | **String**
| **updateVariableRequest** | [**UpdateVariableRequest**](UpdateVariableRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Updating the variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateVariableValues"></a>
# **updateVariableValues**
> updateVariableValues(updateVariableValuesRequest)



 Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, CLEAR)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * CLEAR - Removes all constrains for a given variable, scope is ignored      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateVariableValuesRequest** | [**UpdateVariableValuesRequest**](UpdateVariableValuesRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Updating variable values is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

