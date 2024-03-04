

# SearchDataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryString** | **String** | Query string with search tokens. For example, &lt;code&gt;[Sales][Region]&lt;/code&gt;. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api) |  |
|**logicalTableIdentifier** | **String** | GUID of the data source object, such as a Worksheet, View, or Table. You can find the GUID of a data object from the UI or via API. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_query) for more details. |  |
|**dataFormat** | [**DataFormatEnum**](#DataFormatEnum) | JSON output format. By default, the API returns full data in the JSON. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records to include in a batch. |  [optional] |
|**runtimeFilter** | **Object** | JSON object with representing filter condition to apply filters at runtime. For example, &lt;code&gt; {\&quot;col1\&quot;: \&quot;item type\&quot;, \&quot;op1\&quot;: \&quot;EQ\&quot;, \&quot;val1\&quot;: \&quot;Bags\&quot;} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters). |  [optional] |
|**runtimeSort** | **Object** | JSON object representing columns to sort data at runtime. For example, &lt;code&gt; {\&quot;sortCol1\&quot;: \&quot;sales\&quot;, \&quot;asc1\&quot;: true} &lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort). |  [optional] |
|**runtimeParamOverride** | **Object** | JSON object for setting values of parameters at runtime. For example, &lt;code&gt; {\&quot;param1\&quot;: \&quot;Double List Param\&quot;, \&quot;paramVal1\&quot;: 0.5}&lt;/code&gt;. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters). |  [optional] |



## Enum: DataFormatEnum

| Name | Value |
|---- | -----|
| COMPACT | &quot;COMPACT&quot; |



