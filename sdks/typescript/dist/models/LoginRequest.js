"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LoginRequest = void 0;
var LoginRequest = (function () {
    function LoginRequest() {
    }
    LoginRequest.getAttributeTypeMap = function () {
        return LoginRequest.attributeTypeMap;
    };
    LoginRequest.discriminator = undefined;
    LoginRequest.attributeTypeMap = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_identifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "remember_me",
            "baseName": "remember_me",
            "type": "boolean",
            "format": ""
        }
    ];
    return LoginRequest;
}());
exports.LoginRequest = LoginRequest;
//# sourceMappingURL=LoginRequest.js.map