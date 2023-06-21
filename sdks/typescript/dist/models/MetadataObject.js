"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataObject = void 0;
var MetadataObject = (function () {
    function MetadataObject() {
    }
    MetadataObject.getAttributeTypeMap = function () {
        return MetadataObject.attributeTypeMap;
    };
    MetadataObject.discriminator = undefined;
    MetadataObject.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataObjectTypeEnum",
            "format": ""
        }
    ];
    return MetadataObject;
}());
exports.MetadataObject = MetadataObject;
//# sourceMappingURL=MetadataObject.js.map