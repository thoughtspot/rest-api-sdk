"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataAssociationItem = void 0;
var MetadataAssociationItem = (function () {
    function MetadataAssociationItem() {
    }
    MetadataAssociationItem.getAttributeTypeMap = function () {
        return MetadataAssociationItem.attributeTypeMap;
    };
    MetadataAssociationItem.discriminator = undefined;
    MetadataAssociationItem.attributeTypeMap = [
        {
            "name": "actionConfig",
            "baseName": "action_config",
            "type": "ActionConfig",
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
    return MetadataAssociationItem;
}());
exports.MetadataAssociationItem = MetadataAssociationItem;
//# sourceMappingURL=MetadataAssociationItem.js.map