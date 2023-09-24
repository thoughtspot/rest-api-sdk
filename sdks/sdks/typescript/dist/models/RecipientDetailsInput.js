"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RecipientDetailsInput = void 0;
var RecipientDetailsInput = (function () {
    function RecipientDetailsInput() {
    }
    RecipientDetailsInput.getAttributeTypeMap = function () {
        return RecipientDetailsInput.attributeTypeMap;
    };
    RecipientDetailsInput.discriminator = undefined;
    RecipientDetailsInput.attributeTypeMap = [
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsListItemInput>",
            "format": ""
        }
    ];
    return RecipientDetailsInput;
}());
exports.RecipientDetailsInput = RecipientDetailsInput;
//# sourceMappingURL=RecipientDetailsInput.js.map