"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.JWTUserOptions = void 0;
var JWTUserOptions = (function () {
    function JWTUserOptions() {
    }
    JWTUserOptions.getAttributeTypeMap = function () {
        return JWTUserOptions.attributeTypeMap;
    };
    JWTUserOptions.discriminator = undefined;
    JWTUserOptions.attributeTypeMap = [
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<JWTUserOptionsParametersInner>",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<JWTMetadataObject>",
            "format": ""
        }
    ];
    return JWTUserOptions;
}());
exports.JWTUserOptions = JWTUserOptions;
//# sourceMappingURL=JWTUserOptions.js.map