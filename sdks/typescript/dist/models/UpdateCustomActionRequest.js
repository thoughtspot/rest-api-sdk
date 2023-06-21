"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateCustomActionRequest = void 0;
var UpdateCustomActionRequest = (function () {
    function UpdateCustomActionRequest() {
    }
    UpdateCustomActionRequest.getAttributeTypeMap = function () {
        return UpdateCustomActionRequest.attributeTypeMap;
    };
    UpdateCustomActionRequest.discriminator = undefined;
    UpdateCustomActionRequest.attributeTypeMap = [
        {
            "name": "actionDetails",
            "baseName": "action_details",
            "type": "ActionDetailsInput",
            "format": ""
        },
        {
            "name": "associateMetadata",
            "baseName": "associate_metadata",
            "type": "Array<AssociateMetadataListItemInput>",
            "format": ""
        },
        {
            "name": "defaultActionConfig",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigInput",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }
    ];
    return UpdateCustomActionRequest;
}());
exports.UpdateCustomActionRequest = UpdateCustomActionRequest;
//# sourceMappingURL=UpdateCustomActionRequest.js.map