"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchAnswerDataRequest = void 0;
var FetchAnswerDataRequest = (function () {
    function FetchAnswerDataRequest() {
    }
    FetchAnswerDataRequest.getAttributeTypeMap = function () {
        return FetchAnswerDataRequest.attributeTypeMap;
    };
    FetchAnswerDataRequest.discriminator = undefined;
    FetchAnswerDataRequest.attributeTypeMap = [
        {
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataFormat",
            "baseName": "data_format",
            "type": "FetchAnswerDataRequestDataFormatEnum",
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
    return FetchAnswerDataRequest;
}());
exports.FetchAnswerDataRequest = FetchAnswerDataRequest;
//# sourceMappingURL=FetchAnswerDataRequest.js.map