

# ExportMetadataTMLBatchedRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata object to export, can be one of USER | ROLE | USER_GROUP |  |
|**batchOffset** | **Integer** | Indicates the position within the complete set from where the API should begin returning objects. |  [optional] |
|**batchSize** | **Integer** | Determines the number of objects or items to be retrieved in a single request. |  [optional] |
|**edocFormat** | [**EdocFormatEnum**](#EdocFormatEnum) | TML EDOC content format. |  [optional] |
|**exportDependent** | **Boolean** | Indicates whether to export dependent metadata objects of specified metadata objects. |  [optional] |
|**allOrgsOverride** | **Boolean** | Indicates whether to export is happening from all orgs context. |  [optional] |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |
| ROLE | &quot;ROLE&quot; |



## Enum: EdocFormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;JSON&quot; |
| YAML | &quot;YAML&quot; |


## Implemented Interfaces

* Serializable


