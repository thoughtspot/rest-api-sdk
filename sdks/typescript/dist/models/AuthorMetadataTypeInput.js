"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AuthorMetadataTypeInput = void 0;
var AuthorMetadataTypeInput = (function () {
    function AuthorMetadataTypeInput() {
    }
    AuthorMetadataTypeInput.getAttributeTypeMap = function () {
        return AuthorMetadataTypeInput.attributeTypeMap;
    };
    AuthorMetadataTypeInput.discriminator = undefined;
    AuthorMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AuthorMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return AuthorMetadataTypeInput;
}());
exports.AuthorMetadataTypeInput = AuthorMetadataTypeInput;
//# sourceMappingURL=AuthorMetadataTypeInput.js.map