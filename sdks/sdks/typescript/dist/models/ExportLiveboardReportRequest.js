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
            "name": "fileFormat",
            "baseName": "file_format",
            "type": "ExportLiveboardReportRequestFileFormatEnum",
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
            "name": "pdfOptions",
            "baseName": "pdf_options",
            "type": "PdfOptionsInput",
            "format": ""
        },
        {
            "name": "pngOptions",
            "baseName": "png_options",
            "type": "PngOptionsInput",
            "format": ""
        },
        {
            "name": "runtimeParamOverride",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }
    ];
    return ExportLiveboardReportRequest;
}());
exports.ExportLiveboardReportRequest = ExportLiveboardReportRequest;
//# sourceMappingURL=ExportLiveboardReportRequest.js.map