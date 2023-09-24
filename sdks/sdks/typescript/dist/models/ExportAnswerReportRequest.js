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
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "file_format",
            "baseName": "file_format",
            "type": "ExportAnswerReportRequestFileFormatEnum",
            "format": ""
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
    return ExportAnswerReportRequest;
}());
exports.ExportAnswerReportRequest = ExportAnswerReportRequest;
//# sourceMappingURL=ExportAnswerReportRequest.js.map