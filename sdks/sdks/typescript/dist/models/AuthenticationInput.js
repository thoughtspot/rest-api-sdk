"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AuthenticationInput = void 0;
var AuthenticationInput = (function () {
    function AuthenticationInput() {
    }
    AuthenticationInput.getAttributeTypeMap = function () {
        return AuthenticationInput.attributeTypeMap;
    };
    AuthenticationInput.discriminator = undefined;
    AuthenticationInput.attributeTypeMap = [
        {
            "name": "aPIKey",
            "baseName": "API_Key",
            "type": "APIKeyInput",
            "format": ""
        },
        {
            "name": "basicAuth",
            "baseName": "Basic_Auth",
            "type": "BasicAuthInput",
            "format": ""
        },
        {
            "name": "bearerToken",
            "baseName": "Bearer_Token",
            "type": "string",
            "format": ""
        },
        {
            "name": "noAuth",
            "baseName": "No_Auth",
            "type": "string",
            "format": ""
        }
    ];
    return AuthenticationInput;
}());
exports.AuthenticationInput = AuthenticationInput;
//# sourceMappingURL=AuthenticationInput.js.map