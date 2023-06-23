"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateOrgRequest = void 0;
var UpdateOrgRequest = (function () {
    function UpdateOrgRequest() {
    }
    UpdateOrgRequest.getAttributeTypeMap = function () {
        return UpdateOrgRequest.attributeTypeMap;
    };
    UpdateOrgRequest.discriminator = undefined;
    UpdateOrgRequest.attributeTypeMap = [
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
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateOrgRequestOperationEnum",
            "format": ""
        }
    ];
    return UpdateOrgRequest;
}());
exports.UpdateOrgRequest = UpdateOrgRequest;
//# sourceMappingURL=UpdateOrgRequest.js.map