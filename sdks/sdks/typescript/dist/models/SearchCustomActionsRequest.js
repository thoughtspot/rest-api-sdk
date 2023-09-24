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
            "name": "custom_action_identifier",
            "baseName": "custom_action_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "default_action_config",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigSearchInput",
            "format": ""
        },
        {
            "name": "include_group_associations",
            "baseName": "include_group_associations",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_metadata_associations",
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
            "type": "SearchCustomActionsRequestTypeEnum",
            "format": ""
        }
    ];
    return SearchCustomActionsRequest;
}());
exports.SearchCustomActionsRequest = SearchCustomActionsRequest;
//# sourceMappingURL=SearchCustomActionsRequest.js.map