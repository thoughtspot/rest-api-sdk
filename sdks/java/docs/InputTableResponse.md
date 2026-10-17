

# InputTableResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputTableId** | **String** | Unique ID of the newly created input table. Pass it as the input_table_identifier path parameter of the other input-table operations. |  [optional] |
|**inputColumns** | [**List&lt;InputColumnInfo&gt;**](InputColumnInfo.md) | Columns of the newly created input table, each with its name and unique ID. Use these IDs to reference specific columns in follow-up calls (for example, the column identifiers written by updateInputTable). Returned so callers do not need a separate lookup to resolve a column name to its ID. |  [optional] |
|**messageInfo** | **String** | Note set when a referenced column had to be renamed to keep the input table&#39;s column names unique — a model column name that occurs in more than one base table is prefixed with its base table name. Absent when no column was renamed. Read it to learn the final name of a renamed column, or read the name off input_columns. |  [optional] |


## Implemented Interfaces

* Serializable


