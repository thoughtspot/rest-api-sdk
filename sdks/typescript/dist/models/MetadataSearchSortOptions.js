"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataSearchSortOptions = void 0;
var MetadataSearchSortOptions = (function () {
    function MetadataSearchSortOptions() {
    }
    MetadataSearchSortOptions.getAttributeTypeMap = function () {
        return MetadataSearchSortOptions.attributeTypeMap;
    };
    MetadataSearchSortOptions.discriminator = undefined;
    MetadataSearchSortOptions.attributeTypeMap = [
        {
            "name": "field_name",
            "baseName": "field_name",
            "type": "MetadataSearchSortOptionsFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "MetadataSearchSortOptionsOrderEnum",
            "format": ""
        }
    ];
    return MetadataSearchSortOptions;
}());
exports.MetadataSearchSortOptions = MetadataSearchSortOptions;
//# sourceMappingURL=MetadataSearchSortOptions.js.map