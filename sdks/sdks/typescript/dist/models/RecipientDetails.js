"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RecipientDetails = void 0;
var RecipientDetails = (function () {
    function RecipientDetails() {
    }
    RecipientDetails.getAttributeTypeMap = function () {
        return RecipientDetails.attributeTypeMap;
    };
    RecipientDetails.discriminator = undefined;
    RecipientDetails.attributeTypeMap = [
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsListItem>",
            "format": ""
        }
    ];
    return RecipientDetails;
}());
exports.RecipientDetails = RecipientDetails;
//# sourceMappingURL=RecipientDetails.js.map