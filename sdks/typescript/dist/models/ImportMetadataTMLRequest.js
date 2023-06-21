"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportMetadataTMLRequest = void 0;
var ImportMetadataTMLRequest = (function () {
    function ImportMetadataTMLRequest() {
    }
    ImportMetadataTMLRequest.getAttributeTypeMap = function () {
        return ImportMetadataTMLRequest.attributeTypeMap;
    };
    ImportMetadataTMLRequest.discriminator = undefined;
    ImportMetadataTMLRequest.attributeTypeMap = [
        {
            "name": "metadataTmls",
            "baseName": "metadata_tmls",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "importPolicy",
            "baseName": "import_policy",
            "type": "ImportMetadataTMLRequestImportPolicyEnum",
            "format": ""
        },
        {
            "name": "createNew",
            "baseName": "create_new",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportMetadataTMLRequest;
}());
exports.ImportMetadataTMLRequest = ImportMetadataTMLRequest;
//# sourceMappingURL=ImportMetadataTMLRequest.js.map