

# GetObjectAccessTokenRequestUserParameters

<div>Deprecated: 10.4.0.cl and later </div>  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objects** | [**List&lt;UserObject&gt;**](UserObject.md) |  |  [optional] |
|**runtimeFilters** | [**List&lt;RuntimeFilters&gt;**](RuntimeFilters.md) | Objects to apply the User_Runtime_Filters.  Examples to set the &#x60;runtime_filters&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;operator\&quot;: \&quot;EQ\&quot;, \&quot;values\&quot;: [\&quot;red\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |
|**runtimeSorts** | [**List&lt;RuntimeSorts&gt;**](RuntimeSorts.md) | Objects to apply the User_Runtime_Sorts.  Examples to set the &#x60;runtime_sorts&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;order\&quot;: \&quot;ASC\&quot;, \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |
|**parameters** | [**List&lt;RuntimeParameters&gt;**](RuntimeParameters.md) | Objects to apply the Runtime_Parameters.  Examples to set the &#x60;parameters&#x60; : &#x60;&#x60;&#x60;json { \&quot;name\&quot;: \&quot;Color\&quot;, \&quot;values\&quot;: [\&quot;Blue\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |



