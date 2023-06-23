"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateTagRequest = void 0;
var CreateTagRequest = (function () {
    function CreateTagRequest() {
    }
    CreateTagRequest.getAttributeTypeMap = function () {
        return CreateTagRequest.attributeTypeMap;
    };
    CreateTagRequest.discriminator = undefined;
    CreateTagRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string",
            "format": ""
        }
    ];
    return CreateTagRequest;
}());
exports.CreateTagRequest = CreateTagRequest;
//# sourceMappingURL=CreateTagRequest.js.map