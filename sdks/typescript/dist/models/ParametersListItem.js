"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParametersListItem = void 0;
var ParametersListItem = (function () {
    function ParametersListItem() {
    }
    ParametersListItem.getAttributeTypeMap = function () {
        return ParametersListItem.attributeTypeMap;
    };
    ParametersListItem.discriminator = undefined;
    ParametersListItem.attributeTypeMap = [
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
    return ParametersListItem;
}());
exports.ParametersListItem = ParametersListItem;
//# sourceMappingURL=ParametersListItem.js.map