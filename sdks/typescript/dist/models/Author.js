"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Author = void 0;
var Author = (function () {
    function Author() {
    }
    Author.getAttributeTypeMap = function () {
        return Author.attributeTypeMap;
    };
    Author.discriminator = undefined;
    Author.attributeTypeMap = [
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
        }
    ];
    return Author;
}());
exports.Author = Author;
//# sourceMappingURL=Author.js.map