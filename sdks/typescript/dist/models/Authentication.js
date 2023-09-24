"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Authentication = void 0;
var Authentication = (function () {
    function Authentication() {
    }
    Authentication.getAttributeTypeMap = function () {
        return Authentication.attributeTypeMap;
    };
    Authentication.discriminator = undefined;
    Authentication.attributeTypeMap = [
        {
            "name": "API_Key",
            "baseName": "API_Key",
            "type": "APIKey",
            "format": ""
        },
        {
            "name": "Basic_Auth",
            "baseName": "Basic_Auth",
            "type": "BasicAuth",
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
    return Authentication;
}());
exports.Authentication = Authentication;
//# sourceMappingURL=Authentication.js.map