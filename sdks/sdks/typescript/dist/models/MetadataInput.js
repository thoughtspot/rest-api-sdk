"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataInput = void 0;
var MetadataInput = (function () {
    function MetadataInput() {
    }
    MetadataInput.getAttributeTypeMap = function () {
        return MetadataInput.attributeTypeMap;
    };
    MetadataInput.discriminator = undefined;
    MetadataInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataInputTypeEnum",
            "format": ""
        }
    ];
    return MetadataInput;
}());
exports.MetadataInput = MetadataInput;
//# sourceMappingURL=MetadataInput.js.map