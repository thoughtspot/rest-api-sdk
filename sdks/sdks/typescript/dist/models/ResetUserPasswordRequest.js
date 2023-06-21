"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResetUserPasswordRequest = void 0;
var ResetUserPasswordRequest = (function () {
    function ResetUserPasswordRequest() {
    }
    ResetUserPasswordRequest.getAttributeTypeMap = function () {
        return ResetUserPasswordRequest.attributeTypeMap;
    };
    ResetUserPasswordRequest.discriminator = undefined;
    ResetUserPasswordRequest.attributeTypeMap = [
        {
            "name": "newPassword",
            "baseName": "new_password",
            "type": "string",
            "format": ""
        },
        {
            "name": "userIdentifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        }
    ];
    return ResetUserPasswordRequest;
}());
exports.ResetUserPasswordRequest = ResetUserPasswordRequest;
//# sourceMappingURL=ResetUserPasswordRequest.js.map