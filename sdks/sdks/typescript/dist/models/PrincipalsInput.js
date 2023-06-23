"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PrincipalsInput = void 0;
var PrincipalsInput = (function () {
    function PrincipalsInput() {
    }
    PrincipalsInput.getAttributeTypeMap = function () {
        return PrincipalsInput.attributeTypeMap;
    };
    PrincipalsInput.discriminator = undefined;
    PrincipalsInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "PrincipalsInputTypeEnum",
            "format": ""
        }
    ];
    return PrincipalsInput;
}());
exports.PrincipalsInput = PrincipalsInput;
//# sourceMappingURL=PrincipalsInput.js.map