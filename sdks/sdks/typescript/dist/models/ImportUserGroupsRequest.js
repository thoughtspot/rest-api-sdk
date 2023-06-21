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
            "name": "deleteUnspecifiedGroups",
            "baseName": "delete_unspecified_groups",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "dryRun",
            "baseName": "dry_run",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportUserGroupsRequest;
}());
exports.ImportUserGroupsRequest = ImportUserGroupsRequest;
//# sourceMappingURL=ImportUserGroupsRequest.js.map