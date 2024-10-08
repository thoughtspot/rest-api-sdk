

# UserParameterOptions

Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objects** | [**List&lt;UserObject&gt;**](UserObject.md) |  |  [optional] |
|**runtimeFilters** | [**List&lt;UserRuntimeFilters&gt;**](UserRuntimeFilters.md) | Objects to apply the User_Runtime_Filters.  Examples to set the &#x60;runtime_filters&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;operator\&quot;: \&quot;EQ\&quot;, \&quot;values\&quot;: [\&quot;red\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |
|**runtimeSorts** | [**List&lt;UserRuntimeSorts&gt;**](UserRuntimeSorts.md) | Objects to apply the User_Runtime_Sorts.  Examples to set the &#x60;runtime_sorts&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;order\&quot;: \&quot;ASC\&quot;, \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |
|**parameters** | [**List&lt;UserParameters&gt;**](UserParameters.md) | Objects to apply the Runtime_Parameters.  Examples to set the &#x60;parameters&#x60; : &#x60;&#x60;&#x60;json { \&quot;name\&quot;: \&quot;Color\&quot;, \&quot;values\&quot;: [\&quot;Blue\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; |  [optional] |


