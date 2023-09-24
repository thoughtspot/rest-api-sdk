"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUserGroupsResponse = void 0;
var ImportUserGroupsResponse = (function () {
    function ImportUserGroupsResponse() {
    }
    ImportUserGroupsResponse.getAttributeTypeMap = function () {
        return ImportUserGroupsResponse.attributeTypeMap;
    };
    ImportUserGroupsResponse.discriminator = undefined;
    ImportUserGroupsResponse.attributeTypeMap = [
        {
            "name": "groups_added",
            "baseName": "groups_added",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "groups_deleted",
            "baseName": "groups_deleted",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "groups_updated",
            "baseName": "groups_updated",
            "type": "Array<UserGroup>",
            "format": ""
        }
    ];
    return ImportUserGroupsResponse;
}());
exports.ImportUserGroupsResponse = ImportUserGroupsResponse;
//# sourceMappingURL=ImportUserGroupsResponse.js.map