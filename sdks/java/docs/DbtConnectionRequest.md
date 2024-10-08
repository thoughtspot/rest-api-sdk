

# DbtConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionName** | **String** | Name of the connection. |  |
|**databaseName** | **String** | Name of the Database. |  |
|**importType** | [**ImportTypeEnum**](#ImportTypeEnum) | Mention type of Import |  [optional] |
|**accessToken** | **String** | Access token is mandatory when Import_Type is DBT_CLOUD. |  [optional] |
|**dbtUrl** | **String** | DBT URL is mandatory when Import_Type is DBT_CLOUD. |  [optional] |
|**accountId** | **String** | Account ID is mandatory when Import_Type is DBT_CLOUD |  [optional] |
|**projectId** | **String** | Project ID is mandatory when Import_Type is DBT_CLOUD |  [optional] |
|**dbtEnvId** | **String** | DBT Environment ID\&quot; |  [optional] |
|**projectName** | **String** | Name of the project |  [optional] |
|**fileContent** | **File** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39; |  [optional] |



## Enum: ImportTypeEnum

| Name | Value |
|---- | -----|
| DBT_CLOUD | &quot;DBT_CLOUD&quot; |
| ZIP_FILE | &quot;ZIP_FILE&quot; |



