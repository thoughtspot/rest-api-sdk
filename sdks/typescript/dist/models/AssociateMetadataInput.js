"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AssociateMetadataInput = void 0;
var AssociateMetadataInput = (function () {
    function AssociateMetadataInput() {
    }
    AssociateMetadataInput.getAttributeTypeMap = function () {
        return AssociateMetadataInput.attributeTypeMap;
    };
    AssociateMetadataInput.discriminator = undefined;
    AssociateMetadataInput.attributeTypeMap = [
        {
            "name": "action_config",
            "baseName": "action_config",
            "type": "ActionConfigInput",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "AssociateMetadataInputTypeEnum",
            "format": ""
        }
    ];
    return AssociateMetadataInput;
}());
exports.AssociateMetadataInput = AssociateMetadataInput;
//# sourceMappingURL=AssociateMetadataInput.js.map