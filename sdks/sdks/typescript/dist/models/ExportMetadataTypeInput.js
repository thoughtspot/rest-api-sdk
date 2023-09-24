"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExportMetadataTypeInput = void 0;
var ExportMetadataTypeInput = (function () {
    function ExportMetadataTypeInput() {
    }
    ExportMetadataTypeInput.getAttributeTypeMap = function () {
        return ExportMetadataTypeInput.attributeTypeMap;
    };
    ExportMetadataTypeInput.discriminator = undefined;
    ExportMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "ExportMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return ExportMetadataTypeInput;
}());
exports.ExportMetadataTypeInput = ExportMetadataTypeInput;
//# sourceMappingURL=ExportMetadataTypeInput.js.map