"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TypeInput = void 0;
var TypeInput = (function () {
    function TypeInput() {
    }
    TypeInput.getAttributeTypeMap = function () {
        return TypeInput.attributeTypeMap;
    };
    TypeInput.discriminator = undefined;
    TypeInput.attributeTypeMap = [
        {
            "name": "CALLBACK",
            "baseName": "CALLBACK",
            "type": "CALLBACKInput",
            "format": ""
        },
        {
            "name": "URL",
            "baseName": "URL",
            "type": "URLInput",
            "format": ""
        }
    ];
    return TypeInput;
}());
exports.TypeInput = TypeInput;
//# sourceMappingURL=TypeInput.js.map