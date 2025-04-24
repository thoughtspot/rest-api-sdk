

# ExportMetadataTMLRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;ExportMetadataTypeInput&gt;**](ExportMetadataTypeInput.md) | Metadata objects. |  |
|**exportAssociated** | **Boolean** | Indicates whether to export associated metadata objects of specified metadata objects. |  [optional] |
|**exportFqn** | **Boolean** | Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects, the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don&#39;t need to manually add FQNs of the referenced objects during TML import. |  [optional] |
|**edocFormat** | [**EdocFormatEnum**](#EdocFormatEnum) | TML EDOC content format.  **Note: exporting in YAML format currently requires manual formatting of the output. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)** |  [optional] |
|**exportSchemaVersion** | [**ExportSchemaVersionEnum**](#ExportSchemaVersionEnum) | Indicates whether to export worksheet TML in DEFAULT or V1 or V2 version. |  [optional] |
|**exportDependent** | **Boolean** | Indicates whether to export table while exporting connection. |  [optional] |
|**exportConnectionAsDependent** | **Boolean** | Indicates whether to export connection as dependent while exporting table/worksheet/answer/liveboard. This will only be active when export_associated is true. |  [optional] |
|**allOrgsOverride** | **Boolean** | Indicates whether to export is happening from all orgs context. |  [optional] |
|**exportOptions** | [**ExportMetadataTMLRequestExportOptions**](ExportMetadataTMLRequestExportOptions.md) |  |  [optional] |



## Enum: EdocFormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;JSON&quot; |
| YAML | &quot;YAML&quot; |



## Enum: ExportSchemaVersionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| V1 | &quot;V1&quot; |
| V2 | &quot;V2&quot; |



