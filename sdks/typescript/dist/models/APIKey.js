"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.APIKey = void 0;
var APIKey = (function () {
    function APIKey() {
    }
    APIKey.getAttributeTypeMap = function () {
        return APIKey.attributeTypeMap;
    };
    APIKey.discriminator = undefined;
    APIKey.attributeTypeMap = [
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
    return APIKey;
}());
exports.APIKey = APIKey;
//# sourceMappingURL=APIKey.js.map