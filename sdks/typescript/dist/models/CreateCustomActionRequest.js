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
        }
    ];
    return CreateCustomActionRequest;
}());
exports.CreateCustomActionRequest = CreateCustomActionRequest;
//# sourceMappingURL=CreateCustomActionRequest.js.map