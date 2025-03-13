

# GetCustomAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of the user object. |  |
|**password** | **String** | Password of the user account |  [optional] |
|**secretKey** | **String** | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled. |  [optional] |
|**validityTimeInSec** | **Integer** | Token validity duration in seconds |  [optional] |
|**orgIdentifier** | **String** | ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session. |  [optional] |
|**persistOption** | [**PersistOptionEnum**](#PersistOptionEnum) | Indicates whether the specified attributes should be persisted or not. |  |
|**filterRules** | [**List&lt;FilterRules&gt;**](FilterRules.md) | Filter rules. |  [optional] |
|**parameterValues** | [**List&lt;ParameterValues&gt;**](ParameterValues.md) | Parameter values. |  [optional] |
|**objects** | [**List&lt;TokenAccessScopeObject&gt;**](TokenAccessScopeObject.md) | Objects on which the filter rules and parameters values should be applied to. |  [optional] |
|**email** | **String** | (just-in-time (JIT) provisioning)Email address of the user. Specify this attribute when creating a new user. |  [optional] |
|**displayName** | **String** | (just-in-time (JIT) provisioning) Indicates display name of the user. Specify this attribute when creating a new user. |  [optional] |
|**groups** | [**List&lt;GroupObject&gt;**](GroupObject.md) | (just-in-time (JIT) provisioning) ID or name of the groups to which the newly created user belongs. Specify this attribute when creating a new user. |  [optional] |
|**autoCreate** | **Boolean** |    Creates a new user if the specified username does not exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.     Version: 10.5.0.cl or later  |  [optional] |



## Enum: PersistOptionEnum

| Name | Value |
|---- | -----|
| APPEND | &quot;APPEND&quot; |
| NONE | &quot;NONE&quot; |
| REPLACE | &quot;REPLACE&quot; |
| RESET | &quot;RESET&quot; |



