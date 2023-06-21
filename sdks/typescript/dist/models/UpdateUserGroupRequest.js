"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateUserGroupRequest = void 0;
var UpdateUserGroupRequest = (function () {
    function UpdateUserGroupRequest() {
    }
    UpdateUserGroupRequest.getAttributeTypeMap = function () {
        return UpdateUserGroupRequest.attributeTypeMap;
    };
    UpdateUserGroupRequest.discriminator = undefined;
    UpdateUserGroupRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "defaultLiveboardIdentifiers",
            "baseName": "default_liveboard_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "displayName",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<UpdateUserGroupRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "subGroupIdentifiers",
            "baseName": "sub_group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "UpdateUserGroupRequestTypeEnum",
            "format": ""
        },
        {
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "UpdateUserGroupRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateUserGroupRequestOperationEnum",
            "format": ""
        }
    ];
    return UpdateUserGroupRequest;
}());
exports.UpdateUserGroupRequest = UpdateUserGroupRequest;
//# sourceMappingURL=UpdateUserGroupRequest.js.map