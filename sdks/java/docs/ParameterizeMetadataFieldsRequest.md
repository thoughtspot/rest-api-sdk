

# ParameterizeMetadataFieldsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata object to parameterize. |  [optional] |
|**metadataIdentifier** | **String** | Unique ID or name of the metadata object to parameterize. |  |
|**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | Type of field in the metadata to parameterize. |  |
|**fieldNames** | **List&lt;String&gt;** | JSON array of field names to parameterize. Example: [schemaName, databaseName, tableName] |  |
|**variableIdentifier** | **String** | Unique ID or name of the variable to use for parameterization of these fields. |  |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| CONNECTION | &quot;CONNECTION&quot; |
| CONNECTION_CONFIG | &quot;CONNECTION_CONFIG&quot; |



## Enum: FieldTypeEnum

| Name | Value |
|---- | -----|
| ATTRIBUTE | &quot;ATTRIBUTE&quot; |
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |


## Implemented Interfaces

* Serializable


