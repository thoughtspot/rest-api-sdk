"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AssociateMetadataListItemInput = void 0;
var AssociateMetadataListItemInput = (function () {
    function AssociateMetadataListItemInput() {
    }
    AssociateMetadataListItemInput.getAttributeTypeMap = function () {
        return AssociateMetadataListItemInput.attributeTypeMap;
    };
    AssociateMetadataListItemInput.discriminator = undefined;
    AssociateMetadataListItemInput.attributeTypeMap = [
        {
            "name": "actionConfig",
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
            "type": "string",
            "format": ""
        }
    ];
    return AssociateMetadataListItemInput;
}());
exports.AssociateMetadataListItemInput = AssociateMetadataListItemInput;
//# sourceMappingURL=AssociateMetadataListItemInput.js.map