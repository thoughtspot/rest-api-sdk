"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataAssociationListItem = void 0;
var MetadataAssociationListItem = (function () {
    function MetadataAssociationListItem() {
    }
    MetadataAssociationListItem.getAttributeTypeMap = function () {
        return MetadataAssociationListItem.attributeTypeMap;
    };
    MetadataAssociationListItem.discriminator = undefined;
    MetadataAssociationListItem.attributeTypeMap = [
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
    return MetadataAssociationListItem;
}());
exports.MetadataAssociationListItem = MetadataAssociationListItem;
//# sourceMappingURL=MetadataAssociationListItem.js.map