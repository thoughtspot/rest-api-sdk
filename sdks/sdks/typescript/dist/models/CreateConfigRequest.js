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
            "name": "repository_url",
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
            "name": "access_token",
            "baseName": "access_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_identifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "branch_names",
            "baseName": "branch_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "commit_branch_name",
            "baseName": "commit_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "default_branch_name",
            "baseName": "default_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "enable_guid_mapping",
            "baseName": "enable_guid_mapping",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "configuration_branch_name",
            "baseName": "configuration_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "guid_mapping_branch_name",
            "baseName": "guid_mapping_branch_name",
            "type": "string",
            "format": ""
        }
    ];
    return CreateConfigRequest;
}());
exports.CreateConfigRequest = CreateConfigRequest;
//# sourceMappingURL=CreateConfigRequest.js.map