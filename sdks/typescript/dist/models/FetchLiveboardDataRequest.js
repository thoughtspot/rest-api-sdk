"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchLiveboardDataRequest = void 0;
var FetchLiveboardDataRequest = (function () {
    function FetchLiveboardDataRequest() {
    }
    FetchLiveboardDataRequest.getAttributeTypeMap = function () {
        return FetchLiveboardDataRequest.attributeTypeMap;
    };
    FetchLiveboardDataRequest.discriminator = undefined;
    FetchLiveboardDataRequest.attributeTypeMap = [
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualization_identifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "transient_content",
            "baseName": "transient_content",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_format",
            "baseName": "data_format",
            "type": "FetchLiveboardDataRequestDataFormatEnum",
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
    return FetchLiveboardDataRequest;
}());
exports.FetchLiveboardDataRequest = FetchLiveboardDataRequest;
//# sourceMappingURL=FetchLiveboardDataRequest.js.map