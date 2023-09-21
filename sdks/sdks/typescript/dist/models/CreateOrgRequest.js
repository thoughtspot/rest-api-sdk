"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateOrgRequest = void 0;
var CreateOrgRequest = (function () {
    function CreateOrgRequest() {
    }
    CreateOrgRequest.getAttributeTypeMap = function () {
        return CreateOrgRequest.attributeTypeMap;
    };
    CreateOrgRequest.discriminator = undefined;
    CreateOrgRequest.attributeTypeMap = [
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
        }
    ];
    return CreateOrgRequest;
}());
exports.CreateOrgRequest = CreateOrgRequest;
//# sourceMappingURL=CreateOrgRequest.js.map