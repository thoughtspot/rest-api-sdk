"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateRoleRequest = void 0;
var UpdateRoleRequest = (function () {
    function UpdateRoleRequest() {
    }
    UpdateRoleRequest.getAttributeTypeMap = function () {
        return UpdateRoleRequest.attributeTypeMap;
    };
    UpdateRoleRequest.discriminator = undefined;
    UpdateRoleRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
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
            "type": "Array<UpdateRoleRequestPrivilegesEnum>",
            "format": ""
        }
    ];
    return UpdateRoleRequest;
}());
exports.UpdateRoleRequest = UpdateRoleRequest;
//# sourceMappingURL=UpdateRoleRequest.js.map