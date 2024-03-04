

# DbtGenerateTmlRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dbtConnectionIdentifier** | **String** | Unique ID of the DBT connection. |  |
|**modelTables** | [**List&lt;ModelTableList&gt;**](ModelTableList.md) | List of Models and their respective Tables |  [optional] |
|**importWorksheets** | [**ImportWorksheetsEnum**](#ImportWorksheetsEnum) | Mention the worksheet tmls to import |  |
|**worksheets** | **List&lt;String&gt;** | List of worksheets is mandatory when import_Worksheets is type SELECTED |  [optional] |
|**fileContent** | **File** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ |  [optional] |



## Enum: ImportWorksheetsEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| NONE | &quot;NONE&quot; |
| SELECTED | &quot;SELECTED&quot; |



