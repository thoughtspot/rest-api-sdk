"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.URL = void 0;
var URL = (function () {
    function URL() {
    }
    URL.getAttributeTypeMap = function () {
        return URL.attributeTypeMap;
    };
    URL.discriminator = undefined;
    URL.attributeTypeMap = [
        {
            "name": "authentication",
            "baseName": "authentication",
            "type": "Authentication",
            "format": ""
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<ParametersListItem>",
            "format": ""
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": ""
        }
    ];
    return URL;
}());
exports.URL = URL;
//# sourceMappingURL=URL.js.map