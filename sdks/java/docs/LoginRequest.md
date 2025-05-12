

# LoginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user |  [optional] |
|**password** | **String** | Password of the user account |  [optional] |
|**orgIdentifier** | **String** | ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session. |  [optional] |
|**rememberMe** | **Boolean** | A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests. |  [optional] |


## Implemented Interfaces

* Serializable


