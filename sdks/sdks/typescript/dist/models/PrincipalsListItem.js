"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PrincipalsListItem = void 0;
var PrincipalsListItem = (function () {
    function PrincipalsListItem() {
    }
    PrincipalsListItem.getAttributeTypeMap = function () {
        return PrincipalsListItem.attributeTypeMap;
    };
    PrincipalsListItem.discriminator = undefined;
    PrincipalsListItem.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        }
    ];
    return PrincipalsListItem;
}());
exports.PrincipalsListItem = PrincipalsListItem;
//# sourceMappingURL=PrincipalsListItem.js.map