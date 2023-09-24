"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TagMetadataTypeInput = void 0;
var TagMetadataTypeInput = (function () {
    function TagMetadataTypeInput() {
    }
    TagMetadataTypeInput.getAttributeTypeMap = function () {
        return TagMetadataTypeInput.attributeTypeMap;
    };
    TagMetadataTypeInput.discriminator = undefined;
    TagMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "TagMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return TagMetadataTypeInput;
}());
exports.TagMetadataTypeInput = TagMetadataTypeInput;
//# sourceMappingURL=TagMetadataTypeInput.js.map