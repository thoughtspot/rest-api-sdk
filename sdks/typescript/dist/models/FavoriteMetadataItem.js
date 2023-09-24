"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FavoriteMetadataItem = void 0;
var FavoriteMetadataItem = (function () {
    function FavoriteMetadataItem() {
    }
    FavoriteMetadataItem.getAttributeTypeMap = function () {
        return FavoriteMetadataItem.attributeTypeMap;
    };
    FavoriteMetadataItem.discriminator = undefined;
    FavoriteMetadataItem.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "FavoriteMetadataItemTypeEnum",
            "format": ""
        }
    ];
    return FavoriteMetadataItem;
}());
exports.FavoriteMetadataItem = FavoriteMetadataItem;
//# sourceMappingURL=FavoriteMetadataItem.js.map