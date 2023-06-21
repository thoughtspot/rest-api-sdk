"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExportAnswerReportRequest = void 0;
var ExportAnswerReportRequest = (function () {
    function ExportAnswerReportRequest() {
    }
    ExportAnswerReportRequest.getAttributeTypeMap = function () {
        return ExportAnswerReportRequest.attributeTypeMap;
    };
    ExportAnswerReportRequest.discriminator = undefined;
    ExportAnswerReportRequest.attributeTypeMap = [
        {
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileFormat",
            "baseName": "file_format",
            "type": "ExportAnswerReportRequestFileFormatEnum",
            "format": ""
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
    return ExportAnswerReportRequest;
}());
exports.ExportAnswerReportRequest = ExportAnswerReportRequest;
//# sourceMappingURL=ExportAnswerReportRequest.js.map