"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateConfigRequest = void 0;
var CreateConfigRequest = (function () {
    function CreateConfigRequest() {
    }
    CreateConfigRequest.getAttributeTypeMap = function () {
        return CreateConfigRequest.attributeTypeMap;
    };
    CreateConfigRequest.discriminator = undefined;
    CreateConfigRequest.attributeTypeMap = [
        {
            "name": "repositoryUrl",
            "baseName": "repository_url",
            "type": "string",
            "format": ""
        },
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
    return CreateConfigRequest;
}());
exports.CreateConfigRequest = CreateConfigRequest;
//# sourceMappingURL=CreateConfigRequest.js.map