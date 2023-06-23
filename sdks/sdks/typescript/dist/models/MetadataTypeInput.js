"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataTypeInput = void 0;
var MetadataTypeInput = (function () {
    function MetadataTypeInput() {
    }
    MetadataTypeInput.getAttributeTypeMap = function () {
        return MetadataTypeInput.attributeTypeMap;
    };
    MetadataTypeInput.discriminator = undefined;
    MetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return MetadataTypeInput;
}());
exports.MetadataTypeInput = MetadataTypeInput;
//# sourceMappingURL=MetadataTypeInput.js.map