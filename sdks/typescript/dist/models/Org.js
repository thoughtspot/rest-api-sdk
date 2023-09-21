"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Org = void 0;
var Org = (function () {
    function Org() {
    }
    Org.getAttributeTypeMap = function () {
        return Org.attributeTypeMap;
    };
    Org.discriminator = undefined;
    Org.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }
    ];
    return Org;
}());
exports.Org = Org;
//# sourceMappingURL=Org.js.map