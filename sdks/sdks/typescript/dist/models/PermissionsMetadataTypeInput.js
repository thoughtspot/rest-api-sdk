"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PermissionsMetadataTypeInput = void 0;
var PermissionsMetadataTypeInput = (function () {
    function PermissionsMetadataTypeInput() {
    }
    PermissionsMetadataTypeInput.getAttributeTypeMap = function () {
        return PermissionsMetadataTypeInput.attributeTypeMap;
    };
    PermissionsMetadataTypeInput.discriminator = undefined;
    PermissionsMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "PermissionsMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return PermissionsMetadataTypeInput;
}());
exports.PermissionsMetadataTypeInput = PermissionsMetadataTypeInput;
//# sourceMappingURL=PermissionsMetadataTypeInput.js.map