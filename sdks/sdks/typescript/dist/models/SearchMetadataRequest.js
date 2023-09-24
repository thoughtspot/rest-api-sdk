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
            "name": "created_by_user_identifiers",
            "baseName": "created_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dependent_object_version",
            "baseName": "dependent_object_version",
            "type": "SearchMetadataRequestDependentObjectVersionEnum",
            "format": ""
        },
        {
            "name": "exclude_objects",
            "baseName": "exclude_objects",
            "type": "Array<ExcludeMetadataListItemInput>",
            "format": ""
        },
        {
            "name": "favorite_object_options",
            "baseName": "favorite_object_options",
            "type": "FavoriteObjectOptionsInput",
            "format": ""
        },
        {
            "name": "include_auto_created_objects",
            "baseName": "include_auto_created_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_dependent_objects",
            "baseName": "include_dependent_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_details",
            "baseName": "include_details",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_headers",
            "baseName": "include_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_hidden_objects",
            "baseName": "include_hidden_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_incomplete_objects",
            "baseName": "include_incomplete_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_visualization_headers",
            "baseName": "include_visualization_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_worksheet_search_assist_data",
            "baseName": "include_worksheet_search_assist_data",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "modified_by_user_identifiers",
            "baseName": "modified_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "MetadataSearchSortOptions",
            "format": ""
        },
        {
            "name": "tag_identifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "include_stats",
            "baseName": "include_stats",
            "type": "boolean",
            "format": ""
        }
    ];
    return SearchMetadataRequest;
}());
exports.SearchMetadataRequest = SearchMetadataRequest;
//# sourceMappingURL=SearchMetadataRequest.js.map