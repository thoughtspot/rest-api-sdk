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
**IncludePersonalisedViews** | **bool?** | When set to true and include_details is also true, includes personalised views in the metadata_detail for LIVEBOARD objects. Personalised views are also included when liveboard_details.personalized_views is true. | [optional] [default to false]
**LiveboardDetails** | [**LiveboardDetailsInput**](LiveboardDetailsInput.md) | &lt;div&gt;Version: 26.10.0.cl or later &lt;/div&gt;  Selects which parts of a Liveboard&#39;s &#x60;metadata_detail&#x60; are returned, so that a request can skip the parts it does not need.  Applies only to &#x60;LIVEBOARD&#x60; objects, and only when &#x60;include_details&#x60; is &#x60;true&#x60; and &#x60;liveboard_response_version&#x60; is &#x60;V2&#x60;. Otherwise it is ignored.  * &#x60;liveboard_filters&#x60;, &#x60;liveboard_tabs&#x60;, &#x60;container_layouts&#x60;, &#x60;visualizations&#x60;, &#x60;parameter_overrides&#x60;: default to &#x60;true&#x60;. Set a field to &#x60;false&#x60; to exclude that part of the Liveboard. * &#x60;personalized_views&#x60;: defaults to &#x60;false&#x60;. Personalised views are included when either this field or &#x60;include_personalised_views&#x60; is &#x60;true&#x60;.  The Liveboard header, type, and style are always returned. Excluded collections are returned empty.  To fetch only the personalised views of a Liveboard, set every other field to &#x60;false&#x60;. The Liveboard definition is then not loaded, and &#x60;metadata_detail&#x60; contains only &#x60;personalised_views&#x60;:  &#x60;&#x60;&#x60;json \&quot;liveboard_details\&quot;: {   \&quot;liveboard_filters\&quot;: false,   \&quot;liveboard_tabs\&quot;: false,   \&quot;container_layouts\&quot;: false,   \&quot;visualizations\&quot;: false,   \&quot;parameter_overrides\&quot;: false,   \&quot;personalized_views\&quot;: true } &#x60;&#x60;&#x60; | [optional] 
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

