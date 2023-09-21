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
            "name": "data_warehouse_types",
            "baseName": "data_warehouse_types",
            "type": "Array<SearchConnectionRequestDataWarehouseTypesEnum>",
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
            "name": "tag_identifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "data_warehouse_object_type",
            "baseName": "data_warehouse_object_type",
            "type": "SearchConnectionRequestDataWarehouseObjectTypeEnum",
            "format": ""
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SortOptionInput",
            "format": ""
        },
        {
            "name": "include_details",
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
            "name": "authentication_type",
            "baseName": "authentication_type",
            "type": "SearchConnectionRequestAuthenticationTypeEnum",
            "format": ""
        }
    ];
    return SearchConnectionRequest;
}());
exports.SearchConnectionRequest = SearchConnectionRequest;
//# sourceMappingURL=SearchConnectionRequest.js.map