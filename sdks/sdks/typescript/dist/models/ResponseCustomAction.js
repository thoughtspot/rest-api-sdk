"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResponseCustomAction = void 0;
var ResponseCustomAction = (function () {
    function ResponseCustomAction() {
    }
    ResponseCustomAction.getAttributeTypeMap = function () {
        return ResponseCustomAction.attributeTypeMap;
    };
    ResponseCustomAction.discriminator = undefined;
    ResponseCustomAction.attributeTypeMap = [
        {
            "name": "actionDetails",
            "baseName": "action_details",
            "type": "ActionDetails",
            "format": ""
        },
        {
            "name": "defaultActionConfig",
            "baseName": "default_action_config",
            "type": "DefaultActionConfig",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataAssociation",
            "baseName": "metadata_association",
            "type": "Array<MetadataAssociationItem>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "userGroups",
            "baseName": "user_groups",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        }
    ];
    return ResponseCustomAction;
}());
exports.ResponseCustomAction = ResponseCustomAction;
//# sourceMappingURL=ResponseCustomAction.js.map