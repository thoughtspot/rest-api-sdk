"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchMetadataRequest = void 0;
var SearchMetadataRequest = (function () {
    function SearchMetadataRequest() {
    }
    SearchMetadataRequest.getAttributeTypeMap = function () {
        return SearchMetadataRequest.attributeTypeMap;
    };
    SearchMetadataRequest.discriminator = undefined;
    SearchMetadataRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<MetadataListItemInput>",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<PermissionInput>",
            "format": ""
        },
        {
            "name": "createdByUserIdentifiers",
            "baseName": "created_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dependentObjectVersion",
            "baseName": "dependent_object_version",
            "type": "SearchMetadataRequestDependentObjectVersionEnum",
            "format": ""
        },
        {
            "name": "excludeObjects",
            "baseName": "exclude_objects",
            "type": "Array<ExcludeMetadataListItemInput>",
            "format": ""
        },
        {
            "name": "favoriteObjectOptions",
            "baseName": "favorite_object_options",
            "type": "FavoriteObjectOptionsInput",
            "format": ""
        },
        {
            "name": "includeAutoCreatedObjects",
            "baseName": "include_auto_created_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeDependentObjects",
            "baseName": "include_dependent_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeDetails",
            "baseName": "include_details",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeHeaders",
            "baseName": "include_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeHiddenObjects",
            "baseName": "include_hidden_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeIncompleteObjects",
            "baseName": "include_incomplete_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeVisualizationHeaders",
            "baseName": "include_visualization_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeWorksheetSearchAssistData",
            "baseName": "include_worksheet_search_assist_data",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "modifiedByUserIdentifiers",
            "baseName": "modified_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "recordOffset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "recordSize",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sortOptions",
            "baseName": "sort_options",
            "type": "MetadataSearchSortOptions",
            "format": ""
        },
        {
            "name": "tagIdentifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "includeStats",
            "baseName": "include_stats",
            "type": "boolean",
            "format": ""
        }
    ];
    return SearchMetadataRequest;
}());
exports.SearchMetadataRequest = SearchMetadataRequest;
//# sourceMappingURL=SearchMetadataRequest.js.map