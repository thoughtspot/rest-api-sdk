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
            "name": "API_Key",
            "baseName": "API_Key",
            "type": "APIKeyInput",
            "format": ""
        },
        {
            "name": "Basic_Auth",
            "baseName": "Basic_Auth",
            "type": "BasicAuthInput",
            "format": ""
        },
        {
            "name": "Bearer_Token",
            "baseName": "Bearer_Token",
            "type": "string",
            "format": ""
        },
        {
            "name": "No_Auth",
            "baseName": "No_Auth",
            "type": "string",
            "format": ""
        }
    ];
    return AuthenticationInput;
}());
exports.AuthenticationInput = AuthenticationInput;
//# sourceMappingURL=AuthenticationInput.js.map