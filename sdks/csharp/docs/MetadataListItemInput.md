# ThoughtSpot.RestApi.Sdk.Model.MetadataListItemInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **string** | Unique ID or name of the metadata. | [optional] 
**ObjIdentifier** | **string** | CustomObjectId of the metadata. | [optional] 
**NamePattern** | **string** | A pattern to match the case-insensitive name of the metadata object. User % for a wildcard match. | [optional] 
**Type** | **string** | Type of metadata. Required if the name of the object is set as identifier. This attribute is optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view. 5. CONNECTION for creating or modify data connections. 6. TAG for tag objects. 7. USER for user objects. 8. USER_GROUP for group objects. 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values 10. INSIGHT_SPEC for SpotIQ objects | [optional] 
**Subtypes** | **List&lt;MetadataListItemInput.SubtypesEnum&gt;** | List of subtype of metadata. Applies for LOGICAL_TABLE type with the following valid values. 1. ONE_TO_ONE_LOGICAL 2. WORKSHEET 3. PRIVATE_WORKSHEET. 4. USER_DEFINED. 5. AGGR_WORKSHEET. 6. SQL_VIEW    Version: 10.11.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

