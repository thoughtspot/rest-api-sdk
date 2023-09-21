"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchDataRequest = void 0;
var SearchDataRequest = (function () {
    function SearchDataRequest() {
    }
    SearchDataRequest.getAttributeTypeMap = function () {
        return SearchDataRequest.attributeTypeMap;
    };
    SearchDataRequest.discriminator = undefined;
    SearchDataRequest.attributeTypeMap = [
        {
            "name": "query_string",
            "baseName": "query_string",
            "type": "string",
            "format": ""
        },
        {
            "name": "logical_table_identifier",
            "baseName": "logical_table_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_format",
            "baseName": "data_format",
            "type": "SearchDataRequestDataFormatEnum",
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
            "name": "runtime_filter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_sort",
            "baseName": "runtime_sort",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_param_override",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }
    ];
    return SearchDataRequest;
}());
exports.SearchDataRequest = SearchDataRequest;
//# sourceMappingURL=SearchDataRequest.js.map