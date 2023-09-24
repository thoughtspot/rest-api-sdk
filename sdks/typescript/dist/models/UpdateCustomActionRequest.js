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
            "name": "action_details",
            "baseName": "action_details",
            "type": "ActionDetailsInput",
            "format": ""
        },
        {
            "name": "associate_metadata",
            "baseName": "associate_metadata",
            "type": "Array<AssociateMetadataInput>",
            "format": ""
        },
        {
            "name": "default_action_config",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigInput",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateCustomActionRequestOperationEnum",
            "format": ""
        }
    ];
    return UpdateCustomActionRequest;
}());
exports.UpdateCustomActionRequest = UpdateCustomActionRequest;
//# sourceMappingURL=UpdateCustomActionRequest.js.map