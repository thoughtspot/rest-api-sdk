

# InputTableDefinitionInput

Definition of the input table schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newColumns** | [**List&lt;InputColumnSchemaInput&gt;**](InputColumnSchemaInput.md) | New input-only columns to create in the table. |  |
|**referencedColumns** | **List&lt;String&gt;** | Column IDs from the linked model to include in the table. Pass an empty array to create an input table with no reference columns from the model. |  |


## Implemented Interfaces

* Serializable


