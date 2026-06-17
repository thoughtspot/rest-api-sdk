# ThoughtSpot.Client.Model.UserParameterOptions
Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Objects** | [**List&lt;UserObject&gt;**](UserObject.md) |  | [optional] 
**RuntimeFilters** | [**List&lt;RuntimeFilters&gt;**](RuntimeFilters.md) | Objects to apply the User_Runtime_Filters.  Examples to set the &#x60;runtime_filters&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;operator\&quot;: \&quot;EQ\&quot;, \&quot;values\&quot;: [\&quot;red\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; | [optional] 
**RuntimeSorts** | [**List&lt;RuntimeSorts&gt;**](RuntimeSorts.md) | Objects to apply the User_Runtime_Sorts.  Examples to set the &#x60;runtime_sorts&#x60; : &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;order\&quot;: \&quot;ASC\&quot;, \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; | [optional] 
**Parameters** | [**List&lt;RuntimeParameters&gt;**](RuntimeParameters.md) | Objects to apply the Runtime_Parameters.  Examples to set the &#x60;parameters&#x60; : &#x60;&#x60;&#x60;json { \&quot;name\&quot;: \&quot;Color\&quot;, \&quot;values\&quot;: [\&quot;Blue\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

