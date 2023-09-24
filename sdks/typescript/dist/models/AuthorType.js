"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AuthorType = void 0;
var AuthorType = (function () {
    function AuthorType() {
    }
    AuthorType.getAttributeTypeMap = function () {
        return AuthorType.attributeTypeMap;
    };
    AuthorType.discriminator = undefined;
    AuthorType.attributeTypeMap = [
        {
            "name": "email",
            "baseName": "email",
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
    return AuthorType;
}());
exports.AuthorType = AuthorType;
//# sourceMappingURL=AuthorType.js.map