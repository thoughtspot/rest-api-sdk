"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UserGroup = void 0;
var UserGroup = (function () {
    function UserGroup() {
    }
    UserGroup.getAttributeTypeMap = function () {
        return UserGroup.attributeTypeMap;
    };
    UserGroup.discriminator = undefined;
    UserGroup.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }
    ];
    return UserGroup;
}());
exports.UserGroup = UserGroup;
//# sourceMappingURL=UserGroup.js.map