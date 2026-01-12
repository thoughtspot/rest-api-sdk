

# GetCustomAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of the user object. |  |
|**password** | **String** | Password of the user account |  [optional] |
|**secretKey** | **String** | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled. |  [optional] |
|**validityTimeInSec** | **Integer** | Token validity duration in seconds |  [optional] |
|**orgIdentifier** | **String** | ID or name of the Org context to log in to. If the Org ID or name is not specified but a secret key is provided, the user will be logged into the Org associated with the secret key. If neither the Org ID/name nor the secret key is provided, the user will be logged into the Org context from their previous login session. |  [optional] |
|**persistOption** | [**PersistOptionEnum**](#PersistOptionEnum) | Indicates whether the specified attributes should be persisted or not. RESET and NONE are not applicable if you are setting variable_values. |  |
|**filterRules** | [**List&lt;FilterRules&gt;**](FilterRules.md) | Filter rules. |  [optional] |
|**parameterValues** | [**List&lt;ParameterValues&gt;**](ParameterValues.md) | Allows developers to assign parameter values for existing parameters to a user at login. Note: Using parameter values for row level security use cases will ultimately be deprecated. Developers can still pass data security values via the Custom Access token via the variable_values field and create RLS rules based on custom variables. Please refer to the [ABAC via RLS documentation](https://developers.thoughtspot.com/docs/abac-user-parameters) for more details. |  [optional] |
|**variableValues** | [**List&lt;VariableValues&gt;**](VariableValues.md) | List of variable values where &#x60;name&#x60; references an existing formula variable and &#x60;values&#x60; is any value from the corresponding column.    Version: 10.14.0.cl or later  |  [optional] |
|**objects** | [**List&lt;TokenAccessScopeObject&gt;**](TokenAccessScopeObject.md) | Objects on which the parameter and variable values should be applied to |  [optional] |
|**email** | **String** | (just-in-time (JIT) provisioning)Email address of the user. Specify this attribute when creating a new user. |  [optional] |
|**displayName** | **String** | (just-in-time (JIT) provisioning) Indicates display name of the user. Specify this attribute when creating a new user. |  [optional] |
|**groups** | [**List&lt;GroupObject&gt;**](GroupObject.md) | (just-in-time (JIT) provisioning) ID or name of the groups to which the newly created user belongs. Specify this attribute when creating a new user. |  [optional] |
|**autoCreate** | **Boolean** |    Creates a new user if the specified username does not exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required. New formula variables won&#39;t be created.     Version: 10.5.0.cl or later  |  [optional] |



## Enum: PersistOptionEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;REPLACE&quot; |
| APPEND | &quot;APPEND&quot; |
| NONE | &quot;NONE&quot; |
| RESET | &quot;RESET&quot; |


## Implemented Interfaces

* Serializable


