

# UpdateInputTableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columns** | **List&lt;String&gt;** | Names of the columns being written, in the same order as the values in each row. Must name every key column (the columns mapped from the linked model), since rows are matched on those, and at least one non-key column, since key columns are matched on but never assigned to. |  |
|**rows** | **List&lt;List&lt;String&gt;&gt;** | Rows to write into the input table. Each row is an array of string values aligned positionally with columns. A DATE cell takes an ISO calendar date (yyyy-MM-dd), which is stored with no time-zone conversion; an epoch number is also accepted, but a single column must use the same form in every row. DATE_TIME and TIME cells take an epoch number only. |  |


## Implemented Interfaces

* Serializable


