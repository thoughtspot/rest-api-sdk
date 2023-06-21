"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RepoConfigObject = void 0;
var RepoConfigObject = (function () {
    function RepoConfigObject() {
    }
    RepoConfigObject.getAttributeTypeMap = function () {
        return RepoConfigObject.attributeTypeMap;
    };
    RepoConfigObject.discriminator = undefined;
    RepoConfigObject.attributeTypeMap = [
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
            "name": "defaultBranch",
            "baseName": "default_branch",
            "type": "string",
            "format": ""
        },
        {
            "name": "branches",
            "baseName": "branches",
            "type": "Array<string>",
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
        },
        {
            "name": "org",
            "baseName": "org",
            "type": "Org",
            "format": ""
        }
    ];
    return RepoConfigObject;
}());
exports.RepoConfigObject = RepoConfigObject;
//# sourceMappingURL=RepoConfigObject.js.map