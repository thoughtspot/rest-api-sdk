"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExportLiveboardReportRequest = void 0;
var ExportLiveboardReportRequest = (function () {
    function ExportLiveboardReportRequest() {
    }
    ExportLiveboardReportRequest.getAttributeTypeMap = function () {
        return ExportLiveboardReportRequest.attributeTypeMap;
    };
    ExportLiveboardReportRequest.discriminator = undefined;
    ExportLiveboardReportRequest.attributeTypeMap = [
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
            "name": "file_format",
            "baseName": "file_format",
            "type": "ExportLiveboardReportRequestFileFormatEnum",
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
            "name": "pdf_options",
            "baseName": "pdf_options",
            "type": "PdfOptionsInput",
            "format": ""
        },
        {
            "name": "png_options",
            "baseName": "png_options",
            "type": "PngOptionsInput",
            "format": ""
        },
        {
            "name": "runtime_param_override",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }
    ];
    return ExportLiveboardReportRequest;
}());
exports.ExportLiveboardReportRequest = ExportLiveboardReportRequest;
//# sourceMappingURL=ExportLiveboardReportRequest.js.map