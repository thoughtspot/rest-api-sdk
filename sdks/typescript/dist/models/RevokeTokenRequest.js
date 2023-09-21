"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RevokeTokenRequest = void 0;
var RevokeTokenRequest = (function () {
    function RevokeTokenRequest() {
    }
    RevokeTokenRequest.getAttributeTypeMap = function () {
        return RevokeTokenRequest.attributeTypeMap;
    };
    RevokeTokenRequest.discriminator = undefined;
    RevokeTokenRequest.attributeTypeMap = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "token",
            "baseName": "token",
            "type": "string",
            "format": ""
        }
    ];
    return RevokeTokenRequest;
}());
exports.RevokeTokenRequest = RevokeTokenRequest;
//# sourceMappingURL=RevokeTokenRequest.js.map