

# SearchMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;MetadataListItemInput&gt;**](MetadataListItemInput.md) | Metadata objects such as Liveboards, Answers, and Worksheets. |  [optional] |
|**permissions** | [**List&lt;PermissionInput&gt;**](PermissionInput.md) | Object permission details to search by. |  [optional] |
|**createdByUserIdentifiers** | **List&lt;String&gt;** | GUID or name of user who created the metadata object. |  [optional] |
|**dependentObjectVersion** | [**DependentObjectVersionEnum**](#DependentObjectVersionEnum) | Version of the dependent table of the metadata objects like Worksheets. |  [optional] |
|**excludeObjects** | [**List&lt;ExcludeMetadataListItemInput&gt;**](ExcludeMetadataListItemInput.md) | List of metadata objects to exclude from search. |  [optional] |
|**favoriteObjectOptions** | [**FavoriteObjectOptionsInput**](FavoriteObjectOptionsInput.md) | Options to sort the API response by objects set as favorites for the logged-in user or the users specified in the API request. |  [optional] |
|**includeAutoCreatedObjects** | **Boolean** | Includes system-generated metadata objects. |  [optional] |
|**includeDependentObjects** | **Boolean** | Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers. |  [optional] |
|**dependentObjectsRecordSize** | **Integer** | The maximum number of dependents to include per metadata object. |  [optional] |
|**includeDetails** | **Boolean** | Includes complete details of the metadata objects. |  [optional] |
|**includePersonalisedViews** | **Boolean** | When set to true and include_details is also true, includes personalised views in the metadata_detail for LIVEBOARD objects. Personalised views are also included when liveboard_details.personalized_views is true. |  [optional] |
|**liveboardDetails** | [**LiveboardDetailsInput**](LiveboardDetailsInput.md) | &lt;div&gt;Version: 26.10.0.cl or later &lt;/div&gt;  Selects which parts of a Liveboard&#39;s &#x60;metadata_detail&#x60; are returned, so that a request can skip the parts it does not need.  Applies only to &#x60;LIVEBOARD&#x60; objects, and only when &#x60;include_details&#x60; is &#x60;true&#x60; and &#x60;liveboard_response_version&#x60; is &#x60;V2&#x60;. Otherwise it is ignored.  * &#x60;liveboard_filters&#x60;, &#x60;liveboard_tabs&#x60;, &#x60;container_layouts&#x60;, &#x60;visualizations&#x60;, &#x60;parameter_overrides&#x60;: default to &#x60;true&#x60;. Set a field to &#x60;false&#x60; to exclude that part of the Liveboard. * &#x60;personalized_views&#x60;: defaults to &#x60;false&#x60;. Personalised views are included when either this field or &#x60;include_personalised_views&#x60; is &#x60;true&#x60;.  The Liveboard header, type, and style are always returned. Excluded collections are returned empty.  To fetch only the personalised views of a Liveboard, set every other field to &#x60;false&#x60;. The Liveboard definition is then not loaded, and &#x60;metadata_detail&#x60; contains only &#x60;personalised_views&#x60;:  &#x60;&#x60;&#x60;json \&quot;liveboard_details\&quot;: {   \&quot;liveboard_filters\&quot;: false,   \&quot;liveboard_tabs\&quot;: false,   \&quot;container_layouts\&quot;: false,   \&quot;visualizations\&quot;: false,   \&quot;parameter_overrides\&quot;: false,   \&quot;personalized_views\&quot;: true } &#x60;&#x60;&#x60; |  [optional] |
|**includeHeaders** | **Boolean** | Includes headers of the metadata objects. |  [optional] |
|**includeHiddenObjects** | **Boolean** | Includes details of the hidden objects, such as a column in a worksheet or a table. |  [optional] |
|**includeIncompleteObjects** | **Boolean** | Includes objects with incomplete metadata. |  [optional] |
|**includeVisualizationHeaders** | **Boolean** | Includes visualization headers of the specified Liveboard object. |  [optional] |
|**includeWorksheetSearchAssistData** | **Boolean** | If search assistance lessons are configured on a worksheet, the API returns the search assist data for Worksheet objects. |  [optional] |
|**modifiedByUserIdentifiers** | **List&lt;String&gt;** | Includes ID or names of the users who modified the metadata object. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. It is recommended to use a smaller &#x60;record_size&#x60; when fetching dependent objects or any of the additional metadata detail options. |  [optional] |
|**sortOptions** | [**MetadataSearchSortOptions**](MetadataSearchSortOptions.md) | Sort options to filter metadata details. |  [optional] |
|**tagIdentifiers** | **List&lt;String&gt;** | Tags to filter metadata objects by |  [optional] |
|**includeStats** | **Boolean** | Indicates whether to include stats of the metadata objects. |  [optional] |
|**includeDiscoverableObjects** | **Boolean** | &lt;div&gt;Version: 10.7.0.cl or later &lt;/div&gt;  Boolean to indicate whether to include discoverable metadata objects. |  [optional] |
|**showResolvedParameters** | **Boolean** | &lt;div&gt;Version: 10.9.0.cl or later &lt;/div&gt;  Indicates whether to show resolved parameterised values. |  [optional] |
|**liveboardResponseVersion** | [**LiveboardResponseVersionEnum**](#LiveboardResponseVersionEnum) | Indicates the model version of Liveboard to be attached in metadata detail. |  [optional] |
|**includeOnlyPublishedObjects** | **Boolean** | &lt;div&gt;Version: 10.11.0.cl or later &lt;/div&gt;  If only published objects should be returned |  [optional] |



## Enum: DependentObjectVersionEnum

| Name | Value |
|---- | -----|
| V1 | &quot;V1&quot; |
| V2 | &quot;V2&quot; |



## Enum: LiveboardResponseVersionEnum

| Name | Value |
|---- | -----|
| V1 | &quot;V1&quot; |
| V2 | &quot;V2&quot; |


## Implemented Interfaces

* Serializable


