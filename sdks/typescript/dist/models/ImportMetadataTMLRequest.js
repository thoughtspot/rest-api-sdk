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
            "name": "metadata_tmls",
            "baseName": "metadata_tmls",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "import_policy",
            "baseName": "import_policy",
            "type": "ImportMetadataTMLRequestImportPolicyEnum",
            "format": ""
        },
        {
            "name": "create_new",
            "baseName": "create_new",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportMetadataTMLRequest;
}());
exports.ImportMetadataTMLRequest = ImportMetadataTMLRequest;
//# sourceMappingURL=ImportMetadataTMLRequest.js.map