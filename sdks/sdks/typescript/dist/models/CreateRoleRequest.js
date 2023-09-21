"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateRoleRequest = void 0;
var CreateRoleRequest = (function () {
    function CreateRoleRequest() {
    }
    CreateRoleRequest.getAttributeTypeMap = function () {
        return CreateRoleRequest.attributeTypeMap;
    };
    CreateRoleRequest.discriminator = undefined;
    CreateRoleRequest.attributeTypeMap = [
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
            "type": "Array<CreateRoleRequestPrivilegesEnum>",
            "format": ""
        }
    ];
    return CreateRoleRequest;
}());
exports.CreateRoleRequest = CreateRoleRequest;
//# sourceMappingURL=CreateRoleRequest.js.map