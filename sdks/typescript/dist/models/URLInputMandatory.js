"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.URLInputMandatory = void 0;
var URLInputMandatory = (function () {
    function URLInputMandatory() {
    }
    URLInputMandatory.getAttributeTypeMap = function () {
        return URLInputMandatory.attributeTypeMap;
    };
    URLInputMandatory.discriminator = undefined;
    URLInputMandatory.attributeTypeMap = [
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
    return URLInputMandatory;
}());
exports.URLInputMandatory = URLInputMandatory;
//# sourceMappingURL=URLInputMandatory.js.map