"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BasicAuthInput = void 0;
var BasicAuthInput = (function () {
    function BasicAuthInput() {
    }
    BasicAuthInput.getAttributeTypeMap = function () {
        return BasicAuthInput.attributeTypeMap;
    };
    BasicAuthInput.discriminator = undefined;
    BasicAuthInput.attributeTypeMap = [
        {
            "name": "password",
            "baseName": "password",
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
    return BasicAuthInput;
}());
exports.BasicAuthInput = BasicAuthInput;
//# sourceMappingURL=BasicAuthInput.js.map