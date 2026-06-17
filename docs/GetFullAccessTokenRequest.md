# ThoughtSpot.Client.Model.GetFullAccessTokenRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | Username of the ThoughtSpot user. The username is stored in the &#x60;name&#x60; attribute of the user object. | 
**Password** | **string** | Password of the user account | [optional] [default to ""]
**SecretKey** | **string** | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled. | [optional] [default to ""]
**ValidityTimeInSec** | **int** | Token validity duration in seconds | [optional] [default to 300]
**OrgId** | **int** | ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session. | [optional] 
**Email** | **string** | Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning). | [optional] 
**DisplayName** | **string** | Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT). | [optional] 
**AutoCreate** | **bool?** |    Creates a new user if the specified username does not already exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.  | [optional] [default to false]
**GroupIdentifiers** | **List&lt;string&gt;** | ID or name of the groups to which the newly created user belongs. Use this parameter to provision a user just-in-time (JIT). | [optional] 
**UserParameters** | [**UserParameterOptions**](UserParameterOptions.md) | &lt;div&gt;Deprecated: 10.4.0.cl and later &lt;/div&gt;  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

