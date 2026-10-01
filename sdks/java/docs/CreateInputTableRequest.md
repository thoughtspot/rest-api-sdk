

# CreateInputTableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tableName** | **String** | Physical table name to create in the external warehouse. Must start with a letter or an underscore and contain only letters, digits, and underscores — no spaces or other punctuation — and be at most 128 characters. |  |
|**modelIdentifier** | **String** | Unique ID or name of the model (worksheet) to link the input table to. |  |
|**tableDefinition** | [**InputTableDefinitionInput**](InputTableDefinitionInput.md) | Definition of the input table, including new columns and referenced model columns. |  |


## Implemented Interfaces

* Serializable


