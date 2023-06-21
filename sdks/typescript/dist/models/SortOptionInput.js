"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SortOptionInput = void 0;
var SortOptionInput = (function () {
    function SortOptionInput() {
    }
    SortOptionInput.getAttributeTypeMap = function () {
        return SortOptionInput.attributeTypeMap;
    };
    SortOptionInput.discriminator = undefined;
    SortOptionInput.attributeTypeMap = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "SortOptionInputFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "SortOptionInputOrderEnum",
            "format": ""
        }
    ];
    return SortOptionInput;
}());
exports.SortOptionInput = SortOptionInput;
//# sourceMappingURL=SortOptionInput.js.map