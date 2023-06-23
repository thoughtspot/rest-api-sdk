"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchCustomActionsRequest = void 0;
var SearchCustomActionsRequest = (function () {
    function SearchCustomActionsRequest() {
    }
    SearchCustomActionsRequest.getAttributeTypeMap = function () {
        return SearchCustomActionsRequest.attributeTypeMap;
    };
    SearchCustomActionsRequest.discriminator = undefined;
    SearchCustomActionsRequest.attributeTypeMap = [
        {
            "name": "customActionIdentifier",
            "baseName": "custom_action_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "defaultActionConfig",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigSearchInput",
            "format": ""
        },
        {
            "name": "includeGroupAssociations",
            "baseName": "include_group_associations",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeMetadataAssociations",
            "baseName": "include_metadata_associations",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<CustomActionMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "TypeInput",
            "format": ""
        }
    ];
    return SearchCustomActionsRequest;
}());
exports.SearchCustomActionsRequest = SearchCustomActionsRequest;
//# sourceMappingURL=SearchCustomActionsRequest.js.map