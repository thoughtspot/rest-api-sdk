"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUserGroupsRequest = void 0;
var ImportUserGroupsRequest = (function () {
    function ImportUserGroupsRequest() {
    }
    ImportUserGroupsRequest.getAttributeTypeMap = function () {
        return ImportUserGroupsRequest.attributeTypeMap;
    };
    ImportUserGroupsRequest.discriminator = undefined;
    ImportUserGroupsRequest.attributeTypeMap = [
        {
            "name": "groups",
            "baseName": "groups",
            "type": "Array<GroupsImportListInput>",
            "format": ""
        },
        {
            "name": "delete_unspecified_groups",
            "baseName": "delete_unspecified_groups",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "dry_run",
            "baseName": "dry_run",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportUserGroupsRequest;
}());
exports.ImportUserGroupsRequest = ImportUserGroupsRequest;
//# sourceMappingURL=ImportUserGroupsRequest.js.map