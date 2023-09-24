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
            "name": "display_name",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "group_identifier",
            "baseName": "group_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "default_liveboard_identifiers",
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
            "name": "sub_group_identifiers",
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
            "name": "user_identifiers",
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