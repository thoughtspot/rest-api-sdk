"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataListItemInput = void 0;
var MetadataListItemInput = (function () {
    function MetadataListItemInput() {
    }
    MetadataListItemInput.getAttributeTypeMap = function () {
        return MetadataListItemInput.attributeTypeMap;
    };
    MetadataListItemInput.discriminator = undefined;
    MetadataListItemInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "namePattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataListItemInputTypeEnum",
            "format": ""
        }
    ];
    return MetadataListItemInput;
}());
exports.MetadataListItemInput = MetadataListItemInput;
//# sourceMappingURL=MetadataListItemInput.js.map