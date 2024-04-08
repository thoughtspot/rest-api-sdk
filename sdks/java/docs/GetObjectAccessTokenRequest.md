

# GetObjectAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user |  |
|**objectId** | **String** | GUID of the ThoughtSpot metadata object that the user can access. The bearer will only have access to the object specified in the API request. |  [optional] |
|**password** | **String** | Password of the user account |  [optional] |
|**secretKey** | **String** | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled. |  [optional] |
|**validityTimeInSec** | **Integer** | Token validity duration in seconds |  [optional] |
|**orgId** | **Integer** | ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session. |  [optional] |
|**email** | **String** | Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning). |  [optional] |
|**displayName** | **String** | Display name of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning). |  [optional] |
|**autoCreate** | **Boolean** |    Creates a new user if the specified username does not exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.  |  [optional] |
|**groupIdentifiers** | **List&lt;String&gt;** | Unique ID or name of the groups to which you want to assign the new user. You can specify this attribute to dynamically assign privileges during just-in-time (JIT) provisioning. |  [optional] |
|**jwtUserOptions** | [**JWTUserOptions**](JWTUserOptions.md) |  |  [optional] |



