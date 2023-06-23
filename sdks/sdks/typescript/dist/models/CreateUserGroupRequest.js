"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateUserGroupRequest = void 0;
var CreateUserGroupRequest = (function () {
    function CreateUserGroupRequest() {
    }
    CreateUserGroupRequest.getAttributeTypeMap = function () {
        return CreateUserGroupRequest.attributeTypeMap;
    };
    CreateUserGroupRequest.discriminator = undefined;
    CreateUserGroupRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
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
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<CreateUserGroupRequestPrivilegesEnum>",
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
            "type": "CreateUserGroupRequestTypeEnum",
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
            "type": "CreateUserGroupRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return CreateUserGroupRequest;
}());
exports.CreateUserGroupRequest = CreateUserGroupRequest;
//# sourceMappingURL=CreateUserGroupRequest.js.map