"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActivateUserRequest = void 0;
var ActivateUserRequest = (function () {
    function ActivateUserRequest() {
    }
    ActivateUserRequest.getAttributeTypeMap = function () {
        return ActivateUserRequest.attributeTypeMap;
    };
    ActivateUserRequest.discriminator = undefined;
    ActivateUserRequest.attributeTypeMap = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "auth_token",
            "baseName": "auth_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        }
    ];
    return ActivateUserRequest;
}());
exports.ActivateUserRequest = ActivateUserRequest;
//# sourceMappingURL=ActivateUserRequest.js.map