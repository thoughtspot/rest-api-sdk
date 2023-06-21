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
            "name": "objectId",
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
            "name": "secretKey",
            "baseName": "secret_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "validityTimeInSec",
            "baseName": "validity_time_in_sec",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "orgId",
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
            "name": "displayName",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "autoCreate",
            "baseName": "auto_create",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return GetObjectAccessTokenRequest;
}());
exports.GetObjectAccessTokenRequest = GetObjectAccessTokenRequest;
//# sourceMappingURL=GetObjectAccessTokenRequest.js.map