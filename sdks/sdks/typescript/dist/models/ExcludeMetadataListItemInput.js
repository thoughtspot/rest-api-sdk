"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExcludeMetadataListItemInput = void 0;
var ExcludeMetadataListItemInput = (function () {
    function ExcludeMetadataListItemInput() {
    }
    ExcludeMetadataListItemInput.getAttributeTypeMap = function () {
        return ExcludeMetadataListItemInput.attributeTypeMap;
    };
    ExcludeMetadataListItemInput.discriminator = undefined;
    ExcludeMetadataListItemInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "ExcludeMetadataListItemInputTypeEnum",
            "format": ""
        }
    ];
    return ExcludeMetadataListItemInput;
}());
exports.ExcludeMetadataListItemInput = ExcludeMetadataListItemInput;
//# sourceMappingURL=ExcludeMetadataListItemInput.js.map