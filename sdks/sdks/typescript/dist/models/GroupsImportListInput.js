"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GroupsImportListInput = void 0;
var GroupsImportListInput = (function () {
    function GroupsImportListInput() {
    }
    GroupsImportListInput.getAttributeTypeMap = function () {
        return GroupsImportListInput.attributeTypeMap;
    };
    GroupsImportListInput.discriminator = undefined;
    GroupsImportListInput.attributeTypeMap = [
        {
            "name": "displayName",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupIdentifier",
            "baseName": "group_identifier",
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
            "type": "Array<GroupsImportListInputPrivilegesEnum>",
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
            "type": "GroupsImportListInputTypeEnum",
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
            "type": "GroupsImportListInputVisibilityEnum",
            "format": ""
        }
    ];
    return GroupsImportListInput;
}());
exports.GroupsImportListInput = GroupsImportListInput;
//# sourceMappingURL=GroupsImportListInput.js.map