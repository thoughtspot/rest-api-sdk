

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



## Enum: DependentObjectVersionEnum

| Name | Value |
|---- | -----|
| V1 | &quot;V1&quot; |
| V2 | &quot;V2&quot; |


## Implemented Interfaces

* Serializable


