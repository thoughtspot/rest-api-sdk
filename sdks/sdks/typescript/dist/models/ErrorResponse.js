"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ErrorResponse = void 0;
var ErrorResponse = (function () {
    function ErrorResponse() {
    }
    ErrorResponse.getAttributeTypeMap = function () {
        return ErrorResponse.attributeTypeMap;
    };
    ErrorResponse.discriminator = undefined;
    ErrorResponse.attributeTypeMap = [
        {
            "name": "error",
            "baseName": "error",
            "type": "any",
            "format": ""
        }
    ];
    return ErrorResponse;
}());
exports.ErrorResponse = ErrorResponse;
//# sourceMappingURL=ErrorResponse.js.map