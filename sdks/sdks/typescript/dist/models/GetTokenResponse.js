"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GetTokenResponse = void 0;
var GetTokenResponse = (function () {
    function GetTokenResponse() {
    }
    GetTokenResponse.getAttributeTypeMap = function () {
        return GetTokenResponse.attributeTypeMap;
    };
    GetTokenResponse.discriminator = undefined;
    GetTokenResponse.attributeTypeMap = [
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
    return GetTokenResponse;
}());
exports.GetTokenResponse = GetTokenResponse;
//# sourceMappingURL=GetTokenResponse.js.map