"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateTagRequest = void 0;
var UpdateTagRequest = (function () {
    function UpdateTagRequest() {
    }
    UpdateTagRequest.getAttributeTypeMap = function () {
        return UpdateTagRequest.attributeTypeMap;
    };
    UpdateTagRequest.discriminator = undefined;
    UpdateTagRequest.attributeTypeMap = [
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
    return UpdateTagRequest;
}());
exports.UpdateTagRequest = UpdateTagRequest;
//# sourceMappingURL=UpdateTagRequest.js.map