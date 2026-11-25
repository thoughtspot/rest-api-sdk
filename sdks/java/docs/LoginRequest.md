

# LoginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the ThoughtSpot user |  [optional] |
|**password** | **String** | Password of the user account |  [optional] |
|**orgIdentifier** | **String** | ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session. |  [optional] |
|**rememberMe** | **Boolean** | A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests. |  [optional] |
|**redirectUrl** | **String** | Path on this cluster to land on after a successful login. Pass only the path; a full URL is rejected with 400.   Accepted: &#x60;/insights/home/answers&#x60;, &#x60;/insights/pinboard&#x60;, &#x60;/&#x60;   Rejected: &#x60;https://your-cluster.thoughtspot.cloud/#/insights/home/answers&#x60;, &#x60;//example.com/insights&#x60;, &#x60;insights/home/answers&#x60;   When omitted, no redirect is issued and the response is unchanged.    Version: 26.12.0.cl or later  |  [optional] |
|**noUrlRedirection** | **Boolean** | A flag to suppress the redirect. When set to true, the resolved URL is returned in the location header instead of a 302 redirect. Applies only when redirect_url is set.    Version: 26.12.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


