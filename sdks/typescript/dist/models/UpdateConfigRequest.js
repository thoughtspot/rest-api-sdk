"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateConfigRequest = void 0;
var UpdateConfigRequest = (function () {
    function UpdateConfigRequest() {
    }
    UpdateConfigRequest.getAttributeTypeMap = function () {
        return UpdateConfigRequest.attributeTypeMap;
    };
    UpdateConfigRequest.discriminator = undefined;
    UpdateConfigRequest.attributeTypeMap = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "accessToken",
            "baseName": "access_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "orgIdentifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "branchNames",
            "baseName": "branch_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "defaultBranchName",
            "baseName": "default_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "enableGuidMapping",
            "baseName": "enable_guid_mapping",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "guidMappingBranchName",
            "baseName": "guid_mapping_branch_name",
            "type": "string",
            "format": ""
        }
    ];
    return UpdateConfigRequest;
}());
exports.UpdateConfigRequest = UpdateConfigRequest;
//# sourceMappingURL=UpdateConfigRequest.js.map