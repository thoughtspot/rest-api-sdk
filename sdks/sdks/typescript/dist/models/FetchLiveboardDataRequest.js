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
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualizationIdentifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "transientContent",
            "baseName": "transient_content",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataFormat",
            "baseName": "data_format",
            "type": "FetchLiveboardDataRequestDataFormatEnum",
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
    return FetchLiveboardDataRequest;
}());
exports.FetchLiveboardDataRequest = FetchLiveboardDataRequest;
//# sourceMappingURL=FetchLiveboardDataRequest.js.map