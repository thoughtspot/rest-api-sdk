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
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "expirationTimeInMillis",
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
            "name": "validForUserId",
            "baseName": "valid_for_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "validForUsername",
            "baseName": "valid_for_username",
            "type": "string",
            "format": ""
        }
    ];
    return Token;
}());
exports.Token = Token;
//# sourceMappingURL=Token.js.map