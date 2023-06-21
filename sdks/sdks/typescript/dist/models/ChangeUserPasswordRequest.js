"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ChangeUserPasswordRequest = void 0;
var ChangeUserPasswordRequest = (function () {
    function ChangeUserPasswordRequest() {
    }
    ChangeUserPasswordRequest.getAttributeTypeMap = function () {
        return ChangeUserPasswordRequest.attributeTypeMap;
    };
    ChangeUserPasswordRequest.discriminator = undefined;
    ChangeUserPasswordRequest.attributeTypeMap = [
        {
            "name": "currentPassword",
            "baseName": "current_password",
            "type": "string",
            "format": ""
        },
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
    return ChangeUserPasswordRequest;
}());
exports.ChangeUserPasswordRequest = ChangeUserPasswordRequest;
//# sourceMappingURL=ChangeUserPasswordRequest.js.map