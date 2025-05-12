

# ExportOptions

Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeObjIdRef** | **Boolean** | Boolean Flag to export Object ID of referenced object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. |  [optional] |
|**includeGuid** | **Boolean** | Boolean flag to export guid of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. |  [optional] |
|**includeObjId** | **Boolean** | Boolean flag to export Object ID of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature. |  [optional] |
|**exportWithAssociatedFeedbacks** | **Boolean** | Boolean flag indicating whether to export associated feedbacks of the object. This will only be respected when the object can have feedbacks.    Version: 10.7.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


