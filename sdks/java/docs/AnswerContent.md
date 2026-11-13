

# AnswerContent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableDataRowCount** | **Integer** | Total available data row count. |  |
|**columnNames** | **List&lt;String&gt;** | Name of the columns. |  |
|**dataRows** | **List&lt;Object&gt;** | Rows of data set. |  |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  |
|**recordSize** | **Integer** | The number of records that should be included. |  |
|**returnedDataRowCount** | **Integer** | Total returned data row count. |  |
|**samplingRatio** | **Float** | Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the data set to the total number of keys expected in the query. If the value is 1.0, this means that the complete result is returned. |  |
|**sqlQuery** | **String** | SQL that ThoughtSpot generated from &lt;code&gt;query_string&lt;/code&gt; on the data source in &lt;code&gt;logical_table_identifier&lt;/code&gt;, for the rows in this item. Null when &lt;code&gt;include_sql_query&lt;/code&gt; is false.    Version: 27.1.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


