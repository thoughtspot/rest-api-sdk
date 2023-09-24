"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CustomActionMetadataTypeInput = void 0;
var CustomActionMetadataTypeInput = (function () {
    function CustomActionMetadataTypeInput() {
    }
    CustomActionMetadataTypeInput.getAttributeTypeMap = function () {
        return CustomActionMetadataTypeInput.attributeTypeMap;
    };
    CustomActionMetadataTypeInput.discriminator = undefined;
    CustomActionMetadataTypeInput.attributeTypeMap = [
        {
            "name": "type",
            "baseName": "type",
            "type": "CustomActionMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }
    ];
    return CustomActionMetadataTypeInput;
}());
exports.CustomActionMetadataTypeInput = CustomActionMetadataTypeInput;
//# sourceMappingURL=CustomActionMetadataTypeInput.js.map