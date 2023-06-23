"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SharePermissionsInput = void 0;
var SharePermissionsInput = (function () {
    function SharePermissionsInput() {
    }
    SharePermissionsInput.getAttributeTypeMap = function () {
        return SharePermissionsInput.attributeTypeMap;
    };
    SharePermissionsInput.discriminator = undefined;
    SharePermissionsInput.attributeTypeMap = [
        {
            "name": "principal",
            "baseName": "principal",
            "type": "PrincipalsInput",
            "format": ""
        },
        {
            "name": "shareMode",
            "baseName": "share_mode",
            "type": "SharePermissionsInputShareModeEnum",
            "format": ""
        }
    ];
    return SharePermissionsInput;
}());
exports.SharePermissionsInput = SharePermissionsInput;
//# sourceMappingURL=SharePermissionsInput.js.map