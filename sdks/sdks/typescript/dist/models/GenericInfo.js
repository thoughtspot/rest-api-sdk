"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GenericInfo = void 0;
var GenericInfo = (function () {
    function GenericInfo() {
    }
    GenericInfo.getAttributeTypeMap = function () {
        return GenericInfo.attributeTypeMap;
    };
    GenericInfo.discriminator = undefined;
    GenericInfo.attributeTypeMap = [
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
    return GenericInfo;
}());
exports.GenericInfo = GenericInfo;
//# sourceMappingURL=GenericInfo.js.map