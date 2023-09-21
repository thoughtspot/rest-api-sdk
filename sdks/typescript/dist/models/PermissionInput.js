"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PermissionInput = void 0;
var PermissionInput = (function () {
    function PermissionInput() {
    }
    PermissionInput.getAttributeTypeMap = function () {
        return PermissionInput.attributeTypeMap;
    };
    PermissionInput.discriminator = undefined;
    PermissionInput.attributeTypeMap = [
        {
            "name": "principal",
            "baseName": "principal",
            "type": "PrincipalsInput",
            "format": ""
        },
        {
            "name": "share_mode",
            "baseName": "share_mode",
            "type": "PermissionInputShareModeEnum",
            "format": ""
        }
    ];
    return PermissionInput;
}());
exports.PermissionInput = PermissionInput;
//# sourceMappingURL=PermissionInput.js.map