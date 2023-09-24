"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Token = void 0;
var Token = (function () {
    function Token() {
    }
    Token.getAttributeTypeMap = function () {
        return Token.attributeTypeMap;
    };
    Token.discriminator = undefined;
    Token.attributeTypeMap = [
        {
            "name": "token",
            "baseName": "token",
            "type": "string",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "expiration_time_in_millis",
            "baseName": "expiration_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "Scope",
            "format": ""
        },
        {
            "name": "valid_for_user_id",
            "baseName": "valid_for_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "valid_for_username",
            "baseName": "valid_for_username",
            "type": "string",
            "format": ""
        }
    ];
    return Token;
}());
exports.Token = Token;
//# sourceMappingURL=Token.js.map