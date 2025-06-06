

# UnparameterizeMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata object to unparameterize. |  [optional] |
|**metadataIdentifier** | **String** | Unique ID or name of the metadata object to unparameterize. |  |
|**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | Type of field in the metadata to unparameterize. |  |
|**fieldName** | **String** | Name of the field which needs to be unparameterized. |  |
|**value** | **String** | The value to use in place of the variable for the field |  |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| CONNECTION | &quot;CONNECTION&quot; |



## Enum: FieldTypeEnum

| Name | Value |
|---- | -----|
| ATTRIBUTE | &quot;ATTRIBUTE&quot; |
| CONNECTION_PROPERTY | &quot;CONNECTION_PROPERTY&quot; |


## Implemented Interfaces

* Serializable


