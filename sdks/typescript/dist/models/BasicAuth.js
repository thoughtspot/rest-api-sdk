"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BasicAuth = void 0;
var BasicAuth = (function () {
    function BasicAuth() {
    }
    BasicAuth.getAttributeTypeMap = function () {
        return BasicAuth.attributeTypeMap;
    };
    BasicAuth.discriminator = undefined;
    BasicAuth.attributeTypeMap = [
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        }
    ];
    return BasicAuth;
}());
exports.BasicAuth = BasicAuth;
//# sourceMappingURL=BasicAuth.js.map