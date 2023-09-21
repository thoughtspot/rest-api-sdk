"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.JWTParameter = void 0;
var JWTParameter = (function () {
    function JWTParameter() {
    }
    JWTParameter.getAttributeTypeMap = function () {
        return JWTParameter.attributeTypeMap;
    };
    JWTParameter.discriminator = undefined;
    JWTParameter.attributeTypeMap = [
        {
            "name": "runtime_filter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_sort",
            "baseName": "runtime_sort",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_param_override",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }
    ];
    return JWTParameter;
}());
exports.JWTParameter = JWTParameter;
//# sourceMappingURL=JWTParameter.js.map