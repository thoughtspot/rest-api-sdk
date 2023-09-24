"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.JWTMetadataObject = void 0;
var JWTMetadataObject = (function () {
    function JWTMetadataObject() {
    }
    JWTMetadataObject.getAttributeTypeMap = function () {
        return JWTMetadataObject.attributeTypeMap;
    };
    JWTMetadataObject.discriminator = undefined;
    JWTMetadataObject.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "JWTMetadataObjectTypeEnum",
            "format": ""
        }
    ];
    return JWTMetadataObject;
}());
exports.JWTMetadataObject = JWTMetadataObject;
//# sourceMappingURL=JWTMetadataObject.js.map