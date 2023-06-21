"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchConnectionRequest = void 0;
var SearchConnectionRequest = (function () {
    function SearchConnectionRequest() {
    }
    SearchConnectionRequest.getAttributeTypeMap = function () {
        return SearchConnectionRequest.attributeTypeMap;
    };
    SearchConnectionRequest.discriminator = undefined;
    SearchConnectionRequest.attributeTypeMap = [
        {
            "name": "connections",
            "baseName": "connections",
            "type": "Array<ConnectionInput>",
            "format": ""
        },
        {
            "name": "dataWarehouseTypes",
            "baseName": "data_warehouse_types",
            "type": "Array<SearchConnectionRequestDataWarehouseTypesEnum>",
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
            "name": "tagIdentifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dataWarehouseObjectType",
            "baseName": "data_warehouse_object_type",
            "type": "SearchConnectionRequestDataWarehouseObjectTypeEnum",
            "format": ""
        },
        {
            "name": "sortOptions",
            "baseName": "sort_options",
            "type": "SortOptionInput",
            "format": ""
        },
        {
            "name": "includeDetails",
            "baseName": "include_details",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "configuration",
            "baseName": "configuration",
            "type": "any",
            "format": ""
        },
        {
            "name": "authenticationType",
            "baseName": "authentication_type",
            "type": "SearchConnectionRequestAuthenticationTypeEnum",
            "format": ""
        }
    ];
    return SearchConnectionRequest;
}());
exports.SearchConnectionRequest = SearchConnectionRequest;
//# sourceMappingURL=SearchConnectionRequest.js.map