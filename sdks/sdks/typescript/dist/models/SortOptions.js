"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SortOptions = void 0;
var SortOptions = (function () {
    function SortOptions() {
    }
    SortOptions.getAttributeTypeMap = function () {
        return SortOptions.attributeTypeMap;
    };
    SortOptions.discriminator = undefined;
    SortOptions.attributeTypeMap = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "SortOptionsFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "SortOptionsOrderEnum",
            "format": ""
        }
    ];
    return SortOptions;
}());
exports.SortOptions = SortOptions;
//# sourceMappingURL=SortOptions.js.map