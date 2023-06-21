"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CommiterType = void 0;
var CommiterType = (function () {
    function CommiterType() {
    }
    CommiterType.getAttributeTypeMap = function () {
        return CommiterType.attributeTypeMap;
    };
    CommiterType.discriminator = undefined;
    CommiterType.attributeTypeMap = [
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        }
    ];
    return CommiterType;
}());
exports.CommiterType = CommiterType;
//# sourceMappingURL=CommiterType.js.map