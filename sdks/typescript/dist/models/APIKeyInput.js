"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.APIKeyInput = void 0;
var APIKeyInput = (function () {
    function APIKeyInput() {
    }
    APIKeyInput.getAttributeTypeMap = function () {
        return APIKeyInput.attributeTypeMap;
    };
    APIKeyInput.discriminator = undefined;
    APIKeyInput.attributeTypeMap = [
        {
            "name": "key",
            "baseName": "key",
            "type": "string",
            "format": ""
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string",
            "format": ""
        }
    ];
    return APIKeyInput;
}());
exports.APIKeyInput = APIKeyInput;
//# sourceMappingURL=APIKeyInput.js.map