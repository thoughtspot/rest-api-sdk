"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GetFullAccessTokenRequest = void 0;
var GetFullAccessTokenRequest = (function () {
    function GetFullAccessTokenRequest() {
    }
    GetFullAccessTokenRequest.getAttributeTypeMap = function () {
        return GetFullAccessTokenRequest.attributeTypeMap;
    };
    GetFullAccessTokenRequest.discriminator = undefined;
    GetFullAccessTokenRequest.attributeTypeMap = [
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
    return GetFullAccessTokenRequest;
}());
exports.GetFullAccessTokenRequest = GetFullAccessTokenRequest;
//# sourceMappingURL=GetFullAccessTokenRequest.js.map