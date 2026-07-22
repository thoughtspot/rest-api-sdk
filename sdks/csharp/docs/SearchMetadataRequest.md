# ThoughtSpot.RestApi.Sdk.Model.SearchMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;MetadataListItemInput&gt;**](MetadataListItemInput.md) | Metadata objects such as Liveboards, Answers, and Worksheets. | [optional] 
**Permissions** | [**List&lt;PermissionInput&gt;**](PermissionInput.md) | Object permission details to search by. | [optional] 
**CreatedByUserIdentifiers** | **List&lt;string&gt;** | GUID or name of user who created the metadata object. | [optional] 
**DependentObjectVersion** | **string** | Version of the dependent table of the metadata objects like Worksheets. | [optional] [default to DependentObjectVersionEnum.V1]
**ExcludeObjects** | [**List&lt;ExcludeMetadataListItemInput&gt;**](ExcludeMetadataListItemInput.md) | List of metadata objects to exclude from search. | [optional] 
**FavoriteObjectOptions** | [**FavoriteObjectOptionsInput**](FavoriteObjectOptionsInput.md) | Options to sort the API response by objects set as favorites for the logged-in user or the users specified in the API request. | [optional] 
**IncludeAutoCreatedObjects** | **bool?** | Includes system-generated metadata objects. | [optional] [default to false]
**IncludeDependentObjects** | **bool?** | Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers. | [optional] [default to false]
**DependentObjectsRecordSize** | **int** | The maximum number of dependents to include per metadata object. | [optional] [default to 50]
**IncludeDetails** | **bool?** | Includes complete details of the metadata objects. | [optional] [default to false]
**IncludePersonalisedViews** | **bool?** | When set to true and include_details is also true, includes personalised views in the metadata_detail for LIVEBOARD objects. | [optional] [default to false]
**IncludeHeaders** | **bool?** | Includes headers of the metadata objects. | [optional] [default to true]
**IncludeHiddenObjects** | **bool?** | Includes details of the hidden objects, such as a column in a worksheet or a table. | [optional] [default to false]
**IncludeIncompleteObjects** | **bool?** | Includes objects with incomplete metadata. | [optional] [default to false]
**IncludeVisualizationHeaders** | **bool?** | Includes visualization headers of the specified Liveboard object. | [optional] [default to false]
**IncludeWorksheetSearchAssistData** | **bool?** | If search assistance lessons are configured on a worksheet, the API returns the search assist data for Worksheet objects. | [optional] 
**ModifiedByUserIdentifiers** | **List&lt;string&gt;** | Includes ID or names of the users who modified the metadata object. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included. It is recommended to use a smaller &#x60;record_size&#x60; when fetching dependent objects or any of the additional metadata detail options. | [optional] [default to 10]
**SortOptions** | [**MetadataSearchSortOptions**](MetadataSearchSortOptions.md) | Sort options to filter metadata details. | [optional] 
**TagIdentifiers** | **List&lt;string&gt;** | Tags to filter metadata objects by | [optional] 
**IncludeStats** | **bool?** | Indicates whether to include stats of the metadata objects. | [optional] [default to false]
**IncludeDiscoverableObjects** | **bool?** | &lt;div&gt;Version: 10.7.0.cl or later &lt;/div&gt;  Boolean to indicate whether to include discoverable metadata objects. | [optional] [default to true]
**ShowResolvedParameters** | **bool?** | &lt;div&gt;Version: 10.9.0.cl or later &lt;/div&gt;  Indicates whether to show resolved parameterised values. | [optional] [default to false]
**LiveboardResponseVersion** | **string** | Indicates the model version of Liveboard to be attached in metadata detail. | [optional] [default to LiveboardResponseVersionEnum.V1]
**IncludeOnlyPublishedObjects** | **bool?** | &lt;div&gt;Version: 10.11.0.cl or later &lt;/div&gt;  If only published objects should be returned | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

