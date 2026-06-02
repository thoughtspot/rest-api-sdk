

# SharePermissionsInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**principal** | [**PrincipalsInput**](PrincipalsInput.md) |  |  |
|**shareMode** | [**ShareModeEnum**](#ShareModeEnum) | Type of access to the shared object |  |
|**contentShareMode** | [**ContentShareModeEnum**](#ContentShareModeEnum) | Content share mode for collections. Controls access to objects within the collection. Only applicable when sharing COLLECTION metadata type. |  [optional] |



## Enum: ShareModeEnum

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |
| NO_ACCESS | &quot;NO_ACCESS&quot; |



## Enum: ContentShareModeEnum

| Name | Value |
|---- | -----|
| READ_ONLY | &quot;READ_ONLY&quot; |
| MODIFY | &quot;MODIFY&quot; |


## Implemented Interfaces

* Serializable


