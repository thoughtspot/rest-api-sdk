"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Role = void 0;
var Role = (function () {
    function Role() {
    }
    Role.getAttributeTypeMap = function () {
        return Role.attributeTypeMap;
    };
    Role.discriminator = undefined;
    Role.attributeTypeMap = [
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
    return Role;
}());
exports.Role = Role;
//# sourceMappingURL=Role.js.map