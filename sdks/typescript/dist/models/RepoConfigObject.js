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
            "name": "commit_branch_name",
            "baseName": "commit_branch_name",
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