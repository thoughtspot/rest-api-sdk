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
            "name": "queryString",
            "baseName": "query_string",
            "type": "string",
            "format": ""
        },
        {
            "name": "logicalTableIdentifier",
            "baseName": "logical_table_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataFormat",
            "baseName": "data_format",
            "type": "SearchDataRequestDataFormatEnum",
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
            "name": "runtimeFilter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtimeSort",
            "baseName": "runtime_sort",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtimeParamOverride",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }
    ];
    return SearchDataRequest;
}());
exports.SearchDataRequest = SearchDataRequest;
//# sourceMappingURL=SearchDataRequest.js.map