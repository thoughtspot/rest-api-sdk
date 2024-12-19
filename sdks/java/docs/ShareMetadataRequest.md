

# ShareMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata. Required if identifier in metadata_identifies is a name\&quot;. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. |  [optional] |
|**metadataIdentifiers** | **List&lt;String&gt;** | Unique ID or name of metadata objects. Note: All the names should belong to same metadata_type |  [optional] |
|**metadata** | [**List&lt;ShareMetadataTypeInput&gt;**](ShareMetadataTypeInput.md) | Metadata details for sharing objects. |  [optional] |
|**permissions** | [**List&lt;SharePermissionsInput&gt;**](SharePermissionsInput.md) | Permission details for sharing the objects. |  |
|**visualizationIdentifiers** | **List&lt;String&gt;** | Options to specify details of Liveboard. First Liveboard encountered in payload is considered to be the corresponding Liveboard. |  [optional] |
|**emails** | **List&lt;String&gt;** | Email IDs to which notifications will be sent. |  |
|**message** | **String** | Message to be included in notification. |  |
|**enableCustomUrl** | **Boolean** | Sends object URLs in the customized format in email notifications. |  [optional] |
|**notifyOnShare** | **Boolean** | Flag to notify user when any object is shared. |  [optional] |
|**hasLenientDiscoverability** | **Boolean** | Flag to make the object discoverable. |  [optional] |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |



