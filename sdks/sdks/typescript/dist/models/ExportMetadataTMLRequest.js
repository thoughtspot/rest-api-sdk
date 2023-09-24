"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExportMetadataTMLRequest = void 0;
var ExportMetadataTMLRequest = (function () {
    function ExportMetadataTMLRequest() {
    }
    ExportMetadataTMLRequest.getAttributeTypeMap = function () {
        return ExportMetadataTMLRequest.attributeTypeMap;
    };
    ExportMetadataTMLRequest.discriminator = undefined;
    ExportMetadataTMLRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<ExportMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "export_associated",
            "baseName": "export_associated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "export_fqn",
            "baseName": "export_fqn",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "edoc_format",
            "baseName": "edoc_format",
            "type": "ExportMetadataTMLRequestEdocFormatEnum",
            "format": ""
        }
    ];
    return ExportMetadataTMLRequest;
}());
exports.ExportMetadataTMLRequest = ExportMetadataTMLRequest;
//# sourceMappingURL=ExportMetadataTMLRequest.js.map