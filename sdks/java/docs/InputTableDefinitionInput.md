

# InputTableDefinitionInput

Definition of the input table schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newColumns** | [**List&lt;InputColumnSchemaInput&gt;**](InputColumnSchemaInput.md) | New input-only columns to create in the table. |  |
|**referencedColumns** | **List&lt;String&gt;** | Names of the columns on the linked model to include in the table, as they appear on the model. These become the input table&#39;s key columns: they are what the input table is joined to the model on, and what rows are matched on by updateInputTable. At least one is required — an empty array is rejected. A name must match exactly one visible model column; a name matching none, or more than one, is rejected. Each must also resolve to exactly one physical base column, so a formula, cohort, or constant model column cannot be referenced. |  |
|**referencedColumnTimeDimensions** | [**List&lt;ReferencedColumnTimeDimension&gt;**](ReferencedColumnTimeDimension.md) | Optional per-column time dimension to persist at creation. Provide one entry per referenced date column that should open — and stay locked — at a specific grain. Columns without an entry apply no bucketing (detailed). Applies to referenced model columns only; a column created through new_columns always starts detailed. |  [optional] |


## Implemented Interfaces

* Serializable


