# ThoughtSpot.Client.Model.ShareMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataType** | **string** | Type of metadata. Required if identifier in metadata_identifies is a name. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN 5. Connection 6. Collection | [optional] 
**MetadataIdentifiers** | **List&lt;string&gt;** | Unique ID or name of metadata objects. Note: All the names should belong to same metadata_type | [optional] 
**Metadata** | [**List&lt;ShareMetadataTypeInput&gt;**](ShareMetadataTypeInput.md) | Metadata details for sharing objects. | [optional] 
**Permissions** | [**List&lt;SharePermissionsInput&gt;**](SharePermissionsInput.md) | Permission details for sharing the objects. | 
**VisualizationIdentifiers** | **List&lt;string&gt;** | Options to specify details of Liveboard. First Liveboard encountered in payload is considered to be the corresponding Liveboard. | [optional] 
**Emails** | **List&lt;string&gt;** | Email IDs to which notifications will be sent. | [optional] 
**Message** | **string** | Message to be included in notification. | 
**EnableCustomUrl** | **bool?** | Sends object URLs in the customized format in email notifications. | [optional] [default to false]
**NotifyOnShare** | **bool?** | Flag to notify user when any object is shared. | [optional] [default to true]
**HasLenientDiscoverability** | **bool?** | Flag to make the object discoverable. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

