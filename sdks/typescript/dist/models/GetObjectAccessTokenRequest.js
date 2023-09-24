"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GetObjectAccessTokenRequest = void 0;
var GetObjectAccessTokenRequest = (function () {
    function GetObjectAccessTokenRequest() {
    }
    GetObjectAccessTokenRequest.getAttributeTypeMap = function () {
        return GetObjectAccessTokenRequest.attributeTypeMap;
    };
    GetObjectAccessTokenRequest.discriminator = undefined;
    GetObjectAccessTokenRequest.attributeTypeMap = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "object_id",
            "baseName": "object_id",
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
            "name": "secret_key",
            "baseName": "secret_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "validity_time_in_sec",
            "baseName": "validity_time_in_sec",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "org_id",
            "baseName": "org_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "display_name",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "auto_create",
            "baseName": "auto_create",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "jwt_user_options",
            "baseName": "jwt_user_options",
            "type": "JWTUserOptions",
            "format": ""
        }
    ];
    return GetObjectAccessTokenRequest;
}());
exports.GetObjectAccessTokenRequest = GetObjectAccessTokenRequest;
//# sourceMappingURL=GetObjectAccessTokenRequest.js.map