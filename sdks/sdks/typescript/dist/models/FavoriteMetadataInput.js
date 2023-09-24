"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FavoriteMetadataInput = void 0;
var FavoriteMetadataInput = (function () {
    function FavoriteMetadataInput() {
    }
    FavoriteMetadataInput.getAttributeTypeMap = function () {
        return FavoriteMetadataInput.attributeTypeMap;
    };
    FavoriteMetadataInput.discriminator = undefined;
    FavoriteMetadataInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "FavoriteMetadataInputTypeEnum",
            "format": ""
        }
    ];
    return FavoriteMetadataInput;
}());
exports.FavoriteMetadataInput = FavoriteMetadataInput;
//# sourceMappingURL=FavoriteMetadataInput.js.map