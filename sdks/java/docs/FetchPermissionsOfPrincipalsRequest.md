

# FetchPermissionsOfPrincipalsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | GUID or name of the user or group. |  |
|**metadata** | [**List&lt;PermissionsMetadataTypeInput&gt;**](PermissionsMetadataTypeInput.md) | Metadata objects for which you want to fetch permission details. If not specified, the API returns permission details for all metadata objects that the specified users and groups can access. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included for each metadata type. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included for each metadata type. |  [optional] |
|**defaultMetadataType** | [**DefaultMetadataTypeEnum**](#DefaultMetadataTypeEnum) | When no metadata objects input is passed, metadata objects of this type are fetched. |  [optional] |



## Enum: DefaultMetadataTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| LIVEBOARD | &quot;LIVEBOARD&quot; |
| ANSWER | &quot;ANSWER&quot; |
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |
| LOGICAL_COLUMN | &quot;LOGICAL_COLUMN&quot; |
| CONNECTION | &quot;CONNECTION&quot; |


## Implemented Interfaces

* Serializable


