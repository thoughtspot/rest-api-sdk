

# FetchSqlQueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**SqlMetadataInput**](SqlMetadataInput.md) | Object to fetch the SQL query of. For example, &lt;code&gt;{\&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;, \&quot;identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;}&lt;/code&gt;. |  |
|**queryString** | **String** | Query string with search tokens to apply on the data source. For example, &lt;code&gt;[Sales][Region]&lt;/code&gt;. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api). Required for &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;; not supported with other types. |  [optional] |
|**runtimeFilter** | **Object** | JSON object with representing filter condition to apply filters at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;col1\&quot;: \&quot;item type\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;Bags\&quot;} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters). |  [optional] |
|**runtimeSort** | **Object** | JSON object representing columns to sort data at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;sortCol1\&quot;: \&quot;sales\&quot;, \&quot;asc1\&quot;: true} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort). |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters at runtime. Not supported with &lt;code&gt;tml&lt;/code&gt;. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters). |  [optional] |


## Implemented Interfaces

* Serializable


