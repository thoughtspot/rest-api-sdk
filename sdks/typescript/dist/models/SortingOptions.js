"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SortingOptions = void 0;
var SortingOptions = (function () {
    function SortingOptions() {
    }
    SortingOptions.getAttributeTypeMap = function () {
        return SortingOptions.attributeTypeMap;
    };
    SortingOptions.discriminator = undefined;
    SortingOptions.attributeTypeMap = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "string",
            "format": ""
        }
    ];
    return SortingOptions;
}());
exports.SortingOptions = SortingOptions;
//# sourceMappingURL=SortingOptions.js.map