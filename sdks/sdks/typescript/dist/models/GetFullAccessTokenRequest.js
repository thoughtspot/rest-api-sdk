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
    return GetFullAccessTokenRequest;
}());
exports.GetFullAccessTokenRequest = GetFullAccessTokenRequest;
//# sourceMappingURL=GetFullAccessTokenRequest.js.map