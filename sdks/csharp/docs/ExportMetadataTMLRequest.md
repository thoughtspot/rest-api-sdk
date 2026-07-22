# ThoughtSpot.RestApi.Sdk.Model.ExportMetadataTMLRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;ExportMetadataTypeInput&gt;**](ExportMetadataTypeInput.md) | Metadata objects. | 
**ExportAssociated** | **bool?** | Indicates whether to export associated metadata objects of specified metadata objects. | [optional] [default to false]
**ExportFqn** | **bool?** | Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects, the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don&#39;t need to manually add FQNs of the referenced objects during TML import. | [optional] [default to false]
**EdocFormat** | **string** | TML EDOC content format.  **Note: exporting in YAML format currently requires manual formatting of the output. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)** | [optional] [default to EdocFormatEnum.JSON]
**ExportSchemaVersion** | **string** | Indicates whether to export worksheet TML in DEFAULT or V1 or V2 version. | [optional] [default to ExportSchemaVersionEnum.DEFAULT]
**ExportDependent** | **bool?** | Indicates whether to export table while exporting connection. | [optional] [default to false]
**ExportConnectionAsDependent** | **bool?** | Indicates whether to export connection as dependent while exporting table/worksheet/answer/liveboard. This will only be active when export_associated is true. | [optional] [default to false]
**AllOrgsOverride** | **bool?** | Indicates whether to export is happening from all orgs context. | [optional] [default to false]
**ExportOptions** | [**ExportOptions**](ExportOptions.md) | Flags to specify additional options for export.    Version: 10.6.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

