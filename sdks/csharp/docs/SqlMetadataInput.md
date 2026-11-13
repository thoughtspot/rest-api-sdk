# ThoughtSpot.RestApi.Sdk.Model.SqlMetadataInput
Object to fetch the SQL query of. Set only the fields that its type uses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Type of the object. Required if &lt;code&gt;identifier&lt;/code&gt; is a name. If not set, the type is taken from the request: &lt;code&gt;tml&lt;/code&gt; means &lt;code&gt;ANSWER&lt;/code&gt;, &lt;code&gt;query_string&lt;/code&gt; means &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;, and a GUID in &lt;code&gt;identifier&lt;/code&gt; means the type of that object. | [optional] 
**Identifier** | **string** | GUID or name of the saved Answer, saved Liveboard, or data source (Model, View, or Table). Required for &lt;code&gt;ANSWER&lt;/code&gt;, &lt;code&gt;LIVEBOARD&lt;/code&gt;, and &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;. | [optional] 
**VisualizationIdentifiers** | **List&lt;string&gt;** | GUIDs or names of visualizations on the Liveboard. If not set, the API returns the SQL of all visualizations. Only for &lt;code&gt;LIVEBOARD&lt;/code&gt;. | [optional] 
**Tml** | **string** | The unsaved Answer, as Answer TML in YAML or JSON format. An unsaved Answer is not a saved object in ThoughtSpot and has no GUID. The API does not save the Answer and does not run the query. Only for &lt;code&gt;ANSWER&lt;/code&gt;, and not with &lt;code&gt;identifier&lt;/code&gt;.  **Note: TML in YAML format, when coming directly from our Playground, currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)** | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

