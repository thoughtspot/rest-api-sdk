"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataResponse = void 0;
var MetadataResponse = (function () {
    function MetadataResponse() {
    }
    MetadataResponse.getAttributeTypeMap = function () {
        return MetadataResponse.attributeTypeMap;
    };
    MetadataResponse.discriminator = undefined;
    MetadataResponse.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataResponseTypeEnum",
            "format": ""
        }
    ];
    return MetadataResponse;
}());
exports.MetadataResponse = MetadataResponse;
//# sourceMappingURL=MetadataResponse.js.map