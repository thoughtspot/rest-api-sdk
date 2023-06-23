"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateCustomActionRequest = void 0;
var CreateCustomActionRequest = (function () {
    function CreateCustomActionRequest() {
    }
    CreateCustomActionRequest.getAttributeTypeMap = function () {
        return CreateCustomActionRequest.attributeTypeMap;
    };
    CreateCustomActionRequest.discriminator = undefined;
    CreateCustomActionRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "actionDetails",
            "baseName": "action_details",
            "type": "ActionDetailsInputCreate",
            "format": ""
        },
        {
            "name": "associateMetadata",
            "baseName": "associate_metadata",
            "type": "Array<AssociateMetadataInputCreate>",
            "format": ""
        },
        {
            "name": "defaultActionConfig",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigInputCreate",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return CreateCustomActionRequest;
}());
exports.CreateCustomActionRequest = CreateCustomActionRequest;
//# sourceMappingURL=CreateCustomActionRequest.js.map