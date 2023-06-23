"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AssociateMetadataInputCreate = void 0;
var AssociateMetadataInputCreate = (function () {
    function AssociateMetadataInputCreate() {
    }
    AssociateMetadataInputCreate.getAttributeTypeMap = function () {
        return AssociateMetadataInputCreate.attributeTypeMap;
    };
    AssociateMetadataInputCreate.discriminator = undefined;
    AssociateMetadataInputCreate.attributeTypeMap = [
        {
            "name": "actionConfig",
            "baseName": "action_config",
            "type": "ActionConfigInputCreate",
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
            "type": "AssociateMetadataInputCreateTypeEnum",
            "format": ""
        }
    ];
    return AssociateMetadataInputCreate;
}());
exports.AssociateMetadataInputCreate = AssociateMetadataInputCreate;
//# sourceMappingURL=AssociateMetadataInputCreate.js.map