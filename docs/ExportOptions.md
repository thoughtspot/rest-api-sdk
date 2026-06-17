# ThoughtSpot.Client.Model.ExportOptions
Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IncludeObjIdRef** | **bool?** | Boolean Flag to export Object ID of referenced object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. | [optional] [default to false]
**IncludeGuid** | **bool?** | Boolean flag to export guid of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. | [optional] [default to true]
**IncludeObjId** | **bool?** | Boolean flag to export Object ID of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. | [optional] [default to false]
**ExportWithAssociatedFeedbacks** | **bool?** | Boolean flag indicating whether to export associated feedbacks of the object. This will only be respected when the object can have feedbacks.    Version: 10.7.0.cl or later  | [optional] [default to false]
**ExportColumnSecurityRules** | **bool?** | Boolean flag indicating whether to export column security rules of the object. This will only be respected when the object can have column security rules and export_associated is true.   Version: 10.12.0.cl or later  | [optional] [default to false]
**ExportWithColumnAliases** | **bool?** | Boolean flag indicating whether to export column aliases of the model. This will only be respected when the object can have column aliases.   Version: 10.13.0.cl or later  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

