

# GetFullAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of the user object. |  |
|**password** | **String** | Password of the user account |  [optional] |
|**secretKey** | **String** | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled. |  [optional] |
|**validityTimeInSec** | **Integer** | Token validity duration in seconds |  [optional] |
|**orgId** | **Integer** | ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session. |  [optional] |
|**email** | **String** | Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning). |  [optional] |
|**displayName** | **String** | Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT). |  [optional] |
|**autoCreate** | **Boolean** |    Creates a new user if the specified username does not already exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.  |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | ID or name of the groups to which the newly created user belongs. Use this parameter to provision a user just-in-time (JIT). |  [optional] |
|**userParameters** | [**UserParameterOptions**](UserParameterOptions.md) | &lt;div&gt;Deprecated: 10.4.0.cl and later &lt;/div&gt;  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters). |  [optional] |


## Implemented Interfaces

* Serializable


