"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.URLInput = void 0;
var URLInput = (function () {
    function URLInput() {
    }
    URLInput.getAttributeTypeMap = function () {
        return URLInput.attributeTypeMap;
    };
    URLInput.discriminator = undefined;
    URLInput.attributeTypeMap = [
        {
            "name": "authentication",
            "baseName": "authentication",
            "type": "AuthenticationInput",
            "format": ""
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<ParametersListItemInput>",
            "format": ""
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": ""
        },
        {
            "name": "reference",
            "baseName": "reference",
            "type": "string",
            "format": ""
        }
    ];
    return URLInput;
}());
exports.URLInput = URLInput;
//# sourceMappingURL=URLInput.js.map