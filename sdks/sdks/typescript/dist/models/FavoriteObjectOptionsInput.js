"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FavoriteObjectOptionsInput = void 0;
var FavoriteObjectOptionsInput = (function () {
    function FavoriteObjectOptionsInput() {
    }
    FavoriteObjectOptionsInput.getAttributeTypeMap = function () {
        return FavoriteObjectOptionsInput.attributeTypeMap;
    };
    FavoriteObjectOptionsInput.discriminator = undefined;
    FavoriteObjectOptionsInput.attributeTypeMap = [
        {
            "name": "include",
            "baseName": "include",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "user_identifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return FavoriteObjectOptionsInput;
}());
exports.FavoriteObjectOptionsInput = FavoriteObjectOptionsInput;
//# sourceMappingURL=FavoriteObjectOptionsInput.js.map