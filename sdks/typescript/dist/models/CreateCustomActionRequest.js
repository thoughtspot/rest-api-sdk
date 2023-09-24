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
            "name": "action_details",
            "baseName": "action_details",
            "type": "ActionDetailsInputCreate",
            "format": ""
        },
        {
            "name": "associate_metadata",
            "baseName": "associate_metadata",
            "type": "Array<AssociateMetadataInputCreate>",
            "format": ""
        },
        {
            "name": "default_action_config",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigInputCreate",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return CreateCustomActionRequest;
}());
exports.CreateCustomActionRequest = CreateCustomActionRequest;
//# sourceMappingURL=CreateCustomActionRequest.js.map