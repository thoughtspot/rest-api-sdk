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
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_format",
            "baseName": "data_format",
            "type": "FetchAnswerDataRequestDataFormatEnum",
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
    return FetchAnswerDataRequest;
}());
exports.FetchAnswerDataRequest = FetchAnswerDataRequest;
//# sourceMappingURL=FetchAnswerDataRequest.js.map