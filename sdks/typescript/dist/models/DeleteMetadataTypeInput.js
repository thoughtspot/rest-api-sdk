"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeleteMetadataTypeInput = void 0;
var DeleteMetadataTypeInput = (function () {
    function DeleteMetadataTypeInput() {
    }
    DeleteMetadataTypeInput.getAttributeTypeMap = function () {
        return DeleteMetadataTypeInput.attributeTypeMap;
    };
    DeleteMetadataTypeInput.discriminator = undefined;
    DeleteMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "DeleteMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return DeleteMetadataTypeInput;
}());
exports.DeleteMetadataTypeInput = DeleteMetadataTypeInput;
//# sourceMappingURL=DeleteMetadataTypeInput.js.map